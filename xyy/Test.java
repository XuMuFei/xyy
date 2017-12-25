/*
 *  Copyright ® 2017.   All right reserved.
 *
 *  Last modified 17-7-6 上午9:42
 *
 *
 */

package com.ebnews.bean;

import java.io.Serializable;
import java.util.List;

/**
 * The type Ad entry.
 *
 * @Description: 广告实体类
 * @Author: xuyangyang
 * @Email: xuyangyang @ebrun.com
 * @Version: V4.4.0
 * @Create: 2017 /10/11 15:02
 * @Modify:
 */
public class ADEntry  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2135503938326019274L;
	/**
     * code : 0
     * msg : SUCCESS
     * count : 1
     * ads : [{"adtype":"4","restype":null,"title":"有道词典","desc":"","src":"","icon":"http://oimagea1.ydstatic.com/image?id=-303026711864834443&product=adpublish&w=180&h=120&sc=0","link":"http://m.youdao.com/requestlog?c=MOBILE_DOWNLOAD&keyfrom=soft.download.web&url=youdaodict_android.apk&wid=AAAAAFP%2Fhz0&yd_apk_download=1","clickreport":["http://p.clkservice.youdao.com/clk/request.s?k=XxDt00UG3kzHg1LU8s3V3ZVQVEbVUjEf4Gim9m0r%2FqjXxo%2BoRxcJpjjAgKuViCqvxf8boGqlOa9n6GdkHWDzSrE0W8X8tJLM8dhIJr39UWbPL%2BqeaH34BpO2RbrWQUgS86hU5giAT1EWS%2FslSdXuWfD4yJuEpxtsB8bIN%2FXYFgQSWARVTh5HrnG8jgrkMhlTfSBkz4RXcPzmrZ8K9gUSQBwKJlAm3s6poLVq8xlD%2B35Ptd3xPkYcRC0dkEHuK2t6GHbyTD%2Fu3304ulYXQujPUWAFE2wp9A9rqttfsc9eYJ6Y7bwYuSjADjFL11GXFByPyiy%2FD32TquPA6Xk5eRr4p%2BSsrMhxIVYAXxDbY8QXSqtAXk2JTKfhdIiiYDyLLkBYDB5XUumkFmPCrsU%2BYvprR9NVU8EP27Mif1sBTui7AVSAYwtQ3%2F%2F5F09RnVTbfLdaXTNnw1tkaa3UjuXdbeQ3vQQkJGn50aFLdlkJsNGi1mR1Aa%2FfA9uaNdRoP07Q7ss2Hc9%2Bdy5AndC2AjgRSNAQyP0W%2FnTZNBVMNfTjYOmt11ivVv6Wxhv3sbUWpDnpTb7DTzlwtqoo8IFZGlym51gZBrotwBpHRkcLattkC0KYnpliSabPj9K37T%2BZ1WkJDcRHrVD%2Bp6nUFLTTDldwlaPi5vWYtxJ2aR5lJPeW18lmCKTY9J7lNtV8tplFCdjWuqhxRzykVRYmlVXc8iKe%2FLDVp0gTK0eJ68r9EGYKL60KBj4GgkQfGhv30HkT3I7PyyA6phHCC9fgV9fuMzKNY52%2FJ%2FINUiBQU9wwPYo2jJsJ%2F0tGhNLUz%2F97hZ8IbBDETJPF18aPqEcXCaY4wICrlYgqr9fGj6hHFwmmOMCAq5WIKq%2Fr8IEqslfYvzGeK4u9lh%2F9sv6ByFURYHkB1LVM2t66AA%3D%3D&isrd=0&youdao_bid=dad8385a-32e7-4936-a0d0-726fa1d83f82&youdao_deviceId=866394025339318","http://139.129.85.85/c/?q=WIH4sIAAAAAAAEAOy9B2AcSZYlJi9tynt/SvVK1+B0oQiAYBMk2JBAEOzBiM3mkuwdaUcjKasqgcplVmVdZhZAzO2dvPfee++999577733ujudTif33/8/XGZkAWz2zkrayZ4hgKrIHz9+fB8/In7xR5OPHn308P7ug9n93Xz73r3z2fb+7uz+9mQ3z7ezfCd/mN1/8CB7MPlo9NGUmmaznd179PuMfi8WefH7H3z66b2H+zt79+/de3hv94C+KuirPXrt4Hz3/vbDg4cPt/cf7sy2s8nO/vZBPp3c3z2/l9F31PSnqem92f3pXr7zYHv/wfnB9v50crCd7U/vbx/sfUpY5dmD7GFOTUtA3dnfu/fp6f2nu8e7+/dPd4/3nj49+PTBzr2n9+7tPLh/TM0WHz06z8omH31U0Qu79MmKfu6P6T/6vabf6UeLr/Y/3T+49+Dg04c7D9Espzd3aIxT+TGTH62C+yX/TwAAAP//63+pmikBAAA="],"displayreport":[{"reporttime":0,"reporturl":"http://dsp-impr2.youdao.com/k.gif?yd_ewp=3469&yd_ext=EnQKATASIDY1ZWVhNDdhOTcyOGE2ZWQxNGRjY2M2YWY4NmNkMzg5IksI1uilCBDw5P8BGPKzHiC1_RAo8k4wZDhkZQDQWEVwAHgAgAEAmAEBogELVHJhZGl0aW9uYWy6ARJ7Ik9SREVSRURfSUQiOiIxIn0wAiIkZGFkODM4NWEtMzJlNy00OTM2LWEwZDAtNzI2ZmExZDgzZjgyKG4wADoAQgBSCzEuMjAyLjk0LjQyag0xNDY0OTM5MjQxNDU1eACCAQCIAY0bkAHvv7up0SqoAQGwAQG4AQHCAQQxMzc2yAEB0AEB2gEPODY2Mzk0MDI1MzM5MzE4"},{"reporttime":0,"reporturl":"http://139.129.85.85/d/?q=FIH4sIAAAAAAAEAOy9B2AcSZYlJi9tynt/SvVK1+B0oQiAYBMk2JBAEOzBiM3mkuwdaUcjKasqgcplVmVdZhZAzO2dvPfee++999577733ujudTif33/8/XGZkAWz2zkrayZ4hgKrIHz9+fB8/In7xR5OPHn308P7ug9n93Xz73r3z2fb+7uz+9mQ3z7ezfCd/mN1/8CB7MPlo9NGUmmaznd179PuMfi8WefH7H3z66b2H+zt79+/de3hv94C+KuirPXrt4Hz3/vbDg4cPt/cf7sy2s8nO/vZBPp3c3z2/l9F31PSnqem92f3pXr7zYHv/wfnB9v50crCd7U/vbx/sfUpY5dmD7GFOTUtA3dnfu/fp6f2nu8e7+/dPd4/3nj49+PTBzr2n9+7tPLh/TM0WHz06z8omH31U0Qu79MmKfu6P6T/6vabf6UeLr/Y/3T+49+Dg04c7D9Espzd3aIxT+TGTH62C+yX/TwAAAP//63+pmikBAAA="}],"page":"","width":"","height":"","smarth":0,"extra":null,"action":2,"em":0,"apn":null,"aps":0,"showtime":0,"admode":null}]
     * adcode : ad013
     * pvid : 29a58f15-9899-490d-ab04-8ecb51f3af15
     */

    private int code;
    private String msg;
    private int count;
    private String adcode;
    private String pvid;
    /**
     * adtype : 4
     * restype : null
     * title : 有道词典
     * desc :
     * src :
     * icon : http://oimagea1.ydstatic.com/image?id=-303026711864834443&product=adpublish&w=180&h=120&sc=0
     * link : http://m.youdao.com/requestlog?c=MOBILE_DOWNLOAD&keyfrom=soft.download.web&url=youdaodict_android.apk&wid=AAAAAFP%2Fhz0&yd_apk_download=1
     * clickreport : ["http://p.clkservice.youdao.com/clk/request.s?k=XxDt00UG3kzHg1LU8s3V3ZVQVEbVUjEf4Gim9m0r%2FqjXxo%2BoRxcJpjjAgKuViCqvxf8boGqlOa9n6GdkHWDzSrE0W8X8tJLM8dhIJr39UWbPL%2BqeaH34BpO2RbrWQUgS86hU5giAT1EWS%2FslSdXuWfD4yJuEpxtsB8bIN%2FXYFgQSWARVTh5HrnG8jgrkMhlTfSBkz4RXcPzmrZ8K9gUSQBwKJlAm3s6poLVq8xlD%2B35Ptd3xPkYcRC0dkEHuK2t6GHbyTD%2Fu3304ulYXQujPUWAFE2wp9A9rqttfsc9eYJ6Y7bwYuSjADjFL11GXFByPyiy%2FD32TquPA6Xk5eRr4p%2BSsrMhxIVYAXxDbY8QXSqtAXk2JTKfhdIiiYDyLLkBYDB5XUumkFmPCrsU%2BYvprR9NVU8EP27Mif1sBTui7AVSAYwtQ3%2F%2F5F09RnVTbfLdaXTNnw1tkaa3UjuXdbeQ3vQQkJGn50aFLdlkJsNGi1mR1Aa%2FfA9uaNdRoP07Q7ss2Hc9%2Bdy5AndC2AjgRSNAQyP0W%2FnTZNBVMNfTjYOmt11ivVv6Wxhv3sbUWpDnpTb7DTzlwtqoo8IFZGlym51gZBrotwBpHRkcLattkC0KYnpliSabPj9K37T%2BZ1WkJDcRHrVD%2Bp6nUFLTTDldwlaPi5vWYtxJ2aR5lJPeW18lmCKTY9J7lNtV8tplFCdjWuqhxRzykVRYmlVXc8iKe%2FLDVp0gTK0eJ68r9EGYKL60KBj4GgkQfGhv30HkT3I7PyyA6phHCC9fgV9fuMzKNY52%2FJ%2FINUiBQU9wwPYo2jJsJ%2F0tGhNLUz%2F97hZ8IbBDETJPF18aPqEcXCaY4wICrlYgqr9fGj6hHFwmmOMCAq5WIKq%2Fr8IEqslfYvzGeK4u9lh%2F9sv6ByFURYHkB1LVM2t66AA%3D%3D&isrd=0&youdao_bid=dad8385a-32e7-4936-a0d0-726fa1d83f82&youdao_deviceId=866394025339318","http://139.129.85.85/c/?q=WIH4sIAAAAAAAEAOy9B2AcSZYlJi9tynt/SvVK1+B0oQiAYBMk2JBAEOzBiM3mkuwdaUcjKasqgcplVmVdZhZAzO2dvPfee++999577733ujudTif33/8/XGZkAWz2zkrayZ4hgKrIHz9+fB8/In7xR5OPHn308P7ug9n93Xz73r3z2fb+7uz+9mQ3z7ezfCd/mN1/8CB7MPlo9NGUmmaznd179PuMfi8WefH7H3z66b2H+zt79+/de3hv94C+KuirPXrt4Hz3/vbDg4cPt/cf7sy2s8nO/vZBPp3c3z2/l9F31PSnqem92f3pXr7zYHv/wfnB9v50crCd7U/vbx/sfUpY5dmD7GFOTUtA3dnfu/fp6f2nu8e7+/dPd4/3nj49+PTBzr2n9+7tPLh/TM0WHz06z8omH31U0Qu79MmKfu6P6T/6vabf6UeLr/Y/3T+49+Dg04c7D9Espzd3aIxT+TGTH62C+yX/TwAAAP//63+pmikBAAA="]
     * displayreport : [{"reporttime":0,"reporturl":"http://dsp-impr2.youdao.com/k.gif?yd_ewp=3469&yd_ext=EnQKATASIDY1ZWVhNDdhOTcyOGE2ZWQxNGRjY2M2YWY4NmNkMzg5IksI1uilCBDw5P8BGPKzHiC1_RAo8k4wZDhkZQDQWEVwAHgAgAEAmAEBogELVHJhZGl0aW9uYWy6ARJ7Ik9SREVSRURfSUQiOiIxIn0wAiIkZGFkODM4NWEtMzJlNy00OTM2LWEwZDAtNzI2ZmExZDgzZjgyKG4wADoAQgBSCzEuMjAyLjk0LjQyag0xNDY0OTM5MjQxNDU1eACCAQCIAY0bkAHvv7up0SqoAQGwAQG4AQHCAQQxMzc2yAEB0AEB2gEPODY2Mzk0MDI1MzM5MzE4"},{"reporttime":0,"reporturl":"http://139.129.85.85/d/?q=FIH4sIAAAAAAAEAOy9B2AcSZYlJi9tynt/SvVK1+B0oQiAYBMk2JBAEOzBiM3mkuwdaUcjKasqgcplVmVdZhZAzO2dvPfee++999577733ujudTif33/8/XGZkAWz2zkrayZ4hgKrIHz9+fB8/In7xR5OPHn308P7ug9n93Xz73r3z2fb+7uz+9mQ3z7ezfCd/mN1/8CB7MPlo9NGUmmaznd179PuMfi8WefH7H3z66b2H+zt79+/de3hv94C+KuirPXrt4Hz3/vbDg4cPt/cf7sy2s8nO/vZBPp3c3z2/l9F31PSnqem92f3pXr7zYHv/wfnB9v50crCd7U/vbx/sfUpY5dmD7GFOTUtA3dnfu/fp6f2nu8e7+/dPd4/3nj49+PTBzr2n9+7tPLh/TM0WHz06z8omH31U0Qu79MmKfu6P6T/6vabf6UeLr/Y/3T+49+Dg04c7D9Espzd3aIxT+TGTH62C+yX/TwAAAP//63+pmikBAAA="}]
     * page :
     * width :
     * height :
     * smarth : 0
     * extra : null
     * action : 2
     * em : 0
     * apn : null
     * aps : 0
     * showtime : 0
     * admode : null
     */

    private List<AdsBean> ads;

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code
     *         the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets msg.
     *
     * @param msg
     *         the msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count
     *         the count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets adcode.
     *
     * @return the adcode
     */
    public String getAdcode() {
        return adcode;
    }

    /**
     * Sets adcode.
     *
     * @param adcode
     *         the adcode
     */
    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    /**
     * Gets pvid.
     *
     * @return the pvid
     */
    public String getPvid() {
        return pvid;
    }

    /**
     * Sets pvid.
     *
     * @param pvid
     *         the pvid
     */
    public void setPvid(String pvid) {
        this.pvid = pvid;
    }

    /**
     * Gets ads.
     *
     * @return the ads
     */
    public List<AdsBean> getAds() {
        return ads;
    }

    /**
     * Sets ads.
     *
     * @param ads
     *         the ads
     */
    public void setAds(List<AdsBean> ads) {
        this.ads = ads;
    }

    /**
     * The type Ads bean.
     */
    public static class AdsBean {
        private String adtype;
        private Object restype;
        private String title;
        private String desc;
        private String src;
        private String icon;
        private String link;
        private String page;
        private String width;
        private String height;
        private int smarth;
        private Object extra;
        private int action;
        private int em;
        private Object apn;
        private int aps;
        private int showtime;
        private Object admode;
        private List<String> clickreport;
        /**
         * reporttime : 0
         * reporturl : http://dsp-impr2.youdao.com/k.gif?yd_ewp=3469&yd_ext=EnQKATASIDY1ZWVhNDdhOTcyOGE2ZWQxNGRjY2M2YWY4NmNkMzg5IksI1uilCBDw5P8BGPKzHiC1_RAo8k4wZDhkZQDQWEVwAHgAgAEAmAEBogELVHJhZGl0aW9uYWy6ARJ7Ik9SREVSRURfSUQiOiIxIn0wAiIkZGFkODM4NWEtMzJlNy00OTM2LWEwZDAtNzI2ZmExZDgzZjgyKG4wADoAQgBSCzEuMjAyLjk0LjQyag0xNDY0OTM5MjQxNDU1eACCAQCIAY0bkAHvv7up0SqoAQGwAQG4AQHCAQQxMzc2yAEB0AEB2gEPODY2Mzk0MDI1MzM5MzE4
         */

        private List<DisplayreportBean> displayreport;

        /**
         * Gets adtype.
         *
         * @return the adtype
         */
        public String getAdtype() {
            return adtype;
        }

        /**
         * Sets adtype.
         *
         * @param adtype
         *         the adtype
         */
        public void setAdtype(String adtype) {
            this.adtype = adtype;
        }

        /**
         * Gets restype.
         *
         * @return the restype
         */
        public Object getRestype() {
            return restype;
        }

        /**
         * Sets restype.
         *
         * @param restype
         *         the restype
         */
        public void setRestype(Object restype) {
            this.restype = restype;
        }

        /**
         * Gets title.
         *
         * @return the title
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets title.
         *
         * @param title
         *         the title
         */
        public void setTitle(String title) {
            this.title = title;
        }

        /**
         * Gets desc.
         *
         * @return the desc
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets desc.
         *
         * @param desc
         *         the desc
         */
        public void setDesc(String desc) {
            this.desc = desc;
        }

        /**
         * Gets src.
         *
         * @return the src
         */
        public String getSrc() {
            return src;
        }

        /**
         * Sets src.
         *
         * @param src
         *         the src
         */
        public void setSrc(String src) {
            this.src = src;
        }

        /**
         * Gets icon.
         *
         * @return the icon
         */
        public String getIcon() {
            return icon;
        }

        /**
         * Sets icon.
         *
         * @param icon
         *         the icon
         */
        public void setIcon(String icon) {
            this.icon = icon;
        }

        /**
         * Gets link.
         *
         * @return the link
         */
        public String getLink() {
            return link;
        }

        /**
         * Sets link.
         *
         * @param link
         *         the link
         */
        public void setLink(String link) {
            this.link = link;
        }

        /**
         * Gets page.
         *
         * @return the page
         */
        public String getPage() {
            return page;
        }

        /**
         * Sets page.
         *
         * @param page
         *         the page
         */
        public void setPage(String page) {
            this.page = page;
        }

        /**
         * Gets width.
         *
         * @return the width
         */
        public String getWidth() {
            return width;
        }

        /**
         * Sets width.
         *
         * @param width
         *         the width
         */
        public void setWidth(String width) {
            this.width = width;
        }

        /**
         * Gets height.
         *
         * @return the height
         */
        public String getHeight() {
            return height;
        }

        /**
         * Sets height.
         *
         * @param height
         *         the height
         */
        public void setHeight(String height) {
            this.height = height;
        }

        /**
         * Gets smarth.
         *
         * @return the smarth
         */
        public int getSmarth() {
            return smarth;
        }

        /**
         * Sets smarth.
         *
         * @param smarth
         *         the smarth
         */
        public void setSmarth(int smarth) {
            this.smarth = smarth;
        }

        /**
         * Gets extra.
         *
         * @return the extra
         */
        public Object getExtra() {
            return extra;
        }

        /**
         * Sets extra.
         *
         * @param extra
         *         the extra
         */
        public void setExtra(Object extra) {
            this.extra = extra;
        }

        /**
         * Gets action.
         *
         * @return the action
         */
        public int getAction() {
            return action;
        }

        /**
         * Sets action.
         *
         * @param action
         *         the action
         */
        public void setAction(int action) {
            this.action = action;
        }

        /**
         * Gets em.
         *
         * @return the em
         */
        public int getEm() {
            return em;
        }

        /**
         * Sets em.
         *
         * @param em
         *         the em
         */
        public void setEm(int em) {
            this.em = em;
        }

        /**
         * Gets apn.
         *
         * @return the apn
         */
        public Object getApn() {
            return apn;
        }

        /**
         * Sets apn.
         *
         * @param apn
         *         the apn
         */
        public void setApn(Object apn) {
            this.apn = apn;
        }

        /**
         * Gets aps.
         *
         * @return the aps
         */
        public int getAps() {
            return aps;
        }

        /**
         * Sets aps.
         *
         * @param aps
         *         the aps
         */
        public void setAps(int aps) {
            this.aps = aps;
        }

        /**
         * Gets showtime.
         *
         * @return the showtime
         */
        public int getShowtime() {
            return showtime;
        }

        /**
         * Sets showtime.
         *
         * @param showtime
         *         the showtime
         */
        public void setShowtime(int showtime) {
            this.showtime = showtime;
        }

        /**
         * Gets admode.
         *
         * @return the admode
         */
        public Object getAdmode() {
            return admode;
        }

        /**
         * Sets admode.
         *
         * @param admode
         *         the admode
         */
        public void setAdmode(Object admode) {
            this.admode = admode;
        }

        /**
         * Gets clickreport.
         *
         * @return the clickreport
         */
        public List<String> getClickreport() {
            return clickreport;
        }

        /**
         * Sets clickreport.
         *
         * @param clickreport
         *         the clickreport
         */
        public void setClickreport(List<String> clickreport) {
            this.clickreport = clickreport;
        }

        /**
         * Gets displayreport.
         *
         * @return the displayreport
         */
        public List<DisplayreportBean> getDisplayreport() {
            return displayreport;
        }

        /**
         * Sets displayreport.
         *
         * @param displayreport
         *         the displayreport
         */
        public void setDisplayreport(List<DisplayreportBean> displayreport) {
            this.displayreport = displayreport;
        }

        /**
         * The type Displayreport bean.
         */
        public static class DisplayreportBean {
            private int reporttime;
            private String reporturl;

            /**
             * Gets reporttime.
             *
             * @return the reporttime
             */
            public int getReporttime() {
                return reporttime;
            }

            /**
             * Sets reporttime.
             *
             * @param reporttime
             *         the reporttime
             */
            public void setReporttime(int reporttime) {
                this.reporttime = reporttime;
            }

            /**
             * Gets reporturl.
             *
             * @return the reporturl
             */
            public String getReporturl() {
                return reporturl;
            }

            /**
             * Sets reporturl.
             *
             * @param reporturl
             *         the reporturl
             */
            public void setReporturl(String reporturl) {
                this.reporturl = reporturl;
            }

			@Override
			public String toString() {
				return "DisplayreportBean [reporttime=" + reporttime + ", reporturl=" + reporturl + "]";
			}
            
            
        }

		@Override
		public String toString() {
			return "AdsBean [adtype=" + adtype + ", restype=" + restype + ", title=" + title + ", desc=" + desc
					+ ", src=" + src + ", icon=" + icon + ", link=" + link + ", page=" + page + ", width=" + width
					+ ", height=" + height + ", smarth=" + smarth + ", extra=" + extra + ", action=" + action + ", em="
					+ em + ", apn=" + apn + ", aps=" + aps + ", showtime=" + showtime + ", admode=" + admode
					+ ", clickreport=" + clickreport + ", displayreport=" + displayreport + "]";
		}
        
        
    }
	
	//开始开发v1.1.0的版本 进行中

	@Override
	public String toString() {
		return "ADEntry [code=" + code + ", msg=" + msg + ", count=" + count + ", adcode=" + adcode + ", pvid=" + pvid
				+ ", ads=" + ads + "]";
	}
    
    
}
