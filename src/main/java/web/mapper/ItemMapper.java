package web.mapper;

import web.entity.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer itemId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer itemId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}