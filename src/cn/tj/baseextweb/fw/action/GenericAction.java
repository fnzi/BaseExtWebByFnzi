package cn.tj.baseextweb.fw.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tj.baseextweb.fw.bean.ExecResult;
import cn.tj.baseextweb.fw.bean.GridList;
import cn.tj.baseextweb.fw.exception.DaoException;
import cn.tj.baseextweb.fw.exception.GenericException;
import cn.tj.baseextweb.fw.exception.ServiceException;
import cn.tj.baseextweb.fw.exception.SystemException;
import cn.tj.baseextweb.fw.listener.SpringUtil;
import cn.tj.baseextweb.fw.service.ExecResultService;
import cn.tj.baseextweb.fw.service.GridListService;
import cn.tj.baseextweb.fw.service.ListService;

@Controller
public class GenericAction extends ActionSupport {

    Logger log = Logger.getLogger(GenericAction.class.getClass());

    @RequestMapping("/getExecResult/{serviceName}")
    @ResponseBody
    public ExecResult getExecResult(@PathVariable String serviceName) {
        ExecResult ret = null;
        try {
            Map<String, String> param = getRequstMap();
            ExecResultService service = (ExecResultService) SpringUtil.getBean(serviceName);

            ret = service.execute(param);
        } catch (SystemException e) {
            log.error("系统依赖异常：" + e.getMessage());
        } catch (DaoException e) {
            log.error("数据操作异常：" + e.getMessage());
            ret = new ExecResult(false, e.getMessage());
        } catch (ServiceException e) {
            log.error("业务异常：" + e.getMessage());
            ret = new ExecResult(false, e.getMessage());
        } catch (GenericException e) {
            log.error("系统异常：" + e.getMessage());
            ret = new ExecResult(false, e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            ret = new ExecResult(false, e.getMessage());
        }

        return ret;
    }

    @RequestMapping("/getGridList/{serviceName}")
    @ResponseBody
    public GridList<?> getGridList(@PathVariable String serviceName) {
        GridList<?> ret = new GridList();
        try {
            Map<String, String> param = getRequstMap();
            GridListService<?> service = (GridListService<?>) SpringUtil.getBean(serviceName);

            ret = service.execute(param);
        } catch (SystemException e) {
            log.error("系统依赖异常：" + e.getMessage());
        } catch (DaoException e) {
            log.error("数据操作异常：" + e.getMessage());
        } catch (ServiceException e) {
            log.error("业务异常：" + e.getMessage());
        } catch (GenericException e) {
            log.error("系统异常：" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    @RequestMapping("/getList/{serviceName}")
    @ResponseBody
    public List<?> getList(@PathVariable String serviceName) {
        List<?> ret = new ArrayList();
        try {
            Map<String, String> param = getRequstMap();
            ListService<?> service = (ListService<?>) SpringUtil.getBean(serviceName);

            ret = service.execute(param);
        } catch (SystemException e) {
            log.error("系统依赖异常：" + e.getMessage());
        } catch (DaoException e) {
            log.error("数据操作异常：" + e.getMessage());
        } catch (ServiceException e) {
            log.error("业务异常：" + e.getMessage());
        } catch (GenericException e) {
            log.error("系统异常：" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    @RequestMapping("/toPage/{pageName}")
    public String toPage(@PathVariable String pageName) {

        /**
         * 请不要使用"_"作为jsp文件的名字
         */
        if (pageName.contains("_")) {
            pageName = pageName.replaceAll("_", "/");
        }

        return pageName;
    }
}
