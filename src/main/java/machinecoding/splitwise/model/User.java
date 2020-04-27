package machinecoding.splitwise.model;

import lombok.Data;

import java.util.UUID;

/** The type User. */
@Data
public class User {

	private String id = UUID.randomUUID().toString();

	private String name;

	private String email;

	private String password;

	private Long mobile;

	private boolean isValid(){
		return true;
	}
}
