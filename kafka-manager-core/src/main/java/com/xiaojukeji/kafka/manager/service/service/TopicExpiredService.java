package com.xiaojukeji.kafka.manager.service.service;

import com.xiaojukeji.kafka.manager.common.entity.ResultStatus;
import com.xiaojukeji.kafka.manager.common.entity.ao.topic.TopicExpiredData;

import java.util.List;

/**
 * @author zengqiao
 * @date 20/9/2
 */
public interface TopicExpiredService {
    List<TopicExpiredData> getExpiredTopicDataList(String username);

    ResultStatus retainExpiredTopic(Long physicalClusterId, String topicName, Integer retainDays);

    /**
     * 通过topictopic名称删除
     * @param clusterId 集群id
     * @param topicName topic名称
     * @return int
     */
    int deleteByTopicName(Long clusterId, String topicName);
}