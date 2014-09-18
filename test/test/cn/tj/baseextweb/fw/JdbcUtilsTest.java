package test.cn.tj.baseextweb.fw;

import org.junit.Test;

import cn.tj.baseextweb.fw.data.JdbcUtils;

public class JdbcUtilsTest {

    @Test
    public void test001() {
        JdbcUtils jdbcDeal = JdbcUtils.newInstance();
//        String ret = jdbcDeal.getJdbcTemplate().queryForObject("select NOW() from dual", String.class);
        String ret = jdbcDeal.getJdbcTemplate().queryForObject("select COUNT(*) from monitoritem", String.class);

        System.out.println(ret);
    }
}
