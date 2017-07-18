package org.fkit.ebuy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.ebuy.domain.Order;

/**
 * BookMapper接口
 * */
public interface OrderMapper {

	/**
	 * 查询所有图书
	 * @param username 
	 * @return 图书对象集合
	 * */
	@Select(" select * from tb_order where username=#{username} ")
	List<Order> findAll(String username);
	
	@Select("insert into tb_order(oid,username,totalprice,phone,address,status,good_name,good_id,good_picture) values(#{oid},#{username},#{totalprice},#{phone},#{address},#{status},#{good_name},#{good_id},#{good_picture})")
	Order insertorder(@Param("oid")String oid,@Param("username")String username,@Param("totalprice")String totalprice,@Param("phone")String phone,@Param("address")String address,@Param("status")String status,
			@Param("good_name")String good_name,@Param("good_id")String good_id,@Param("good_picture")String good_picture);
}
