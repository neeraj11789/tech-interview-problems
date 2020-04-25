package machinecoding.splitwise.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * The type Pass book entry.
 */
@Data
public class PassBookEntry {

	// PassBook Id
	private String rowId = UUID.randomUUID().toString();

	private Float amount;

	private User lender;

	private User Borrower;

	private Expense expense;

	private LocalDateTime createdTime = LocalDateTime.now();

	/**
	 * Instantiates a new Pass book entry.
	 *
	 * @param amount the amount
	 * @param lender the lender
	 * @param expense the expense
	 */
public PassBookEntry(Float amount, User lender, Expense expense) {
		this.amount = amount;
		this.lender = lender;
		this.expense = expense;
	}

	/**
	 * Instantiates a new Pass book entry.
	 *
	 * @param amount the amount
	 * @param lender the lender
	 * @param borrower the borrower
	 * @param expense the expense
	 */
public PassBookEntry(Float amount, User lender, User borrower, Expense expense) {
		this.amount = amount;
		this.lender = lender;
		Borrower = borrower;
		this.expense = expense;
	}
}