package com.atguigu.adapter.Cstuadapter.adapterExemple;
//光能适配器
public class OpticalAdapter implements Motor{
    private OpticalMotor opticalMotor;

    public OpticalAdapter(OpticalMotor opticalMotor){
        this.opticalMotor=opticalMotor;
    }

    @Override
    public void drive() {//这就是提供给用户的接口
        opticalMotor.opticalDrive();
    }
}
