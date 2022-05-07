import java.util.Scanner;

public class TheMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner con = new Scanner(System.in);

		PackagesList l = new PackagesList();

		StackOfPackages s = new StackOfPackages();

		RandomNumber(l, PackagesReceived());
		l.display();
		System.out.print("]");

		System.out.println();

		System.out.println("---------------------------------------------------------------------------------");

		System.out.print("After separating each package and stacking it in a container according to its size:");

		s.ContainerFilling(l);

	}

	public static int PackagesReceived() {
		Scanner con = new Scanner(System.in);
		int packages_number;

		System.out.print("How many packages did the company receive today?\nPackages number:");

		packages_number = con.nextInt();
		return packages_number;
	}

	public static void RandomNumber(PackagesList l, int packages_number) {
		int random_number;
		System.out.println("-------------------------------------------------");

		System.out.print("The list of Packages of random sizes(from 1 to 5):[ ");

		for (int i = 0; i < packages_number; i++) {

			random_number = (int) (1 + Math.random() * 5);

			l.insertAtBack(random_number);

		}
	}
}
