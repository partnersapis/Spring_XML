package org.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.study.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	
public List<User> findByCourseId(int courseId);
}
