package com.atguigu.adapter.AdapterExtend;

//适配者实现
class AdapteeRealize  implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
