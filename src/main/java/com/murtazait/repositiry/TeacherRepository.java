package com.murtazait.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murtazait.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
