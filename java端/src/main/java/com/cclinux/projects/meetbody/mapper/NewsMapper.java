package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.NewsModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBodyNewsMapper")
@Mapper
public interface NewsMapper extends ProjectBaseMapper<NewsModel> {
}
