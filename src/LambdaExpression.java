import java.util.ArrayList;

public class LambdaExpression {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("boom");
        words.add("halloween");
        words.add("boo");
        words.add("candy");
        words.add("casper the ghost");

        Trimmer trim = (arrayList) -> {
            arrayList.removeLast();
            for(String name : arrayList){
                System.out.println(name);
            }
        };

        trimLast(words, trim);
    }

    public static void trimLast(ArrayList<String> arrayList, Trimmer t){
        t.trimLast(arrayList);
    }
}
