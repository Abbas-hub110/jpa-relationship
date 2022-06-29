package com.murtazait.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murtazait.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query("select s.userName from Student s inner join s.area sub where sub.idArea = :idArea")
}
