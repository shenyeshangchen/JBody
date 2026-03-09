package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBodyFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
