package com.example.springboot_002.controller;


import com.example.springboot_002.enity.UserInfo;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping(value = "/file")
public class FileUpload {






    private static final Logger logger = LoggerFactory.getLogger(FileUpload.class);

    public FileUpload() {
        logger.info("-----这里是文件上传11111-----");
    }


    @RequestMapping(value = "/file1")
    public String create(UserInfo ui, MultipartFile[] file, HttpServletRequest request) {

        logger.info("-进来了-");

        try {
            if (file != null && file.length > 0) {
                for (MultipartFile multipartFile : file) {
                    String path = request.getSession().getServletContext().getRealPath("/");//生产路径
                    logger.info("文件路径为：" + path);
                    FileUtils.writeByteArrayToFile(new File(path + "file" + multipartFile.getOriginalFilename()), multipartFile.getBytes());
                }
            }
        } catch (IOException e) {
            System.out.println("文件上传失败");
            logger.error(e.toString());
        }
        return "index";

    }
/**
 *
 @RequestMapping(value = "/products", method = RequestMethod.POST)
 public String create( MultipartHttpServletRequest request) {

 try {
 List<MultipartFile> files = request.getFiles("file");
 for (MultipartFile file : files) {
 FileUtils.writeByteArrayToFile(new File("F:\\dev\\" + file.getOriginalFilename()), file.getBytes());

 }
 } catch (IOException e) {
 logger.error(e.toString());
 }

 return "index";
 }
 */


}
