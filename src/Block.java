public class Block {
    private char letter1;
    private char letter2;

    public Block(char letter1, char letter2) {
        this.letter1 = letter1;
        this.letter2 = letter2;
    }

    public boolean hasletter(char letter) {
        return letter == letter1 || letter == letter2;
    }

    public String printBlock() {
        return "(" + letter1 + ", " + letter2 + ")";
    }
}
