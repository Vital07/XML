import java.util.*;

class DAOComparator implements Comparator<DAOObject> {

    @Override //please see here
    public int compare(DAOObject o1, DAOObject o2) {
        Double coeff1 = o1.getX1()*0.43 + o1.getX2()*0.21;
        Double coeff2 = o2.getX1()*0.43 + o2.getX2()*0.21;
        return coeff1.compareTo(coeff2);
    }
}
