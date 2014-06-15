/**
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package algorithmsanddatastructures;
import algorithmsanddatastructures.sortalgorithms.BubbleSort;
import algorithmsanddatastructures.sortalgorithms.SortingAlgo;
import algorithmsanddatastructures.sortalgorithms.TestCaseProvider;

/**
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class MainRunner {

    public static void main(String[] args) {
        RunTheSortingTest(new BubbleSort());
    }

    private static void RunTheSortingTest(SortingAlgo chosenAlgo) {
        
        int[] valueArray = TestCaseProvider.GetUnsortedExample();
        chosenAlgo.SortTheData(valueArray);
        
        int[] correctlySortedArray = TestCaseProvider.GetCorrectlySortedExample();

        if (DeepEquals(valueArray, correctlySortedArray)) {
            Pri.nt("Algorithm Correctly Sorted the Data");
        }
        else {
            Pri.nt("Error in Algoritm.  Data not sorted correctly.");
        }
        
        Pri.nt("-------------------");
    }
    
    private static Boolean DeepEquals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        else {
            for (int i=0; i<a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
