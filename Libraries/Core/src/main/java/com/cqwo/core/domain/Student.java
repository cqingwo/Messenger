package com.cqwo.core.domain;

import java.io.Serializable;

/**
 * Created by cqnews on 2017/4/12.
 */
public class Student  implements Serializable {
    private int classId;
    private String level;

    public Student() {
    }

    public Student(int classId, String level) {
        this.classId = classId;
        this.level = level;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "{classId:" + classId + ",level:" + level + "}";
    }
}