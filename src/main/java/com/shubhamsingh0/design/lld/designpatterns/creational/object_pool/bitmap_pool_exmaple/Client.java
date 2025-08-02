package com.shubhamsingh0.design.lld.designpatterns.creational.object_pool.bitmap_pool_exmaple;

public class Client {
    public static void main(String[] args) {
//        The classic ObjectPool pattern usually manages a pool of the same type of object, but you can extend it for your use case.
        ObjectPool<Bitmap> imagePool = new ObjectPool<>(()->new Bitmap("bitmap.png"), 3);
        Bitmap bitmap = imagePool.get();
        bitmap.draw();
        bitmap.setLocation(new java.awt.geom.Point2D.Double(10, 20));
        imagePool.release(bitmap);
    }
}
