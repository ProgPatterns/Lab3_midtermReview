//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExerciseFour<Integer> tree = new ExerciseFour<>();

        tree.addIterative(56);
        tree.addIterative(22);
        tree.addIterative(57);
        tree.addIterative(80);
        tree.addIterative(12);

        tree.toArray();

        for(int i = 0; i < tree.toArray().length; i++){
            System.out.print(tree.toArray()[i] + " ");
        }
    }
}