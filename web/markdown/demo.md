## 前言

今年在机核网看见了机核网关于`GameShell`的介绍，感觉很种草，但是因为价格有点贵，就没入手，后来在双十一购入了一台原版的`GameShell`，打算折腾一下Linux系统。经过漫长的等待，我收到了它，经过几小时的试玩，我发现它的1200mah的电池太不扛用了，所以就萌生了给电池扩容的想法。

## 方案选择

### 电池

当然，我首先想到了机核网的deot话题下的文章。我在[DEOT 新手入坑指南](https://www.gcores.com/articles/113887)这篇文章下的评论区得到了第一个线索：

> 咸鱼关键字：gameshell大容量电池

顺着这个线索，我找到了这条评论说的店铺，但是我发现这家店铺的外壳是不透光的纯白色的，价格要35，算上电池的26，还得加上运费15一共76，经过问询，商家说透明的壳子需要三倍的价格，也就是35*3+15=120，加上电池的23，一共143元，这样的价格有点难以接受，但这次的线索给我带来了一个很好的电池方案。

电池的话也就是几个参数需要考虑：

- 物理的尺寸：如果尺寸太小，gameshell装不下就完了
- 电量容量：至少得比1200mah大吧，不然就白改装了，类比手机，电池的合理的容量的范围是3000-5000mah
- 电池的电压：gameshell支持3.7v的供电电压，这和很多开发板的设计是类似的
- 电池类型：一般用的是锂电池，容量大，尺寸小，之前考虑过gameshell同配的诺基亚BL5C，但是发现这种电池容量上不去，大容量的也有很多人怀疑虚标，遂放弃。
- 电池接线：当然，电池应该要连接gameshell的clockworkpi，官方有一条，不过为了保险，尽量选择自带连接线的电池

闲鱼的这家店铺的外壳虽然不和我意，但它推荐的电池基本符合上面的要求，电池的购买链接在[这里](https://m.tb.cn/h.VZxUpHF)， 16元的价格加上8至10元的运费，成本大概是24到26，4200mah的锂电池。记得让店家配个合适的接口。

![battery](https://gd1.alicdn.com/imgextra/i1/3194421185/O1CN01bcZwJs1KclsWv6oYD_!!3194421185.jpg)

### 外壳

我继续寻找我的外壳，我想我的外壳应该有下面的要求：

- 尺寸：尺寸合适，最好是专门为gameshell定制的

- 材料：应该是3d打印的，最好不要太粗糙

- 透明度：尽量的透明的

我把目光移向了另外一个gameshell爱好者聚集地：[gameshell官方论坛](https://forum.clockworkpi.com)，经过一系列搜索，我发现社区的爱好者们早已对gameshell开了🔪，各种改造方案层出不穷，经过一番寻找，我看到了[它](https://www.tinkercad.com/things/7r3u8jN85GY)：

  ![3d](https://csg.tinkercad.com/things/7r3u8jN85GY/t725.png?rev=1567253704928445829&s=953e2ffdfe05aadde7bbec8eff238079&v=1)

  

这是一个gameshell电池扩展外壳，来自gameshell官方论坛用户[xin](https://forum.clockworkpi.com/u/xin)，此外，他还设计了多个进阶版，主要是采用了镂空的设计，但是我觉得不美观就没有采用，如果你感兴趣，可以点击[此处](https://www.tinkercad.com/users/hCwfVfujE76-it2amf)查看。

作者在[此处](https://forum.clockworkpi.com/t/swapping-out-battery-for-larger-capacity-li-ion/882/114?u=wangtingzheng)也推荐了上文所示的锂电池，还贴出了他改造后的gameshell，可见这个外壳与锂电池是配套的。

### 3D 打印

接下来要挑选合适的3D打印厂家了，要求的话大概就下面几点：

- 价格：价格尽量实惠，这个不多说
- 效果：能打印透明材质，虽然到时候还得把电池盖成黑色，但是透明的壳子的话就有很多的选择空间

经过一番搜索和试错，最终锁定这一家：[未来工厂](http://www.wenext.cn)。上传外壳的stl格式的3D模型，配置如下：

- 材料: 透明光敏树脂                                                

- 颜色: 透明
- 公差: 200微米或0.2%

上传后平台返回报价是21.04，但是运费比较贵，这个平台只能用顺丰，我这里到黑龙江运费是22元，总共花费43，其他省份运费可自行尝试得知，建议可以多打几个其他件或者多人一起打印，均摊运费。

### 装饰

由于锂电池是黄色的，放在gameshell比较抢眼，我选择使用黑色的PVC热缩管进行包装：

![pvc](https://gd2.alicdn.com/imgextra/i2/1762028187/O1CN01OAJhTG2ALh69qkTSU_!!1762028187.jpg)

这里可以发挥自己的想象力，会画画的同学们甚至可以在电池外画一些图案，或者可以贴身gameshell自带的官方贴纸，这就属于装饰性的功能了，可有可无，不影响使用。买的是70MM(长度1m)的，但到货时发现电池塞不下去，有点尴尬，估计错了尺寸，要用它的同学尺寸可以选大一些的，长度无所谓，够用。包邮，花费6元。

由于这个PVC器件个大电商网站上有很多，这里就不放连接了，直接搜索`PVC热缩套管`即可。

### 资费总结

|        | 单价 | 运费 | 总计 |
| ------ | ---- | ---- | ---- |
| 锂电池 | 16   | 10   | 26   |
| 外壳   | 21   | 22   | 43   |
| PVC    | 6    | 0    | 6    |

总计75元，比闲鱼上不透明的还略便宜，比透明的便宜很多，还是不镂空的，价格已经非常合适了。

## 拼装

经过漫长的等待，所有的配件已全部到齐，开始拼装，拼装的过程没什么好注意的，尺寸也都刚刚好。

我先从PVC上裁切一块，放入电池外壳中，发现刚刚好，然后我从官方贴纸中选择了一张长方形的大贴纸，粘贴到了PVC上，贴纸朝外：

![IMG_20200112_172631.jpg](https://i.loli.net/2020/01/12/XtRowUe9sq63npi.jpg)

再把电池放入电池外壳，合上外壳：

![IMG_20200112_172729.jpg](https://i.loli.net/2020/01/12/ml9wzBbvcxjQ5FU.jpg)
![IMG_20200112_172949.jpg](https://i.loli.net/2020/01/12/57sGHBe1pV9SYIz.jpg)

到此，gameshell的电池扩展改装算是完成了，后面我也没进行专门的测试，但是负责任地说，改装后的gameshell的续航提升明显，在使用过程中我感受不到明显的电量消耗，常常是我玩厌了gameshell的电量还没用完，估计普通使用至少5小时，具体的数据没有测试，大家可以改装完成后自行测试。

## 参考

- [DEOT 新手入坑指南：机核网](https://www.gcores.com/articles/113887)
- [Swapping out Battery for Larger Capacity Li-Ion?：clockworkpi forum](https://forum.clockworkpi.com/t/swapping-out-battery-for-larger-capacity-li-ion/882)