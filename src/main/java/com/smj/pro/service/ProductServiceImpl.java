package com.smj.pro.service;

import com.smj.pro.dao.ProductDao;
import com.smj.pro.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao dao;

    @Override
    public List<Product> getProducts() {
        return dao.findAll();
    }
}
