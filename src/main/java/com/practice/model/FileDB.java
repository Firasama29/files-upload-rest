package com.practice.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Entity
@Table(name = "file")
public class FileDB implements Serializable{

	private static final long serialVersionUID = -8021987673859595928L;
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	private String name;
	private String type;
	@Lob		//LOB is datatype for storing large object data. It has two types: BLOB (for binary data), CLOB (for text data)
	private byte[] data;
	private String size;
	
	public FileDB() {
		super();
	}

	public FileDB(String name, String type, byte[] data, String size) {
		super();
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

	@Override
	public String toString() {
		return "FileDB [id=" + id + ", name=" + name + ", type=" + type + ", data=" + Arrays.toString(data)
				+", size" + size + "]";
	}
}
