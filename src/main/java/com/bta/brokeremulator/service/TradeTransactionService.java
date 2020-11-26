package com.bta.brokeremulator.service;

import com.bta.brokeremulator.model.TradeTransaction;

import java.util.List;

public interface TradeTransactionService {
    public void saveTradeTransactionByUsername(TradeTransaction transaction, String username);

    List<TradeTransaction> getTransactionByUsername(String username);
}
