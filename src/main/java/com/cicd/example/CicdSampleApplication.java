package com.cicd.example;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdSampleApplication {

	static Logger logger = (Logger) LoggerFactory.getLogger(CicdSampleApplication.class);

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CicdSampleApplication.class, args);

		CicdSampleApplication example = new CicdSampleApplication();
		example.Debug(args);
	}

	public void Debug(String... args) throws Exception {
    String currentTime = new String();
    long now = System.currentTimeMillis();
    currentTime = String.format("currentTime: %s", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(now));
    logger.debug(currentTime);

    logger.trace("trace -- Hello world.");
    logger.debug("debug -- Hello world.");
    logger.info("info -- 헬로우 월드.");
    logger.warn("warn -- Hello world.");
    logger.error("error -- Hello world.");
  }

}
