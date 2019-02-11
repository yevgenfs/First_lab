package Demo;

public class Vase {
	protected String form;
	protected int year_of_vase;
	private int valume;
	private int weight;
	private String type_of_material;
	private int height;
	private String color;
	private static int how_many_decor_element;

	public void set_valume(int valume) {
		this.valume = valume;
	}

	public int get_valume() {
		return valume;
	}

	public void set_weight(int weight) {
		this.weight = weight;
	}

	public int get_weight() {
		return weight;
	}

	public void set_type_of_material(String type_of_material) {
		this.type_of_material = type_of_material;
	}

	public String get_type_of_material() {
		return type_of_material;
	}

	public void set_height(int height) {
		this.height = height;
	}

	public int get_height() {
		return height;
	}

	public void set_color(String color) {
		this.color = color;
	}

	public String get_color() {
		return color;
	}

	public Vase() {

	}

	public Vase(int valume, int weight, String type_of_material, int height) {
		this.valume = valume;
		this.weight = weight;
		this.type_of_material = type_of_material;
		this.height = height;
	}

	public Vase(int valume, int weight, String type_of_material, int height, String color, String form,
			int year_of_vase, int how_many_decor_element) {
		this(valume, weight, type_of_material, height);
		this.color = color;
		this.form = form;
		this.year_of_vase = year_of_vase;
		this.how_many_decor_element = how_many_decor_element;
	}

	public String toString() {
		return "valume=" + valume + ";weight=" + weight + ";type_of_material=" + type_of_material + "; height=" + height
				+ "; color=" + color + "; form=" + form + "; year_of_vase=" + year_of_vase + "; how_many_decor_element="
				+ how_many_decor_element;
	}

	public static void printStaticHowManyDecorElement() {
		System.out.println(how_many_decor_element);
	}

	public void printField(int field) {
		System.out.println(field);
	}

	public void resetValues(int valume, int weight, String type_of_material, int height, String color, String form,
			int year, int element) {

		this.valume = valume;
		this.weight = weight;
		this.type_of_material = type_of_material;
		this.height = height;
		this.color = color;
		this.form = form;
		this.year_of_vase = year;
		this.how_many_decor_element = element;

	}

	public static void main(String[] args) {
		Vase testVaseObjct1 = new Vase();
		Vase testVaseObjct2 = new Vase(1, 2, "clay", 3);
		Vase testVaseObjct3 = new Vase(10, 20, "ceramics", 30, "red", "squres", 1250, 5);

		System.out.println(testVaseObjct1.toString());
		System.out.println(testVaseObjct2.toString());
		System.out.println(testVaseObjct3.toString());
		testVaseObjct3.printField(how_many_decor_element);
		Vase.printStaticHowManyDecorElement();
		testVaseObjct2.resetValues(100, 200, "ceramics", 300, "blue", "circle", 1250, 50);
		System.out.println(testVaseObjct2.toString());

	}

}
