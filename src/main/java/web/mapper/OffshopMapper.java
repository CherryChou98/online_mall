package web.mapper;

import web.entity.Offshop;
import web.entity.OffshopKey;

public interface OffshopMapper {
    int deleteByPrimaryKey(OffshopKey key);

    int insert(Offshop record);

    int insertSelective(Offshop record);

    Offshop selectByPrimaryKey(OffshopKey key);

    int updateByPrimaryKeySelective(Offshop record);

    int updateByPrimaryKey(Offshop record);
}