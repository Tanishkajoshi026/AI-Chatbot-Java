import java.util.HashMap;
import java.util.Scanner;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Basic NLP: Rule-based answers using a Map
        HashMap<String, String> responses = new HashMap<>();

        // Training the bot with FAQs
        responses.put("hello", "Hi there! How can I help you today?");
        responses.put("what is your name", "I am your Java AI Assistant.");
        responses.put("how are you", "I'm doing great, thank you for asking!");
        responses.put("bye", "Goodbye! Have a great day ahead.");

        System.out.println("AI Chatbot: Hello! Type something to start (or 'bye' to exit).");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase().trim();

            if (input.equals("bye")) {
                System.out.println("AI Chatbot: " + responses.get("bye"));
                break;
            }

            // Simple pattern matching (NLP Technique)
            boolean found = false;
            for (String key : responses.keySet()) {
                if (input.contains(key)) {
                    System.out.println("AI Chatbot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("AI Chatbot: I'm still learning. Can you rephrase that?");
            }
        }
        scanner.close();
    }
}