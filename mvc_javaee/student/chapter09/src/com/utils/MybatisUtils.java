package com.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 工具类
 * @author Administrator
 *
 */
public class MybatisUtils {
	private static SqlSessionFactory sqlSessionFactory = null;
	//初始化SqlsessionFactory对象
	static {
		//使用Mybatis提供的Resources类加载Mybatis配置文件
		try {
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			//构建SqlSessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//获取SqlSession对象的静态方法
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}
