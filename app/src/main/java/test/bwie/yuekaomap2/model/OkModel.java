package test.bwie.yuekaomap2.model;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import test.bwie.yuekaomap2.bean.Api;

/**
 * Created by 蒋六六 on 2017/10/24.
 */

public class OkModel {
    public void okhttp(String uid){
        OkHttpClient okHttpClient=new OkHttpClient();
        FormBody.Builder builder=new FormBody.Builder();
        builder.add("uid",uid);
        FormBody build = builder.build();
        Request build1 = new Request.Builder().post(build).url(Api.Api_selectcarshop).build();
        okHttpClient.newCall(build1).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                succes.successed(string);
            }
        });
    }
    private Success succes;
    public void setsucces(Success succes){
        this.succes=succes;
    }
    public interface Success{
        void successed(String a);
    }
}
