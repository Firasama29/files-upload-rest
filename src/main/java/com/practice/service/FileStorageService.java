package com.practice.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.practice.model.FileDB;
import com.practice.repository.FileDBRepository;

@Service
public class FileStorageService {

	@Autowired
	FileDBRepository repository;
	
	//storing file
	public FileDB store(MultipartFile file) throws IOException{
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB fileDb = new FileDB(fileName, file.getContentType(), file.getBytes(), fileName);
		return repository.save(fileDb);
	}
	
	//get a file by id
	public FileDB getFile(String id) {
		return repository.findById(id).get();
	}
	
	//get all files
	public Stream<FileDB> getFiles(){
		return repository.findAll().stream();
	}
}
