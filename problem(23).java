// 23. Chat Application
// Create a class ChatApplication. Create threads for sending and
// receiving messages. Demonstrate thread lifecycle.
// Output: Sending and receiving messages.

class ChatApplication {
    public static void main(String[] args) {
        Thread sender = new Thread(() -> {
            System.out.println("Sending message...");
        });

        Thread receiver = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        System.out.println("Sender state: " + sender.getState());
        System.out.println("Receiver state: " + receiver.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender state after start: " + sender.getState());
        System.out.println("Receiver state after start: " + receiver.getState());
    }
}
