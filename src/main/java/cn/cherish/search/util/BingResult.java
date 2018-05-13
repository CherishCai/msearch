package cn.cherish.search.util;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 16:27
 */
@NoArgsConstructor
@Data
public class BingResult {


    /**
     * _type : SearchResponse
     * queryContext : {"originalQuery":"西安美食"}
     * webPages : {"webSearchUrl":"https://www.bing.com/search?q=%e8%a5%bf%e5%ae%89%e7%be%8e%e9%a3%9f","totalEstimatedMatches":1700000,"value":[{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.0","name":"【携程美食林】西安美食攻略/美食排行榜,西安小吃/攻略/推荐 ...","url":"http://you.ctrip.com/restaurant/xian7.html","isFamilyFriendly":true,"displayUrl":"you.ctrip.com/restaurant/xian7.html","snippet":"西安美食大全，携程攻略社区! 推荐好吃的西安美食及长沙小吃，把西安美食小吃一网打尽，网罗最新最全的西安美食攻略、美食排行榜、小吃攻略、小吃大全、小吃推荐 ...","dateLastCrawled":"2018-05-08T08:13:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.1","name":"西安美食,西安美食攻略,西安旅游美食攻略 - 马蜂窝","url":"http://www.mafengwo.cn/cy/10195/gonglve.html","isFamilyFriendly":true,"displayUrl":"www.mafengwo.cn/cy/10195/gonglve.html","snippet":"西安有什么好吃的，西安好吃的地方,马蜂窝西安美食攻略详尽介绍西安旅游有什么好吃的,西安去哪里吃,网罗最新最全的西安美食攻略信息","dateLastCrawled":"2018-05-08T13:46:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.2","name":"西安美食,西安美食攻略,西安特色美食-大众点评网","url":"http://www.dianping.com/xian/food","isFamilyFriendly":true,"displayUrl":"www.dianping.com/xian/food","snippet":"根据合理的商区、地标和美食商户分类系统，为你提供西安121401家美食商户，并通过海量亲身消费者的点评聚合，以各种评分、星级的标准让你选择。","dateLastCrawled":"2018-05-07T18:56:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.3","name":"西安有哪些好玩的地方和美食值得推荐？ - 知乎","url":"https://www.zhihu.com/question/19675143","isFamilyFriendly":true,"displayUrl":"https://www.zhihu.com/question/19675143","snippet":"美食，是流淌在舌尖上的历史。千年西安，珍馐璀璨。最新一期《奔跑吧兄弟》 美食特辑duang~duang~来袭！跑男团携手嘉宾黄渤、夏雨、林心如变身美食评审 ...","dateLastCrawled":"2018-05-08T21:35:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.4","name":"[西安小吃]西安美食_西安美食攻略_艺龙旅游指南","url":"http://trip.elong.com/xian/meishi/","isFamilyFriendly":true,"displayUrl":"trip.elong.com/xian/meishi","snippet":"西安是旅游名城，也是著名的美食与小吃之城，在这里可以尽情地品尝三秦美食。西安具有浓郁的西北风情，肉夹馍、羊肉泡馍、凉皮、岐山面、饺子宴，是很多人 ...","dateLastCrawled":"2018-05-03T09:36:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.5","name":"2018西安美食攻略,西安美食推荐,西安特色小吃_百度旅游","url":"https://lvyou.baidu.com/xian/meishi","isFamilyFriendly":true,"displayUrl":"https://lvyou.baidu.com/xian/meishi","snippet":"大家印象：\u201c西安历史文化底蕴深厚，同时也是时尚的现代化大都市。兵马俑十分壮观，古城很雄伟，明城墙保存的非常好，钟鼓楼后面的回民小吃街有很多美食。","dateLastCrawled":"2018-05-04T17:52:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.6","name":"西安美食_西安美食推荐_西安美食网","url":"http://xian.cncn.com/meishi/","isFamilyFriendly":true,"displayUrl":"xian.cncn.com/meishi","snippet":"欣欣旅游网(CNCN.com)为您提供西安美食图片，西安美食介绍。 ... 饮食指南 2008-12-10 | 14911浏览 西安的饮食文化洋溢着浓郁的西北风情，品尝西安的风味小吃 ...","dateLastCrawled":"2018-05-05T09:37:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.7","name":"西安美食攻略_西安美食排行榜/特色小吃/美食街推荐【驴 ...","url":"http://www.lvmama.com/lvyou/food/d-xian340.html","isFamilyFriendly":true,"displayUrl":"www.lvmama.com/lvyou/food/d-xian340.html","snippet":"《驴妈妈旅游攻略,绝对实用》西安美食攻略,介绍西安有什么好吃的,好吃的特色小吃,西安美食街吃货指南,网罗最新最全的西安美食排行榜攻略信息","dateLastCrawled":"2018-05-04T05:36:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.8","name":"西安美食地图_百度百科","url":"https://baike.baidu.com/item/%E8%A5%BF%E5%AE%89%E7%BE%8E%E9%A3%9F%E5%9C%B0%E5%9B%BE","isFamilyFriendly":true,"displayUrl":"https://baike.baidu.com/item/西安美食地图","snippet":"《西安美食地图》是2011年5月1日西安出版社出版的图书，作者是李幸娟。本书能使人们了解陕西的历史，品尝西安的文化，欣赏、品味一个地方的饮食文化。","dateLastCrawled":"2018-05-06T21:39:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.9","name":"西安有哪些值得玩的地方？有哪些不能错过的特色美食？ - 知乎","url":"https://www.zhihu.com/question/19863530","isFamilyFriendly":true,"displayUrl":"https://www.zhihu.com/question/19863530","snippet":"葫芦头泡馍 葫芦头是陕西西安特有的汉族传统风味小吃。以味醇汤浓、馍筋肉嫩、肥而不腻闻名于国内外。其烹制工艺精细，合理使用多种调。最重要的是处理肠肚、熬汤 ...","dateLastCrawled":"2018-05-08T01:48:00.0000000Z","language":"zh_chs"}],"someResultsRemoved":true}
     * rankingResponse : {"mainline":{"items":[{"answerType":"WebPages","resultIndex":0,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.0"}},{"answerType":"WebPages","resultIndex":1,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.1"}},{"answerType":"WebPages","resultIndex":2,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.2"}},{"answerType":"WebPages","resultIndex":3,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.3"}},{"answerType":"WebPages","resultIndex":4,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.4"}},{"answerType":"WebPages","resultIndex":5,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.5"}},{"answerType":"WebPages","resultIndex":6,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.6"}},{"answerType":"WebPages","resultIndex":7,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.7"}},{"answerType":"WebPages","resultIndex":8,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.8"}},{"answerType":"WebPages","resultIndex":9,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.9"}}]}}
     */

