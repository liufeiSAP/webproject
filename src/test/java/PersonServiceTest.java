 
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.deppon.test04.service.IPersonService;
public class PersonServiceTest {
	
	public static void main(String args[])
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonService per = (IPersonService) factory.getBean("personService");
		per.processSave();
	}
}
