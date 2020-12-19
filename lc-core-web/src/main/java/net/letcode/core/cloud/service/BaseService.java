package net.letcode.core.cloud.service;

import java.util.Map;
import net.letcode.core.web.support.api.RequestResult;
import net.letcode.core.web.support.bean.db.PageParams;

/**
 * 基础的微服务操作接口
 */
public interface BaseService {

    RequestResult create(Map<String, Object> entity);

    RequestResult update(Map<String, Object> entity);

    RequestResult delete(String ids);

    RequestResult findById(Integer id);

    RequestResult list(PageParams pageParams);

}
