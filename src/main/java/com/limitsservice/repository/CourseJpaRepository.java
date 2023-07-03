package com.limitsservice.repository;
import java.util.List;

import com.limitsservice.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Long>{
	List<Course> findByUsername(String username);
}