    private String _type;
    private QueryContext queryContext;
    private WebPages webPages;
    private RankingResponse rankingResponse;

    @NoArgsConstructor
    @Data
    public static class QueryContext {
        /**
         * originalQuery : 西安美食
         */

        private String originalQuery;
    }

    @NoArgsConstructor
    @Data
    public static class WebPages {
        /**
         * webSearchUrl : https://www.bing.com/search?q=%e8%a5%bf%e5%ae%89%e7%be%8e%e9%a3%9f
         * totalEstimatedMatches : 1700000
         * value : [{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.0","name":"【携程美食林】西安美食攻略/美食排行榜,西安小吃/攻略/推荐 ...","url":"http://you.ctrip.com/restaurant/xian7.html","isFamilyFriendly":true,"displayUrl":"you.ctrip.com/restaurant/xian7.html","snippet":"西安美食大全，携程攻略社区! 推荐好吃的西安美食及长沙小吃，把西安美食小吃一网打尽，网罗最新最全的西安美食攻略、美食排行榜、小吃攻略、小吃大全、小吃推荐 ...","dateLastCrawled":"2018-05-08T08:13:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.1","name":"西安美食,西安美食攻略,西安旅游美食攻略 - 马蜂窝","url":"http://www.mafengwo.cn/cy/10195/gonglve.html","isFamilyFriendly":true,"displayUrl":"www.mafengwo.cn/cy/10195/gonglve.html","snippet":"西安有什么好吃的，西安好吃的地方,马蜂窝西安美食攻略详尽介绍西安旅游有什么好吃的,西安去哪里吃,网罗最新最全的西安美食攻略信息","dateLastCrawled":"2018-05-08T13:46:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.2","name":"西安美食,西安美食攻略,西安特色美食-大众点评网","url":"http://www.dianping.com/xian/food","isFamilyFriendly":true,"displayUrl":"www.dianping.com/xian/food","snippet":"根据合理的商区、地标和美食商户分类系统，为你提供西安121401家美食商户，并通过海量亲身消费者的点评聚合，以各种评分、星级的标准让你选择。","dateLastCrawled":"2018-05-07T18:56:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.3","name":"西安有哪些好玩的地方和美食值得推荐？ - 知乎","url":"https://www.zhihu.com/question/19675143","isFamilyFriendly":true,"displayUrl":"https://www.zhihu.com/question/19675143","snippet":"美食，是流淌在舌尖上的历史。千年西安，珍馐璀璨。最新一期《奔跑吧兄弟》 美食特辑duang~duang~来袭！跑男团携手嘉宾黄渤、夏雨、林心如变身美食评审 ...","dateLastCrawled":"2018-05-08T21:35:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.4","name":"[西安小吃]西安美食_西安美食攻略_艺龙旅游指南","url":"http://trip.elong.com/xian/meishi/","isFamilyFriendly":true,"displayUrl":"trip.elong.com/xian/meishi","snippet":"西安是旅游名城，也是著名的美食与小吃之城，在这里可以尽情地品尝三秦美食。西安具有浓郁的西北风情，肉夹馍、羊肉泡馍、凉皮、岐山面、饺子宴，是很多人 ...","dateLastCrawled":"2018-05-03T09:36:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.5","name":"2018西安美食攻略,西安美食推荐,西安特色小吃_百度旅游","url":"https://lvyou.baidu.com/xian/meishi","isFamilyFriendly":true,"displayUrl":"https://lvyou.baidu.com/xian/meishi","snippet":"大家印象：\u201c西安历史文化底蕴深厚，同时也是时尚的现代化大都市。兵马俑十分壮观，古城很雄伟，明城墙保存的非常好，钟鼓楼后面的回民小吃街有很多美食。","dateLastCrawled":"2018-05-04T17:52:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.6","name":"西安美食_西安美食推荐_西安美食网","url":"http://xian.cncn.com/meishi/","isFamilyFriendly":true,"displayUrl":"xian.cncn.com/meishi","snippet":"欣欣旅游网(CNCN.com)为您提供西安美食图片，西安美食介绍。 ... 饮食指南 2008-12-10 | 14911浏览 西安的饮食文化洋溢着浓郁的西北风情，品尝西安的风味小吃 ...","dateLastCrawled":"2018-05-05T09:37:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.7","name":"西安美食攻略_西安美食排行榜/特色小吃/美食街推荐【驴 ...","url":"http://www.lvmama.com/lvyou/food/d-xian340.html","isFamilyFriendly":true,"displayUrl":"www.lvmama.com/lvyou/food/d-xian340.html","snippet":"《驴妈妈旅游攻略,绝对实用》西安美食攻略,介绍西安有什么好吃的,好吃的特色小吃,西安美食街吃货指南,网罗最新最全的西安美食排行榜攻略信息","dateLastCrawled":"2018-05-04T05:36:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.8","name":"西安美食地图_百度百科","url":"https://baike.baidu.com/item/%E8%A5%BF%E5%AE%89%E7%BE%8E%E9%A3%9F%E5%9C%B0%E5%9B%BE","isFamilyFriendly":true,"displayUrl":"https://baike.baidu.com/item/西安美食地图","snippet":"《西安美食地图》是2011年5月1日西安出版社出版的图书，作者是李幸娟。本书能使人们了解陕西的历史，品尝西安的文化，欣赏、品味一个地方的饮食文化。","dateLastCrawled":"2018-05-06T21:39:00.0000000Z","language":"zh_chs"},{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.9","name":"西安有哪些值得玩的地方？有哪些不能错过的特色美食？ - 知乎","url":"https://www.zhihu.com/question/19863530","isFamilyFriendly":true,"displayUrl":"https://www.zhihu.com/question/19863530","snippet":"葫芦头泡馍 葫芦头是陕西西安特有的汉族传统风味小吃。以味醇汤浓、馍筋肉嫩、肥而不腻闻名于国内外。其烹制工艺精细，合理使用多种调。最重要的是处理肠肚、熬汤 ...","dateLastCrawled":"2018-05-08T01:48:00.0000000Z","language":"zh_chs"}]
         * someResultsRemoved : true
         */

