package aplication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		//teste 
		Department dp1 = new Department(1,"Books");
		
		System.out.println(dp1);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, dp1);
		
		System.out.println(seller);

	}

}
