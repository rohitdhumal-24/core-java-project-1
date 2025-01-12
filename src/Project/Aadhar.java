package Project;

//-----------------------------------------------------> DAO layer <---------------------------------------------------------
public class Aadhar {
    // Aadher cha data private Thevayla private modifier

    private String name;

    private String aadharNumber;

    private String father;

    private String address;

    //Jevha class "Aadhar" chya object baher access karun  use karayach aasel tar tyasathi Parametric constructor
    public Aadhar(String name, String aadharNumber, String father, String address) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.father = father;
        this.address = address;
    }

    //private ha fakt Tya class purata limited aahe Mhanun getter and Setter use honar baher use Karayla

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

    // Also AADHAR CLASS CHY Sagalys Object print karayla toString

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
