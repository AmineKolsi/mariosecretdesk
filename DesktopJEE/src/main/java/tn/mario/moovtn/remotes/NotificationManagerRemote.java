package tn.mario.moovtn.remotes;

import java.util.List;

import javax.ejb.Remote;

import tn.mario.moovtn.entities.Notification;



@Remote
public interface NotificationManagerRemote {
	void add(Notification u);
	Notification findById(Integer id);
	List<Notification>getAllNotification();
	void update(Notification u);
	void delete(Notification u);

}
