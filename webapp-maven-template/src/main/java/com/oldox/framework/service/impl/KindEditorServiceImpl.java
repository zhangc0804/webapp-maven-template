package com.oldox.framework.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldox.framework.dao.KindEditorDao;
import com.oldox.framework.dao.UserDao;
import com.oldox.framework.entity.KindEditorContent;
import com.oldox.framework.entity.User;
import com.oldox.framework.service.KindEditorService;
import com.oldox.framework.service.UserService;
@Service
public class KindEditorServiceImpl implements KindEditorService {
	
	@Autowired
	private KindEditorDao indEditorDao;

	@Override
	public KindEditorContent getById(Long id) {
		return indEditorDao.getById(id);
	}

	@Override
	public void saveOrUpdate(KindEditorContent kindEditorContent) {
		indEditorDao.saveOrUpdate(kindEditorContent);
		
	}
	

}
