import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class User {

    private final LocalDateTime registrationDate;

    @NotBlank
    private String name;

    @NotBlank
    private LocalDateTime dateOfBirth;

    @NotBlank
    private Address residentialAddress;

    private Address correspondenceAddress;

    private String bankAccount;

    private User(LocalDateTime registrationDate, String name, LocalDateTime dateOfBirth, Address residentialAddress, Address correspondenceAddress, String bankAccount) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = residentialAddress;
        this.correspondenceAddress = correspondenceAddress;
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

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
