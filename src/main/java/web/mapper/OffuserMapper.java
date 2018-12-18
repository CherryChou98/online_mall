package web.mapper;

import web.entity.Offuser;
import web.entity.OffuserKey;

public interface OffuserMapper {
    int deleteByPrimaryKey(OffuserKey key);

    int insert(Offuser record);

    int insertSelective(Offuser record);

    Offuser selectByPrimaryKey(OffuserKey key);

    int updateByPrimaryKeySelective(Offuser record);

    int updateByPrimaryKey(Offuser record);
}