package acess_modifier;

public class Main {
	public static void main(String[]args)
	{
	Animal animal;
	animal =new Cat();
	animal.sound();
	Cat c = (Cat)animal;
	c.Cateat();

	animal=new Lion();
	animal.sound();
	
	}
}
