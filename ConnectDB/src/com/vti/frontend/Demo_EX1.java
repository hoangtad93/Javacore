package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.Exercise1;

public class Demo_EX1 {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Exercise1 exercise1 = new Exercise1();
		exercise1.question1();
		exercise1.question2();
		// exercise1.question3();
		// exercise1.question4();
		exercise1.question5();
	}
}
