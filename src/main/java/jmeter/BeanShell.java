package jmeter;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class BeanShell {
    public static void main(String[] args) throws IOException {

        String init = "{\"taskId\":\"7e692c8a863a4497a7057eceb155d440\",\"id\":\"1b847048f08145319738d384d0569654\"}";
        /*System.out.println(init);*/
        JSONObject json = JSONObject.parseObject(init);
        String id = json.getString("id");
        String taskId = json.getString("taskId");

        FileWriter fstream = new FileWriter("G:/2Perfmon/resultfile/result.csv",true);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(id+","+taskId);
        out.write(System.getProperty("line.separator"));
        out.flush();
        out.close();
        fstream.close();
    }
}
