/*
    Copyright 2014 Mike Randrup <github@mikerandrup.com>
    See LICENSE file for license details.
*/
package algorithmsanddatastructures;

/**
  * @author Mike Randrup <github@mikerandrup.com>
  * 
  * usage: Pri.nt("string"), 
 */
public class Pri {
    public static void nt(String message) {
        System.out.println(message);
    }
    
    public static void nt(int[] intArray) {
        String output = "";
        for (int i=0; i<intArray.length; i++) {
            output += (intArray[i]) + ", ";
        }
        Pri.nt(output);
    }
}
