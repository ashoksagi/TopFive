package com.topfive.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;



@Service
public class TopfiveService {

	public List<String> JsonParser() {
		List<String> listofelements=new ArrayList<>();
		String jsonString = null;
		try {
			jsonString = FileUtils.readFileToString(new File("C:\\Users\\Supriya Mandapati\\Documents\\workspace-spring-tool-suite-4-4.15.3.RELEASE\\RestForTopFive\\src\\main\\resources\\examplerequest.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Gson gson = new Gson();
		Root[] max = gson.fromJson(jsonString, Root[].class);
		for (int i = 0; i < max.length; i++) {
			if(Integer.parseInt(max[i].rank.toString())<=5) {
				listofelements.add("description="+max[i].description.toString());
				listofelements.add("rank="+max[i].rank.toString());
				listofelements.add("heading="+max[i].Heading.toString());
			}
		}
		return listofelements;
	}
}
