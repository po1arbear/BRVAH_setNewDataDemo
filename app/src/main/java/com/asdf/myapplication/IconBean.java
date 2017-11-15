package com.asdf.myapplication;

public  class IconBean {
            /**
             * title : 个人资料
             * pic :
             * pts : 1,2,3
             * type : 1
             * group : 0
             * needlogin : 1
             * url : http://a.54hw.com/index.php?tp=front/jc_uinfo
             */

            private String title;
            private String pic;
            private String pts;
            private String type;
            private String group;
            private String needlogin;
            private String url;

            @Override
            public String toString() {
                return "IconBean{" +
                        "title='" + title + '\'' +
                        ", pic='" + pic + '\'' +
                        ", pts='" + pts + '\'' +
                        ", type='" + type + '\'' +
                        ", group='" + group + '\'' +
                        ", needlogin='" + needlogin + '\'' +
                        ", url='" + url + '\'' +
                        ", extra_img='" + extra_img + '\'' +
                        '}';
            }

            public String getExtra_img() {
                return extra_img;
            }

            public void setExtra_img(String extra_img) {
                this.extra_img = extra_img;
            }

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
        }