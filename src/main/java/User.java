import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;


public class User {
    private LocalDate dateOfRegistration;

    @NotBlank
    private Evidence name;

    @NotBlank
    private LocalDate dateOfBirth;
    private String nationalInsuranceNumber;

    @NotBlank
    private Evidence residentialAddress;
    private Evidence correspondenceAddress;
    @NotBlank
    private Evidence bankAccount;
    boolean isProspect;
    private List<Evidence> nameHistory;
    private List<Evidence> addressHistory;
    private List<Evidence> bankAccountHistory;

    public User(String name, LocalDate dateOfBirth, String residentialAddress, String bankAccount) {
        this.dateOfRegistration = LocalDate.now();
        this.name = new Evidence(name);
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = new Evidence(residentialAddress);
        this.bankAccount = new Evidence(bankAccount);
        this.isProspect = true;

        this.nameHistory = new ArrayList<>();
        this.addressHistory = new ArrayList<>();
        this.bankAccountHistory = new ArrayList<>();

        this.nameHistory.add(this.name);
        this.addressHistory.add(this.residentialAddress);
        this.bankAccountHistory.add(this.bankAccount);
    }

    public String getName() {
        return name.getValue();
    }

    public void addName(String name) {
        Evidence newName = new Evidence(name);
        this.name = newName;
        this.nameHistory.add(newName);
    }

    public String getAddress() {
        if (correspondenceAddress != null){
            return correspondenceAddress.getValue();
        }
        return residentialAddress.getValue();
    }

    public void addCorrespondenceAddress(String address) {
        Evidence newAddress = new Evidence(address);
        this.addressHistory.add(newAddress);
    }

    public String getBankAccount() {
        return bankAccount.getValue();
    }

    public void addBankAccount(String bankAccount) {
        Evidence newBankAccount = new Evidence(bankAccount);
        this.bankAccount = newBankAccount;
        this.bankAccountHistory.add(newBankAccount);
    }


    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.isProspect = false;
    }

    public void addResidentialAddress(String address) {
        Evidence newAddress = new Evidence(address);
        this.residentialAddress = newAddress;
        this.addressHistory.add(newAddress);
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

}