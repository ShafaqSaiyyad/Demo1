package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.bean.ArmstrongNumber;

@SpringBootApplication
public class DemoProj02Application {

	public static void main(String[] args) {
		System.out.println("DemoProj02Application.main()");
		ConfigurableApplicationContext ctx=SpringApplication.run(DemoProj02Application.class, args);
		ArmstrongNumber a=ctx.getBean("arm",ArmstrongNumber.class);
		int num=142;
		a.isArmstrong(num);
		
	}

}
