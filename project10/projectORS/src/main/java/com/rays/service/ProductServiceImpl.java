package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.ProductDAOInt;
import com.rays.dto.ProductDTO;

@Service
@Transactional
public class ProductServiceImpl  extends BaseServiceImpl<ProductDTO, ProductDAOInt> implements ProductServiceInt{

	@Autowired
	ProductDAOInt productDAO;

	@Override
	public ProductDTO findByName(String name, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}
}
