package KiberHW;


public class Kiber2501HW {
    public static void main(String[] args) {
        String str = "I see a cat and a tree";
        boolean got = str.contains("cat");
        got = str.contains("tree");
        if (str.contains("cat")) System.out.println("You've written banned word!");
        else {
            System.out.println("I see a tree");
        }

    }


}

