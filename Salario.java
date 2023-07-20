public class Salario{
public static void main(String a[] ){
EmpSal salario=new EmpSal();
salario.setnomemp("Hugo");
salario.setcanhrstrab(40);
salario.setpreshrs(10);
salario.suelt();
System.out.println("Nombre del empleado:"+salario.setnomemp());
System.out.println("El salario es de:"+salario.getsuelt());

salario.setnomemp("luiz");
salario.setcanhrstrab(40);
salario.setpreshrs(10);
salario.suelt();
System.out.println("Nombre del empleado:"+salario.setnomemp());
System.out.println("El salario es de:"+salario.getsuelt());


}
}