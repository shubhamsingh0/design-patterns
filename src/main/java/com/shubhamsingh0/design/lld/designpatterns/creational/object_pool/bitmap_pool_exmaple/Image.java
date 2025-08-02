package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.bitmap_pool_exmaple;

import java.awt.geom.Point2D;

public interface Image extends Poolable {
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);
}
