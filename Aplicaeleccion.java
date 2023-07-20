import javax.swing.*;
public class Aplicaeleccion{
public static void main(String a1[]){
Eleccion e=new Eleccion();

e.asicna();
e.getcandidato1();
e.getcandidato2();
e.getcandidato3();
e.getcandidato4();
JOptionPane.showMessageDialog(null, "el total de votos del candidato 1 es:"+e.getcandidato1()+"\nel total de votos del candidato 2 es:"+e.getcandidato2()+"\nel total de votos del candidato 3 es"+e.getcandidato3()+"\nel total de votos del candidato 4 es:"+e.getcandidato4());







}}