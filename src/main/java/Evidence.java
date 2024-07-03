import java.util.Date;

public class Evidence {
    
    private final Object evidence;
    
    private final Date dateProvided;

    public Evidence(Object evidence, Date dateProvided) {
        this.evidence = evidence;
        this.dateProvided = dateProvided;
    }

    public Object getEvidence() {
        return evidence;
    }

    public Date getDateProvided() {
        return dateProvided;
    }
}
