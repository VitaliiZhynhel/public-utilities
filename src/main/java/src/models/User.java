package src.models;

public class User {

    private String firstName;
    private String secondName;
    private String thirdName;
    private int indivTaxNumber;
    private int phone;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public int getIndivTaxNumber() {
        return indivTaxNumber;
    }

    public void setIndivTaxNumber(int indivTaxNumber) {
        this.indivTaxNumber = indivTaxNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
