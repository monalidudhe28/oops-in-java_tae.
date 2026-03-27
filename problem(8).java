// 8. Create a class TextProcessingBuilder.
//  Use StringBuilder to create a string.
//  Append additional text.
//  Display modified string.
//  Write a comment comparing StringBuilder and
// StringBuffer.

class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        sb.append(" - Welcome to Java");

        System.out.println("Modified String: " + sb.toString());
    }
}
