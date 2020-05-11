package com.revature.bank.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.bank.user.Customer;

public class CustomerDAOSerialization implements CustomerDAO{
	
	@Override
	public void saveCustomer(Customer c) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {      
	      
			fos = new FileOutputStream("/Users/mei/Documents/_Revature/files/test.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			fos.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	
	@Override
	public Customer getCustomer(String customer) {
		Customer c = null;
		try (FileInputStream fis = new FileInputStream("/Users/mei/Documents/_Revature/files/test.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
				c = (Customer) ois.readObject();
			} catch (FileNotFoundException e) {	
//				System.out.println(customer);
//				saveCustomer(getCustomer(customer));
				
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return c;
	}

}








