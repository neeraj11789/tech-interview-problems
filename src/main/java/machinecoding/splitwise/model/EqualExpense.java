package machinecoding.splitwise.model;

import lombok.NonNull;
import machinecoding.splitwise.util.Constants;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/** The type Equal expense. */
public class EqualExpense extends Expense {

  /**
   * Instantiates a new Equal expense.
   *
   * @param lender the lender
   * @param amount the amount
   * @param type the type
   * @param borrowerShareMap the borrower share map
   */
  public EqualExpense(
      @NonNull User lender,
      @NonNull Float amount,
      @NonNull ExpenseType type,
      @NonNull Map<User, Float> borrowerShareMap) {
		super(lender, amount, type, borrowerShareMap);
	}

	@Override
	public void calculateAmountPerUser() {
		if (getBorrowerShareMap().entrySet().size() < 1)
			throw new IllegalArgumentException(Constants.INVALID_USER_SHARE);
		float perUserX = getAmount() / getBorrowerShareMap().entrySet().size();
		Map<User, Float> userFloatMap = new HashMap<>();

		Iterator<Map.Entry<User, Float>> iterator = getBorrowerShareMap().entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<User, Float> curr = iterator.next();
			userFloatMap.put(curr.getKey(), perUserX);
		}

		this.setAmountPerBorrower(userFloatMap);
	}
}
