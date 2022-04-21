package sprinigboots3aws.com.example.s3sdkdemo.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface S3Service {

    String saveFile(MultipartFile file);

    byte[] downloadFile(String filename);


    String deleteFile(String filename);


    List<String> listAllFiles();



}
