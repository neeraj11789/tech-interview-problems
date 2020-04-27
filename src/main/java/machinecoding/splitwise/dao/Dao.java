package machinecoding.splitwise.dao;

import java.util.List;
import java.util.Optional;

/**
 * The interface Dao.
 *
 * @param <T>   the type parameter
 */
public interface Dao<T> {

	/**
	 * Gets by id.
	 *
	 * @param id the id
	 * @return the by id
	 */
Optional<T> getById(String id);

	/**
	 * Gets all.
	 *
	 * @return the all
	 */
List<T> getAll();

	/**
	 * Save.
	 *
	 * @param t the t
	 */
void save(T t);

	/**
	 * Delete.
	 *
	 * @param t the t
	 */
void delete(T t);

	/**
	 * Delete by id.
	 *
	 * @param id the id
	 */
void deleteById(String id);
}
