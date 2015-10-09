package tn.mario.moovtn.remotes;

import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.User;

@Remote
public interface UserService {
	void addUser(User u);

	User findUsrById(Integer id);

	List<User> getAllUsers();

	void updateUser(User u);

	void deleteUSer(User u);

	User loginAdmin(String pwd, String login);

}
