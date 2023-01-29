package com.vti.fontend;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryName;
import com.vti.entity.Categoryquestion;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.PositionName;
import com.vti.entity.Question;
import com.vti.entity.TypeName;
import com.vti.entity.Typequestion;

public class Program {
	public static void main(String[] args) {
		// create dep1
		Department dep1 = new Department();
		dep1.departmentID = 1;
		dep1.departmentName = "Sale";

		// in thongtin dep1
		System.out.println("tt phong ban 1 ");
		System.out.println("ID: " + dep1.departmentID);
		System.out.println("Name:" + dep1.departmentName);

		// create dep2
		Department dep2 = new Department();
		dep2.departmentID = 2;
		dep2.departmentName = "Marketing";

		// in thongtin dep2
		System.out.println("tt phong ban 2 ");
		System.out.println("ID: " + dep2.departmentID);
		System.out.println("Name:" + dep2.departmentName);

		/* create position */
		Position pos1 = new Position();
		pos1.positionID = 1;
		pos1.positionName = PositionName.Dev;

		Position pos2 = new Position();
		pos2.positionID = 2;
		pos2.positionName = PositionName.Test;

		Position pos3 = new Position();
		pos3.positionID = 3;
		pos3.positionName = PositionName.Scrum_Master;

		Position pos4 = new Position();
		pos4.positionID = 4;
		pos4.positionName = PositionName.PM;

		// in thongtin pos1
		System.out.println("---------------------------------- ");
		System.out.println("tt chuc vu ");
		System.out.println("posID: " + pos1.positionID);
		System.out.println("posName:" + pos1.positionName);

		/* create Account */
		Account acc1 = new Account();
		acc1.accountID = 01;
		acc1.email = "jonty123@gmail.com";
		acc1.userName = "Jonty";
		acc1.fullName = "Wilyam Jonty";
		acc1.departmentId = dep2;
		acc1.positionId = pos2;
		acc1.createDate = LocalDate.now();

		Account acc2 = new Account();
		acc2.accountID = 02;
		acc2.email = "hoangtd93@gmail.com";
		acc2.userName = "hoang";
		acc2.fullName = "Hoang Ta";
		acc2.departmentId = dep1;
		acc2.positionId = pos1;
		// acc3
		Account acc3 = new Account();
		acc3.accountID = 03;
		acc3.email = "thuytienphd@gmail.com";
		acc3.userName = "Tien";
		acc3.fullName = "Thuy Tien";
		acc3.departmentId = dep1;
		acc3.positionId = pos3;
		acc3.createDate = LocalDate.of(2022, 12, 11);
		// acc4
		Account acc4 = new Account();
		acc4.accountID = 04;
		acc4.email = "acc4@gmail.com";
		acc4.userName = "ac4";
		acc4.fullName = "account4";
		acc4.departmentId = dep1;
		acc4.positionId = pos3;
		acc4.createDate = LocalDate.of(2022, 12, 11);
		// acc5
		Account acc5 = new Account();
		acc5.accountID = 05;
		acc5.email = "acc5@gmail.com";
		acc5.userName = "ac5";
		acc5.fullName = "account5";
		acc5.departmentId = dep2;
		acc5.positionId = pos1;
		acc5.createDate = LocalDate.of(2022, 12, 11);

		System.out.println("---------------------------------- ");
		// in thongtin acc1
		System.out.println("tt account");
		System.out.println("accountID: " + acc1.accountID);
		System.out.println("Email:" + acc1.email);
		System.out.println("Username: " + acc1.userName);
		System.out.println("FullName:" + acc1.fullName);
		System.out.println("DepartmentID: " + acc1.departmentId.departmentID);
		System.out.println("PositionID: " + acc1.positionId.positionName);
		System.out.println("CreateDate: " + acc1.createDate);

		/* create group */
		Group grp1 = new Group();
		grp1.groupID = 1;
		grp1.groupName = "mentor";
		grp1.creatorID = acc1;
		grp1.createDate = LocalDate.of(2022, 4, 13);
		Account[] grp1Accounts = { acc1, acc2 };
		grp1.accounts = grp1Accounts;

		Group grp2 = new Group();
		grp2.groupID = 2;
		grp2.groupName = "tutor";
		grp2.creatorID = acc2;
		grp2.createDate = LocalDate.now();
		Account[] grp2Accounts = { acc2 };
		grp2.accounts = grp2Accounts;

		Group grp3 = new Group();
		grp3.groupID = 1;
		grp3.groupName = "music";
		grp3.creatorID = acc1;
		grp3.createDate = LocalDate.of(2022, 9, 11);
		Account[] grp3Accounts = { acc1, acc2 };
		grp3.accounts = grp3Accounts;

		Group grp4 = new Group();
		grp4.groupID = 2;
		grp4.groupName = "guitar";
		grp4.creatorID = acc2;
		grp4.createDate = LocalDate.of(2022, 10, 20);

		Account[] grp4Accounts = { acc1, acc2 };
		grp4.accounts = grp4Accounts;

		// gan gruop vao account
		Group[] acc1Groups = new Group[2];
		acc1Groups[0] = grp1;
		acc1Groups[1] = grp3;
		acc1.groups = acc1Groups;

		Group[] acc2groups = { grp1, grp2, grp4 };
		acc2.groups = acc2groups;

		// in group
		System.out.println("---------------------------------- ");
		System.out.println("tt group");
		System.out.println("groupID: " + grp1.groupID);
		System.out.println("groupname: " + grp1.groupName);
		System.out.println("creatorID: " + grp1.creatorID.accountID);
		System.out.println("CreateDate: " + grp1.createDate);
		System.out.println("group acc1 tham gia: " + acc1.groups[0].groupName);
		System.out.println("group acc1 tham gia: " + acc1.groups[1].groupName);

		System.out.println("---------------------------------- ");
		System.out.println("group acc2 tham gia: " + acc2.groups[0].groupName);
		System.out.println("group acc2 tham gia: " + acc2.groups[1].groupName);
		System.out.println("group acc2 tham gia: " + acc2.groups[2].groupName);

		System.out.println("---------------------------------- ");
		System.out.println("trong group1 co acc tham gia: " + grp1.accounts[0].email);
		System.out.println("trong group1 co acc tham gia: " + grp1.accounts[1].email);

		// create Type question---------------------------------- ");

		Typequestion typeQ1 = new Typequestion();
		typeQ1.typeID = 1;
		typeQ1.typeName = TypeName.Essay;
		Typequestion typeQ2 = new Typequestion();
		typeQ2.typeID = 2;
		typeQ2.typeName = TypeName.Multiple_Choice;

		// create CategoryQuestion---------------------------------- ");

		Categoryquestion cQ1 = new Categoryquestion();
		cQ1.categoryID = 1;
		cQ1.categoryName = CategoryName.Java;
		Categoryquestion cQ2 = new Categoryquestion();
		cQ2.categoryID = 1;
		cQ2.categoryName = CategoryName.NET;
		Categoryquestion cQ3 = new Categoryquestion();
		cQ3.categoryID = 1;
		cQ3.categoryName = CategoryName.SQL;
		Categoryquestion cQ4 = new Categoryquestion();
		cQ4.categoryID = 1;
		cQ4.categoryName = CategoryName.Postman;
		Categoryquestion cQ5 = new Categoryquestion();
		cQ5.categoryID = 1;
		cQ5.categoryName = CategoryName.Ruby;

		// create Question---------------------------------- ");

		Question question1 = new Question();
		question1.questionID = 1;
		question1.content = "This is question 1";
		question1.categoryID = cQ1;
		question1.typeID = typeQ1;
		question1.creatorID = acc1;
		question1.createDate = LocalDate.of(2022, 12, 12);
		// q2
		Question question2 = new Question();
		question2.questionID = 1;
		question2.content = "This is question 2";
		question2.categoryID = cQ2;
		question2.typeID = typeQ2;
		question2.creatorID = acc2;
		question2.createDate = LocalDate.of(2023, 1, 2);
		// q3
		Question question3 = new Question();
		question3.questionID = 1;
		question3.content = "This is question 3";
		question3.categoryID = cQ3;
		question3.typeID = typeQ2;
		question3.creatorID = acc3;
		question3.createDate = LocalDate.of(2022, 10, 3);

		// create Answer---------------------------------- ");

		Answer answer1 = new Answer();
		answer1.answerID = 1;
		answer1.content = "cau tra loi ve JAVA!";
		answer1.questionID = question1;
		answer1.isCorred = "T";
		Answer answer2 = new Answer();
		answer2.answerID = 2;
		answer2.content = "cau tra loi ve NET!";
		answer2.questionID = question2;
		answer2.isCorred = "F";
		Answer answer3 = new Answer();
		answer3.answerID = 3;
		answer3.content = "cau tra loi ve SQL!";
		answer3.questionID = question3;
		answer3.isCorred = "F";
		Answer answer4 = new Answer();
		answer4.answerID = 4;
		answer4.content = "cau tra loi ve Postman!";
		answer4.questionID = question2;
		answer4.isCorred = "T";

		// create Exam----------------------------------
		Exam exam1 = new Exam();
		exam1.examID = 1;
		exam1.code = 1;
		exam1.title = "cau tra loi ve JavaCode";
		exam1.categoryID = cQ1;
		exam1.duration = LocalDateTime.now();
		exam1.creatorID = acc1;
		exam1.createDate = LocalDate.now();
		Exam exam2 = new Exam();
		exam2.examID = 1;
		exam2.code = 1;
		exam2.title = "cau tra loi ve NET";
		exam2.categoryID = cQ2;
		exam2.duration = LocalDateTime.now();
		exam2.creatorID = acc2;
		Exam exam3 = new Exam();
		exam3.examID = 1;
		exam3.code = 1;
		exam3.title = "cau tra loi ve SQL";
		exam3.categoryID = cQ3;
		exam3.duration = LocalDateTime.now();
		exam3.creatorID = acc3;

		// create Examquestion

		// testing system 2 System.out.
		System.out.println("-----------------Exercise 1_ testing_system_2----------------- ");

		// question1

		if (acc2.departmentId == null) {

			System.out.println("Nhân viên này chưa có phòng ban!");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + acc2.departmentId.departmentName);
		}
		System.out.println(acc1.departmentId == null ? "Nhân viên này chưa có phòng ban!"
				: "Phòng ban của nhân viên này là: " + acc1.departmentId.departmentName);

