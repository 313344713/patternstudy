package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.PythonCourse;

public class PythonCourseFactory extends ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
