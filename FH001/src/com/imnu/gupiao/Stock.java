package com.imnu.gupiao;

public class Stock {
	String code;
	   
	 String name;
	    
	double previousClosingPrice;
	  
	  double currentPrice;
	  public Stock(String code, String name){
		  this.code=code;
		  this.name=name;
	  }
	public double changePercent() {
		return (previousClosingPrice-currentPrice)/previousClosingPrice;
	    }

	}



