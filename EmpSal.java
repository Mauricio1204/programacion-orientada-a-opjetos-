public class EmpSal{
private String nomemp;
private double canhrstrab;
private double preshrs;
private double suelt;

public void setnomemp(String a){
nomemp=a;}
public void setcanhrstrab (double i){
canhrstrab=i;
}
public void setpreshrs (double s){
preshrs=s;
}
public void suelt (){
suelt=canhrstrab*preshrs;
}
public double getsuelt(){
return suelt;
}
public String setnomemp(){
return nomemp;
}
}