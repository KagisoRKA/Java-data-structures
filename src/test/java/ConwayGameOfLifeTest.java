import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConwayGameOfLifeTest {
    //input
    String[][] initialGeneration = {
            {"+","+","#","+","+","+",},
            {"+","+","#","#","#","+",},
            {"+","+","+","+","+","+",}
    };
    @Test
    void generate() {
        assertEquals("[+, +, #, +, +, +]\n[+, +, #, #, +, +]\n[+, +, +, #, +, +]\n",ConwayGameOfLife.generate(initialGeneration));
    }
}