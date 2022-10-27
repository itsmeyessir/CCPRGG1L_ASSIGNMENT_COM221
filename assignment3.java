public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};

  
        // PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");
        int sum1 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (row == 0)
            sum1 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 1 is: " + sum1);

        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        int sum2 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (column == 0)
            sum2 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 2 is: " + sum2);

        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        int sum3 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 || column == 0)
            sum3 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 3 is: " + sum3);
        
        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        int sum4 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 && column == 0 || row == 0 && column == 3 || row == 3 && column == 0 || row == 3 && column == 3)
            sum4 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 4 is: " + sum4);
        
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
        int sum5 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (row == 1 && column == 1 || row == 1 && column == 2 || row == 2 && column == 1 || row == 2 && column == 2)
            sum5 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 5 is: " + sum5);
      
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");
        int sum6 = 0;
        for (int row = 0; row < mdArray.length; row++) {
            for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 && column == 0 || row == 0 && column == 3 || row == 3 && column == 0 || row == 3 && column == 3 || row == 1 && column == 1 || row == 1 && column == 2 || row == 2 && column == 1 || row == 2 && column == 2)
            sum6 += mdArray[row][column];
            }
        }
        System.out.println("The sum of PATTERN 6 is: " + sum6);
    }
  }
