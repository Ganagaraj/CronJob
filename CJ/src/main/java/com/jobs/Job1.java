package com.jobs;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.quartz.Job;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;

public class Job1 implements Job{
 public void execute(JobExecutionContext context) throws JobExecutionException {  
	 String generatedString = RandomStringUtils.randomAlphabetic(10);

	    System.out.println(generatedString);
	 
}   

}
