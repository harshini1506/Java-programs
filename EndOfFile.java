                      /*HACKERRANK PROBLEM*/
/*input                                   
Hello World                             
Iam a file                              
Read me until end-of file*/  

/*output 
 1 Hello world
 2 Iam a file
 3 Read me until end-of-file */

                          /*PROGRAM */

import java.util.Scanner;
public class EOF{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        int lineNumber=1;
        while(sc.hasNext()){
        String line=sc.nextLine();
        System.out.println(lineNumber+" "+line);
        lineNumber++;
        }
    }
}



