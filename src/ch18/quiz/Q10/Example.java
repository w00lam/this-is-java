package ch18.quiz.Q10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("원본 파일 경로: ");
            String originalFilePath = sc.nextLine();
            System.out.print("복사 파일 경로: ");
            String targetFilePath = sc.nextLine();

            File originalFile = new File(originalFilePath);
            if (!originalFile.exists()) {
                System.out.println("원본 파일이 존재하지 않습니다.");
                System.exit(0);
            }

            File targetFile = new File(targetFilePath);
            File parentFile = targetFile.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalFilePath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFilePath));

            byte[] data = new byte[1024];
            while (true) {
                int num = bis.read(data);
                if (num == -1) {
                    break;
                }
                bos.write(data, 0, num);
            }
            System.out.println("복사가 성공되었습니다.");

            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
