import javafx.beans.property.DoubleProperty;
import  javafx.beans.property.SimpleDoubleProperty;

public class Binding {
    public static void main(String[] args) {
        DoubleProperty d1= new SimpleDoubleProperty(1.0);
        DoubleProperty d2=new SimpleDoubleProperty(2.0);
        d1.bind(d2);
        System.out.println(d1.getValue() + "      " +  d2.getValue());
        d2.setValue(1.1);
        System.out.println(d1.getValue() + "      " +  d2.getValue());
    }
}
