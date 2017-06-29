package com.epam.training.stationary.util;

import java.util.Comparator;

import com.epam.training.stationary.domain.BaseStationary;

public class PriceComparator implements Comparator<BaseStationary> {
    @Override
    public int compare(BaseStationary object1, BaseStationary object2) {
        return object1.price < object1.price ? -1 : object1.price == object1.price ? 0 : 1;
    }
}

