package com.feyl.ssm.mapper;

import com.feyl.ssm.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id=#{id}")
    User selectById(@Param("id") Long id);

    @Insert("INSERT INTO user VALUES(#{id},#{name},#{age})")
    Integer insert(@Param("id") Long id,@Param("name") String name,@Param("age") Integer age);

    @Delete("DELETE FROM user WHERE id=#{id}")
    Integer delete(@Param("id") Long id);

    @Update("UPDATE user SET name=#{name},age=#{age} WHERE id=#{id}")
    Integer update(@Param("id") Long id,@Param("name") String name,@Param("age") Integer age);
}
