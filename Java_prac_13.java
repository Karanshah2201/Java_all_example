package java_prac_13;
import java.util.*;
class Area{
int length,width;
public Area(int l,int w){
length=l;
width=w;}
public int return_area(){
return length*width;}}
public class Java_prac_13 {
    public static void main(String[] args) {
        int l,w,ans;
Scanner sc=new Scanner(System.in);
System.out.println("\t ID :d23dce151");
System.out.println("Enter length and width : ");
l=sc.nextInt();
w=sc.nextInt();
Area a1=new Area(l, w);
ans=a1.return_area();
System.out.println("Area = "+ ans);
sc.close();
    }
    
}
