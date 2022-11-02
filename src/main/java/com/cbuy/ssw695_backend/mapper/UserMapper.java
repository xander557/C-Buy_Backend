package com.cbuy.ssw695_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cbuy.ssw695_backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
