package test.bwie.yuekaomap2.Ppresenter;

import test.bwie.yuekaomap2.model.OkModel;
import test.bwie.yuekaomap2.view.Okview;

/**
 * Created by 蒋六六 on 2017/10/24.
 */

public class OKPresenter implements OkModel.Success,Okview {
    private OkModel okModel;
    private Okview okview;
    public OKPresenter(Okview okview){
        this.okview=okview;
         okModel = new OkModel();
         okModel.setsucces(this);
    }
    public void login(String uid){
        okModel.okhttp(uid);
    }
    @Override
    public void successed(String a) {
       okview.successed(a);
    }
}
