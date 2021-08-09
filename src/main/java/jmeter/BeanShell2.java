package jmeter;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BeanShell2 {
    public static void main(String[] args) throws IOException {
        String init = "{\"taskId\":\"e9f29ef9435f434d80dd9d6fba139dfe\",\"id\":\"f7c003cf12524e1ab969cfe90963f80b\"}";
        JSONObject jsonObject = JSONObject.parseObject(init);
        String id = jsonObject.getString("id");
        String taskId = jsonObject.getString("taskId");
        System.out.println(id+","+taskId);

        FileWriter fileWriter = new FileWriter("G:\\2Perfmon\\resultfile\\result.csv");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(id+","+taskId);
        bw.flush();
        bw.close();
        fileWriter.close();

    }
}
