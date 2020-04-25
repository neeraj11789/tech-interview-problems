package machinecoding.splitwise.dao;

import machinecoding.splitwise.entity.UserEntity;

import java.util.List;
import java.util.Optional;

/**
 * The type User dao.
 */
public class UserDao implements Dao<UserEntity> {
	@Override
	public Optional<UserEntity> getById(String id) {
		return Optional.empty();
	}

	@Override
	public List<UserEntity> getAll() {
		return null;
	}

	@Override
	public void save(UserEntity userEntity) {

	}

	@Override
	public void delete(UserEntity userEntity) {

	}

	@Override
	public void deleteById(String id) {

	}
}
