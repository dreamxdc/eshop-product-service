package com.roncoo.eshop.product.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.roncoo.eshop.product.model.ProductIntro;

/**
 * 商品介绍mapper
 * @author dream
 *
 */
@Mapper
public interface ProductIntroMapper {
	@Insert("INSERT INTO product_intro(content,product_id) VALUES(#{content},#{productId})")  
	public void add(ProductIntro productIntro);
	
	@Update("UPDATE product_intro SET content=#{content},product_id=#{productId} WHERE id=#{id}")  
	public void update(ProductIntro productIntro);
	
	@Delete("DELETE FROM product_intro WHERE id=#{id}")  
	public void delete(Long id);
	
	@Select("SELECT * FROM product_intro WHERE id=#{id}")  
	@Results({
		@Result(column="product_id",property = "productId")
	})
	public ProductIntro findById(Long id);
}
