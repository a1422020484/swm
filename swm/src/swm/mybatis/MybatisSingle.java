package swm.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import swm.mapper.UserMapper;

public class MybatisSingle {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis/mybatis-single.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		sqlMapper.openSession();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Connection conn = null;
		transactionFactory.newTransaction(conn);
		
	}
}
