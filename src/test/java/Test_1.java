import java.math.BigDecimal;
import java.sql.Date;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lingzhuo.entity.CustomerEntity;



/**
 * 
 */

/**
 * @ClassName: Test_1
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 下午9:04:39
 * 
 * 
 * 下面加载配置文件通过注解加载
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)//使用Spring单元测试
@Configuration("classpath:applicationContext.xml")
public class Test_1 {

	public void test_1(){
		  CustomerEntity cus=new CustomerEntity();
		  cus.setCusnames("jiujiu");
		  cus.setBirthday(Date.valueOf("2002-09-09"));
		  cus.setSal(new BigDecimal("7009"));
		  
	}
}
