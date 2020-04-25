package machinecoding.splitwise.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The type Expense entity.
 */
@Data
public class ExpenseEntity {

	private String id;

	private String name;

	private String notes;

	private List<String> images;

	private LocalDateTime creationTime;

	private LocalDateTime updationTime;
}
