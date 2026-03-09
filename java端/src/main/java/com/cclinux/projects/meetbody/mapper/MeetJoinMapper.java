package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.MeetJoinModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetBodyMeetJoinMapper")
@Mapper
public interface MeetJoinMapper extends ProjectBaseMapper<MeetJoinModel> {

}
