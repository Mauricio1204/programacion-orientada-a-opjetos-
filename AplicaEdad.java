import javax.swing.*;
public class AplicaEdad{
public static void main(String a1[]) {
Tercera e=new Tercera();
String b=JOptionPane.showInputDialog("ingresa el nombre");
e.setnom(b);
int v=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad. "));
e.seta(v);
int c=Integer.parseInt(JOptionPane.showInputDialog("ingresa el a�o de nacimento"));
e.seta�o(c);

JOptionPane.showMessageDialog(null, "usted es:"+e.verificar());
JOptionPane.showMessageDialog(null, "Nombre:"+e.getnom());
e.getnom();
JOptionPane.showMessageDialog(null, "su edad es:"+e.geta+"El a�o en que usted nacio es:"+e.geta�o());
e.geta();
//JOptionPane.showMessageDialog(null, "El a�o en que usted nacio es:"+e.geta�o());
e.geta�o();

}} 