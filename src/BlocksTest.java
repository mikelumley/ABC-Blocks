import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BlocksTest {

    public Blocks setUp() {
        Blocks blocks = new Blocks();
        ArrayList<Block> freePool = new ArrayList<Block>();

        freePool.add(new Block('B', 'O'));
        freePool.add(new Block('O', 'A'));
        freePool.add(new Block('R', 'O'));
        freePool.add(new Block('K', 'O'));

        blocks.setFreePool(freePool);
        return blocks;
    }

    @Test
    void givenLetter_checkLetterInBlocks_returnsTrue() {
        Blocks blocks = setUp();
        assertTrue(blocks.hasBlock('B'));
    }

    @Test
    void givenLetter_checkLetterInBlocks_returnsFalse() {
        Blocks blocks = setUp();
        assertFalse(blocks.hasBlock('C'));
    }

    @Test
    void givenWord_checkWordInBlocks_returnsTrue() {
        Blocks blocks = setUp();
        assertTrue(blocks.hasWord("bark"));
    }

    @Test
    void givenWord_checkBlockNotUsedMultipleTimes_returnsFalse() {
        Blocks blocks = setUp();
        assertFalse(blocks.hasWord("bbbb"));
    }

    @Test
    void givenWordWhereLetterNotInPoolOfBlocks_checkIfHasWord_returnsFalse() {
        Blocks blocks = setUp();
        assertFalse(blocks.hasWord("barks"));
    }

    @Test
    void givenWords_checkBlockNotUsedMultipleTimes_returnsFalse() {
        Blocks blocks = setUp();
        assertTrue(blocks.hasWord("obrk"));
    }
}