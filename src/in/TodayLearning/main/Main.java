package in.TodayLearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.TodayLearning.beans.Student;

public class Main 
{
    public static void main(String args[])
    {
    	String config_location="/in/TodayLearning/resources/ApplicationContext.xml";
    	ApplicationContext context = new AnnotationConfigApplicationContext(config_location);
    	
    	Student bean = context.getBean(Student.class);
    	
    	bean.display();
    	
    }
}
