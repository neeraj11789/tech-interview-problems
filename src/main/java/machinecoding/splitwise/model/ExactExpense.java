package machinecoding.splitwise.model;

import lombok.NonNull;

import java.util.Map;

/** The type Exact expense. */
public class ExactExpense extends Expense {

  /**
   * Instantiates a new Expense.
   *
   * @param lender the lender
   * @param amount the amount
   * @param type the type
   * @param borrowerShareMap the borrower share map
   */
  public ExactExpense(
      @NonNull User lender,
      @NonNull Float amount,
      @NonNull ExpenseType type,
      @NonNull Map<User, Float> borrowerShareMap) {
		super(lender, amount, type, borrowerShareMap);
	}

	@Override
	void calculateAmountPerUser() {

	}
}
