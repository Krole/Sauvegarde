package fr.sopra;

import fr.sopra.shared.maths.MathUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathUtils mathUtils = new MathUtils();
        
        System.out.println("Facotrielle de 7 ! " + mathUtils.factorielle(7));
    }
}
