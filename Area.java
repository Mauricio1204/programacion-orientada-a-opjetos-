public class Area{
private double h;
private double b;
private double res;
private double per;

public void seth (double A ){
h=A;
}
public void setb (double B ){
b=B;
}
public void res (){
res=h*b;
}

public void per (){
per=2*(h+b);
}
public double getres (){
return res;
}
public double getper (){
return per;
}
}