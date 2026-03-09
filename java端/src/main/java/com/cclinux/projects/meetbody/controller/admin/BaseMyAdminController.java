package com.cclinux.projects.meetbody.controller.admin;

import com.cclinux.framework.core.platform.controller.BaseAdminController;
import com.cclinux.projects.meetbody.service.admin.AdminMgrService;

import javax.annotation.Resource;

/**
 * @Notes: 本项目管理系统控制器基类
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */
public class BaseMyAdminController extends BaseAdminController {
    @Resource(name = "MeetBodyAdminMgrService")
    private AdminMgrService adminMgrService;

}
