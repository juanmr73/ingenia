package com.mx.ingenia;

import javax.faces.bean.*;

import com.mx.ingenia.util.RandomUtils;
@ManagedBean
public class Navigator{
	
	private String[] resultPages =
		{ "page1.jsf", "page2.jsf", "page3.jsf" };
	
	public Navigator()
	{}
	
	public String choosePage() {
		
		return("pages/" + RandomUtils.randomElement(resultPages));
	}

}