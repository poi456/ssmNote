package com.rj1814.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;

public class getSqlSession {
    private static SqlSessionFactory build;
    private static getSqlSession getSqlSession;
    private getSqlSession(){

    }
    static {
        getSqlSession = new getSqlSession();
        try {
            InputStream in = getSqlSession.getClass().getClassLoader().getResourceAsStream("mybatis.xml");
            build = new SqlSessionFactoryBuilder().build(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return build.openSession();
    }
}
