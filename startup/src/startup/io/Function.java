package startup.io;

import javax.swing.*;

public class Function {

    public boolean check(String input){
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x<0);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    public void dollarToUan(double MInput){
        double uan = MInput * 36.65;
        JOptionPane.showMessageDialog(null, "Amount of UAN: "+uan+"hrn");
    }
    public void dollarToJPY(double MInput){
        double jpy = MInput * 142.50;
        JOptionPane.showMessageDialog(null, "Amount of JPY: "+jpy+"yen");
    }
}
