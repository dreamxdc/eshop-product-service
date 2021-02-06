package com.roncoo.eshop.product.service;

import com.roncoo.eshop.product.model.ProductIntro;

/**
 * 商品介绍service
 * @author dream
 *
 */
public interface ProductIntroService {
	public void add(ProductIntro productIntro, String operationType);
	
	public void update(ProductIntro productIntro, String operationType);
	
	public void delete(Long id, String operationType);
	
	public ProductIntro findById(Long id);
}
