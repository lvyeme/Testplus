package com.lvye.testplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvye.testplus.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}