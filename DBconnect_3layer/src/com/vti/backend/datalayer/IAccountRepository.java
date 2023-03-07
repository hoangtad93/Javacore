package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Account;

public interface IAccountRepository {
	List<Account> getListAccounts() throws ClassNotFoundException, SQLException;

	public Account getAccountByID(int id)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException;

	public Boolean isAccNameExists(String name) throws ClassNotFoundException, SQLException;

	public boolean isAccIdExists(int id) throws SQLException, ClassNotFoundException;

	public boolean createAccount(Account acc, int depId, int posId) throws SQLException, ClassNotFoundException;

	public boolean delAccByID(int ID) throws SQLException, ClassNotFoundException;

	public boolean updateByEmai(int id, String newEmail) throws ClassNotFoundException, SQLException;

	public boolean updateByUserName(int id, String newUserName) throws SQLException, ClassNotFoundException;

	public boolean updateByFullName(int id, String newFullName) throws SQLException, ClassNotFoundException;

	public boolean updateByDepId(int id, int idDep) throws ClassNotFoundException, SQLException;

	public boolean updateByPosId(int id, int idPos) throws SQLException, ClassNotFoundException;
}
