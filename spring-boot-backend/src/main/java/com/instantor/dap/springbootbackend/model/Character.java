package com.instantor.dap.springbootbackend.model;

import com.instantor.dap.springbootbackend.enums.Sex;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;
    private Sex sex;
    private Jedi jedi;
    private List<Character> children;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Jedi getJedi() {
        return jedi;
    }

    public void setJedi(Jedi jedi) {
        this.jedi = jedi;
    }

    public List<Character> getChildren() {
        return children;
    }

    public void addChildren(Character child) {
        if (children == null){
            children = new ArrayList<>();
        }
        this.children.add(child);
    }
}
