package stage3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader  sc =new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(sc.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        for (int i=0; i<count; i++) {
            StringTokenizer st = new StringTokenizer(sc.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }

        bw.flush();
        bw.close();

    }

}

