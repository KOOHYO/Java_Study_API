package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		WorkerSevice workerSevice = new WorkerSevice();
		WorkerView workerView = new WorkerView();
		
		WorkerDTO [] workerdtos = workerSevice.init();
		workerView.View(workerdtos);
		int num=10;
		
		String str = String.valueOf(num);
		

	}

}
