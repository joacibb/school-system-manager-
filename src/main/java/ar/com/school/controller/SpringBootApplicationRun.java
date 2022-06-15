package ar.com.school.controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={"ar.com.school.manager","ar.com.school.controller","ar.com.school.models","ar.com.school.entities"})
public class SpringBootApplicationRun
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringBootApplicationRun.class, args);
    }
}