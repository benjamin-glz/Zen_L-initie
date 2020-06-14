package save;
import game.*;
import java.io.*;

/**
 * Load the game 
 * @author B.Guillouzo
 */

public class LoadGame {

    /**
     * Load the game of the give file
     * @param filename : file where was stored the game
     */

    public static Game loadGame(String filename) {
        
        Game g = new Game();

        try {
            FileInputStream input = new FileInputStream(filename);
            ObjectInputStream data = new ObjectInputStream(input);

            g = (Game) data.readObject();
            data.close();

        } catch (FileNotFoundException f) {
            System.out.println("loadGame : Error - file not found") ;
        } catch (IOException i) {
            System.out.println("read : Error - input/output exception");
        } catch (Exception e) {
            System.out.println("loadGame : Error - object problem");
        }

        return g;

    }
    
}