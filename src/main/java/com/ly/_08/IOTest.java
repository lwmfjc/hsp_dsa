package com.ly._08;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(
                new File("src/my.data")
        );
        ObjectOutputStream
                objectOutputStream = new ObjectOutputStream(fileOutputStream
        );
        int[][] a = new int[3000][4000];
        a[2][1] = 5;
        a[1][2] = 9;
        objectOutputStream.writeObject(a);
        objectOutputStream.close();
        File file = new File("src/my.data");
        System.out.println("文件大小(字节)："+file.length());
        System.out.println("文件大小(kb)："+file.length()/1024.0);
        System.out.println("文件大小(mb)："+file.length()/1024/1024.0);
        //从文件读取数组
        /*FileInputStream inputStream=new FileInputStream(
                new File("src/my.data"));
        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        int[][] b = (int[][]) objectInputStream.readObject();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.printf("%4d",b[i][j]);
            }
            System.out.println();
        }*/

    }
}
