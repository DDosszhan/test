package ImutableClasses;

public final class ExampleImmutableClass {
    private  final PropertyClass propertyClass;
    private final String propertyClassMark;

    public ExampleImmutableClass(PropertyClass propertyClass, String propertyClassMark) {
        this.propertyClass = propertyClass;
        this.propertyClassMark = propertyClassMark;
    }

    public PropertyClass getPropertyClass() {
        return propertyClass;
    }

    public String getPropertyClassMark() {
        return propertyClassMark;
    }
}
