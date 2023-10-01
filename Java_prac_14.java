package java_prac_14;
class complex{
int real,img;
complex(){
real=0;
img=0;
}
complex(int r,int i){
real=r;
img=i;
}
public void Sum(complex c1,complex c2){
real=c1.real+c2.real;
img=c1.img+c2.img;
}
public void Sub(complex c1,complex c2){
real=c1.real-c2.real;
img=c1.img-c2.img;
}public void multiplier(complex c1,complex c2){
real=c1.real*c2.real;
img=c1.img*c2.img;
}
void show_display(){
System.out.println("Real Number : "+real +" and imaginary Number : "+img );
}
}public class Java_prac_14 {
public static void main(String[] args) {
complex c1=new complex(12 ,3);
complex c2=new complex(14 ,9);
complex c3=new complex();
System.out.println("\t ID :d23dce151");
c1.show_display();
c2.show_display();
System.out.println();
System.out.println("Complex Number of sum : ");
c3.Sum(c1, c2);
c3.show_display();
System.out.println("Complex Number of subtract : ");
c3.Sub(c1, c2);
c3.show_display();
System.out.println("COMPLEX Number of Multiplication : ");
c3.multiplier(c1, c2);
c3.show_display();
    }
    
}
