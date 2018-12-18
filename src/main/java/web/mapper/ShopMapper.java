package web.mapper;

import web.entity.Shop;
import web.entity.ShopKey;

public interface ShopMapper {
    int deleteByPrimaryKey(ShopKey key);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(ShopKey key);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}