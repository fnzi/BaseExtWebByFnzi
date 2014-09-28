package cn.tj.baseextweb.auth.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import cn.tj.baseextweb.auth.bean.User;
import cn.tj.baseextweb.fw.bean.GridList;
import cn.tj.baseextweb.fw.exception.ServiceException;
import cn.tj.baseextweb.fw.service.GridListService;

@Service("listUserService")
public class ListUserService extends GridListService<User> {

    @Override
    public GridList<User> doExecute(Map<String, Object> param) {

        List<User> us = new ArrayList<User>();

        String name = getParam(param, "username");
        String pwd = getParam(param, "password");

        if (pwd == null || pwd.equals("")) {
            throw new ServiceException("密码不能为空");
        }

        User u = new User();
        u.setName(name);
        u.setPwd(pwd);

        us.add(u);

        return new GridList<User>(us.size(), us);
    }

}
