import javax.swing.*;
public class Aplicapromedio{
public static void main(String a1[]){
Promedio e=new Promedio();


String A=JOptionPane.showInputDialog("ingresa el nombre");
e.setnombre(A);
int B=Integer.parseInt(JOptionPane.showInputDialog("ingresa la matricula"));
e.setmat(B);
double Z=Double.parseDouble(JOptionPane.showInputDialog("ingresa cal1 "));
e.setcf1(Z);
double X=Double.parseDouble(JOptionPane.showInputDialog("ingresa cal2 "));
e.setcf2(X);
double C=Double.parseDouble(JOptionPane.showInputDialog("ingresa cal3 "));
e.setcf3(C);
double V=Double.parseDouble(JOptionPane.showInputDialog("ingresa cal4 "));
e.setcf4(V);
double N=Double.parseDouble(JOptionPane.showInputDialog("ingresa cal5 "));
e.setcf5(N);
e.getnombre();
JOptionPane.showMessageDialog(null, "Nombre del alumno es:"+e.getnombre());
e.getcf1();
JOptionPane.showMessageDialog(null, "calificacion 1 es:"+e.getcf1());
e.getcf2();
JOptionPane.showMessageDialog(null, "calificacion 2 es:"+e.getcf2());
e.getcf3();
JOptionPane.showMessageDialog(null, "calificacion 3 es:"+e.getcf3());
e.getcf4();
JOptionPane.showMessageDialog(null, "calificacion 4 es:"+e.getcf4());
e.getcf5();
JOptionPane.showMessageDialog(null, "calificacion 5 es:"+e.getcf5());
e.prom();
JOptionPane.showMessageDialog(null, "su promeio es:"+e.getprom());





}
}