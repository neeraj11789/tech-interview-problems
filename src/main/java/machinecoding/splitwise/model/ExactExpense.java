package machinecoding.splitwise.model;

import java.util.HashMap;
import java.util.List;

/**
 * The type Exact expense.
 */
public class ExactExpense extends Expense {
	@Override
	List<HashMap<User, Float>> getAmountPerBorrower() {
		return null;
	}
}
