package test.cn.tj.baseextweb.fw.entity;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;

import cn.tj.baseextweb.auth.service.GetUsersFromDaoService;
import cn.tj.baseextweb.fw.dao.GenericDao;
import cn.tj.baseextweb.fw.entity.User;
import cn.tj.baseextweb.fw.test.BaseTest;

public class GetUsersFromDaoServiceTest extends BaseTest {

    @Resource
    GetUsersFromDaoService getUsersFromDaoService;

    @Resource
    GenericDao dao;

    @Test
    public void test001() throws Exception {

        // clear db
        dao.executeHql("delete from User u where u.username = ? and u.password = ?", "fnzi", "123");
        dao.executeHql("delete from User u where u.username = ? and u.password = ?", "user001", "123");

        User u = new User();
        u.setUsername("fnzi");
        u.setPassword("123");
        dao.save(u);

        User u001 = new User();
        u001.setUsername("user001");
        u001.setPassword("123");
        dao.save(u001);

        List<User> users = getUsersFromDaoService.execute(null);

        Assert.assertEquals(1, users.size());
        Assert.assertEquals("fnzi", users.get(0).getUsername());
        System.out.println(users.get(0).getUsername());

    }
}
