import java.util.Scanner;

public class StateTaxes{
    // properties 
    private final double TAX_RATE = 0.13;

    private final double numberOfDependents;
        // if a mistake is made, 
            // a new form will replace the last form and the old form is made 

    // constructors
    public StateTaxes(Integer numberOfDependents) {
        // dependency level of injection
        _numberOfDependents = numberOfDependents;
        // prefixed with an underscore ensures the program differentiates between the argument and the parameter
            // helps the code understand the value is injected from the outside of the system

    } 
    // concretions 

    // helpers (private and only available for that class)

    // classes need to be extremely generic or incredibly specific 
        // 
}