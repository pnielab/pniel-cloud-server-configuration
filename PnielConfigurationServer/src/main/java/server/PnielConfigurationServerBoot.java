package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Zeev Ben Sender on 3/19/2017.
 */
@SpringBootApplication
@EnableConfigServer
public class PnielConfigurationServerBoot {


    public static void main(String[] args) {
        SpringApplication.run(PnielConfigurationServerBoot.class, args);
    }

}
