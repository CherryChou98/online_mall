package web.mapper;

import web.entity.Offitem;
import web.entity.OffitemKey;

public interface OffitemMapper {
    int deleteByPrimaryKey(OffitemKey key);

    int insert(Offitem record);

    int insertSelective(Offitem record);

    Offitem selectByPrimaryKey(OffitemKey key);

    int updateByPrimaryKeySelective(Offitem record);

    int updateByPrimaryKey(Offitem record);
}