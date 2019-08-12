package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.JavaCourse;

/**
 * 简单工厂测试类
 */
public class CourseFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.create("PYTHON");
        course.recored();
        course = courseFactory.createByClass("com.study.pattern.factory.JavaCourse");
        course.recored();
        course = courseFactory.create(JavaCourse.class);
        course.recored();
    }
}
