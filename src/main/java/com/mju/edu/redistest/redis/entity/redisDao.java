package com.mju.edu.redistest.redis.entity;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.mju.edu.redistest.redis.entity.redis;

public interface redisDao {

    int insert(@Param("pojo") redis pojo);

    int insertList(@Param("pojo") List< redis> pojo);

    List<redis> select(@Param("pojo") redis pojo);

    int update(@Param("pojo") redis pojo);

}
