package org.sid.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value="/api")
public class UploadController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment env;
	
	@RequestMapping(value="/upload",headers = "content-type=multipart/*", method=RequestMethod.POST)
	public void upload(@RequestParam("uploadFile") MultipartFile file){
		String fileName = "";
		double randomName = Math.random();
		String dateName = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		try {
			fileName = dateName+"-"+randomName;
			byte [] bytes = file.getBytes();
			String directory =env.getProperty("upload.file.path");
			String uploadFilePath= Paths.get("."+File.separator + directory,fileName).toString();
			final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(uploadFilePath)));
			bufferedOutputStream.write(bytes);
			bufferedOutputStream.close();
		} catch (IOException e) {
			log.info("File problem : "+fileName);
			e.printStackTrace();
		}
	}
}
