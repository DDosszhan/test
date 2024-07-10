package ImutableClasses;

public class Block {
    private int id;
    private String name;
    private String description;
    private String address;
    private int realEstateId;
    private int propertyClassId;

    public Block(int id, String name, String description, String address, int realEstateId, int propertyClassId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.realEstateId = realEstateId;
        this.propertyClassId = propertyClassId;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getAddress(){
        return address;
    }
    public int getRealEstateId(){
        return realEstateId;
    }
    public int getPropertyClassId(){
        return propertyClassId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRealEstateId(int realEstateId) {
        this.realEstateId = realEstateId;
    }

    public void setPropertyClassId(int propertyClassId) {
        this.propertyClassId = propertyClassId;
    }
}
