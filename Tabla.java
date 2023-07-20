public class Tabla{
private int a;
public void seta(int c){a=c;}

/*public void calcular(){
for(int i=1;i<=10;i++){
             System.out.println(a+"X"+i+"="+a*i);
}
*/
public void calcular(){
 for (int a =1; a<=10; a++) {
      System.out.println("Tabla de multiplicar del " + a);
         for(int i=1;i<=10;i++)
             System.out.println(a+"X"+i+"="+a*i);
}}}