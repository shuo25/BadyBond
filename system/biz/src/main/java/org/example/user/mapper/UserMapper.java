package org.example.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.user.entity.User;

/**
 * Author: 18615
 * Date: 2024/3/18 20:34
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
