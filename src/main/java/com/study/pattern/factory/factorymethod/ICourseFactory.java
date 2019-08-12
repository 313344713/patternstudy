package com.study.pattern.factory.factorymethod;

import com.study.pattern.factory.ICourse;

/**
 * 统一规范
 */
public abstract class ICourseFactory {
    abstract ICourse create();
}
