import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Blocks blocks = new Blocks();

        blocks.printBlocks();

        while(true) {
            System.out.println("Type a word to make:");
            String word = in.nextLine();

            if (blocks.hasWord(word)) {
                System.out.println("True");
            }

            blocks.reset();
        }
    }

}
