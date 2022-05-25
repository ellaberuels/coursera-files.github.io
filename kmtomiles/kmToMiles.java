import javax.swing.*;

public class kmToMiles {

  
    public static void main(String[] args) {
    
        String kmStr;   
        double km;      
        double mi;      

        //... Input
        kmStr = JOptionPane.showInputDialog(null, "Enter kilometers.");
        km = Double.parseDouble(kmStr);

        //... Computation
        mi = km * 0.621;                                 //Note 1

        //... Output
        JOptionPane.showMessageDialog(null, km + " kilometers is "
                                          + mi + " miles.");
    }

}