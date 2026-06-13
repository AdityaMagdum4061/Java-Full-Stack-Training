package com.test;

import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.test.dao.UserRepository;
import com.test.entity.User;

@SpringBootApplication

public class JpaSpringBootApplication {

	static UserRepository userRepository;
	static Scanner sc = new Scanner(System.in);

	static void add() {
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		System.out.print("Enter City: ");
		String city = sc.nextLine();
		System.out.print("Enter Status: ");
		String status = sc.nextLine();

		User us1 = new User();
		us1.setName(name);
		us1.setCity(city);
		us1.setStatus(status);

		User save = userRepository.save(us1);
		System.out.println(save);
	}

	static void update() {
		System.out.print("Enter ID to update: ");
		int id = Integer.parseInt(sc.nextLine());
		Optional<User> optional = userRepository.findById(id);
		User user = optional.get();

		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		System.out.print("Enter City: ");
		String city = sc.nextLine();

		System.out.print("Enter Status: ");
		String status = sc.nextLine();

		user.setName(name);
		user.setCity(city);
		user.setStatus(status);

		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

	static void display() {
		Iterable<User> itr = userRepository.findAll();
		Iterator<User> iterator = itr.iterator();
		while (iterator.hasNext()) {
			User value = iterator.next();
			System.out.println(value);
		}
	}

	static void delete() {
		System.out.print("Enter ID to delete: ");
		int id = Integer.parseInt(sc.nextLine());

		userRepository.deleteById(id);
		System.out.println("Record Deleted Successfully..");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaSpringBootApplication.class, args);

		userRepository = context.getBean(UserRepository.class);

		int choice;
		do {

			System.out.println("1. Add User\n2. Update User\n3. Display Users\n4. Delete User\n5. Exit");
			System.out.print("Enter choice: ");
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				display();
				break;
			case 4:
				delete();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 0);

		sc.close();
	}
}



/*
 * package com.test;
 * 
 * import java.util.Iterator; import java.util.List; import java.util.Optional;
 * import java.util.Scanner;
 * 
 * import org.springframework.boot.SpringApplication; import
 * org.springframework.boot.autoconfigure.SpringBootApplication; import
 * org.springframework.context.ApplicationContext;
 * 
 * import com.test.dao.UserRepository; import com.test.entity.User;
 * 
 * @SpringBootApplication
 * 
 * public class JpaSpringBootApplication { public static void main(String[]
 * args) { ApplicationContext context =
 * SpringApplication.run(JpaSpringBootApplication.class, args);
 * 
 * Scanner sc = new Scanner(System.in); System.out.println("\n");
 * 
 * 
 * System.out.print("Enter Name: "); String name = sc.nextLine();
 *
 * System.out.print("Enter City: "); String city = sc.nextLine();
 *
 * System.out.print("Enter Status: "); String status = sc.nextLine();
 *
 * User us1 = new User(); us1.setName(name); us1.setCity(city);
 * us1.setStatus(status);
 *
 * User us2 = new User(); us2.setName("ABC"); us2.setCity("PQR");
 * us2.setStatus("XYZ");
 * 
 * 
 * 
 * UserRepository userRepository = context.getBean(UserRepository.class);
 * 
 * List<User> users = List.of(us1,us2); Iterable<User> result =
 * userRepository.saveAll(users); result.forEach(use->{ System.out.println(use);
 * });
 * 
 * 
 * //Update User
 * 
 * Optional<User> optional = userRepository.findById(3); User user =
 * optional.get();
 *
 * System.out.print("Enter Name: "); String name = sc.nextLine();
 *
 * System.out.print("Enter City: "); String city = sc.nextLine();
 *
 * System.out.print("Enter Status: "); String status = sc.nextLine();
 *
 *
 * user.setName(name); user.setCity(city); user.setStatus(status);
 *
 * User user1 = userRepository.save(user);
 *
 * System.out.println(user);
 * 
 * 
 * 
 * // get Record from Data
 * 
 * Iterable<User> itr = userRepository.findAll(); Iterator<User> iterator =
 * itr.iterator(); while(iterator.hasNext()) { User value = iterator.next();
 * System.out.println(value); }
 * 
 * 
 * 
 * //Delete record from data 
 * userRepository.deleteById(4);
 * System.out.println("Record Deleted Successfully..");
 * 
 * 
 * sc.close(); } }
 * 
 */