//package com.answern.admin;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.test.context.junit4.SpringRunner;
//
///**   
//  *  
//  * @需求名称:
//  * @类描述:[一句话描述该类的功能]
//  * @创建人:[@wem]
//  * @创建时间:[2017年10月9日 上午11:35:24]  
//  * @版本:[v1.0]   
//  *    
//  */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=AdminApplication.class)
//public class mailTest {
// 
//	@Autowired
//    private JavaMailSender mailSender;
//	
//	@Test
//	public void mailTestSyso() {
//		System.out.println("这是一个打印test");
//	}
////	 @Test
////   public void sendSimpleMail() throws Exception {
////       SimpleMailMessage message = new SimpleMailMessage();
////       message.setFrom("wangermin@95303.com");
////       message.setTo("674693934@qq.com");
////       message.setSubject("主题：简单邮件");
////       message.setText("测试邮件内容");
////       System.out.println("生产邮件");
////       mailSender.send(message);
////   }
////	 @Test
////	 public void testSendHtml() {
////	     MimeMessage message = null;
////	     try {
////	         message = mailSender.createMimeMessage();
////	         MimeMessageHelper helper = new MimeMessageHelper(message, true);
////	         helper.setFrom("674693934@qq.com");
////	         helper.setTo("wangermin@95303.com");
////	         helper.setSubject("标题：发送Html内容");
////
////	         StringBuffer sb = new StringBuffer();
////	         sb.append("<h1>大标题-h1</h1>")
////	           .append("<p style='color:#F00'>红色字</p>")
////	           .append("<p style='text-align:right'>右对齐</p>");
////	         helper.setText(sb.toString(), true);
////	     } catch (MessagingException e) {
////	         e.printStackTrace();
////	     }
////	     System.out.println("这里是html邮件");
////	     mailSender.send(message);
////	 }
//}
