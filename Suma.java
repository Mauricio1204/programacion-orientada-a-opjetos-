public class Suma{
private int num1;
private int num2;
private int res;
public void setnum1(int x){
num1=x;
}
public void setnum2(int x){
num2=x;
}
public void sumar (){
res=num1+num2;
}
public class resta {
public void setnum1(int x){
num1=x;
}
public void setnum2(int x){
num2=x;
}
public void resta (){
res=num1-num2;
}
 }
 public class dibidir {
 public void setnum1(int x){
num1=x;
}
public void setnum2(int x){
num2=x;
}
public void dividir (){
res=num1/num2;
}
}
public class multiplicacion {
public void setnum1(int x){
num1=x;
}
public void setnum2(int x){
num2=x;
}
}
public void multiplicar (){
res=num1*num2;
}

public int getresultado (){
return res;
}
}
