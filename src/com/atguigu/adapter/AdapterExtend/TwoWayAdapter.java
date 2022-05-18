package com.atguigu.adapter.AdapterExtend;
//双向适配器
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee{
    /**
     * 可以添加两个
     *
     * */
    private TwoWayAdaptee twoWayAdaptee;
    private TwoWayTarget twoWayTarget;

    public TwoWayAdapter(TwoWayAdaptee twoWayAdaptee){
        this.twoWayAdaptee=twoWayAdaptee;
    }

    public TwoWayAdapter(TwoWayTarget twoWayTarget){
        this.twoWayTarget=twoWayTarget;
    }



    @Override
    public void specificRequest() {
        twoWayTarget.request();
    }

    @Override
    public void request() {

        twoWayAdaptee.specificRequest();
    }
}
