import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dasha on 18.12.2016.
 */
@XmlRootElement (name = "daoObjects")
public class DAOObjects {
    private ArrayList<DAOObject> daoObjects;
    public DAOObjects() {
        daoObjects = new ArrayList<>();
    }

    public void add(DAOObject daoObject) {
        daoObjects.add(daoObject);
    }
    @XmlElement (name = "daoObject")
    public List<DAOObject> getDAOObjects() {
        return daoObjects;
    }
}
