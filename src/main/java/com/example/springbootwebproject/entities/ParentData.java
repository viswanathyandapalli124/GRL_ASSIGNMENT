package com.example.springbootwebproject.entities;

import java.util.List;

public class ParentData {
	private String name;
    private int age;
    private List<ChildData> children;
	public ParentData(String name, int age, List<ChildData> children) {
		super();
		this.name = name;
		this.age = age;
		this.children = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<ChildData> getChildren() {
		return children;
	}
	public void setChildren(List<ChildData> children) {
		this.children = children;
	}
    
}
