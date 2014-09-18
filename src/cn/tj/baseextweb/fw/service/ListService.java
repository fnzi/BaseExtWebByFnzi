package cn.tj.baseextweb.fw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import cn.tj.baseextweb.fw.dao.GenericDao;

/**
 * 用于返回集合类服务处理
 * 
 * @author fnzi
 *
 * @param <T>
 */
public abstract class ListService<T> implements GenericService<Map<String, String>, List<T>> {

    @Resource
    private GenericDao dao;

    protected GenericDao getDao() {
        return dao;
    }

    @Override
    public abstract List<T> execute(Map<String, String> param);

}
