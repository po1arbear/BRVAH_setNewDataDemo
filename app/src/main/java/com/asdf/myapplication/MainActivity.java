package com.asdf.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerview;
    private Button btn_refresh;
    private String json="{\"msg\":\"\",\"status\":\"1\",\"data\":{\"share_info\":null,\"icon\":[{\"title\":\"\\u4e2a\\u4eba\\u8d44\\u6599\",\"pic\":\"\",\"pts\":\"1,2,3\",\"type\":\"1\",\"group\":\"0\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_uinfo\",\"extra_img\":\"\"},{\"title\":\"\\u6211\\u7684\\u7ade\\u731c\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141712117602.png\",\"pts\":\"1,2,3\",\"type\":\"2\",\"group\":\"1\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_cairecord\",\"extra_img\":\"\"},{\"title\":\"\\u8d26\\u6237\\u660e\\u7ec6\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141712404395.png\",\"pts\":\"1,2,3\",\"type\":\"1\",\"group\":\"1\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_bill\",\"extra_img\":\"\"},{\"title\":\"\\u6d88\\u606f\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141713092714.png\",\"pts\":\"1,2,3\",\"type\":\"2\",\"group\":\"2\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_mynews\",\"extra_img\":\"\"},{\"title\":\"\\u9080\\u8bf7\\u597d\\u53cb\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141713324742.png\",\"pts\":\"1,2,3\",\"type\":\"2\",\"group\":\"2\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_prom\",\"extra_img\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201711\\/201711141015443266.png\"},{\"title\":\"\\u5e2e\\u52a9\\u4e0e\\u5ba2\\u670d\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141714386074.png\",\"pts\":\"1,2,3\",\"type\":\"2\",\"group\":\"2\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_help\",\"extra_img\":\"\"},{\"title\":\"\\u5173\\u4e8e\\u6211\\u4eec\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141714561240.png\",\"pts\":\"1,2,3\",\"type\":\"1\",\"group\":\"2\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_aboutus\",\"extra_img\":\"\"},{\"title\":\"\\u8bbe\\u7f6e\",\"pic\":\"http:\\/\\/img.54hw.com\\/upload\\/admin\\/201709\\/201709141715157404.png\",\"pts\":\"1,2,3\",\"type\":\"1\",\"group\":\"3\",\"needlogin\":\"1\",\"url\":\"http:\\/\\/a.54hw.com\\/index.php?tp=front\\/jc_set\",\"extra_img\":\"\"}],\"userinfo\":{\"id\":\"195772\",\"username\":\"qqqhhh\",\"logo\":\"http://img.54hw.com/upload/admin/201711/201711132007498262.jpg\",\"jc_cash\":\"963600\",\"phone\":\"13971181368\",\"uid\":\"195772\",\"cash\":963600}}}";
    private UserCenterAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        json = getResources().getString(R.string.icons_json);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        btn_refresh = (Button) findViewById(R.id.btn_refresh);
        btn_refresh.setOnClickListener(this);
        Bean bean = new Gson().fromJson(json,Bean.class);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new UserCenterAdapter(R.layout.item_mine,bean.getData().getIcon());
        recyclerview.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_refresh:
                Bean bean = new Gson().fromJson(json,Bean.class);
                List<Bean.DataBean.IconBean> icons = bean.getData().getIcon();
                adapter.setNewData(icons);
                break;
        }
    }
}
