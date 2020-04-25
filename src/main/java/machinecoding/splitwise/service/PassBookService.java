package machinecoding.splitwise.service;

import machinecoding.splitwise.model.Expense;
import machinecoding.splitwise.model.PassBookEntry;
import machinecoding.splitwise.model.User;

import java.util.List;

/** The interface Pass book service. */
public interface PassBookService {

  /**
   * Gets user expenses.
   *
   * @param user the user
   * @return the user expenses
   */
  List<PassBookEntry> getUserExpenses(User user);

  /**
   * Gets all expense.
   *
   * @return the all expense
   */
  List<PassBookEntry> getAllExpense();

  /**
   * Add entry.
   *
   * @param passBookEntry the pass book entry
   */
  void addEntry(PassBookEntry passBookEntry);

  /**
   * Add expense.
   *
   * @param expense the expense
   */
  void addExpense(Expense expense);
}
