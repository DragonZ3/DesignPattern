package com.atguigu.adapter.Cstuadapter.adapterExemple;
//客户端代码
public class MotorAdapterTest {
    public static void main(String[] args) {
        //这个是电能
        Motor motor = new ElectricAdapter(new ElectricMotor());
        motor.drive();
        //这个是光能
        Motor motor1=new OpticalAdapter(new OpticalMotor());
        motor1.drive();
    }
}
