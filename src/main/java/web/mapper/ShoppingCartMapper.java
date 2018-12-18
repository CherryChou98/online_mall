package web.mapper;

import web.entity.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer shoppingCartId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer shoppingCartId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}