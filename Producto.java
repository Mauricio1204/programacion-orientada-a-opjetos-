public class Producto{
private double total;
private String nomproduc;
private int canproduc;
private double presprocduc;

public void setnomproduc(String i){
nomproduc=i;
}

public void setpresprocduc(double i){
presprocduc=i;
}
public void setcanproduc(int i){
canproduc=i;
}
public void total(){
total=presprocduc*canproduc;
}
public double gettotal(){
return total;
}

}

