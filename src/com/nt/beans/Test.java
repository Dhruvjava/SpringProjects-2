package com.nt.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;

public class Test {
    public static void main(String[] args)throws IOException {
        FileSystemResource fileSystemResource=new FileSystemResource("src/com/nt/cfgs/ApplicationContext.xml");
        XmlBeanFactory xmlBeanFactory=new XmlBeanFactory(fileSystemResource);
        WishMessageGenerator wishMessageGenerator=(WishMessageGenerator) xmlBeanFactory.getBean("wmg");
        String Result=wishMessageGenerator.generateWishMessage("Ankit");
        System.out.println(Result);
    }
}
