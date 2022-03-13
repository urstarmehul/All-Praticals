package com.mehul.soap.webservices.soapcoursemanagement.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailRequest;
import com.in28minutes.courses.GetCourseDetailResponse;
import com.mehul.soap.webservices.soapcoursemanagement.soap.bean.Course;
import com.mehul.soap.webservices.soapcoursemanagement.soap.service.CourseDetailsService;

@Endpoint
public class CourseDetailsEndpoint {
	
	@Autowired
	CourseDetailsService service;
	
	@PayloadRoot(namespace="http://in28minutes.com/courses", localPart="GetSourceDetailRequest") 
	@ResponsePayload
	public GetCourseDetailResponse processCourseDetailRequest
	(@RequestPayload GetCourseDetailRequest request) {
		GetCourseDetailResponse response = new GetCourseDetailResponse();
		
		Course course = service.findById(request.getId());
		
		CourseDetails courseDetails = new CourseDetails();
		courseDetails.setId(course.getId());
		courseDetails.setName(course.getName());
		courseDetails.setDescription(course.getDescription());
		response.setCourseDetails(courseDetails);
		
		return response;
	}

}
