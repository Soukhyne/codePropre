package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		Carnivore carnivore1 = new Carnivore("MAMMIFERE", "Panthère", "CARNIVORE");
		Herbivore herbivore1 = new Herbivore("MAMMIFERE", "Gazelle", "HERBIVORE");
		Herbivore herbivore2 = new Herbivore("MAMMIFERE", "Zèbre", "HERBIVORE");
		Carnivore carnivore2 = new Carnivore("MAMMIFERE", "Lion", "CARNIVORE");
		Poisson poisson1 = new Poisson ("POISSON", "Requin blanc", "HERBIVORE");
		Poisson poisson2 = new Poisson ("POISSON", "Truite dorée", "HERBIVORE");
		Reptile reptile1 = new Reptile ("SERPENT", "Boa constrictor", "CARNIVORE");
		Reptile reptile2 = new Reptile ("SERPENT", "Python", "CARNIVORE");
		
		
		
		zoo.addCarnivore(carnivore1);
		zoo.addCarnivore(carnivore2);
		zoo.addHerbivore(herbivore1);
		zoo.addHerbivore(herbivore2);
		zoo.addPoisson(poisson1);
		zoo.addPoisson(poisson2);
		zoo.addReptile(reptile1);
		zoo.addReptile(reptile2);
		
		//zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		//zoo.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		//zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		//zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		
		//zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		//zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		//zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		//zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
	}

}
