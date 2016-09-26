package com.epam.second.comparator;


import com.epam.second.entity.Sweet;

import java.util.Comparator;

public class SweetWeightComparator implements Comparator<Sweet> {

    public int compare(Sweet s1, Sweet s2) {
        if(s1.getWeight() < s2.getWeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}
