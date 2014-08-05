/**
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package algorithmsanddatastructures;
import ListStructures.List;
import ListStructures.ListImplementationLinked;
import algorithmsanddatastructures.sortalgorithms.BubbleSort;
import algorithmsanddatastructures.sortalgorithms.InsertionSort;
import algorithmsanddatastructures.sortalgorithms.SelectionSort;
import algorithmsanddatastructures.sortalgorithms.SortingAlgo;
import algorithmsanddatastructures.sortalgorithms.TestCaseProvider;

/**
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class MainRunner {

    public static void main(String[] args) {
        RunTheSortingTests(new BubbleSort());
        RunTheSortingTests(new SelectionSort());
        RunTheSortingTests(new InsertionSort());
        
        RunTheLinkedListTests();
    }

    private static void RunTheSortingTests(SortingAlgo chosenAlgo) {
        
        int[] valueArray = TestCaseProvider.GetUnsortedExample();
        chosenAlgo.SortTheData(valueArray);
        
        int[] correctlySortedArray = TestCaseProvider.GetCorrectlySortedExample();

        if (DeepEquals(valueArray, correctlySortedArray)) {
            Pri.nt("Algorithm Correctly Sorted the Data");
        }
        else {
            Pri.nt("Error in Algoritm.  Data not sorted correctly.");
        }
        
        Pri.ntSpacer();
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

    private static void RunTheLinkedListTests() {
        List myList = new ListImplementationLinked();
        
        Pri.nt("Insert some data");
        myList.InsertAtTail(4);
        myList.InsertAtTail(5);
        myList.InsertAtTail(6);
        myList.InsertAtTail(7);
        myList.InsertAtTail(8);
        myList.InsertAtTail(9);
        myList.InsertAtTail(10);
        myList.InsertAtHead(3);
        myList.InsertAtHead(2);
        myList.InsertAtHead(1);
        Pri.nt(myList.toString());
        Pri.ntSpacer();
        
        
        Pri.nt("Delete the even numbers");
        myList.DeleteNodeAtIndex(1);
        myList.DeleteNodeAtIndex(2);
        myList.DeleteNodeAtIndex(3);
        myList.DeleteNodeAtIndex(4);
        myList.DeleteNodeAtIndex(5);
        myList.DeleteNodeAtIndex(6);
        Pri.nt(myList);
        Pri.ntSpacer();
        
        // Whoops!  This isn't working yet.
        Pri.nt("Move last 3 nodes to head");
        myList.MoveLastNNodesToHead(3);
        Pri.nt(myList);
        Pri.ntSpacer();
        
        Pri.nt("Reverse the list");
        myList.Reverse();
        Pri.nt(myList);
    }
}
