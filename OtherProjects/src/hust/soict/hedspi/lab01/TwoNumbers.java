import javax.swing.JOptionPane;

public class TwoNumbers {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        strNotification += "Tong la : " + (num1 + num2) + "\nHieu la : " + (num1 - num2) + "\nTich la : " + (num1 * num2) + "\nThuong la " + (num2!=0? num1/num2 : "Khong ton tai");
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
