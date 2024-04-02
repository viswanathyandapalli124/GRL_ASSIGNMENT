package com.example.springbootwebproject.entities;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static List<ParentData> generateTestData(int numOfParents) {
        List<ParentData> parents = new ArrayList<>();
        for (int i = 1; i <= numOfParents; i++) {
            ParentData parent = new ParentData( null, i, null);
            parent.setName("Parent " + i);
            parent.setAge(30); // For example
            parent.setChildren(generateChildren(i));
            parents.add(parent);
        }
        return parents;
    }

    private static List<ChildData> generateChildren(int numOfChildren) {
        List<ChildData> children = new ArrayList<>();
        for (int i = 1; i <= numOfChildren; i++) {
            ChildData child = new ChildData(null, i);
            child.setName("Child " + i);
            child.setAge(10); // For example
            children.add(child);
        }
        return children;
    }
}

