import java.util.Stack;

public class StackOfPackages extends PackagesList {

	public StackOfPackages() {
		super();
	}

	public boolean isEmpty() {
		return super.isEmpty();
	}

	public void push(int a) {
		insertAtBack(a);
	}

	public int pop() {
		return RemoveFromfront();
	}

	public StringBuffer str(int x) {
		String string = "packages";

		StringBuffer sb = new StringBuffer(string);
		if (x == 1) {
			return sb.deleteCharAt(sb.length() - 1);
		} else {
			return sb;
		}
	}

	public void ContainerFilling(PackagesList l) {

		StackOfPackages t = new StackOfPackages();
		int a, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
		StackOfPackages Container1 = new StackOfPackages();
		StackOfPackages Container2 = new StackOfPackages();
		StackOfPackages Container3 = new StackOfPackages();
		StackOfPackages Container4 = new StackOfPackages();
		StackOfPackages Container5 = new StackOfPackages();
		PackagesNode p = l.getFirst();
		while (p != null) {

			if (p.sizeOfpackage == 1) {
				Container1.push(p.sizeOfpackage);

			} else if (p.sizeOfpackage == 2) {
				Container2.push(p.sizeOfpackage);

			} else if (p.sizeOfpackage == 3) {
				Container3.push(p.sizeOfpackage);

			} else if (p.sizeOfpackage == 4) {
				Container4.push(p.sizeOfpackage);

			} else {
				Container5.push(p.sizeOfpackage);

			}
			p = p.next;
		}

		System.out.println();

		System.out.print("Container(1): ");

		while (!Container1.isEmpty()) {
			a = Container1.pop();
			System.out.print(a + " ");
			count1++;
			t.push(a);
		}
		while (!t.isEmpty()) {
			this.push(t.pop());
		}
		System.out.println();

		System.out.print("Container(2): ");

		while (!Container2.isEmpty()) {
			a = Container2.pop();
			System.out.print(a + " ");
			count2++;
			t.push(a);
		}
		while (!t.isEmpty()) {
			this.push(t.pop());
		}
		System.out.println();

		System.out.print("Container(3): ");

		while (!Container3.isEmpty()) {
			a = Container3.pop();
			System.out.print(a + " ");
			count3++;
			t.push(a);
		}
		while (!t.isEmpty()) {
			this.push(t.pop());
		}
		System.out.println();

		System.out.print("Container(4): ");

		while (!Container4.isEmpty()) {
			a = Container4.pop();
			System.out.print(a + " ");
			count4++;
			t.push(a);
		}
		while (!t.isEmpty()) {
			this.push(t.pop());
		}
		System.out.println();

		System.out.print("Container(5): ");

		while (!Container5.isEmpty()) {
			a = Container5.pop();
			System.out.print(a + " ");
			count5++;
			t.push(a);
		}
		while (!t.isEmpty()) {
			this.push(t.pop());
		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Container(1) contains " + count1 + " " + str(count1) + " of size 1.");
		System.out.println("Container(2) contains " + count2 + " " + str(count2) + " of size 2.");
		System.out.println("Container(3) contains " + count3 + " " + str(count3) + " of size 3.");
		System.out.println("Container(4) contains " + count4 + " " + str(count4) + " of size 4.");
		System.out.println("Container(5) contains " + count5 + " " + str(count5) + " of size 5.");
	}

	public void display() {
		StackOfPackages temp = new StackOfPackages();
		int a;
		while (!isEmpty()) {
			a = pop();
			System.out.print(a + " ");
			temp.push(a);
		}
		while (!temp.isEmpty()) {
			this.push(temp.pop());
		}

	}
}
