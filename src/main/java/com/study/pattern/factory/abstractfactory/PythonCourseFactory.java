package com.study.pattern.factory.abstractfactory;

import com.study.pattern.factory.*;

public class PythonCourseFactory extends ICourseFactory{

    @Override
    ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    IVideo createVideo() {
        return null;
    }
}
