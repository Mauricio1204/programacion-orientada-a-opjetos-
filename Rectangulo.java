import javax.swing.*;
public class Rectangulo{
public static void main(String a1[]){
Area e=new Area();
double h=Double.parseDouble(JOptionPane.showInputDialog("ingresa a "));
e.seth(h);

double b=Double.parseDouble(JOptionPane.showInputDialog("ingresa b "));
e.setb(b);
e.res();
JOptionPane.showMessageDialog(null, "El valor de el area es:"+e.getres());
//System.out.println("el valor e Y es:"+e.gety());/*


e.per();
JOptionPane.showMessageDialog(null, "El valor del perimetro es:"+e.getper());
} 
}
