import java.util.Stack;

public class PackagesList {
	PackagesNode first;

	public PackagesList() {
		first = null;

	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insertAtBack(int packagee) {
		PackagesNode p = new PackagesNode(packagee);
		if (isEmpty() == true) {
			first = p;
		} else {
			PackagesNode current = first;
			while (current.next != null) {

				current = current.next;
			}
			current.next = p;
			p.next = null;
		}
	}

	public int size() {
		int count = 0;
		PackagesNode p = first;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}

	public void RemovePackage(int key) {

		PackagesNode temp = first, prev = null;

		if (temp != null && temp.sizeOfpackage == key) {
			first = temp.next;
			return;
		}

		while (temp != null && temp.sizeOfpackage != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			return;
		}

		prev.next = temp.next;

	}

	public int RemoveFromfront() {

		PackagesNode c = first;
		PackagesNode pre = c;
		if (isEmpty() == true) {
			return -1;
		} else {

			first = c.next;
			pre.next = null;
			return pre.sizeOfpackage;

		}

	}

	public PackagesNode getFirst() {
		return first;
	}

	public void setFirst(PackagesNode first) {
		this.first = first;
	}

	public int SearchPackageSize(int size) {
		PackagesNode current = first;
		int i = 1;
		int x = -1;
		while (current != null) {

			if (current.sizeOfpackage == size) {
				x = 1;
				return x;
			}
			current = current.next;
			i++;
		}
		return x;

	}

	public void display() {
		PackagesNode p = first;
		while (p != null) {
			System.out.print(p.sizeOfpackage + " ");
			p = p.next;
		}

	}
}
