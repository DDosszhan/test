package ImutableClasses;

public class test {
    public static void main(String[] args) {
        PropertyType propertyType1 = new PropertyType(1, "Квартира");
        PropertyType propertyType2 = new PropertyType(2, "Паркинг");
        PropertyType propertyType3 = new PropertyType(3, "Кладовка");

        PropertyClass propertyClass1 = new PropertyClass(1, "Бизнес");
        PropertyClass propertyClass2 = new PropertyClass(2, "Эконом");
        PropertyClass propertyClass3 = new PropertyClass(3, "Стандарт");

        ImmutableChecker immutableChecker = new ImmutableChecker();

        System.out.println(immutableChecker.isClassImmutable(PropertyType.class));
        System.out.println(immutableChecker.isClassImmutable(ExampleImmutableClass.class));
        System.out.println(immutableChecker.isClassImmutable(Placement.class));
    }
}
