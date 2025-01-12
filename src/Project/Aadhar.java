package Project;

public class Aadhar {
    private String name;

    private String aadharNumber;

    private String father;

    private String address;

    public Aadhar(String name, String aadharNumber, String father, String address) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.father = father;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Aadhar{" +
                "name='" + name + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", father='" + father + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
