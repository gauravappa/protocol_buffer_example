package com.example.java.programming.a.firstproto;

import com.example.java.programming.a.firstproto.generated.FirstProto.Student;

/* proto file is defined in the
 * resouces com.example.firstproto package
 * we defined Student message in proto file
 * with two field id and name
 */

public class FirstProtoExample {

	public static void main(String[] args) {
		
	/* we are using Student Model from generated classes by protoc compiler from our 
	 * proto file first_proto.proto
	 */
		
		Student student = Student.newBuilder().setId("15005054")
							.setName("Gaurav Appa")
							.build();
		
		System.out.println(student.toString());
		
	}
	
}
