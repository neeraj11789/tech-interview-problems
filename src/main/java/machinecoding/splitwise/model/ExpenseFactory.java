package machinecoding.splitwise.model;

import lombok.Data;

/** The type Expense factory. */
@Data
public class ExpenseFactory {

	private Expense expense;

  /**
   * Instantiates a new Expense factory.
   *
   * @param type the type
   */
public ExpenseFactory(ExpenseType type) {


	}

  /**
   * New expense expense.
   *
   * @return the expense
   */
public Expense newExpense() {
		// @TODO: Get the params and set it for the object
		return expense;
	}
}
