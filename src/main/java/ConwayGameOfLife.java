import java.util.Arrays;
public class ConwayGameOfLife {
    public static String generate(String[][] initGen){
        System.out.println("Input:");
        for (String[] arr: initGen) {
            System.out.println(Arrays.toString(arr));
        }
        String[][] nextGen = new String[initGen.length][initGen[1].length];
        for (String[] array: initGen){
            for (int a=0;a<array.length;a++){
                int aliveNeighbours = 0;
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) - 1][a + 1])) { aliveNeighbours += 1;}//top right neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) - 1][a])) { aliveNeighbours += 1;}//top neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) - 1][a - 1])) { aliveNeighbours += 1;}//top left neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(array[a - 1])) { aliveNeighbours += 1;}//left neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(array[a + 1])) { aliveNeighbours += 1;}//right neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) + 1][a + 1])) { aliveNeighbours += 1;}//bottom right neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) + 1][a])) { aliveNeighbours += 1;}//bottom neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                try {
                    if ("#".equals(initGen[Arrays.asList(initGen).indexOf(array) + 1][a - 1])) { aliveNeighbours += 1;}//bottom left neighbour
                } catch (ArrayIndexOutOfBoundsException ignore) {}
                if(aliveNeighbours<2){
                    nextGen[Arrays.asList(initGen).indexOf(array)][a] = "+";
                }else if(array[a].equals("#") && aliveNeighbours ==2){
                    nextGen[Arrays.asList(initGen).indexOf(array)][a] = "#";
                }else if(aliveNeighbours >3){
                    nextGen[Arrays.asList(initGen).indexOf(array)][a] = "+";
                }else if(aliveNeighbours==3){
                    nextGen[Arrays.asList(initGen).indexOf(array)][a] = "#";
                }else{
                    nextGen[Arrays.asList(initGen).indexOf(array)][a] = "+";
                }
            }
        }
        System.out.println("\nNext Generation:");
        StringBuilder nextGeneration = new StringBuilder();
        for (String[] arr: nextGen) {
            nextGeneration.append(Arrays.toString(arr)).append("\n");
        }
        return nextGeneration.toString();
    }
}