import java.util.*;
public class securitykey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3, s4, s5, ss3, ss4, ss5;
        int l = s1.length();
        int l1 = s2.length();
        int qut = l / 3;
        int qut2 = l1 / 3;
        int rem = l % 3;
        int rem1 = l1 % 3;
        if (l1 <= 3) {
            s3 = s1.charAt(0) + "";
            s4 = s1.charAt(1) + "";
            s5 = s1.charAt(2) + "";
        } else if (s1.length() % 3 == 0) {
            s3 = s1.substring(0, l / 3);
            s4 = s1.substring(qut, qut + qut + rem);
            s5 = s1.substring((qut + qut + rem), qut + qut + qut + rem);
        } else {
            s3 = s1.substring(0, l / 3);
            s4 = s1.substring(qut, qut + qut + rem);
            s5 = s1.substring((qut + qut + rem), qut + qut + qut + rem);
        }
        if (l1 <= 3) {
            ss3 = s2.charAt(0) + "";
            ss4 = s2.charAt(1) + "";
            ss5 = s2.charAt(2) + "";
        } else if (s2.length() % 3 == 0) {
            ss3 = s2.substring(0, l1 / 3);
            ss4 = s2.substring(qut2, qut2 + qut2 + rem1);
            ss5 = s2.substring((qut2 + qut2 + rem1), qut2 + qut2 + qut2 + rem1);
        } else {
            ss3 = s2.substring(0, qut2);
            ss4 = s2.substring(qut2, qut2 + qut2 + rem1);
            ss5 = s2.substring((qut2 + qut2 + rem1), qut2 + qut2 + qut2 + rem1);
        }
        System.out.println(ss3 + s3 + s5 + ss5);
    }
}