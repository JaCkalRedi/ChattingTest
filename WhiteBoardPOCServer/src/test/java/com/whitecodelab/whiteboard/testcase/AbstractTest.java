package com.whitecodelab.whiteboard.testcase;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/mybatis/web/mybatis-context.xml",
		"/mybatis/web/mybatis-context_his.xml", 
		"/spring/testApplicationContext.xml"})
public class AbstractTest {

	private static final Logger log = LoggerFactory.getLogger(AbstractTest.class);

	public static Logger getLog() {
		return log;
	}

}