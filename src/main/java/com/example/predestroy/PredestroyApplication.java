package com.example.predestroy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PredestroyApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext();

		MyBean mb1 = ctx.getBean(MyBean.class);
		System.out.println(mb1.hashCode());

		MyBean mb2 = ctx.getBean(MyBean.class);
		System.out.println(mb2.hashCode());

		ctx.close();
	}

}
