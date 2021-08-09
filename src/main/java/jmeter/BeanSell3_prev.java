package jmeter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BeanSell3_prev {
    public static void main(String[] args) throws IOException {
        //String recv=prev.getResponseDataAsString();
        String recv = "{\"success\":\"True\",\"errmsg\":\"success\",\"errcode\":\"0\",\"data\":\"157f82319d50410a9cf93369ef9acf0a\"}";
        JSONObject jsonObject = JSON.parseObject(recv);
        String token = (String) JSONPath.eval(jsonObject,"$.data");
        System.out.println(token);

        String tk = jsonObject.getString("data");
        System.out.println(tk);
        System.out.println("做了一些修改new");

        FileWriter fileWriter = new FileWriter("G:\\2Perfmon\\resultfile\\test.csv");
        BufferedWriter bf = new BufferedWriter(fileWriter);
        bf.write(tk+","+tk);
        bf.flush();
        bf.close();
        fileWriter.close();



    }
}
