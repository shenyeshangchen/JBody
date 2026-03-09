package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.AdminModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBodyAdminMapper")
@Mapper
public interface AdminMapper extends ProjectBaseMapper<AdminModel> {
}
