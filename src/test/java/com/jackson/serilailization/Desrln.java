package com.jackson.serilailization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Desrln {
	
	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		
		ObjectMapper mapper=new ObjectMapper();
		Project data = mapper.readValue(new File("./serln.json"), Project.class);
		
		System.out.println(data.projectId);
		System.out.println(data.ProjectName);
	}

}
