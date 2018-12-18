package web.mapper;

import web.entity.CommentItem;

public interface CommentItemMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentItem record);

    int insertSelective(CommentItem record);

    CommentItem selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(CommentItem record);

    int updateByPrimaryKey(CommentItem record);
}