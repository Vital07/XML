
import javax.xml.bind.JAXBException;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws JAXBException {
        DAOObjects daoObjects = new DAOObjects();
        daoObjects.add(new DAOObject(2.7,4.0));
        daoObjects.add(new DAOObject(3.7,2.0));
        daoObjects.add(new DAOObject(5.7,1.0));
        daoObjects.add(new DAOObject(4.7,3.0));
        marshing.write(daoObjects);
        //Collections.sort(daoObjects, new DAOComparator());
        //System.out.print(daoObjects.toString());

    }

}