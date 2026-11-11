package org.example.springbootdemo;

import java.util.List;

public class softwareDevelopers {
    private Integer id;
    private String name;
    private String email;
    private List<String> testStack;

    public softwareDevelopers(Integer id, String name, String email, List<String> testStack) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.testStack = testStack;
    }


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public List<String> getTestStack() {
        return testStack;
    }

}
