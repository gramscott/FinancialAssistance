import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class User {
    private final Date dateOfRegistration;
    private String name;
    private Date dateOfBirth;
    private String nationalInsuranceNumber;
    private Address residentialAddress;
    private Address correspondenceAddress;
    private BankAccount bankAccount;
    private boolean isProspect;

    private List<Evidence<Address>> addressHistory;
    private List<Evidence<BankAccount>> bankAccountHistory;
    private List<Evidence<String>> nameHistory;

    public User(String name, Date dateOfBirth, Address residentialAddress, BankAccount bankAccount) {
        this.dateOfRegistration = new Date();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = residentialAddress;
        this.bankAccount = bankAccount;
        this.isProspect = true;

        this.nameHistory = new ArrayList<>();
        this.addressHistory = new ArrayList<>();
        this.bankAccountHistory = new ArrayList<>();

        this.nameHistory.add(new Evidence<>(name));
        this.addressHistory.add(new Evidence<>(residentialAddress));
        this.bankAccountHistory.add(new Evidence<>(bankAccount));
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Optional<String> getNationalInsuranceNumber() {
        return Optional.ofNullable(nationalInsuranceNumber);
    }

    public Address getResidentialAddress() {
        return residentialAddress;
    }

    public Optional<Address> getCorrespondenceAddress() {
        return Optional.ofNullable(correspondenceAddress);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public boolean isProspect() {
        return isProspect;
    }


}