

import javax.swing.JOptionPane;
import java.lang.Math;

public class Equation {
    public static void main(String[] args){
        int key;
        JOptionPane.showMessageDialog(null, "1. Phuong trinh bac nhat \n 2. He phuong trinh bac nhat \n 3. Phuong trinh bac hai", "Show menu", JOptionPane.INFORMATION_MESSAGE);
        do {
            String option = JOptionPane.showInputDialog(null, "Lua chon : ");
            key = Integer.parseInt(option);
        }
        while (key != 1 && key !=2 && key != 3);
        switch (key){
            case 1 :
                FirstDegree();
                break;
            case 2 :
                Linearsystem();
                break;
            case 3 :
                secondDegree();
                break;
        }
    }
    public static void FirstDegree(){
        String strNum1, strNum2;
        String strNotification = "Nghiem duy nhat la : ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input a : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input b : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        if ( a == 0){
            if ( b == 0 )
            JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
            else 
            JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
        }
        else {
            strNotification += -1 * b/a;
            JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac nhat", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static void secondDegree(){
        String strNum1, strNum2, strNum3;
        String strNotification = "Nghiem la : ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input a : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input b : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input c : ", "Input the third number", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(strNum1);
        double b = Double.parseDouble(strNum2);
        double c = Double.parseDouble(strNum3);
        if ( a == 0 ){
            if ( b == 0){
                if ( c == 0 )
                JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
                else 
                JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
                }
                else {
                    strNotification += -1 * c/b;
                    JOptionPane.showMessageDialog(null, strNotification, "Suy bien thanh phuong trinh bac nhat", JOptionPane.INFORMATION_MESSAGE);
                }
        }
        else {
            double delta = b*b - 4*a*c;
            if (delta > 0){
                strNotification += Math.sqrt(-1*b + delta)/(4*a) + " and " + Math.sqrt(-1*b - delta)/(4*a);
                JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (delta == 0 ){
                strNotification += -1*b/(2*a);
                JOptionPane.showMessageDialog(null, strNotification, "Phuong trinh bac hai", JOptionPane.INFORMATION_MESSAGE);
            }
            else JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");

        }
    }

    public static void Linearsystem(){
        String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
        strNum1 = JOptionPane.showInputDialog(null, "Please input a11 : ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input a12 : ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null, "Please input a21 : ", "Input the third number", JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null, "Please input a22 : ", "Input the forth number", JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null, "Please input b1 : ", "Input the fifth number", JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null, "Please input b2 : ", "Input the sixth number", JOptionPane.INFORMATION_MESSAGE);
        
        double a11 = Double.parseDouble(strNum1);
        double a12 = Double.parseDouble(strNum2);
        double a21 = Double.parseDouble(strNum3);
        double a22 = Double.parseDouble(strNum4);
        double b1 = Double.parseDouble(strNum5);
        double b2 = Double.parseDouble(strNum6);
        double D = Math.abs(a11*a22 - a12 * a21);
        double D1 = Math.abs(b1*a22 - b1*a12);
        double D2 = Math.abs(b2*a11 - a22*b1);
        if (D == 0){
            if (D1 == 0 && D2 == 0)
            JOptionPane.showMessageDialog(null, "Phuong trinh vo so nghiem");
            else JOptionPane.showMessageDialog(null,  "Phuong trinh vo nghiem");
        }
        else {
            JOptionPane.showMessageDialog(null, "Nghiem la : x = " + D1/D  + " , y = " + D2/D);
        }
        
    }
}
