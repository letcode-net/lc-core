package net.letcode.core.web.monitor.service;

import net.letcode.core.web.auth.bean.LoginUser;
import net.letcode.core.web.monitor.dto.LogParams;
import net.letcode.core.web.support.bean.http.ClientInfo;

/**
 * 基础日志服务
 */
public interface BaseLogService {

    /**
     * 记录日志
     * @param logInfo
     * @param user
     * @param client
     */
    void log(LogParams logInfo, LoginUser user, ClientInfo client);

}
