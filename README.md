代码在https://github.com/CherishCai/msearch

git clone https://github.com/CherishCai/msearch.git


由于关联了ik-analyzer， 启动会失败
使用的是https://github.com/wks/ik-analyzer这里的ik-analyzer
所以需要
git clone https://github.com/wks/ik-analyzer.git

然后打包到本地仓库
mvn install -Dmaven.test.skip=true



在启动msearch就行
