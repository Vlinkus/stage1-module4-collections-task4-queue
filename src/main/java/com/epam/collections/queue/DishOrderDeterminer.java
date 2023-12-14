package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> newList = new ArrayList<>();
        ArrayList<Integer> dishes = new ArrayList<>();
        if(numberOfDishes > 0) {
            for (int i = 1; i <= numberOfDishes; i++)
                dishes.add(i);
            int count = 0;
            while (newList.size() != numberOfDishes)
                for (int i = 0; i < dishes.size(); i++) {
                    count++;
                    if (count == everyDishNumberToEat) {
                        if(i == dishes.size()-1) {
                            count = 0;
                        }else {
                            count = 1;
                        }
                        newList.add(dishes.get(i));
                        dishes.remove(i);
                    }
                }
        }
        return newList;
    }
}
