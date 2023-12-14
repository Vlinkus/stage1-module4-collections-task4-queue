package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new ReverseStringComparator());
        queue.addAll(firstList);
        queue.addAll(secondList);
       return queue;
    }
}
class ReverseStringComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

