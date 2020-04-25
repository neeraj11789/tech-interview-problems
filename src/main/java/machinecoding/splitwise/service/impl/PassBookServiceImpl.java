package machinecoding.splitwise.service.impl;

import machinecoding.splitwise.model.Expense;
import machinecoding.splitwise.model.PassBookEntry;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.service.PassBookService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The type Pass book service. */
public class PassBookServiceImpl implements PassBookService {

	// in memory passbook save
	private static final Map<String, PassBookEntry> records = new HashMap<>();

	@Override
	public List<PassBookEntry> getUserExpenses(User user) {
		return null;
	}

	@Override
	public List<PassBookEntry> getAllExpense() {
		return null;
	}

	@Override
	public void addEntry(PassBookEntry passBookEntry) {
		records.put(passBookEntry.getRowId(), passBookEntry);
	}

	@Override
	public void addExpense(Expense expense) {
		// Entry For the Lender
		PassBookEntry entry = new PassBookEntry(expense.getAmount(), expense.getLender(), expense);
		records.put(entry.getRowId(), entry);
		// Store Negative Balance for each borrower
		for (Map.Entry<User, Float> m : expense.getAmountPerBorrower().entrySet()){
			entry = new PassBookEntry(m.getValue(), m.getKey(), expense);
			records.put(entry.getRowId(), entry);
		}
	}
}
