import java.util.ArrayList;

public class Blocks {

    private ArrayList<Block> freePool = new ArrayList<Block>();
    private ArrayList<Block> usedPool = new ArrayList<Block>();

    public Blocks() {
        freePool.add(new Block('B', 'O'));
        freePool.add(new Block('O', 'A'));
        freePool.add(new Block('R', 'O'));
        freePool.add(new Block('K', 'O'));
    }

    public void setFreePool(ArrayList<Block> freePool) {
        this.freePool = freePool;
    }

    public boolean hasBlock(char letter) {
        for (Block block : freePool) {
            if (block.hasletter(letter) && !usedPool.contains(block)) {
                usedPool.add(block);
                return true;
            }
        }
        return false;
    }

    public boolean hasWord(String word) {
        String upperCaseWord = word.toUpperCase();
        for (int i = 0; i < upperCaseWord.length(); i++) {
            char ch = upperCaseWord.charAt(i);

            if (!hasBlock(ch)) {
                System.out.println("False");
                break;
            }
        }
        return usedPool.size() == upperCaseWord.length();
    }

    public void reset() {
        usedPool.clear();
    }

    public void printBlocks() {
        System.out.println("Blocks are:");
        for(Block block: freePool) {
            System.out.println(block.printBlock());
        }
    }
}
