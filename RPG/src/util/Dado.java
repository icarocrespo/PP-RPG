package util;

import java.util.Random;

/**
 *
 * @author icaro
 */
public class Dado {
  
    public static Integer dado(){
        Random random = new Random();
        return random.nextInt(6);
    }
    
    public static Integer dadoMovimento(){
        Random random = new Random();
        
        return random.nextInt(5);
    }
}
