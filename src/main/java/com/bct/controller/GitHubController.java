package com.bct.controller;

import com.bct.dto.CreateRepositoryRequest;
import com.bct.service.GitHubService;
import org.kohsuke.github.GHRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class GitHubController {

    private final GitHubService gitHubService;

    @Autowired
    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @PostMapping("/repositories")
    public GHRepository createRepository(@RequestBody CreateRepositoryRequest request) throws IOException {
        String repositoryName = request.getRepositoryName();
        return gitHubService.createRepository(repositoryName);
    }
}
