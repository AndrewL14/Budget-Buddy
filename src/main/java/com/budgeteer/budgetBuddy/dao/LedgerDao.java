package com.budgeteer.budgetBuddy.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.budgeteer.budgetBuddy.dao.models.Expense;
import com.budgeteer.budgetBuddy.dao.models.Ledger;

import java.util.List;

public class LedgerDao {
    private DynamoDBMapper mapper;

    public LedgerDao(DynamoDBMapper mapper) {
        this.mapper = mapper;
    }

    public List<Ledger> get(String ledgerId) {
        Ledger ledger  = new Ledger();
        ledger.setLedgerId(ledgerId);

        DynamoDBQueryExpression<Ledger> expression = new DynamoDBQueryExpression<Ledger>()
                .withConsistentRead(false)
                .withHashKeyValues(ledger);
        return mapper.query(Ledger.class, expression);
    }

    public void create(Ledger ledger, Expense expense) {
        mapper.save(ledger);
    }
}
