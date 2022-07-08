package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper //自动装配
public interface DiscussPostMapper {
    //声明查询方法，写出有关的sql
    List<DiscussPost> selectDiscussPosts(int userId , int offset , int limit);

    int selectDiscussPostRows(@Param("userId") int userId); //Param注解是用于给参数取别名，如果只有一个参数，并且在<if>里使用，则必须加别名。
}
