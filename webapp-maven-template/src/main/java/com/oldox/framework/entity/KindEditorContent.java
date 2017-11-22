package com.oldox.framework.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KindEditorContent {

	private Long id;

	private String content;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
