import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dasha on 15.12.2016.
 */
public class marshing {


    static void write(DAOObjects a) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(DAOObjects.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(a, System.out);
        jaxbMarshaller.marshal(a, new File("d:/daoObjects.xml"));

    }
}
