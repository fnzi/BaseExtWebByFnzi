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
    public List<User> execute(Map<String, String> param) {
        List<User> us = new ArrayList<User>();

        String name = param.get("username");
        String pwd = param.get("password");

        User u = new User();
        u.setName(name);
        u.setPwd(pwd);

        us.add(u);

        return us;
    }

}
