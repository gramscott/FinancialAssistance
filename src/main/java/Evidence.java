import java.util.Date;

public class Evidence<T> {
    
    private final T evidence;
    private final Date dateProvided;


    public Evidence(T evidence) {
        this.evidence = evidence;
        this.dateProvided = new Date();
    }


    public T getEvidence() {
        return evidence;
    }

    public Date getDateProvided() {
        return dateProvided;
    }


}
