package com.bct.configurations;

import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GitHubConfig {

    @Value("${github.api.token}")
    private String githubApiToken;

    @Bean
    public GitHub gitHubClient() throws IOException {
        return GitHub.connectUsingOAuth(githubApiToken);
    }
}
