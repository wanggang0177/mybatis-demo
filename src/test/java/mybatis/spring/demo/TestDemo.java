package mybatis.spring.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import mybatis.spring.demo.dao.TeacherDao;
import mybatis.spring.demo.pojo.Teacher;

@ContextConfiguration(locations = { "classpath:mybatis-spring/spring-bean.xml" })
public class TestDemo extends AbstractTestNGSpringContextTests{

//	private static final Logger log = LoggerFactory.getLogger(SpringIntegrationTest.class);  
    
    @Autowired
    TeacherDao teacherDao;  
    
//    @Test  
//    public void queryTest() { 
//    	Teacher t = new Teacher();
//    	t.setName("Mrs zhang");
//    	t.setAge(32);
//    	    
//    	ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis-spring/spring-bean.xml"); 
//    	TeacherDao teacherDao = (TeacherDao) ctx.getBean("teacherDao");
//    	teacherDao.insertTeacher(t);
//    }
    

	@Test 
    public void queryTest2() { 
    	Teacher t = new Teacher();
    	t.setName("Mrs zhang");
    	t.setAge(32);
    	teacherDao.insertTeacher(t);
    }  
}
