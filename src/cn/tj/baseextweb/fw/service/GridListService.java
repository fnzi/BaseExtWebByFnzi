package cn.tj.baseextweb.fw.service;

import java.util.Map;

import javax.annotation.Resource;

import cn.tj.baseextweb.fw.bean.GridList;
import cn.tj.baseextweb.fw.dao.GenericDao;

/**
 * 用于返回ext Grid服务处理
 * 
 * @author fnzi
 *
 * @param <T>
 */
public abstract class GridListService<T> implements GenericService<Map<String, String>, GridList<T>> {

    @Resource
    private GenericDao dao;

    protected GenericDao getDao() {
        return dao;
    }

    @Override
    public abstract GridList<T> execute(Map<String, String> param);

}
