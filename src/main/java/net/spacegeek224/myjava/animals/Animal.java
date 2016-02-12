package net.spacegeek224.myjava;


/**
 * The Animal Class
 * 
 */
public class Animal {
    
    private String name;
    
    /**
     * Creates an animal with the specified name.
     * 
     * @param name The name of the animal.
     */
    
    public Animal(String name) {
        this.name = name;
    }
    
    /**
     * Creates an animal with the name "An Animal".
     * 
     */
    public Animal() {
        this.name = "An Animal";
    }
    
    /**
     * Get the name of the Animal.
     * 
     * @return name the animals name.
     */
    public String getName() {
        return this.name;
    }
}