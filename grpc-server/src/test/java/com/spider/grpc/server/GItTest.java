package com.spider.grpc.server;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.junit.Test;

import java.io.File;
import java.util.Random;
import java.util.Set;

public class GItTest {

    String username = "spider.nns";
    String password = "";

    @Test
    public void testGitCredit() throws GitAPIException {
        Git git = Git.cloneRepository()
                .setURI("https://github.com/spider-nns/cloud-action.git")
                .setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password))
                .setDirectory(new File("/Users/spider/Downloads/gitClone/" + new Random().ints() + "/"))
                .setBranch("master")
                .call();
        StoredConfig config = git.status().getRepository().getConfig();
        Set<String> sections = config.getSections();
        System.out.println(sections);
    }
}
