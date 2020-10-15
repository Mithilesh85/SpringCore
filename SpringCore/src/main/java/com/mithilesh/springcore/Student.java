package com.mithilesh.springcore;

public class Student {

	private int studentId;
	private String studentName;
	private String StudentAddress;

	public Student(int studentId, String studentName, String StudentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.StudentAddress = StudentAddress;
	}

	public Student() {
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String StudentAddress) {
		this.StudentAddress = StudentAddress;
	}

	@Override
	public String toString() {
		return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", StudentAddress="
				+ StudentAddress + '}';
	}

}
