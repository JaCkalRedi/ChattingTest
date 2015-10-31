package com.whitecodelab.whiteboard.core.model.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.whitecodelab.whiteboard.common.base.BaseService;
import com.whitecodelab.whiteboard.core.model.dao.MemberDAO;
import com.whitecodelab.whiteboard.core.model.entity.MemberEntity;

/**
 * 
 * @author KimHanKyul
 *
 */
@Service
public class MemberService extends BaseService {

	/**
	 * 
	 */
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private MemberSessionService memberSessionService;
	
	public JSONPObject memberCheck() throws Exception {
		JSONPObject result;
		
		try {
			//TO-DO : id, password check
			MemberEntity memberEntity = memberDAO.selectMemberInfo();
			
			//TO-DO : session id create
			memberSessionService.createSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
