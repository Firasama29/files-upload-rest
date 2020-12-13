package com.practice.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class FileDTO implements Serializable{

	private static final long serialVersionUID = -7843265073595569540L;
	
	private String id;
	private String name;
	private String type;
	private byte[] data;
	private String size;
	
	public FileDTO() {
		super();
	}
	
	public FileDTO(String name, String type, byte[] data, String size) {
		this.name = name;
		this.type = type;
		this.data = data;
		this.size = size;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
}
