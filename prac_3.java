package prac_3;
import java.util.Scanner; 
public class prac_3{
    public static void main(String[]args)
    { int rs;
    short code[]={1,2,3,4,5};
    float tax[]={8,12,5,7.5f,3};
int price[]={149,299,49,449,799}; 
System.out.println("1. Motor (Rs.149 + Tax = Rs.8)"); 
System.out.println("2. fan (Rs.299 + Tax = Rs.12)");
System.out.println("3. Tube (Rs.49 + Tax = Rs.5)"); 
System.out.println("4. Wire (Rs.449 + Tax = Rs. 7.5)"); 
System.out.println("5. Other Product (Rs.799 + Tax = Rs. 3)");
System.out.println("\nEnter Product Code: "); 
Scanner sc= new Scanner(System.in);
int i=sc.nextInt(); 
switch(i) {
    case 1: 
rs = (int) (price[i -1]+price[i -1]*tax[i -1]/ 100); 
break;
    case 2: rs = (int) (price[i -1]+price[i -1]*tax[i -1]/ 100);
break; 
case 3: 
rs = (int) (price[i -1]+price[i -1]*tax[i -1]/ 100); 
break; 
case 4: rs = (int) (price[i -1]+price[i -1]*tax[i -1]/ 100); 
break;
default:
rs = (int) (price[i -1]+price[i -1]*tax[i -1]/ 100); 
}
System.out.println("\n<----Bill---->"); 
System.out.println("Total amount is: "+rs);
System.out.println("ID:D23DCE151");
System.out.println("Name=Shah Karan");
}
}
