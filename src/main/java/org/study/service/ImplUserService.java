package org.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.study.Entity.User;
import org.study.repository.CourseRepository;
import org.study.repository.UserRepository;
@Service
public class ImplUserService implements IUserService{
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
		
	}

	@Override
	public Optional<User> getUserById(int id) {
		Optional<User> user=userRepo.findById(id);
		if(user.isPresent()) {
			return user;
		}
		return null;
	}

	@Override
	public String addUser(User user) {
		Optional<User> user1 =userRepo.findById(user.getId());
		if(user1.isPresent())
			return "already exist";
		else {
			userRepo.save(user);
			return "added successfully";
		}
		
	}

	@Override
	public String deleteUser(int id) {
		Optional<User> user =userRepo.findById(id);
		if(user.isPresent())
		{	userRepo.deleteById(id);
		return "user deleted successfully";
		}
		else {
		return "No user to delete";
		}
		
	}

	@Override
	public String updateUser(User user,int id) {
		Optional<User> user1 = userRepo.findById(user.getId());
		if(user1.isPresent()) {
			userRepo.save(user);
			return "updated successfully";
		}
		return "no user found";
	}

//	@Override
//	public List<User> getAllUserByCourseId(int cs_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<User> getAllUserByCourseId(int courseId) {
		return userRepo.findByCourseId(courseId);
		
	}

}
