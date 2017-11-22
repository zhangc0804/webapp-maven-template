package com.oldox.framework.service;

import com.oldox.framework.entity.KindEditorContent;

public interface KindEditorService {

	public KindEditorContent getById(Long id);

	public void saveOrUpdate(KindEditorContent kindEditorContent);
}
