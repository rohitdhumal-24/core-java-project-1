package Project;

//-----------------------------------------------------> DAO layer <---------------------------------------------------------
public class Pan {
    private String panNumber;

    //aadhar pan la link salyamul te pan pan madhe yenar
    private String aadharNumber;

    private String bankDetails;

    private String investments;

    //Jevha class " Pan" chya object baher access karun  use karayach aasel tar tyasathi Parametric constructor

    public Pan(String panNumber, String aadharNumber, String bankDetails, String investments) {
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.bankDetails = bankDetails;
        this.investments = investments;
    }

    //private ha fakt Tya class purata limited aahe Mhanun getter and Setter use honar baher use Karayla

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    // Also AADHAR CLASS CHY Sagalys Object print karayla toString

    @Override
    public String toString() {
        return "Pan{" +
                "panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investments='" + investments + '\'' +
                '}';
    }
}
