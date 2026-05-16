package com.github.gelald.rocketmq.producer.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WuYingBin
 * Date 2022/7/22
 */
@SpringBootApplication(scanBasePackages = {
        "com.github.gelald.rocketmq.common",
        "com.github.gelald.rocketmq.producer.starter"}
)
public class RocketMQProducerStarterApplication {
    public static void main(String[] args) {
        // 让 RocketMQ Client 使用 SLF4J 输出日志，避免 Netty 初始化时的 appender 警告
        System.setProperty("rocketmq.client.logUseSlf4j", "true");
        SpringApplication.run(RocketMQProducerStarterApplication.class, args);
    }
}
