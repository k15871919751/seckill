package org.ct.seckill;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 * @Author K
 * @Date 2020/1/16 1:22
 * @Version 1.0
 */
@SpringBootApplication
@EnableCaching
@EnableJpaAuditing
public class SeckillApplication {
    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }
}
