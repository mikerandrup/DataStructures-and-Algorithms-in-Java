/*
 Copyright 2014 Mike Randrup <github@mikerandrup.com>
 See LICENSE file for license details.
 */
package algorithmsanddatastructures.sortalgorithms;

import algorithmsanddatastructures.Pri;

/**
 * @author Mike Randrup <github@mikerandrup.com>
 */
public class SelectionSort implements SortingAlgo {
    
    public SelectionSort() {
        Pri.nt("SelectionSort");
    }

    @Override
    public void SortTheData(int[] data) {
        
        int i, j, index, tmp, len = data.length;
        
        for (i = 0; i < len - 1; i++)
        {
            Pri.nt(data);
            index = i;
            for (j = i + 1; j < len; j++)
                if (data[j] < data[index]) 
                    index = j;
      
            tmp = data[index];  
            data[index] = data[i];
            data[i] = tmp;
        }
        
        Pri.nt(data);
    }  
}