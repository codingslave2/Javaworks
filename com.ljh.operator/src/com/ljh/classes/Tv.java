package com.ljh.classes;

public class Tv {
	
String compamy= ""; 
String yymmdd="";
String name= "";
String color= "";
public Tv(String yymmdd, String name, String color) {
	super();
	this.yymmdd = yymmdd;
	this.name = name;
	this.color = color;
}
public Tv() {
	super();
	// TODO Auto-generated constructor stub
System.out.println("TV default constructor is call");
	
}
public Tv(String name) {
	super();
	this.name = name;
}




}
