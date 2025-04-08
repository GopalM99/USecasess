package com.rays.service;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TransactionsDAOInt;
import com.rays.dto.TransactionsDTO;

@Repository
public class TransactionServiceImpl extends BaseServiceImpl<TransactionsDTO, TransactionsDAOInt> implements TransactionsServiceInt{

}
