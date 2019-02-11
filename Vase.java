package Demo;

public class Vase {
	protected String form;
	protected int yearOfVase;
	private int valume;
	private int weight;
	private String typeOfMaterial;
	private int height;
	private String color;
	private static int howManyDecorElement;
	
	public Vase() {

	}

	public Vase(int valume, int weight, String typeOfMaterial, int height) {
		this.valume = valume;
		this.weight = weight;
		this.typeOfMaterial = typeOfMaterial;
		this.height = height;
	}

	public Vase(int valume, int weight, String typeOfMaterial, int height, String color, String form,
			int yearOfVase, int howManyDecorElement) {
		this(valume, weight, typeOfMaterial, height);
		this.color = color;
		this.form = form;
		this.yearOfVase = yearOfVase;
		this.howManyDecorElement = howManyDecorElement;
	}

	public void setValume(int valume) {
		this.valume = valume;
	}

	public int getValume() {
		return valume;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}



	/*public String toString() {
		return "valume=" + valume + ";weight=" + weight + ";type_of_material=" + typeOfMaterial + "; height=" + height
				+ "; color=" + color + "; form=" + form + "; year_of_vase=" + yearOfVase + "; how_many_decor_element="
				+ howManyDecorElement;
	}*/


	
	public String toString() {
		return "Vase [form=" + form + ", yearOfVase=" + yearOfVase + ", valume=" + valume + ", weight=" + weight
				+ ", typeOfMaterial=" + typeOfMaterial + ", height=" + height + ", color=" + color + "]";
	}
	
	public static void printStaticHowManyDecorElement() {
		System.out.println(howManyDecorElement);
	}

	public void printField(int field) {
		System.out.println(field);
	}

	public void resetValues(int valume, int weight, String typeOfMaterial, int height, String color, String form,
			int year, int element) {

		this.valume = valume;
		this.weight = weight;
		this.typeOfMaterial = typeOfMaterial;
		this.height = height;
		this.color = color;
		this.form = form;
		this.yearOfVase = year;
		this.howManyDecorElement = element;

	}

	public static void main(String[] args) {
		Vase testVaseObjct1 = new Vase();
		Vase testVaseObjct2 = new Vase(1, 2, "clay", 3);
		Vase testVaseObjct3 = new Vase(10, 20, "ceramics", 30, "red", "squres", 1250, 5);

		System.out.println(testVaseObjct1.toString());
		System.out.println(testVaseObjct2.toString());
		System.out.println(testVaseObjct3.toString());
		testVaseObjct3.printField(howManyDecorElement);
		Vase.printStaticHowManyDecorElement();
		testVaseObjct2.resetValues(100, 200, "ceramics", 300, "blue", "circle", 1250, 50);
		System.out.println(testVaseObjct2.toString());

	}

}
