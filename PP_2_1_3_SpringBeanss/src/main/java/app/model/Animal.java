package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class Animal {
    @Component
    public class Dog extends Animal {
        @Autowired
        private String dog;

        public Dog(String dog) {
            this.dog = dog;
        }

        public String getDog() {
            return dog;
        }

        public void setDog(String dog) {
            this.dog = dog;
        }
    }
}
