package com.luv2code.springdemo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class PracticeFortune implements FortuneService {

	private Random random= new Random();
	
	@Override
	public String getFortune() {
		
		String fileName="/Users/re338357/Desktop/Fortune.txt";
		List<String> list = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(fileName))){
			
			list = stream.collect(Collectors.toList());
			Object[] data=list.toArray();
			int index = random.nextInt(list.size());
			return data[index].toString();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		
	}

}
