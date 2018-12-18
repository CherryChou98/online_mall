package web.mapper;

import web.entity.ForumTopicBack;

public interface ForumTopicBackMapper {
    int deleteByPrimaryKey(Integer forumTopicBackId);

    int insert(ForumTopicBack record);

    int insertSelective(ForumTopicBack record);

    ForumTopicBack selectByPrimaryKey(Integer forumTopicBackId);

    int updateByPrimaryKeySelective(ForumTopicBack record);

    int updateByPrimaryKey(ForumTopicBack record);
}