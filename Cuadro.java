import javax.swing.*;
public class Cuadro{
public static void main(String a1[]){
Operacion e=new Operacion();
double b=Double.parseDouble(JOptionPane.showInputDialog("ingresa a "));
e.setb(b);

double a=Double.parseDouble(JOptionPane.showInputDialog("ingresa b "));
e.seta(a);
e.y();
JOptionPane.showMessageDialog(null, "el valor e Y es:"+e.gety());
//System.out.println("el valor e Y es:"+e.gety());/*
} 
}
