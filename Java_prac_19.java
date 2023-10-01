package java_prac_19;
class degree{
    public void getDegree(){
        System.out.println("I got a Degree!!!");
    } 
}
class undergraduate extends degree{
    public void ug(){
        System.out.println("I am an undergraduate.");
    }
}
class postgraduate extends degree{
    public void pg(){
        System.out.println("I am a Postgraduate.");
    }
}
public class Java_prac_19{
    public static void main(String[] args) {
        degree d1 = new degree();
        undergraduate u1 = new undergraduate();
        postgraduate p1 = new postgraduate();
    d1.getDegree();
    p1.pg();
    u1.ug();
    }
}
