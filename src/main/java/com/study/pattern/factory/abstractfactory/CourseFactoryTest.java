package com.study.pattern.factory.abstractfactory;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.IVideo;

public class CourseFactoryTest {

    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse course = javaCourseFactory.createCourse();
        IVideo video = javaCourseFactory.createVideo();
        course.recored();
        video.play();
    }
}
