package test.bwie.yuekaomap2.bean;

import java.util.List;

/**
 * Created by 蒋六六 on 2017/10/24.
 */

public class Bean {
    public String msg;
    public String code;
    public List<DataBean> data;
    public static class DataBean {
        public String sellerName;
        public String sellerid;
        public List<ListBean> list;
        public static class ListBean {
            public int bargainPrice;
            public String createtime;
            public String detailUrl;
            public String images;
            public int num;
            public int pid;
            public int price;
            public int pscid;
            public int selected;
            public int sellerid;
            public String subhead;
            public String title;
        }
    }
}
