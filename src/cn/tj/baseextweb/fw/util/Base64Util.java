package cn.tj.baseextweb.fw.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Util {

    /**
     * base64解密
     */
    public static String dec(String target) {
        String ret = "";
        try {
            ret = new String((new BASE64Decoder()).decodeBuffer(target), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * base64加密
     */
    public static String enc(String target) {
        String ret = "";
        try {
            ret = (new BASE64Encoder()).encodeBuffer(target.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return ret;
    }
}
