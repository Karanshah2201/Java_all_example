package java_prac_2;
public class Java_prac_2 {
 public static void main(String[] args) {
      int[][] twoDArray = {
            {1,2},
            {2, 3,4},
            {4, 5, 6,7}
        };

        // Display the length of each dimension
        int firstDimensionLength = twoDArray.length; // Length of the first dimension (number of rows)
        int secondDimensionLength1 = twoDArray[0].length; // Length of the second dimension in the first row
        int secondDimensionLength2 = twoDArray[1].length; // Length of the second dimension in the second row
        int secondDimensionLength3 = twoDArray[2].length; // Length of the second dimension in the third row

        System.out.println("Length of the First Dimension (Number of Rows): " + firstDimensionLength);
        System.out.println("Length of the Second Dimension in the First Row: " + secondDimensionLength1);
        System.out.println("Length of the Second Dimension in the Second Row: " + secondDimensionLength2);
        System.out.println("Length of the Second Dimension in the Third Row: " + secondDimensionLength3);
        System.out.println("ID:D23DCE151");
System.out.println("Name=Shah Karan");
    }
}