        private String webSearchUrl;
        private int totalEstimatedMatches;
        private boolean someResultsRemoved;
        private List<Value> value;

        @NoArgsConstructor
        @Data
        public static class Value {
            /**
             * id : https://api.cognitive.microsoft.com/api/v7/#WebPages.0
             * name : 【携程美食林】西安美食攻略/美食排行榜,西安小吃/攻略/推荐 ...
             * url : http://you.ctrip.com/restaurant/xian7.html
             * isFamilyFriendly : true
             * displayUrl : you.ctrip.com/restaurant/xian7.html
             * snippet : 西安美食大全，携程攻略社区! 推荐好吃的西安美食及长沙小吃，把西安美食小吃一网打尽，网罗最新最全的西安美食攻略、美食排行榜、小吃攻略、小吃大全、小吃推荐 ...
             * dateLastCrawled : 2018-05-08T08:13:00.0000000Z
             * language : zh_chs
             */

            private String id;
            private String name;
            private String url;
            private boolean isFamilyFriendly;
            private String displayUrl;
            private String snippet;
            private String dateLastCrawled;
            private String language;
        }
    }

    @NoArgsConstructor
    @Data
    public static class RankingResponse {
        /**
         * mainline : {"items":[{"answerType":"WebPages","resultIndex":0,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.0"}},{"answerType":"WebPages","resultIndex":1,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.1"}},{"answerType":"WebPages","resultIndex":2,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.2"}},{"answerType":"WebPages","resultIndex":3,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.3"}},{"answerType":"WebPages","resultIndex":4,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.4"}},{"answerType":"WebPages","resultIndex":5,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.5"}},{"answerType":"WebPages","resultIndex":6,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.6"}},{"answerType":"WebPages","resultIndex":7,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.7"}},{"answerType":"WebPages","resultIndex":8,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.8"}},{"answerType":"WebPages","resultIndex":9,"value":{"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.9"}}]}
         */

        private Mainline mainline;

        @NoArgsConstructor
        @Data
        public static class Mainline {
            private List<Items> items;

            @NoArgsConstructor
            @Data
            public static class Items {
                /**
                 * answerType : WebPages
                 * resultIndex : 0
                 * value : {"id":"https://api.cognitive.microsoft.com/api/v7/#WebPages.0"}
                 */

                private String answerType;
                private int resultIndex;
                private ValueX value;

                @NoArgsConstructor
                @Data
                public static class ValueX {
                    /**
                     * id : https://api.cognitive.microsoft.com/api/v7/#WebPages.0
                     */

                    private String id;
                }
            }
        }
    }
}
