package com.study.pattern.factory.abstractfactory;

import com.study.pattern.factory.ICourse;
import com.study.pattern.factory.IVideo;


/**
 * 定义一系列相关的多个产品（1个产品族）
 */
public abstract class ICourseFactory {

    abstract ICourse createCourse();

    abstract IVideo createVideo();
}
