package machinecoding.splitwise.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import machinecoding.splitwise.model.Expense;
import machinecoding.splitwise.model.PassBookEntry;
import machinecoding.splitwise.model.User;
import machinecoding.splitwise.service.ExpenseService;
import machinecoding.splitwise.service.PassBookService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The type Memory expense service. */
@RequiredArgsConstructor
public class MemoryExpenseServiceImpl implements ExpenseService {

	// in memory expenses
	private static final Map<String, Expense> expenses = new HashMap<>();

	@NonNull
	private PassBookService passBookService;

	@Override
	public void addExpense(@NonNull Expense expense) {
		expenses.put(expense.getId(), expense);
		// add the balances
		passBookService.addExpense(expense);
	}

	@Override
	public void removeExpense(Expense expense) {

	}

	@Override
	public List<Expense> expenseByUser(User user) {
		return null;
	}
}
