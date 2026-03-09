package com.cclinux.projects.meetbody.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetbody.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetBodyUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
