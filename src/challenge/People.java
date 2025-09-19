package challenge;

public class People {
    private int id;
    private String name;
    private String bloodType;
    private boolean preferential;

    public People(int id, String bloodType, boolean preferential, String name) {
        this.id = id;
        this.bloodType = bloodType;
        this.preferential = preferential;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isPreferential() {
        return preferential;
    }

    public void setPreferential(boolean preferential) {
        this.preferential = preferential;
    }

}
