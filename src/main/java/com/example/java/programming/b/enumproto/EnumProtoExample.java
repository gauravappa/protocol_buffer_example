package com.example.java.programming.b.enumproto;

import com.example.java.programming.b.enumproto.generated.EnumProto.StudentData;
import com.example.java.programming.b.enumproto.generated.EnumProto.StudentData.Section;

public class EnumProtoExample {

	public static void main(String[] args) {

		StudentData.Builder builder = StudentData.newBuilder();
		
		builder.setId(15005054);
		
		//setting enum value
		// we can also set integer as value but it is little bit dangerous as it can be mistaken by us
		builder.setSectionOfStudent(Section.B_SECTION);
		
		System.out.println(builder.toString());
		
	}
	
}
