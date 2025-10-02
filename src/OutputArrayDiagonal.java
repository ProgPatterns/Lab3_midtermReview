public class OutputArrayDiagonal {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},
                         {4,5,6},
                            {7,8,9}
        };

        char[][] arr = {
                {'C', 'A', 'B'},
                {'A', 'A', 'A'},
                {'B', 'C', 'D'},
                {'D', 'D', 'D'}
        };

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("printing diagonal: ");
        printDiagonal(array);
        System.out.println();

        System.out.println("does the 2d array contain 3 consecutive A");
        System.out.println(checkAConsecutive(arr));
    }

    public static void printDiagonal(int [][] array){
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j){
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }

    public static boolean checkAConsecutive(char [][] arr){
        for(int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'A') {
                    counter++;
                } else {
                    counter = 0;
                }
            }
            if (counter == 3) {
                return true;
            }
        }
        return false;
    }
}
