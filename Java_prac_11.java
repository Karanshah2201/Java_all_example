package java_prac_11;
import java.util.*;
class Employee{
String F_name,L_name;
double salary;
Scanner sc=new Scanner(System.in);
public void set(){
System.out.print("Enter First Name : ");
F_name=sc.nextLine();
System.out.print("Enter Last Name : ");
L_name=sc.nextLine();
System.out.print("Enter Salary : ");
salary=sc.nextDouble();
if(salary<=0.0){
salary=0.0;
}
}
public void get(){
System.out.println("First Name : "+ F_name );
System.out.println("Last Name : "+ L_name );
System.out.println("Salary is : "+ salary);
}
public void raise(int pr){
double raise1=(salary*pr)/100;
salary+=raise1;
System.out.println("Your Raise Salary is : "+ salary);
}
}
public class Java_prac_11 {
    public static void main(String[] args) {
        Employee e1=new Employee();
Employee e2=new Employee();
System.out.println("\t ID : d23ce151 ");
e1.set();
System.out.println("\t First person Details ");
e1.get();
e1.raise(10);
e2.set();
System.out.println("\t Second Person Details ");
e2.get();
e2.raise(21);
        // TODO code application logic here
    }
    
}
