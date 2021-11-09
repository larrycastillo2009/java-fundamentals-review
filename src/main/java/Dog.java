public class Dog extends Pet implements Barkable {
    private String breed;

    public Dog(int age, boolean isRescue, String name, String breed) {
        super(age, isRescue, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void bark() {
        System.out.println("Bork bork!");
    }
}