		System.out.println("-----------------Exercise 1_ testing_system_2 Question 5----------------- ");

		// đếm số lượng account đang có trong group1

		int countInGrp1 = grp1.accounts.length;
		if (grp1.accounts == null) {
			System.out.println("chưa có thành viên");
		} else {
			switch (countInGrp1) {
			case 1:
				System.out.println("Nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("Nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("Nhóm có 3 thành viên");
				break;
			case 4:
				System.out.println("Nhóm có 4 thành viên");
				break;

			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;

			}
		}

		// question 10
		System.out.println("-----------------Exercise 1_ testing_system_2 Question 10----------------- ");
		Account[] accountArray = { acc1, acc2, acc3, acc4, acc5 };
		// dung for
		for (int i = 0; i < accountArray.length; i++) {
			System.out.println("thong tin account: " + (i + 1) + "la: ");
			System.out.println("accountID: " + accountArray[i].accountID);
			System.out.println("Email:" + accountArray[i].email);
			System.out.println("FullName:" + accountArray[i].fullName);
			System.out.println("Department: " + accountArray[i].departmentId.departmentName);

		}
		System.out.println("-----------------use for each----------------- ");
		// dung for each
		for (Account account : accountArray) {

			System.out.println("thong tin account: ");
			System.out.println("accountID: " + account.accountID);
			System.out.println("Email:" + account.email);
			System.out.println("FullName:" + account.fullName);
			System.out.println("Department: " + account.departmentId.departmentName);
		}

		// question 11
		System.out.println("-----------------Exercise 1_ testing_system_2 Question 11----------------- ");
		Department[] departmentArray = { dep1, dep2 };
		for (int i = 0; i < departmentArray.length; i++) {
			System.out.println("thong tin department " + (i + 1) + " " + "la: ");
			System.out.println("departmentID: " + departmentArray[i].departmentID);
			System.out.println("Name:" + departmentArray[i].departmentName);
		}

		// question 14
		System.out.println("-----------------Exercise 1_ testing_system_2 Question 14----------------- ");
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].accountID < 5) {
				System.out.println("accountID: " + accountArray[i].accountID);
				System.out.println("Email:" + accountArray[i].email);
				System.out.println("FullName:" + accountArray[i].fullName);
				System.out.println("Department: " + accountArray[i].departmentId.departmentName);
			}
		}

		// question 16 chua question11 dung while
		System.out.println("-----------------Exercise 1_ testing_system_2 Question 16----------------- ");

		// Department[] departmentArray = { dep1, dep2 };
		// while
		int i = 0;
		while (i < departmentArray.length) {
			System.out.println("thong tin department thu " + (i + 1) + " " + "la: ");
			System.out.println("departmentID: " + departmentArray[i].departmentID);
			System.out.println("Name:" + departmentArray[i].departmentName);
			i = i + 1;
		}
		// question 16 chua question11 dung while
		System.out.println("-----------------demo input tao phong ban moi----------------- ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao id phong ban: ");
		int depID3 = scanner.nextInt();
		System.out.println("nhap vao Name phong ban: ");
		String depName3 = scanner.next();
		// String depName3 = scanner.nextLine();
		System.out.println("department moi nhap: " + depID3 + depName3);
		Department dep4 = new Department();
		dep4.departmentID = depID3;
		dep4.departmentName = depName3;
		System.out.println("tt phong ban 4 ");
		System.out.println("ID: " + dep4.departmentID);
		System.out.println("Name:" + dep4.departmentName);
		// close
	}
}
