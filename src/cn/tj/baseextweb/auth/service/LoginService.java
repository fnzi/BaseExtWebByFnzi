package cn.tj.baseextweb.auth.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import cn.tj.baseextweb.fw.bean.ExecResult;
import cn.tj.baseextweb.fw.service.ExecResultService;

@Service("loginService")
public class LoginService extends ExecResultService {

    @Override
    public ExecResult execute(Map<String, String> param) {
        System.out.println((String) param.get("username"));
        System.out.println((String) param.get("password"));
        return new ExecResult(true, "success");
    }

}
