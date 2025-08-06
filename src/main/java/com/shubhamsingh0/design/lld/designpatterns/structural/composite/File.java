package com.shubhamsingh0.design.lld.designpatterns.structural.composite;

/**
 * Interface representing a file or directory in a file system.
 * It can be a leaf node (file) or a composite node (directory).
 */
// This class represents a Component in the Composite Design Pattern.
public interface File {
    String getName();
    void setName(String name);
    void add(File file);
    void remove(File file);
    File getChild(int index);
    int getSize();
    String getType();
    String showContent(String indent);
}
