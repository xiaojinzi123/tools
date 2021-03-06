package com.move.tools.android;

import android.telephony.SmsManager;

import java.util.List;

/**
 * 短信的工具类
 *
 * @author xiaojinzi
 */
public class SmsUtil {

    /**
     * 发短信 需要权限：android.permission.SEND_SMS
     *
     * @param phone   电话
     * @param content 上下文
     */
    public static void sendSms(String phone, String content) {

        // 获取到短信的管理器
        SmsManager smsManager = SmsManager.getDefault();

        // 分割 消息为一个集合
        List<String> list = smsManager.divideMessage(content);

        // 循环集合发送短信
        for (int i = 0; i < list.size(); i++) {
            smsManager.sendTextMessage(phone, null, list.get(i), null, null);
        }

    }

}
