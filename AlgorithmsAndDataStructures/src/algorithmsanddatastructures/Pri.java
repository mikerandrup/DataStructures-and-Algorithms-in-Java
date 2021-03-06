/*
    Copyright 2014 Mike Randrup <github@mikerandrup.com>
    See LICENSE file for license details.
*/
package algorithmsanddatastructures;

/**
  * @author Mike Randrup <github@mikerandrup.com>
 */
public class Pri {
    
    private static String LinePrefix = "* "; // for easy pasting into github markdown
    
    public static void nt(String message) {
        System.out.println(LinePrefix + message);
    }
    
    public static void nt(Object obj) {
        nt(obj.toString());
    }
    
    public static void nt(int[] intArray) {
        String output = "";
        for (int i=0; i<intArray.length; i++) {
            output += (intArray[i]) + ((i!=intArray.length-1) ? ", " : "");
        }
        Pri.nt(output);
    }
    
    public static void ntSpacer() {
        Pri.nt("\n-----------------------\n");
    }
}
