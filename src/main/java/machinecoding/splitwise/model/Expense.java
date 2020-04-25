package machinecoding.splitwise.model;

import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/** The type Expense. */
@Data
public abstract class Expense {

	private String id = UUID.randomUUID().toString();

	@NonNull
	private User lender;

	@NonNull
	private Float amount;

	@NonNull
	private ExpenseType type;

	@NonNull
	private Map<User, Float> borrowerShareMap;

	private Map<User, Float> amountPerBorrower;

	private LocalDateTime creationTime = LocalDateTime.now();

  /**
   * Validate boolean.
   *
   * @return the boolean
   */
  // @TODO
  public boolean validate() {
		return true;
	}

  /** Calculate amount per user. */
  abstract void calculateAmountPerUser();

  /**
   * Instantiates a new Expense.
   *
   * @param lender the lender
   * @param amount the amount
   * @param type the type
   * @param borrowerShareMap the borrower share map
   */
  public Expense(
      @NonNull User lender,
      @NonNull Float amount,
      @NonNull ExpenseType type,
      @NonNull Map<User, Float> borrowerShareMap) {
		this.lender = lender;
		this.amount = amount;
		this.type = type;
		this.borrowerShareMap = borrowerShareMap;

		// Calculate Amount per borrower
		calculateAmountPerUser();
	}
}
