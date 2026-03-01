package com.dani.expensetracker.repository;

import com.dani.expensetracker.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ExpenseRepository {

    private final List<Expense> expenses = new ArrayList<>();
    private Long currentId = 1L;

    public List<Expense> findAll() {
        return expenses;
    }

    public Optional<Expense> findById(Long id) {
        return expenses.stream()
                .filter(expense -> expense.getId().equals(id))
                .findFirst();
    }

    public Expense save(Expense expense) {
        expense.setId(currentId++);
        expenses.add(expense);
        return expense;
    }

    public void deleteById(Long id) {
        expenses.removeIf(expense -> expense.getId().equals(id));
    }
}