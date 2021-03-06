package com.example.test;

import com.example.domain.bean.SimpleDTO;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: lingjun.jlj
 * @date: 2018/9/15 21:25
 * @description:
 */
public class Test {

    public static void fillPdfFields(Map<String, Object> params, String type, String field) {
        if (StringUtils.isBlank(field)) {
            params.put(type + "0", "");
            return;
        }
        for (int i = 0; i < field.length(); i++) {
            params.put(type + i, field.charAt(i));
        }
    }

    /**
     * 根据地址获得数据的字节流
     *
     * @param strUrl 网络连接地址
     * @return
     */
    public static byte[] getImageFromNetByUrl(String strUrl) {
        try {
            URL url = new URL(strUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据
            return btImg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 从输入流中获取数据
     *
     * @param inStream 输入流
     * @return
     * @throws Exception
     */
    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }

    public static void main(String[] args) throws IOException {
        /*byte[] btImg = getImageFromNetByUrl("http://vodqnuhbilj.vod.126.net/vodqnuhbilj/00f39e83-b59c-4931-99ce-7b2047750df7.mp4");
        String md5 = DigestUtils.md2Hex(btImg);
        System.out.println(md5 + " " + StringUtils.equals("60358b67e7ce6f31b493cbf956548909", md5));

        File file = new File("D:\\software\\nginx-1.16.0.zip");
        String fileMd5 = DigestUtils.md2Hex(new FileInputStream(file));
        System.out.println(fileMd5);
        System.out.println(StringUtils.equals("78137943904752ed3c0e8138b8bfd073", md5));*/

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        for (Integer num : list) {
//            print(num);
//        }
//        String md5 = DigestUtils.md5Hex("330781199509082330");
//        System.out.println(md5);
//
//        System.out.println(Runtime.getRuntime().availableProcessors());

        String keyword = "anad，1131321";
        System.out.println(keyword.replace("，", ","));

        String name = " 角色名称   ";
        System.out.println(name.trim());

        List<SimpleDTO> list = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < 10; i++) {
            SimpleDTO dto = new SimpleDTO();
            dto.setId(index++);
            list.add(dto);
        }
        System.out.println(list);

        long interval = 1000_000_000;

        System.out.println(interval);

        int num = 1011;
        System.out.println("右侧第1位:" + (num & 1));
        System.out.println("右侧第2位" + (num >> 1 & 1));
        System.out.println("右侧第3位" + (num >> 2 & 1));
        System.out.println("右侧第4位:" + (num >> 3 & 1));

        Integer a = 100;//new Integer(100);
        Integer b = 100;//new Integer(100);
        System.out.println(a == b);

        System.out.println(System.nanoTime());

        System.out.println(DigestUtils.md5Hex("123456"));
        System.out.println(DigestUtils.md5Hex("ab123456"));
        System.out.println("密码：" + DigestUtils.md5Hex(DigestUtils.md5Hex("admin@123456") + "1000"));
        System.out.println("密码：" + DigestUtils.md5Hex("4860ce23464e697ebf0e5f8f554b2fbb" + "1000"));

        String password = "70f43a87461999eba84700437ad50ca7" + "1";
        System.out.println("加密密码：" + DigestUtils.sha256Hex(password));

        System.out.println("毫秒时间戳:"+System.nanoTime()+"92012326399170196");

    }

    private static void print(Integer num) {
        if (num == 3) {
            return;
        }
        System.out.println(num);
    }


}
