package com.asdf.myapplication;

import java.util.List;

/**
 * Created by Hsiung on 2017/11/15.
 */

public class Bean {

    /**
     * msg :
     * status : 1
     * data : {"share_info":null,"icon":[{"title":"个人资料","pic":"","pts":"1,2,3","type":"1","group":"0","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_uinfo","extra_img":""},{"title":"我的竞猜","pic":"http://img.54hw.com/upload/admin/201709/201709141712117602.png","pts":"1,2,3","type":"2","group":"1","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_cairecord","extra_img":""},{"title":"账户明细","pic":"http://img.54hw.com/upload/admin/201709/201709141712404395.png","pts":"1,2,3","type":"1","group":"1","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_bill","extra_img":""},{"title":"消息","pic":"http://img.54hw.com/upload/admin/201709/201709141713092714.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_mynews","extra_img":""},{"title":"邀请好友","pic":"http://img.54hw.com/upload/admin/201709/201709141713324742.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_prom","extra_img":"http://img.54hw.com/upload/admin/201711/201711141015443266.png"},{"title":"帮助与客服","pic":"http://img.54hw.com/upload/admin/201709/201709141714386074.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_help","extra_img":""},{"title":"关于我们","pic":"http://img.54hw.com/upload/admin/201709/201709141714561240.png","pts":"1,2,3","type":"1","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_aboutus","extra_img":""},{"title":"设置","pic":"http://img.54hw.com/upload/admin/201709/201709141715157404.png","pts":"1,2,3","type":"1","group":"3","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_set","extra_img":""}],"userinfo":{"id":"195772","username":"qqqhhh","logo":"http://img.54hw.com/upload/admin/201711/201711132007498262.jpg","jc_cash":"963600","phone":"13971181368","uid":"195772","cash":963600}}
     */

    private String msg;
    private String status;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * share_info : null
         * icon : [{"title":"个人资料","pic":"","pts":"1,2,3","type":"1","group":"0","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_uinfo","extra_img":""},{"title":"我的竞猜","pic":"http://img.54hw.com/upload/admin/201709/201709141712117602.png","pts":"1,2,3","type":"2","group":"1","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_cairecord","extra_img":""},{"title":"账户明细","pic":"http://img.54hw.com/upload/admin/201709/201709141712404395.png","pts":"1,2,3","type":"1","group":"1","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_bill","extra_img":""},{"title":"消息","pic":"http://img.54hw.com/upload/admin/201709/201709141713092714.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_mynews","extra_img":""},{"title":"邀请好友","pic":"http://img.54hw.com/upload/admin/201709/201709141713324742.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_prom","extra_img":"http://img.54hw.com/upload/admin/201711/201711141015443266.png"},{"title":"帮助与客服","pic":"http://img.54hw.com/upload/admin/201709/201709141714386074.png","pts":"1,2,3","type":"2","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_help","extra_img":""},{"title":"关于我们","pic":"http://img.54hw.com/upload/admin/201709/201709141714561240.png","pts":"1,2,3","type":"1","group":"2","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_aboutus","extra_img":""},{"title":"设置","pic":"http://img.54hw.com/upload/admin/201709/201709141715157404.png","pts":"1,2,3","type":"1","group":"3","needlogin":"1","url":"http://a.54hw.com/index.php?tp=front/jc_set","extra_img":""}]
         * userinfo : {"id":"195772","username":"qqqhhh","logo":"http://img.54hw.com/upload/admin/201711/201711132007498262.jpg","jc_cash":"963600","phone":"13971181368","uid":"195772","cash":963600}
         */

        private Object share_info;
        private UserinfoBean userinfo;
        private List<IconBean> icon;

        public Object getShare_info() {
            return share_info;
        }

        public void setShare_info(Object share_info) {
            this.share_info = share_info;
        }

        public UserinfoBean getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(UserinfoBean userinfo) {
            this.userinfo = userinfo;
        }

        public List<IconBean> getIcon() {
            return icon;
        }

        public void setIcon(List<IconBean> icon) {
            this.icon = icon;
        }

        public static class UserinfoBean {
            /**
             * id : 195772
             * username : qqqhhh
             * logo : http://img.54hw.com/upload/admin/201711/201711132007498262.jpg
             * jc_cash : 963600
             * phone : 13971181368
             * uid : 195772
             * cash : 963600
             */

            private String id;
            private String username;
            private String logo;
            private String jc_cash;
            private String phone;
            private String uid;
            private int cash;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public String getJc_cash() {
                return jc_cash;
            }

            public void setJc_cash(String jc_cash) {
                this.jc_cash = jc_cash;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public int getCash() {
                return cash;
            }

            public void setCash(int cash) {
                this.cash = cash;
            }
        }

        public static class IconBean {
            /**
             * title : 个人资料
             * pic :
             * pts : 1,2,3
             * type : 1
             * group : 0
             * needlogin : 1
             * url : http://a.54hw.com/index.php?tp=front/jc_uinfo
             * extra_img :
             */

            private String title;
            private String pic;
            private String pts;
            private String type;
            private String group;
            private String needlogin;
            private String url;
            private String extra_img;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getPts() {
                return pts;
            }

            public void setPts(String pts) {
                this.pts = pts;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getGroup() {
                return group;
            }

            public void setGroup(String group) {
                this.group = group;
            }

            public String getNeedlogin() {
                return needlogin;
            }

            public void setNeedlogin(String needlogin) {
                this.needlogin = needlogin;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getExtra_img() {
                return extra_img;
            }

            public void setExtra_img(String extra_img) {
                this.extra_img = extra_img;
            }
        }
    }
}
