package com.example.reddit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class RedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	//https://www.youtube.com/watch?v=DKlTBBuc32c&t=427s&ab_channel=freeCodeCamp.org
	//https://github.com/SaiUpadhyayula/spring-reddit-clone/tree/master/src/main/java/com/programming/techie/springredditclone/model
}
