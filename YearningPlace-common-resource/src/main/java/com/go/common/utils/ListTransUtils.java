package com.go.common.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.type.CollectionType;

public class ListTransUtils<T> {
	
	public List<T> transfor(String json,Class<?> T){
		try{
			List<T> tList=null;
			JsonNode data = MapperUtil.MP.readTree(json);
			JsonParser parser = data.traverse();
			CollectionType type = MapperUtil.MP.getTypeFactory().constructCollectionType(List.class, T);
			tList=MapperUtil.MP.readValue(parser, type);
			return tList;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	public List<T> transfor2(String json,Class<?> T){
		try{
			List<T> tList=null;
			JsonNode data = MapperUtil.MP.readTree(json);
			JsonParser parser = data.traverse();
			CollectionType type = MapperUtil.MP.getTypeFactory().constructCollectionType(List.class, T);
			tList=MapperUtil.MP.readValue(parser, type);
			return tList;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
	public List<T> transfor3(String json,Class<?> T){
		try{
			List<T> tList=null;
			JsonNode data = MapperUtil.MP.readTree(json);
			JsonParser parser = data.traverse();
			CollectionType type = MapperUtil.MP.getTypeFactory().constructCollectionType(List.class, T);
			tList=MapperUtil.MP.readValue(parser, type);
			return tList;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}
}
