package com.oldox.framework.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oldox.framework.dao.KindEditorDao;
import com.oldox.framework.entity.KindEditorContent;
@Repository
public class KindEditorDaoImpl implements KindEditorDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public KindEditorContent getById(Long id) {
		return (KindEditorContent)sessionFactory.getCurrentSession().load(KindEditorContent.class, id);
	}

	@Override
	public void saveOrUpdate(KindEditorContent kindEditorContent) {
		sessionFactory.getCurrentSession().saveOrUpdate(kindEditorContent);
	}

}
