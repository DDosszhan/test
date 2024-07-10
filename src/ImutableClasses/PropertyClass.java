package ImutableClasses;

public final class PropertyClass {
    private final int id;
    private final String name;

    public PropertyClass (int id, String name) {
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
