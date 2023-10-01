package java_prac_17;
class rectengel{
 float length;
 float breath;
 public rectengel(float l,float b){
     length=l;
     breath=b;
 }
 public float area(){
     return length*breath;
     //System.out.println("the area of the rectengle "+length*breath);
 }
 
    public float perimeter(){
      return (2*length)+(2*breath);
       // System.out.println("The perimeter of rectangle is "+((2*length)*(2*breadth)));
    }
}

class square extends rectengel{
    public square(int s){
        super(s, s);
    }
}

public class Java_prac_17 {
    public static void main(String[] args) {
              rectengel[] rectangles = new rectengel[2];
        rectangles[0] = new rectengel(5, 10);
        rectangles[1] = new square(4);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Rectangle " + (i + 1) + ":");
            System.out.println("Area: " + rectangles[i].area());
            System.out.println("Perimeter: " + rectangles[i].perimeter());
            System.out.println();
        }
    }
}

