package com;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal info
 * @phase compile
 * @requiresProject false
 */
public class HelloWorldMojo extends AbstractMojo {
	/**
	 * @parameter expression="${name}"
	 * @required
	 */
	String name;

	public void execute() throws MojoExecutionException, MojoFailureException {
		System.out.println("hello " + name);
	}
}