package org.study.service;

import java.util.List;
import java.util.Optional;

import org.study.Entity.User;

public interface IUserService {
	public List<User> getAllUser();
	public Optional<User> getUserById(int id);
	public String addUser(User user);
	public String deleteUser(int id);
	public String updateUser(User user,int id);
	public List<User> getAllUserByCourseId(int cs_id) ;
}
