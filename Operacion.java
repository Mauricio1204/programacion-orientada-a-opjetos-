public class Operacion{
private double b;
private double y;
private double a;
 
public void setb(double b){
this.b=b;
 }

public void seta(double a){
this.a=a;
}
public void y(){
y=b/(a+b*(4*4));
}
public double gety(){
return y;
} 
}