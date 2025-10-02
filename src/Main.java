import DataStructure.ExerciseFour;
public class Main {
    public static void main(String[] args) {
        ExerciseFour<Integer> tree = new ExerciseFour<>();

        tree.addIterative(56);
        tree.addIterative(22);
        tree.addIterative(57);
        tree.addIterative(80);
        tree.addIterative(12);

        Object[] array = tree.toArray();

        for(Object value : array){
            System.out.print(value + " ");
        }
    }
}