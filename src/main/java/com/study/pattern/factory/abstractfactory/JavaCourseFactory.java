package com.study.pattern.factory.abstractfactory;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.IVideo;
import com.study.pattern.factory.JavaCourse;
import com.study.pattern.factory.JavaVideo;

public class JavaCourseFactory extends ICourseFactory{

    @Override
    ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    IVideo createVideo() {
        return new JavaVideo();
    }
}
