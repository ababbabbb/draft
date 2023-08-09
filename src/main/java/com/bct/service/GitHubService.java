package com.bct.service;

import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GitHubService {

    private final GitHub gitHub;

    @Autowired
    public GitHubService(GitHub gitHub) {
        this.gitHub = gitHub;
    }

    public GHRepository createRepository(String repositoryName) throws IOException {
        GHCreateRepositoryBuilder builder = gitHub.createRepository(repositoryName);
        return builder.create();
    }
}
