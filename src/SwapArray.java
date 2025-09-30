public class SwapArray {
    public static int[] swap(int[] array){
        for(int i = 0; i < array.length -1; i++){
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {4, 2, 6, 9, 1};

        System.out.println("initial array");
        for(int e : array){
            System.out.print(e + " ");
        }

        int[] swapped = swap(array);
        System.out.println("\nswapped array");
        for(int e : swapped){
            System.out.print(e + " ");
        }
    }
}
