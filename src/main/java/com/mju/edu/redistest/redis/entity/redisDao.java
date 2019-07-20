package com.mju.edu.redistest.redis.entity;

import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 *功能描述
 * @author Mr.Lin
 * @date 2019/7/20
 * @param
 * @return
 */
public interface redisDao {
    /**
     *功能描述 dsfdf
     * @author Mr.Lin
     * @date 2019/7/20
     * @param [pojo]
     * @return int
     */
    int insert(@Param("pojo") redis pojo);

    int insertList(@Param("pojo") List< redis> pojo);

    List<redis> select(@Param("pojo") redis pojo);

    int update(@Param("pojo") redis pojo);

}
