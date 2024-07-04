import java.time.LocalDate;
import java.util.Date;

class Evidence {
    private String value;
    private LocalDate dateAdded;

    public Evidence(String value) {
        this.value = value;
        this.dateAdded = LocalDate.now();
    }

    public String getValue() {
        return value;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}
