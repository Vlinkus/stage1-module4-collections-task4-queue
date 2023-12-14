package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        boolean firstNow = true;
        int count = 0;
        Integer removed;
        while(count < 4){
            if(count<2){
                count++;
                removed = firstQueue.poll();
                if(removed != null) {
                    deq.offer(removed);
                }
            } else {
                count++;
                removed = secondQueue.poll();
                if(removed != null) {
                    deq.offer(removed);
                }
            }
        }
        count = 0;
        while(!secondQueue.isEmpty() ){
            if(firstNow){
                if(count == 0){
                    firstQueue.offer(deq.pollLast());
                }
                count++;
                removed = firstQueue.poll();
                if(removed != null) {
                    deq.offer(removed);
                }
                if(count == 2){
                    firstNow = false;
                    count =  0;
                }
            }else {
                if(count == 0){
                    secondQueue.offer(deq.pollLast());
                }
                count++;
                removed = secondQueue.poll();
                if(removed != null) {
                    deq.offer(removed);
                }
                if(count == 2){
                    firstNow = true;
                    count =  0;
                }
            }

        }
        return deq;
    }

}
