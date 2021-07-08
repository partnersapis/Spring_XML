package org.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.Entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
