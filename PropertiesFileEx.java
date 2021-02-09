package collectionPrograms;
import java.util.*;
import java.io.*;

import java.util.Properties;

public class PropertiesFileEx {

    public static void main(String[] args)throws Exception{
        FileReader reader=new FileReader("C:\\Users\\Nagarjuna Tatiparthi\\Desktop\\a.txt");

        Properties p=new Properties();
        p.load(reader);


        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}  