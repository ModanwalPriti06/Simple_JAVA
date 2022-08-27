import java.io.BufferedReader;
import java.io.InputStreamReader;
    class BufferReader
    {
        public static void main(String args[])
        {

            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            try
            {
                String input=br.readLine();
                int n=Integer.parseInt(input);
                System.out.println("the no is="+n);
            }

            catch (Exception ioe)
            {
                System.out.println("Input Error="+ioe);
            }

        }
    }

