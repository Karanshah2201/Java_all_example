package java_prac_15;
class parent{
 void call(){
     System.out.println("this is parent class");
 } 
}
class child extends parent{
 void recall(){
     System.out.println("this is the child class");
     System.out.println("ID:D23DCE151");
     System.out.println("NAME:KARAN");
 }   
}
public class Java_prac_15 {
    public static void main(String[] args) {
        parent c1=new parent();
        child c2= new child();
         c1.call();
         c2.recall();
    }
    
}
