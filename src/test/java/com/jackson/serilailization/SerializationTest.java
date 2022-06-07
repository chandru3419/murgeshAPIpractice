package com.jackson.serilailization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class SerializationTest {

	public static void main(String[] args) throws Throwable, JsonMappingException, IOException {
		
		Project pObj=new Project("mnb","apr","ProjectSerln","tyoo12","ongoing",4);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("./serln.json"), pObj);
		

	}

}
