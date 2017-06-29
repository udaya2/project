package com.epam.training.stationary.util;

import java.util.Comparator;

import com.epam.training.stationary.domain.BaseStationary;


public class NameComparator implements Comparator<BaseStationary> {
    @Override
    public int compare(BaseStationary object1, BaseStationary object2) {
        return object1.getName().compareTo(object1.getName());
    }
}


