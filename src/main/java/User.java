import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.Date;

public class User {


    private final Date registrationDate;

    @NotBlank
    private String name;

    @NotBlank
    private LocalDate dateOfBirth;

    private String nationalInsuranceNumber;

    @NotBlank
    private Address residentialAddress;

    private Address correspondenceAddress;

    private BankAccount bankAccount;

    User( String name, LocalDate dateOfBirth, String nationalInsuranceNumber, Address residentialAddress, Address correspondenceAddress, BankAccount bankAccount) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.residentialAddress = residentialAddress;
        this.correspondenceAddress = correspondenceAddress;
        this.registrationDate = new Date();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Address getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(Address residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public Address getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(Address correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }


    public Date getRegistrationDate() {
        return registrationDate;
    }
}
