package com.fatsnake.spring.annotaion_07.f_typefilter.fillter;

import com.fatsnake.spring.annotaion_07.f_typefilter.color.Green;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Auther: fatsnake
 * @Description": https://blog.csdn.net/qq_29860591/article/details/108613847   spring组件注册 自定义TypeFilter 指定过滤规则
 * @Date:2022/6/20 09:55
 * Copyright (c) 2022, zaodao All Rights Reserved.
 */
public class GreenTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        return classMetadata.getClassName().equals(Green.class.getName());
    }
}
