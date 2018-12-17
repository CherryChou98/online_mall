package config.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 数据库访问类
 */
public class DBAccess {
    private static DBAccess ourInstance = new DBAccess();

    public static DBAccess getInstance() {
        return ourInstance;
    }

    private DBAccess() {
    }

    public SqlSession getSqlSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("main/resource/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
