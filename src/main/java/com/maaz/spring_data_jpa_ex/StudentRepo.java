package com.maaz.spring_data_jpa_ex;

import com.maaz.spring_data_jpa_ex.model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

//    @Query(value = "SELECT u FROM student u WHERE u.userID  = :name")
    List<Student> findByName(String name);

//    @Query("select s from student s where s.marks = :marks")
    List<Student> findByMarks(Integer marks);

}
