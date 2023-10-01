package java_prac_18;
class shape{
    public void call1(){
        System.out.println("This is a Shape.");
    }
}class rectangle extends shape{
    public void call2(){
        System.out.println("This is a Rectangular Shape");
    }
}class circle extends shape{
    public void call3(){
        System.out.println("This is a Circular Shape"); 
    }
}class square extends rectangle{
    public void call4(){
        System.out.println("This is a Square Shape");
    }
}
public class Java_prac_18{
    public static void main(String[] args) {
        square s1 = new square();
        s1.call1();
        s1.call2();
        s1.call4();
    }
}
