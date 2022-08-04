import java.io.*;

public class ExampleString01 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String J = r.readLine();
        String S = r.readLine();

        String Ja = J.replace(".", "");
        String Sa = S.replace(".", "");

        String[] Jaj = Ja.split(", ");
        String[] Sas = Sa.split(", ");

        String[] A0 = Jaj[0].split(" ");
        String[] A1 = Jaj[1].split(" ");
        String[] B0 = Sas[0].split(" ");
        String[] B1 = Sas[1].split(" ");

        int result1 = 0;

        if (A0[0].equals(B0[0]) & A0[1].equals(B0[1])) {
            result1 = result1 + 1;
        } else if (A0[0].equals(B0[1]) & A0[1].equals(B0[0])) {
            result1 = result1 + 1;
        } else if (A0[0].equals(B1[0]) & A0[1].equals(B1[1])) {
            result1 = result1 + 1;
        } else if (A0[0].equals(B1[1]) & A0[1].equals(B1[0])) {
            result1 = result1 + 1;
        }

        int result2 = 0;

        if (A1[0].equals(B0[0]) & A1[1].equals(B0[1])) {
            result2 = result2 + 1;
        } else if (A1[0].equals(B0[1]) & A1[1].equals(B0[0])) {
            result2 = result2 + 1;
        } else if (A1[0].equals(B1[0]) & A1[1].equals(B1[1])) {
            result2 = result2 + 1;
        } else if (A1[0].equals(B1[1]) & A1[1].equals(B1[0])) {
            result2 = result2 + 1;
        }

        if ((result1 + result2) >= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

