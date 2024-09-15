class Animal {
    protected String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}

class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(String speciesName, boolean hasFur) {
        super(speciesName);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String speciesName, boolean hasFur, String breed) {
        super(speciesName, hasFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Species: " + getSpeciesName() + ", Has Fur: " + hasFur() + ", Breed: " + getBreed();
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Canis lupus familiaris", true, "Golden Retriever");
        System.out.println(dog);
    }
}
