package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired(required = true)
	//@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		if(exam == null) {
			System.out.printf("total is %d, avg is %f", 0, 0.0);
			System.out.println("");
		}
		else
			System.out.printf("total is %d, avg is %f", exam.total(), exam.avg());
			System.out.println("");
		
	}


	@Override
	public void setExam(Exam exam) {

		this.exam = exam;
	}
	
}
