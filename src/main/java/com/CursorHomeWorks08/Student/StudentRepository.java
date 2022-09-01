package com.CursorHomeWorks08.Student;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long>{

//        QueryByExampleExecutor<Student>, JpaSpecificationExecutor<Student>{

//    List<Student> findByName(String name);
//
//    default Student saveWithNameSuffix(Student student) {
//        student.setName(student.getName() + " TM");
//        return save(student);
//    }
//
//    @Modifying
//    @Query("select p from Student p where p.age > ?1")
//    List<Student> findStudentsWithHighPrices(Integer age);
}
