// 7. Define a class TextEditorBuffer.
//  Create a string using StringBuffer.
//  Append text to the string.
//  Insert text at a specific position.
//  Reverse the final string and display it.

import java.util.Scanner;
class TextEditorBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        String appendText = sc.nextLine();
        sb.append(appendText);

        String insertText = sc.nextLine();
        int position = sc.nextInt();
        sb.insert(position, insertText);

        sb.reverse();
        System.out.println(sb.toString());
    }
}

