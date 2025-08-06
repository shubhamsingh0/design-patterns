package com.shubhamsingh0.design.lld.designpatterns.structural.composite;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
// This class represents a  in the Composite Design Pattern.
public class SimpleFile implements File {
    private String name;
    private int size;

    public SimpleFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException("Leaf nodes cannot have children.");
    }

    @Override
    public void remove(File file) {
        throw new UnsupportedOperationException("Leaf nodes cannot have children.");
    }

    @Override
    public File getChild(int index) {
        throw new UnsupportedOperationException("Leaf nodes do not have children.");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getType() {
        return "Leaf Node";
    }

    @Override
    public String showContent(String indent) {
        return indent + "- " + name + " (" + size + " bytes)\n";
    }
}
