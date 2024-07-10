package ImutableClasses;

public final class PropertyType {
    private final int id;
    private final String name;

    public PropertyType (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
