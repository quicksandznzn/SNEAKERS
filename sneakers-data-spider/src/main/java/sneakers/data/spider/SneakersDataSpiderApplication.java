package sneakers.data.spider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SneakersDataSpiderApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SneakersDataSpiderApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SneakersDataSpiderApplication.class, args);

        LOG.info(
                "====================== SNEAKERS DATA SPIDER APPLICATION START ======================");
    }

}
