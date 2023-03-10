package cn.st.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("cn.st")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
