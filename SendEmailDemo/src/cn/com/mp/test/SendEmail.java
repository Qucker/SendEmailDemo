package cn.com.mp.test;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	 public static void main(String [] args) throws MessagingException
	   {   
		 Properties props = new Properties();  
	        // ����debug����  
	        props.setProperty("mail.debug", "true");  
	        // ���ͷ�������Ҫ�����֤  
	        props.setProperty("mail.smtp.auth", "true");  
	        // �����ʼ�������������  
	        props.setProperty("mail.host", "smtp.163.com");  
	        // �����ʼ�Э������  
	        props.setProperty("mail.transport.protocol", "smtp");  
	        // ���û�����Ϣ  
	        Session session = Session.getInstance(props);  
	          
	        // �����ʼ�����  
	        Message msg = new MimeMessage(session);  
	        try {
				msg.setSubject("JavaMail����");
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	        // �����ʼ�����  
	        msg.setText("�����ʼ�");  
	        // ���÷�����  
	        msg.setFrom(new InternetAddress("18189530509@163.com"));  
	          
	        Transport transport = session.getTransport();  
	        // �����ʼ�������     xzbbrvnlsjpdbfei
	        transport.connect("18189530509@163.com", "126137mp");  
	        // �����ʼ�  
	        transport.sendMessage(msg, new Address[] {new InternetAddress("909864545@qq.com")});  
	        // �ر�����  
	        transport.close();  
	    }  
}
