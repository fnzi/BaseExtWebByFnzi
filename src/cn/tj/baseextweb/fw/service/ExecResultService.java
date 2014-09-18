package cn.tj.baseextweb.fw.service;

import java.util.Map;

import javax.annotation.Resource;

import cn.tj.baseextweb.fw.bean.ExecResult;
import cn.tj.baseextweb.fw.dao.GenericDao;

/**
 * 用于返回ext逻辑判断服务处理
 * 
 * @author fnzi
 *
 */
public abstract class ExecResultService implements GenericService<Map<String, String>, ExecResult> {

    @Resource
    private GenericDao dao;

    protected GenericDao getDao() {
        return dao;
    }

    @Override
    public abstract ExecResult execute(Map<String, String> param);

}
