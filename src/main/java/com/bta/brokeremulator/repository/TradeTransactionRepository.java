package com.bta.brokeremulator.repository;

import com.bta.brokeremulator.model.TradeTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradeTransactionRepository extends CrudRepository<TradeTransaction, Long> {
    List<TradeTransaction> findAllByUserAccountUsername(String username);
}
