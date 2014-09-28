package cn.tj.baseextweb.auth.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import cn.tj.baseextweb.fw.bean.ExecResult;
import cn.tj.baseextweb.fw.exception.ServiceException;
import cn.tj.baseextweb.fw.service.ExecResultService;

@Service("loginService")
public class LoginService extends ExecResultService {

    @Override
    public ExecResult doExecute(Map<String, Object> param) {
        String pwd = getParam(param, "password");
        
        System.out.println(getParam(param, "username"));
        System.out.println(pwd);
        if (pwd == null || pwd.equals("")) {
            throw new ServiceException("密码不能为空");
        }
        HttpSession session = getParam(param, SESSION_KEY);
        assert session != null;
        return new ExecResult(true, "success");
    }

}
