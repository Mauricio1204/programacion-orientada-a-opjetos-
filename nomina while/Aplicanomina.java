import javax.swing.*;
public class Aplicanomina{
public static void main(String a1[]){
Nomina e=new Nomina();
//double a=Double.parseDouble(JOptionPane.showInputDialog("ingrsa sueldo"));
//e.setsuel(a);
e.nomina();

e.getnominadetabadores();
JOptionPane.showMessageDialog(null, "la nomina total es:"+e.getnominadetabadores());

}}