package com.study.pattern.factory.simplefactory;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.JavaCourse;
import com.study.pattern.factory.PythonCourse;
import org.apache.commons.lang3.StringUtils;

/**
 * 课程工厂(简单工厂)
 */
public class CourseFactory {

    /**
     * 方式一
     * @param courseName
     * @return
     */
    public ICourse create(String courseName) {
        if ("JAVA".equals(courseName)) {
            return new JavaCourse();
        } else if ("PYTHON".equals(courseName)) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    /**
     * 方式二
     * @param clazz
     * @return
     */
    public ICourse createByClass(String clazz) {
        try {
            if (StringUtils.isNotEmpty(clazz)) {
                return (ICourse)Class.forName(clazz).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方式三
     * @param clazz
     * @return
     */
    public ICourse create(Class<? extends ICourse> clazz){
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
