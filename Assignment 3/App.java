public class App {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
        // int rows = mdArray.length;  
        int rows = mdArray.length;
        int cols = mdArray[0].length;
       
        // PATTERN 1
       
        for(int i = 0; i < 1; i++){  
            int sumRow = 0;  
            for(int j = 0; j < cols; j++){  
              sumRow = sumRow + mdArray[i][j];  
            }  
            System.out.println("1. SUM OF PATTERN 1: " + sumRow);  
        }  
   
        // PATTERN 2
        System.out.println("");

        for (int i = 0; i < 1; i++){
            int sumColumn = 0;
            for(int j = 0; j < rows; j++){
                sumColumn = sumColumn + mdArray[j][i];
            }
            System.out.println("2. SUM OF PATTERN 2: " + sumColumn);
        }
        
        
        // PATTERN 3
        System.out.println("");
      
       
        int sum3 = 0;
        for (int i = 0; i < mdArray.length; i++){
            for (int j = 0; j < mdArray.length; j++) {
                if(i == 0 || j == 0){
                    sum3 += mdArray[i][j];
                }
            }
        }      System.out.println("3. SUM OF PATTERN 3: " + sum3);   
        
        // // PATTERN 4
        System.out.println("");

        int sum4 = 0;
        for (int i = 0; i < mdArray.length; i++){
            for (int j = 0; j < mdArray.length; j++) {
                if((i == 0 && j == 0)||(i == 0 && j == 3) || (i == 3 && j == 3) || (i == 3 && j == 0)){
                    sum4 += mdArray[i][j];
                }
            }
        }      System.out.println("4. SUM OF PATTERN 4: " + sum4);   
        
        // PATTERN 5
        System.out.println("");

        int sum5 = 0;
        for (int i = 0; i < mdArray.length; i++){
            for (int j = 0; j < mdArray.length; j++) {
                if((i == 1 && j == 1)||(i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2)){
                    sum5 += mdArray[i][j];
                }
            }
        }      System.out.println("5. SUM OF PATTERN 5: " + sum5);   

        // PATTERN 6
        System.out.println("");
        
        int sum6 = 0;
        for (int i = 0; i < mdArray.length; i++){
            for (int j = 0; j < mdArray.length; j++) {
                if((i == 0 && j == 0)||(i == 0 && j == 3) || (i == 3 && j == 3) || (i == 3 && j == 0)||(i == 1 && j == 1)||(i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2)){
                    sum6 += mdArray[i][j];
                }
            }
        }      System.out.println("6. SUM OF PATTERN 6: " + sum6);
    }
  }
