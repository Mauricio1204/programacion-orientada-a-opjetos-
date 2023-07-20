public class Aplicaproducto{
public static void main(String a[]){
Producto lapiz=new Producto();
lapiz.setnomproduc("lapiz");
lapiz.setpresprocduc(5.0);
lapiz.setcanproduc(100);
lapiz.total();
System.out.println("El total a pagar es:"+lapiz.gettotal());
 
 
Producto teclado=new Producto();
teclado.setnomproduc("teclado");
teclado.setpresprocduc(150.0);
teclado.setcanproduc(3);
teclado.total();
System.out.println("El total a pagar es:"+teclado.gettotal());


}
}