package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.bitmap_pool_exmaple;

import java.awt.geom.Point2D;

public class Bitmap implements Image{

    private Point2D location;

    public Bitmap(String name) {
    }

    @Override
    public void draw() {
        System.out.println("Drawing Bitmap at location: " + location);
    }

    @Override
    public Point2D getLocation() {
        return null;
    }

    @Override
    public void setLocation(Point2D location) {
        System.out.println(location);
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap reset");
    }
}
