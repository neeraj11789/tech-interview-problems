package machinecoding.splitwise.service;

import machinecoding.splitwise.model.User;

/**
 * The interface User service.
 */
public interface UserService {

  /**
   * Create.
   *
   * @param user the user
   */
void create(User user);

  /**
   * Find by name.
   *
   * @param name the name
   */
void findByName(String name);

  /**
   * Delete.
   *
   * @param user the user
   */
void delete(User user);
}