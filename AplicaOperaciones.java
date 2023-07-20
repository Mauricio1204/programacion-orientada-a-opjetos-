public class  AplicaOperaciones{
public static void main(String a[]){
Suma operaciones=new Suma();
operaciones.setnum1 (5);
operaciones.setnum2 (8);
operaciones.getres();
operaciones.getres1();
operaciones.getres2();
operaciones.getres3();

System.out.println("El total a pagar es:"+operaciones.getres());
System.out.println("El total a pagar es:"+operaciones.getres1());
System.out.println("El total a pagar es:"+operaciones.getres2());
System.out.println("El total a pagar es:"+operaciones.getres3());
}

}