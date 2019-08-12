package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;

/**
 *
 */
public class ICourseFactoryTest {
    public static void main(String[] args) {
        ICourse course = null;
        ICourseFactory courseFactory = new JavaCourseFactory();
        course = courseFactory.create();
        course.recored();
        courseFactory = new PythonCourseFactory();
        course = courseFactory.create();
        course.recored();
    }
}
