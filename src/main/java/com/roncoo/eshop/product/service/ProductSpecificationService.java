package com.roncoo.eshop.product.service;

import com.roncoo.eshop.product.model.ProductSpecification;

/**
 * 商品规格service
 * @author dream
 *
 */
public interface ProductSpecificationService {
	public void add(ProductSpecification productSpecification, String operationType);
	
	public void update(ProductSpecification productSpecification, String operationType);
	
	public void delete(Long id, String operationType);
	
	public ProductSpecification findById(Long id);
	
	public ProductSpecification findByProductId(Long productId);
	
}
