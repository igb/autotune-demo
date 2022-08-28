package org.hccp.jvm.autotune;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class YComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
       if  (((Point2D)o1).getY() < ((Point2D)o2).getY()) {
           return -1;
       } else if (((Point2D)o1).getY() > ((Point2D)o2).getY()) {
           return 1;
       } else {
           return 0;
       }
    }
}
