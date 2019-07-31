package com.hcl.springbootTrainingdemo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.hcl.springbootTrainingdemo.entity.User;
import com.hcl.springbootTrainingdemo.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	@Mock
	UserRepository UserRepository;
	@InjectMocks
	UserService userService;
	
	
	List<User> ul=new ArrayList<>();
       
	User user;
	@Before
	public void init() {
	user=new User();
	user.setAge(25);
	user.setFirstName("Dimple");
	user.setLastName("Kumari");
	ul.add(user);
	
	}
	
	
	
	@Test
	public void saveUsertest() {
		when(UserRepository.save(Mockito.any())).thenReturn(user);
		User user1=new User();
		user1.setAge(25);
		user1.setFirstName("Dimple");
		user1.setLastName("Kumari");
		String user2=userService.saveUser(user1);
		assertEquals("Dimple", user.getFirstName());
	}
	@Test
	public void  getAllUserstest() {
		when(UserRepository.findAll()).thenReturn(ul);
		List<User> uex=userService.getAllUsers();
		assertEquals(uex.size(), ul.size());
	}

}
