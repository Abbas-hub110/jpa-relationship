package com.murtazait.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murtazait.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
