package cn.tj.baseextweb.auth.service;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import cn.tj.baseextweb.fw.entity.User;
import cn.tj.baseextweb.fw.service.ListService;

@Service("getUsersFromDaoService")
public class GetUsersFromDaoService extends ListService<User> {

    @Override
    public List<User> execute(Map<String, String> param) {

        List<User> us = getDao().createCriteria(User.class).add(Restrictions.eq("username", "fnzi")).list();

        return us;
    }

}
