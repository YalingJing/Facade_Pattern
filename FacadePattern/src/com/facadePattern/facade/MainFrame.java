package com.facadePattern.facade;

import com.facadePattern.subSystem.CpuRun;
import com.facadePattern.subSystem.HardDiskRead;
import com.facadePattern.subSystem.MemoryCheck;
import com.facadePattern.subSystem.OsLoad;

public class MainFrame extends AbstractMainFrame{
    private MemoryCheck memoryCheck;
    private CpuRun cpuRun;
    private HardDiskRead hardDiskRead;
    private OsLoad osLoad;

    public MainFrame(){
        memoryCheck = new MemoryCheck();
        cpuRun = new CpuRun();
        hardDiskRead = new HardDiskRead();
        osLoad = new OsLoad();
    }

    @Override
    public void on() {
        //内存自检
        memoryCheck.check();
        //CPU运行
        cpuRun.run();
        //硬盘读取
        hardDiskRead.read();
        //操作系统载入
        osLoad.load();
        System.out.println("电脑主机开机成功！");
    }
}
