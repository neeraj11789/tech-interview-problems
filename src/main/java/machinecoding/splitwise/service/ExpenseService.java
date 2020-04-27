package machinecoding.splitwise.service;

import machinecoding.splitwise.model.Expense;
import machinecoding.splitwise.model.User;

import java.util.List;

/** The interface Expense service. */
public interface ExpenseService {

  /**
   * Add expense.
   *
   * @param expense the expense
   */
void addExpense(Expense expense);

  /**
   * Remove expense.
   *
   * @param expense the expense
   */
void removeExpense(Expense expense);

  /**
   * Expense by user list.
   *
   * @param user the user
   * @return the list
   */
List<Expense> expenseByUser(User user);
}