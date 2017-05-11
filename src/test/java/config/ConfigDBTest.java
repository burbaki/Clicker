package config;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//дописать тест для бд
public class ConfigDBTest {

	@Test
	public void ConfigDBShouldCreateNotNullDataSource(){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigDB.class);
		DataSource ds = ctx.getBean("dataSource" , DataSource.class);
		Assert.assertNotNull(ds);
	}
}
