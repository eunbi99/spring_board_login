package com.Finally.VO;

import org.springframework.stereotype.Component;

//�˻����
@Component
public class Criteria {
	
	private String type;
	private String keyword;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}