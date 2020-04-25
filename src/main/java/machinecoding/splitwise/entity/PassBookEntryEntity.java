package machinecoding.splitwise.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * The type Pass book entry entity.
 */
@Data
public class PassBookEntryEntity {

	private String id;

	private Long amount;

	private String lenderId;

	private String borrowerId;

	private String expenseId;

	private LocalDateTime creationTime;
}
