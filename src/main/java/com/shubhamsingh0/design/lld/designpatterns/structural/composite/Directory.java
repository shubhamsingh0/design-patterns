package com.shubhamsingh0.design.lld.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// This class represents a LeafNode in the Composite Design Pattern.
public class Directory implements File {
    List<File> children = new ArrayList<>();
    private String name;
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
        this.children.add(file);
    }

    @Override
    public void remove(File file) {
        this.children.add(file);
    }

    @Override
    public File getChild(int index) {
        return this.children.get(index);
    }

    @Override
    public int getSize() {
        return children.stream()
                .mapToInt(File::getSize)
                .sum();
    }

    @Override
    public String getType() {
        return "directory";
    }
    @Override
    public String showContent(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("+ ").append(name).append("/\n");
        for (File f : children) {
            sb.append(f.showContent(indent + "  "));
        }
        return sb.toString();
    }
}
