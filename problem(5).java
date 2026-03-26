// 5. Define a class FileExtensionExtractor.
//  Accept a file name (example: &quot;report.pdf&quot;).
//  Extract file extension using substring() method.
//  Display extracted extension.

import java.util.Scanner;
class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

        int index = fileName.lastIndexOf('.');
        String extension = fileName.substring(index + 1);

        System.out.println(extension);
    }
}
