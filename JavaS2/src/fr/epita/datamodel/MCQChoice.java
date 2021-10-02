package fr.epita.datamodel;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.PrimitiveIterator;


// Constructor
public class MCQChoice {
    MCQChoice Question; // inheritance

    private String choice;
    private boolean valid;

    public MCQChoice(String choice, boolean valid) {
        this.choice = choice;
        this.valid = valid;
    }
// Getter and Setter


    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
