package prompt;

public class Prompt {
    // public static void main(String[] args) {
    //     System.out.println("Running from class: " + Prompt.class.getName());
    //     System.out.println("Class location: " + Prompt.class.getResource("Prompt.class"));
    // }
    private final String message;
    private final String type;

    public Prompt(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }
}
