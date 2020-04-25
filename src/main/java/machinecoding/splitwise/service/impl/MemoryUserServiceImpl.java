package machinecoding.splitwise.service.impl;

import lombok.NonNull;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.service.UserService;
import machinecoding.splitwise.util.Constants;

import java.util.HashMap;
import java.util.Map;

/** The type Memory user service. */
public class MemoryUserServiceImpl implements UserService {

	// Save Users Info in Memory
	private static final Map<String, User> users = new HashMap<>();

	@Override
	public void create(@NonNull User user) {
		if(users.containsKey(user.getId()))
			throw new IllegalArgumentException(Constants.DUPLICATE_USER_MSG);
		users.put(user.getId(), user);
        System.out.println(Constants.USER_SAVED_MSG);
	}

	@Override
	public void findByName(String name) {

	}

	@Override
	public void delete(User user) {

	}
}
