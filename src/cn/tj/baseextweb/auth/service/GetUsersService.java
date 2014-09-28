package cn.tj.baseextweb.auth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.tj.baseextweb.auth.bean.User;
import cn.tj.baseextweb.fw.service.ListService;

@Service("getUsersService")
public class GetUsersService extends ListService<User> {

    @Override
    public List<User> doExecute(Map<String, Object> param) {
        List<User> us = new ArrayList<User>();

        String name = getParam(param, "username");
        String pwd = getParam(param, "password");

        User u = new User();
        u.setName(name);
        u.setPwd(pwd);

        us.add(u);

        return us;
    }

}
