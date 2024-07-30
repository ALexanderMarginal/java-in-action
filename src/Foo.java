public class Foo extends Bar implements Buzz {
	public Foo(String name) {
		super(name);
	}

	@Override
	public void getClassname() {
		System.out.println(this.name + "foo");
	}

	public int sum(int x, int y) {
		return x + y;
	}

	public int sum(int x, int y, int z) {
		return x + y + z;
	}

	@Override
	public void printClassName() {
		this.getClassname();
	}
}
