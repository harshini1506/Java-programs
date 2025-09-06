                       /*HACKERRANK PROBLEM*/
/*input
Two integers(One per line)
1
3
*/

/*output
if both are positive=print area
if either is non-positive=Print exeception message 

 */
import java.util.Scanner;
public class javaStaticInitializerBlock {
static int B;
static int H;
static boolean flag;
static{
Scanner sc=new Scanner(System.in);
B=sc.nextInt();
H=sc.nextInt();
if(B<=0||H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");

}
else{
    flag=true;
}
}
public static void main(String[]args){
    if(flag){
        int area=B*H;
        System.out.println(area);
    }
}  
}
