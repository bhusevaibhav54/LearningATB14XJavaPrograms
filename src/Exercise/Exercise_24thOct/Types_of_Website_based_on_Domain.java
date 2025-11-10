package Exercise.Exercise_24thOct;
//24)  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
//           :- take the Site URL input from the user
//Example Scenarios
//Input: example.com
//Output: The website type is: Commercial website
//Input: example.org
//Output: The website type is: Non-profit organization
//Input: example.edu
//Output: The website type is: Educational institution
//Input: example.gov
//Output: The website type is: Government website
//Input: example.net
//Output: The website type is: Network-related website
//Input: example.info
//Output: The website type is: Informational website
//Input: example.xyz
//Output: The website type is: Unknown or other types of websites

import java.util.Scanner;

public class Types_of_Website_based_on_Domain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL: ");
        String url = sc.nextLine().toLowerCase();

        String type;
        if (url.endsWith(".com")) {
            type = "Commercial website";
        } else if (url.endsWith(".org")) {
            type = "Non-profit organization";
        } else if (url.endsWith(".edu")) {
            type = "Educational institution";
        } else if (url.endsWith(".gov")) {
            type = "Government website";
        } else if (url.endsWith(".net")) {
            type = "Network-related website";
        } else if (url.endsWith(".info")) {
            type = "Informational website";
        } else {
            type = "Unknown or other types of websites";
        }
        System.out.println("The website type is: " + type);
    }
}
