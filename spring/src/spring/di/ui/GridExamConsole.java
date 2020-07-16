package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {

		System.out.printf("Grid total is %d, avg is %f", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {

		this.exam = exam;
	}

}
