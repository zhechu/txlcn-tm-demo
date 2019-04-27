package com.wise.tm.demo;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * 客户端重连BUG补丁 https://www.cnblogs.com/jagerLan/p/10606115.html
 * @author lingyuwang
 *
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class TransactionManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionManagerApplication.class, args);
    }
}
