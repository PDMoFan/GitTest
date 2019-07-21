package com.mju.edu.redistest.redis.entity;
import java.util.List;
import com.mju.edu.redistest.redis.entity.Redis;

import java.io.Serializable;

public class Redis implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private Integer age;

    /**
     * sex
     */
    private String sex;

    private static final long serialVersionUID = 1L;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Redis{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}