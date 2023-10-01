package java_prac_7;
import java.util.*;
public class Java_prac_7 {
  static String boolean_char(String str1){
String ans = "";
char ch[] = str1.toCharArray();
for(int i=0;i<str1.length();i++){
for(int j=0;j<2;j++){
ans += ch[i];
}
}
return ans;
}
public static void main(String[] args) {
String str;
Scanner sc = new Scanner(System.in);
System.out.println("ID : d23dce151");
System.out.print("Enter String : ");
str = sc.nextLine();
// String ans = boolean_char(str);
System.out.println(boolean_char(str));
sc.close();
}
}