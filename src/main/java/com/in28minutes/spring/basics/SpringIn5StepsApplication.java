package com.in28minutes.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {
//        BinarySearchImpl binarySearch = new BinarySearchImpl();
//        System.out.println(result);
        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);
        int result =binarySearchBean.binarySearch(new int[]{12,4,6}, 3);

    }

}
