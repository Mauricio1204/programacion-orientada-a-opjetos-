import javax.swing.*;
public class Eleccion{
private int candidato1; 
private int candidato2; 
private int candidato3; 
private int candidato4; 
private int voto;
private int i;
private int tvot;
 public int getcandidato1(){
                                                  return candidato1;}
                                                  public int getcandidato2(){
                                                  return candidato2;}
                                                  public int getcandidato3(){
                                                  return candidato3;}
                                                  public int getcandidato4(){
                                                  return candidato4;}
public void asicna(){
              int i=1;
		        while (i>=1){
			  int voto=Integer.parseInt(JOptionPane.showInputDialog("ingresa el voto:"));

                if(voto==1){
                 candidato1+=i;
                }
                else{
                   if(voto==2){
                     candidato2+=i;
                   }
                    else{ 
                    if(voto==3){
                      candidato3+=i;
                       }
                       else{
                          if(voto==4){
                              candidato4+=i;
                          }}}}
                          i++;
                                                 }
                                                 }
                                                 }