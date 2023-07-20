import javax.swing.*;
public class Lluvia{
private int zona;
private int mayor=0;
private int menor=0;
private int num1;
private int nlluvias;
private int tlluviasc;
private double tlluviascp;
private int tlluviasn;
private int tlluviasnp;
private int tlluviass;
private int tlluviassp;

public void zonas(){
     /* int i=1;  
  while (i<=3) {*/
zona=Integer.parseInt(JOptionPane.showInputDialog("ingeza la zona que deseas registrar:\n1:zona centro\n2:zona sur\n3:zona norte."));
     switch(zona){     
                    case 1:
                            for(int a=1;a<=4;a++){
                               nlluvias=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de llovias de este mes:")); 
                                      tlluviasc+=nlluvias;
                                      }
												  tlluviascp=tlluviasc/4;
                                     
												  
                                      break; 
                                      
                    case 2:
                            for(int b=1;b<=4;b++){
                               tlluviass=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de llovias de este mes:")); 
                                     
                                      int i=0;
                                      if(i==0){
                                      mayor=tlluviass;
                                      menor=tlluviass;}
                                      }
                                      if(tlluviass>mayor)mayor=tlluviass;
                                      if(tlluviass<menor){
                                      menor=tlluviass;}
                                      break;
                                      
                    case 3: 
                              for(int c=1;c<=4;c++){
                               nlluvias=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de llovias de este mes:")); 
                                      nlluvias+=c;
                                      }
                                      tlluviassp=(nlluvias/4);
                                      break;

}
JOptionPane.showMessageDialog(null,"El total de lluvias fue:"+ tlluviasc +"\nEl promedio anual de la zona centro fue:"+tlluviascp+"\nel mes con menor numero de llubias fue:"+menor+"\n el mes con mayor yuvia fue"+mayor);
/*
}i++;*/
}}