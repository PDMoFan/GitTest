package com.mju.edu.redistest.redis.entity;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.mju.edu.redistest.redis.entity.redis;
import com.mju.edu.redistest.redis.entity.redisDao;

@Service
public class redisService {

    @Resource
    private redisDao redisDao;

    public int insert(redis pojo){
        return redisDao.insert(pojo);
    }

    public int insertList(List< redis> pojos){
        return redisDao.insertList(pojos);
    }

    public List<redis> select(redis pojo){
        return redisDao.select(pojo);
    }

    public int update(redis pojo){
        return redisDao.update(pojo);
    }

}
