package cn.tj.baseextweb.fw.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 获取spring环境
 * 
 * @author fnzi
 *
 */
public class SpringUtil implements ServletContextListener {

  private static WebApplicationContext springContext;

  public SpringUtil() {
    super();
  }

  public void contextInitialized(ServletContextEvent event) {
    springContext = WebApplicationContextUtils.getWebApplicationContext(event
        .getServletContext());
  }

  public void contextDestroyed(ServletContextEvent event) {
  }

  /**
   * 获取spring环境
   * 
   * @param name
   * @return
   */
  public static ApplicationContext getApplicationContext() {
    return springContext;
  }

  /**
   * 获取spring环境中的bean
   * 
   * @param name
   * @return
   */
  public static Object getBean(String name) {
    return springContext.getBean(name);
  }
}