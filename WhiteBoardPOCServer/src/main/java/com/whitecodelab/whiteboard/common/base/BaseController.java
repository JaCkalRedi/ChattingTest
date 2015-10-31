package com.whitecodelab.whiteboard.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author KimHanKyul
 *
 */
public class BaseController {

	protected Logger logger;
	
	public void BaseController() {
		logger = LoggerFactory.getLogger(this.getClass());
	}
}
