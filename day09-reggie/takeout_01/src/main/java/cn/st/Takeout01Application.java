package cn.st;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class Takeout01Application {

    public static void main(String[] args) {
        SpringApplication.run(Takeout01Application.class, args);
        log.info("项目启动成功...");
    }

}
