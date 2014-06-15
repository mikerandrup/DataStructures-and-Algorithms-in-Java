/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package algorithmsanddatastructures.sortalgorithms;

import algorithmsanddatastructures.Pri;

/**
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class InsertionSort implements SortingAlgo {
    
    public InsertionSort() {
        Pri.nt("InsertionSort");
    }

    @Override
    public void SortTheData(int[] data) {
        int i, j, current, tmp, len = data.length;
        
        for (i=0; i<len; i++) {
            Pri.nt(data);
            current = data[i];
            j = i-1;
            while (j >=0 && data[j] > current) {
                data[j+1] = data[j];
                j = j - 1;
            }
            data[j+1] = current;
        }
        
        Pri.nt(data);
    }  
}