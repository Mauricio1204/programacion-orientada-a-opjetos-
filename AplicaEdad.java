import javax.swing.*;
public class AplicaEdad{
public static void main(String a1[]) {
Tercera e=new Tercera();
String b=JOptionPane.showInputDialog("ingresa el nombre");
e.setnom(b);
int v=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu edad. "));
e.seta(v);
int c=Integer.parseInt(JOptionPane.showInputDialog("ingresa el año de nacimento"));
e.setaño(c);

JOptionPane.showMessageDialog(null, "usted es:"+e.verificar());
JOptionPane.showMessageDialog(null, "Nombre:"+e.getnom());
e.getnom();
JOptionPane.showMessageDialog(null, "su edad es:"+e.geta+"El año en que usted nacio es:"+e.getaño());
e.geta();
//JOptionPane.showMessageDialog(null, "El año en que usted nacio es:"+e.getaño());
e.getaño();

}} 