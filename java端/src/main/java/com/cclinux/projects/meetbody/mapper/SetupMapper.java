package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.SetupModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBodySetupMapper")
@Mapper
public interface SetupMapper extends ProjectBaseMapper<SetupModel> {
}
