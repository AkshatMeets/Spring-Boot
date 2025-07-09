package com.api.book.SpringBootRestBook.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {

//    public final String UPLOAD_DIR="A:\\Office 2025\\Spring-Boot\\SpringBootRestBook\\SpringBootRestBook\\src\\main\\resources\\static\\image";
    public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException {

    }
    public boolean uploadFile(MultipartFile f){
        boolean fals = false;

        try{

//            InputStream is = f.getInputStream();
//            byte data[]= new byte[is.available()];
//            is.read(data);
//
//            FileOutputStream fos =  new FileOutputStream(UPLOAD_DIR+File.separator+f.getOriginalFilename());
//            fos.write(data);
//
//            fos.flush();
//            fos.close();

            Files.copy(f.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+f.getOriginalFilename()) ,StandardCopyOption.REPLACE_EXISTING);

            fals=true;

        }catch(Exception e){

        }
        return fals;
    }
}
