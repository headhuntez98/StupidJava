

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Stupid {
    public static void main(String[] arg) {        
        int crazy = Dumb(arg);
		System.exit(crazy);    
    }
    public static int Dumb(String dumb[]) 
    {
        try {
            if(dumb.length != 2) {
                return -1;
            }
            String a = new String(Files.readAllBytes(Paths.get(dumb[1]))); 
            String b = new String(Files.readAllBytes(Paths.get(dumb[0])));
            int c = b.length();
            if(c < 4) {
                return -2;
            }
            int x = 0; 
            float y = 0;
            for(int i = 0; i < c - 3; i++){       
				for(int j = 0; j < a.length() - 4; j++){
					int vOv = 0;
                    for(int k = 0; k < 4; k++){
                        if(b.charAt(i + k) == a.charAt(j + k)){              
                            vOv++;
                        }
                        if(vOv == 4){
                            System.out.println("DEBUG : ".concat(String.valueOf(i) + "," + String.valueOf(j)));
                            x++; 
                            y++;
                        }
                        else {             
                            x++;
                        }
                    }
				}
            }
            System.out.println(String.valueOf(Math.round(y)).concat("/") + String.valueOf(x));   
            return 1;
		} catch(IOException ex){
            System.out.println("DEBUG:Error");
            return -3;
        }
    }
}

