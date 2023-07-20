import javax.swing.*;
public class Aplitabla{
public static void main(String a1[]){
Tabla e=new Tabla();
int c=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero a multiplicar:"));
e.seta(c);

e.calcular();
///JOptionPane.showMessageDialog(null, ""+e.calcular());
}
}