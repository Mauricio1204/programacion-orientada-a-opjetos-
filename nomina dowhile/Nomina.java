import javax.swing.*;
public class Nomina{
private double suel;
private double suel1;
private double nomina;
private double newsuel;
private int i;

private double nominadetabadores;
      public void nomina(){
           int i=1;
           do{
           double  suel=Double.parseDouble(JOptionPane.showInputDialog("ingrsa sueldo:"));  
                if(suel>800){
			        suel1=(suel*0.15);
                 newsuel=suel1+suel;
                // JOptionPane.showMessageDialog(null,"el salario del trabaor es:" + newsuel);	
                 // System.out.println("la nomina es:"+newsuel);
           }
			  else {
			       if(suel<=800){
			             suel1=(suel*0.7);
                      newsuel=suel1+suel;	
                     // JOptionPane.showMessageDialog(null,"el salario del trabaor es:" + newsuel);
            }}
         nomina=i+1;
         nominadetabadores+=newsuel;
JOptionPane.showMessageDialog(null,"el salario del trabaor es:" + newsuel /*+"\nNumero de trabajadores:"+nomina +"\nnomina total:"+nominadetabadores*/ );
i++;}while(i<=3);}

public double getnominadetabadores(){
return nominadetabadores;}


}