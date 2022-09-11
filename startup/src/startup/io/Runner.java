package startup.io;


import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function f = new Function();
        Object[] option1 = {"UAN", "YEN", "Quit"};
        Object[] option2 = {"Try Again", "Quit"};

        while (true){
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(f.check(input) == true){
                double MInput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Choise Which Currency You Wish To Convert",
                        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        option1, option1[2]);

                if (choice1 == 0) {
                    f.dollarToUan(MInput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currenty Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {
                    } else { break; }
                } else if (choice1 == 1) {
                    f.dollarToJPY(MInput);
                    int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currenty Converter",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                    if (choice2 == 0) {
                    } else { break; }
                } else { break; }
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Output");

                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currenty Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2[1]);
                if (choice2 == 0) {
                } else { break; }
            }
        }


    }
}