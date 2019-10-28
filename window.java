package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class window {
    public static void main(String[] args){
        window a=new window();
    }
    final JTextArea textArea1 = new JTextArea("1797887724@qq.com;1797887724@cug.edu.cn");
    final JTextArea textArea2 = new JTextArea("123456789.");
    window() {
        JFrame jf = new JFrame("邮件推送");
        Container contenpane = jf.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel lable1 = new JLabel("收件人");
        lable1.setBounds(40, 30, 50, 50);
        panel.add(lable1);
        JLabel label2 = new JLabel("正文");
        label2.setBounds(40, 130, 50, 40);
        panel.add(label2);
        contenpane.add(panel);

        textArea1.setFont(new Font("黑体", Font.PLAIN, 13));
        textArea1.setLineWrap(true);
        JScrollPane up = new JScrollPane(textArea1, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        up.setBounds(80, 35, 460, 38);
        panel.add(up);

        textArea2.setFont(new Font("黑体", Font.PLAIN, 13));
        textArea2.setLineWrap(true);
        JScrollPane down = new JScrollPane(textArea2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        down.setBounds(80, 150, 460, 300);
        panel.add(down);
        JButton jb1 = new JButton();
        jb1.setText("发送");
        jb1.setBounds(540, 430, 90, 30);
        panel.add(jb1);
        jb1.addActionListener(new ActionListener() {
                                  public void actionPerformed(ActionEvent e) {
                                      //判断输入邮箱地址的个数
                                      String get = textArea1.getText();
                                      String content = textArea2.getText();
                                      String address[] = get.split(";");
                                      if (get.equals("")) {
                                          System.out.println("0");
                                      } else if (address.length == 1) {
                                          testWebService(1);
                                      } else if (address.length >= 1) {
                                          //System.out.println(address.length);
                                          testWebService(2);
                                      }

                                  }
                              }
        );
        jf.setBounds(400, 100, 646, 516);
        jf.setVisible(true);
    }
    public void testWebService(int kind){
        //获取webservice服务器对象（这里的类名，其实是从wsdl文件中的servicename标签中进行获取的）
        APPService myFirstWebServiceService = new APPService();
        //获取到我们自定义的webservice的对象
        APP myFirstWebServicePort = myFirstWebServiceService.getAPPPort();
        //调用service服务器中的方法
//        String receivedInfo = myFirstWebServicePort.testWebService("您好，webservice 服务器");
//        //打印从服务器的方法中得到的返回值，测试表示收到了服务器返回的内容
//        System.out.println("服务器返回的内容是：" + receivedInfo);
//        }
        if(kind==1){
            String address=textArea1.getText();
            String content=textArea2.getText();
            System.out.println(address+"+"+content);
            boolean res=myFirstWebServicePort.sendEmail(address,content);
            System.out.println(res);
        }
        else if(kind==2) {
            String address = textArea1.getText();
            String content = textArea2.getText();
            String list[] = address.split(";");
            String s;
            for(int i=0;i<list.length;i++){
                s=list[i];
                System.out.println(list[i]);
                myFirstWebServicePort.sendEmail(s,content);
            }

            System.out.println("send 2");
        }


    }
}
