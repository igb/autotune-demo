package org.hccp.jvm.autotune;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class XComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if  (((Point2D)o1).getX() < ((Point2D)o2).getX()) {
            return -1;
        } else if (((Point2D)o1).getX() > ((Point2D)o2).getX()) {
            return 1;
        } else {
            return 0;
        }
    }
}
