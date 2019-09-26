package com.rony.test;

import com.rony.mapper.CourseMapper;
import com.rony.pojo.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
//        InputStream is = Resources.getResourceAsStream("generatorConfig.xml");
//
//        SqlSession ss = new SqlSessionFactoryBuilder().build(is).openSession();
//        CourseMapper mapper = ss.getMapper(CourseMapper.class);
//        Course c=new Course();
//        c.setId(20190707);
//        c.setTeacherid(2012);
//        c.setCoursename("MyBatis");
//
//        int i = mapper.insert(c);
//        System.out.println(i);
    }
}
