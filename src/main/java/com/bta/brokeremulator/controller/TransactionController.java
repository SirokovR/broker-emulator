package com.bta.brokeremulator.controller;


import com.bta.brokeremulator.model.TradeTransaction;
import com.bta.brokeremulator.service.TradeTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("transaction")
public class TransactionController {


    @Autowired
    private TradeTransactionService tradeTransactionService;

    @PostMapping("create")
    public ModelAndView createTransaction(@ModelAttribute TradeTransaction transaction){

        tradeTransactionService.saveTradeTransactionByUsername(transaction, "testuser");
        List<TradeTransaction> tradeTransactions = tradeTransactionService.getTransactionByUsername("testuser");

        final Map<String, Object> params = new HashMap<>();
        params.put("transaction", tradeTransactions);


        return  new ModelAndView("transaction/table",params);
    }
}
