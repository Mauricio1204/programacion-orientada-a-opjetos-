public class Promedio{
private String nombre;
private int mat;
private double cf1;
private double cf2;
private double cf3;
private double cf4;
private double cf5;
private double prom;
public void setnombre(String A){
nombre=A;}

public void setmat( int B){
mat=B;}
public void setcf1(double Z){
cf1=Z;}
public void setcf2(double X){
cf2=X;}
public void setcf3(double c){
cf3=c;}
public void setcf4(double V){
cf4=V;}
public void setcf5(double N){
cf5=N;}
public void prom(){
prom=(cf1+cf2+cf3+cf4+cf5)/5;
}
public double getprom (){
return prom;}

public String getnombre(){
return nombre;}
public double getmat(){
return mat;}
public double getcf1(){
return cf1;}

public double getcf2(){
return cf2;}

public double getcf3(){
return cf3;}

public double getcf4(){
return cf4;}

public double getcf5(){
return cf5;}

}
