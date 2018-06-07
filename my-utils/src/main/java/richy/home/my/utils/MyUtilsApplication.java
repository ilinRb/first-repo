package richy.home.my.utils;

import static org.junit.Assert.assertNull;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.dsystem.utils.VelocityWrapper;


@SpringBootApplication
@Configuration
@ImportResource("dsystem-config.xml")
public class MyUtilsApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyUtilsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		String echo = VelocityWrapper.echo();
		
		MyClass myClass = new MyClass();
		
		Integer i = myClass.getFirstNumber();
		
		if(myClass.getFirstNumber().equals(new Integer(5))) {
			assertNull(null);
		}		
		
		if(myClass.getFirstNumber()!=null) {
			assertNull(null);
		}
		
		String s = myClass.getFirstString();
	}
}
