package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.MeetModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBodyMeetMapper")
@Mapper
public interface MeetMapper extends ProjectBaseMapper<MeetModel> {
}
