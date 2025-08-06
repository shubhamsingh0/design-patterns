package com.shubhamsingh0.design.lld.designpatterns.structural.composite;

public class Client {
    public static void main(String[] args) {
//        The composite pattern solves the problem of treating individual objects and
//        compositions of objects uniformly. It allows you to build complex tree structures
//        of objects, where both leaf nodes and composite nodes can be interacted with through
//        a common interface. This simplifies client code and supports recursive structures
//        like file systems or organizational hierarchies.
//        Example: File system structure where files and directories can be treated uniformly

        File rootDirectory = new Directory();
        rootDirectory.add(new SimpleFile("file1.txt", 100));
        rootDirectory.add(new SimpleFile("file2.txt", 100));
        Directory subDirectory = new Directory();
        subDirectory.setName("subDir");
        subDirectory.add(new SimpleFile("file3.txt", 200));

        Directory subDirectory2 = new Directory();
        subDirectory2.setName("subDir2");
        subDirectory2.add(new SimpleFile("file5.txt", 300));

        subDirectory.add(new SimpleFile("file4.txt", 200));
        subDirectory.add(subDirectory2);
        rootDirectory.add(subDirectory);
        rootDirectory.setName("rootDir");
        System.out.println("Root Directory: " + rootDirectory.getName());
        System.out.println("Total Size: " + rootDirectory.getSize() + " bytes");
        System.out.println("Type: " + rootDirectory.getType());
        System.out.println("Content:\n" + rootDirectory.showContent(" "));
    }
}
