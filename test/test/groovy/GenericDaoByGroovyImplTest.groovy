package test.groovy;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import cn.tj.baseextweb.fw.dao.GenericDao
import cn.tj.baseextweb.fw.entity.User
import cn.tj.baseextweb.fw.test.BaseTest
import groovy.GenericDaoByGroovyImpl

import org.junit.Test;

class GenericDaoByGroovyImplTest extends BaseTest {

    GenericDao dao = new GenericDaoByGroovyImpl();

    @Test
    public void test() {

        assert 'run methodMissing: unknown method hello()' == dao.hello()
        println dao.hello();
    }

    @Test
    public void test001() {
        println dao.findUserByuserName("fnzi");
        
        println dao.findUserBypassword("123");
    }

    @Test
    public void test002() {
        // note: test java generic

        List<User> users = dao.getListByHQL("", null);
    }
}
