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
                {'C', 'B', 'D'}
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

        System.out.println("printing consecutive A");
        checkAConsecutive(arr);
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

    public static void checkAConsecutive(char [][] arr){
        for(int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 'A') {
                    counter++;
//                    System.out.print(arr[i][j] + " ");
                } else {
                    counter = 0;
                }
            }
        }
    }
}
