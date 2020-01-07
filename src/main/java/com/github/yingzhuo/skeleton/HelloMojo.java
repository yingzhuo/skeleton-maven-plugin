package com.github.yingzhuo.skeleton;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class HelloMojo extends AbstractMojo {

    @Parameter(required = true, defaultValue = "${project.artifactId}")
    private String name;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        super.getLog().info(String.format("hello, %s.", name));
    }

}
