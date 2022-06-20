package com.fatsnake.spring.annotaion_07.f_typefilter.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Auther: fatsnake
 * @Description":
 * @Date:2022/6/20 09:47
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Animal {
}
