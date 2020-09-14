package shumei.Service.impl;

public class StudentService implements StudentServiceImpl {

	@Override
	public void addStudent() {
		System.out.println("添加学生信息");
	}

	@Override
	public void editStudent() {
		System.out.println("编辑学生信息");
	}

	@Override
	public void deleteStudent() {
		System.out.println("删除学生信息");

	}

	@Override
	public void selectStudent() {
		System.out.println("查询学生信息");
	}

}
