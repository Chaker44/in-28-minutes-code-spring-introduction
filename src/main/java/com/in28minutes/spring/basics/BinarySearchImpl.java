package com.in28minutes.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm ;


    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        bubbleSortAlgorithm.sort(numbers);
        return 3;
    }



}
