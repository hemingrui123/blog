package com.example.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pay;
@Mapper
@Repository
public interface PayMapper {
	@Insert("insert into pay(tradeNo,amount,name,kind) "
			+ "values(#{tradeNo},#{amount},#{name},#{kind})")
	void save(Pay pay);
}
