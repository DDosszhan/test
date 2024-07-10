package ImutableClasses;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableChecker {
    private static final Set<Class<?>> IMMUTABLE_TYPES;

    static {
        Set<Class<?>> types = new HashSet<>();
        types.add(String.class);
        types.add(Integer.class);
        types.add(Long.class);
        types.add(Double.class);
        types.add(Float.class);
        types.add(Boolean.class);
        types.add(Byte.class);
        types.add(Character.class);
        types.add(Short.class);
        types.add(Void.class);
        IMMUTABLE_TYPES = Collections.unmodifiableSet(types);
    }

    public boolean isClassImmutable(Class<?> clazz) {
        if (!Modifier.isFinal(clazz.getModifiers())) {
            return false;
        }

        for (Field field : clazz.getDeclaredFields()) {
            if (!Modifier.isPrivate(field.getModifiers()) || !Modifier.isFinal(field.getModifiers())) {
                return false;
            }
            // Check if field type is immutable
            if (!isFieldTypeImmutable(field.getType())) {
                return false;
            }
        }

        for (Method method : clazz.getDeclaredMethods()) {
            if (isSetter(method)) {
                return false;
            }
        }

        return true;
    }

    private boolean isFieldTypeImmutable(Class<?> fieldType) {
        if (fieldType.isPrimitive()) {
            return true;
        }
        if (IMMUTABLE_TYPES.contains(fieldType)) {
            return true;
        }
        if (fieldType.isArray()) {
            return isFieldTypeImmutable(fieldType.getComponentType());
        }
        return isClassImmutable(fieldType); // Default assumption for non-known immutable classes
    }

    private boolean isSetter(Method method) {
        return method.getParameterCount() == 1 && method.getName().startsWith("set");
    }
}
