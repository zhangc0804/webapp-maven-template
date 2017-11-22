package com.oldox.framework.dao;

import com.oldox.framework.entity.KindEditorContent;

public interface KindEditorDao {
	
	public KindEditorContent getById(Long id);
	
	public void saveOrUpdate(KindEditorContent kindEditorContent);

}
