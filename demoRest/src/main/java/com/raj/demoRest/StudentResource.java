package com.raj.demoRest;

import java.util.List;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {

	StudentRepository sr = new StudentRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudentDetails() {

		return sr.getListOfStudents();

	}

	@GET
	@Path("student/{num}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Student getStudentDetails(@PathParam("num") int id) {
		return sr.getStudent(id);
	}

	@POST
	@Path("student")
	public Student createStudentEntry(Student s) {
		sr.createEntry(s);
		return s;
	}

	@PUT
	@Path("student")
	public Student updateStudentEntry(Student s) {

		if (sr.getStudent(s.getId()).getId() == 0) {
			sr.createEntry(s);
		} else {

			sr.updateEntry(s);
		}
		return s;
	}

	@DELETE
	@Path("student")
	public Student deleteStudentEntry(Student s) {
		sr.deleteEntry(s);
		return s;
	}
	
	@DELETE
	@Path("student/{num}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Student getStudentDeleted(@PathParam("num") int id) {
		Student s = sr.getStudent(id);
		if(s.getId()!=0)
		sr.getStudentDeleted(id);
		return s;
	}

}
