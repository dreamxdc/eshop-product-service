package com.roncoo.eshop.product.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.roncoo.eshop.product.model.Product;
/**
 * 商品基本信息mapper
 * @author dream
 *
 */
@Mapper
public interface ProductMapper {
	@Insert("insert into product(name,category_id,brand_id) values(#{name},#{categoryId},#{brandId})")
	public void add(Product product);
	
	@Update("update product set name=#{name},category_id=#{categoryId},brand_id=#{brandId} where id=#{id}")
	public void update(Product product);
	
	@Delete("delete from product where id=#{id}")
	public void delete(Long id);
	
	@Select("select * from product where id=#{id}")
	@Results({
		@Result(column="category_id",property = "categoryId"),
		@Result(column = "brand_id",property = "brandId")
	})
	public Product findById(Long id);
}
