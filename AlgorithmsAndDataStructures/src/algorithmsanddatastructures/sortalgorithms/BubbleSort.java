/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package algorithmsanddatastructures.sortalgorithms;

import algorithmsanddatastructures.Pri;

/**
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class BubbleSort implements SortingAlgo {
    
    public BubbleSort() {
        Pri.nt("BubbleSort");
    }

    @Override
    public void SortTheData(int[] data) {
        int i, j, tmp;
        
        for (i=0; i<data.length-1; i++) {
            Pri.nt(data);
            for (j=0; j<data.length-1-i; j++) {
                if (data[j]>data[j+1]) {
                    tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                }
            }
        }
        
        Pri.nt(data);
    }   
}
