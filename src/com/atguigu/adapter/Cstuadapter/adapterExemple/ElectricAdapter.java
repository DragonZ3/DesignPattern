package com.atguigu.adapter.Cstuadapter.adapterExemple;

//电能适配器
public class ElectricAdapter implements Motor {
    private ElectricMotor electricMotor;

    public ElectricAdapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void drive() {//这就是提供给用户的同意接口
        electricMotor.electricDrive();
    }
}
