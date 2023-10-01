package java_prac_8;
import java.util.*;
public class Java_prac_8 {
public static void main(String[] args) {
System.out.println("ID : d23ce151");
System.out.println("NAME : KARAN");
String s = "KARAN";
System.out.println("Length : " + s.length());
System.out.println("Lower case : " + s.toLowerCase());
System.out.println("Upper case : " + s.toUpperCase());
char ch[]=s.toCharArray();
System.out.print("Reverse string : ");
for(int i=s.length()-1;i>=0;i--){
System.out.print(ch[i]);
}
System.out.println();
Arrays.sort(ch);
System.out.println("Sort string : "+ Arrays.toString(ch));
}
}
