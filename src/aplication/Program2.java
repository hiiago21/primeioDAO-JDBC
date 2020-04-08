package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department findAll =====");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department p:list) {
			System.out.println(p);
		}
		
		System.out.println("\n=== TEST 2: department findById =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department deleteById =====");
		System.out.println("Entre com ID do Departamento a ser excluido:");
		Integer id = sc.nextInt();
		departmentDao.deleteById(id);
		
		System.out.println("\n=== TEST 4: department update =====");
		department = departmentDao.findById(2);
		department.setName("Food");
		departmentDao.update(department);
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: department insert =====");
		Department newdep = new Department(null, "Carro");
		departmentDao.insert(newdep);
		System.out.println(newdep.getId());

	}
}
