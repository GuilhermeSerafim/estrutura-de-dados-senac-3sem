package challenge;

public class People {
    private int id;
    private String bloodType;
    private boolean preferencial;

    public People(int id, String bloodType, boolean preferencial) {
        this.id = id;
        this.bloodType = bloodType;
        this.preferencial = preferencial;
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

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

}
