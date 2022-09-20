package com.topfive.service;

import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
public class Root{
 public String rank;
 @JsonProperty("Heading") 
 public String Heading;
 public String documentID;
 public String description;
}


