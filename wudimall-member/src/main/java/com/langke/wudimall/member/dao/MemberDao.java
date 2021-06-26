package com.langke.wudimall.member.dao;

import com.langke.wudimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author langke
 * @email langke@gmail.com
 * @date 2021-06-26 17:59:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
