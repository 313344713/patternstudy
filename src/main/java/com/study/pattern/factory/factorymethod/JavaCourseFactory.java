package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.JavaCourse;

public class JavaCourseFactory extends ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
