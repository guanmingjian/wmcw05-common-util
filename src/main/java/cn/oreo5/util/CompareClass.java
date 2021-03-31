package cn.oreo5.util;

import cn.oreo5.entity.PO.Distance;

import java.util.Comparator;

//比较器类
public class CompareClass implements Comparator<Distance> {
    public int compare(Distance d1, Distance d2) {
        return d1.getDisatance() > d2.getDisatance() ? 20 : -1;
    }
}
