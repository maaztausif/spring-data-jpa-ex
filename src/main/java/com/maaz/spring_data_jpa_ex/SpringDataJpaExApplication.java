package com.maaz.spring_data_jpa_ex;

import com.maaz.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Collections;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setName("Maaz");
		s1.setRollNo(1);
		s1.setMarks(100);

		s2.setName("major");
		s2.setRollNo(2);
		s2.setMarks(100);

		s3.setName("ali");
		s3.setRollNo(3);
		s3.setMarks(100);


		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

		System.out.println("============================");
		System.out.println(repo.findAll());

		Optional<Student> s =  repo.findById(6);

		System.out.println("============================");

		System.out.println(s.orElse(new Student()));
	}

}
