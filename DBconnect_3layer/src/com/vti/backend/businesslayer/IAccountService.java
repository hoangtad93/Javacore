package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;
// Interface là một kiểu dữ liệu tham chiếu trong java
// là tập hợp các phương thức abstract trừu tượng  
// Khi một lớp kế thừa interface, thì nó sẽ kế thừa những phương thức abstract của interface đó.

// Không thể khởi tạo, nên không có phương thức khởi tạo.
// Tất cả các phương thức trong interface luôn ở dạng public abstract mà không cần khai báo.
// Các thuộc tính trong interface luôn ở dạng public static final mà không cần khai báo, yêu cầu phải có giá trị.

// Mục đích của interface là để thay thế đa kế thừa lớp của những ngôn ngữ khác

public interface IAccountService {
	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	public Account getAccountByID(int id)
			throws ClassNotFoundException, FileNotFoundException, SQLException, IOException;

	public Boolean isAccNameExists(String name) throws ClassNotFoundException, SQLException;

	public boolean createAccount(Account acc, int depId, int posId) throws ClassNotFoundException, SQLException;

	public boolean delAccByID(int ID) throws ClassNotFoundException, SQLException;

	public boolean updateByEmai(int id, String newEmail) throws ClassNotFoundException, SQLException;

	public boolean updateByUserName(int id, String newUserName) throws ClassNotFoundException, SQLException;

	public boolean updateByFullName(int id, String newFullName) throws ClassNotFoundException, SQLException;

	public boolean updateByDepId(int id, int idDep) throws ClassNotFoundException, SQLException;

	public boolean updateByPosId(int id, int idPos) throws ClassNotFoundException, SQLException;

	public boolean isAccIdExists(int id) throws ClassNotFoundException, SQLException;
}
