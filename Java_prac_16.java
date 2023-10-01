package java_prac_16;
import java.util.*;
class member{
    Scanner sc = new Scanner (System.in);
    String name = new String();
    int age;
    long number;
    String address = new String();
    float salary;
    public void printSalary(){
            System.out.println(salary);
        }
    public void getdata(){
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter number");
        number = sc.nextLong();
        System.out.println("Enter salary");
        salary = sc.nextFloat();
    }
    public void printdata(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(number);
    }
}
class manager extends member{
    Scanner sc = new Scanner (System.in);
    String specialization;
    public void getdt(){
        System.out.println("Enter specialization");
        specialization = sc.nextLine();
}
    public void printdt(){
        System.out.println(specialization);
    }
}
class employee extends member{
    Scanner sc = new Scanner (System.in);
    String department;
    public void gdt(){
        System.out.println("Enter Department");
        department = sc.nextLine();
    }
    public void pdt(){
        System.out.println(department);
    }
}
public class Java_prac_16 {
    public static void main(String[] args) {
        int i;
       for(i=1;i<2;i++){
        manager m1 = new manager();
        employee e1 = new employee();
        m1.getdata();
        m1.getdt();
        e1.getdata();
        e1.gdt();
        System.out.println("Data of Manager");
        m1.printdata();
        m1.printdt();
        m1.printSalary();
        System.out.println("Data of employee");
        e1.printdata();
        e1.pdt();
        e1.printSalary();
    }
    }
}

