import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {

    private final LocalDateTime registrationDate;

    @NotBlank
    private String name;

    @NotBlank
    private LocalDate dateOfBirth;

    @NotBlank
    private Address residentialAddress;

    private Address correspondenceAddress;

    private BankAccount bankAccount;

    User(LocalDateTime registrationDate, String name, LocalDate dateOfBirth, Address residentialAddress, Address correspondenceAddress, BankAccount bankAccount) {
        this.residentialAddress = residentialAddress;
        this.correspondenceAddress = correspondenceAddress;
        this.registrationDate = new LocalDateTime;
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

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
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
}
