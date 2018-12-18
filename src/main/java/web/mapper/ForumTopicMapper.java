package web.mapper;

import web.entity.ForumTopic;

public interface ForumTopicMapper {
    int deleteByPrimaryKey(Integer forumTopicId);

    int insert(ForumTopic record);

    int insertSelective(ForumTopic record);

    ForumTopic selectByPrimaryKey(Integer forumTopicId);

    int updateByPrimaryKeySelective(ForumTopic record);

    int updateByPrimaryKeyWithBLOBs(ForumTopic record);

    int updateByPrimaryKey(ForumTopic record);
}