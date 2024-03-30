package com.framework.listenters;

import org.testng.IExecutionListener;

import static com.framework.listenters.GenerateMasterReport.generateReport;
import static com.framework.listenters.GenerateMasterReport.removeReportJsonFile;

public class TestNGExecutionListener implements IExecutionListener {
    @Override
    public void onExecutionStart(){
        System.out.println("TestNG is starting the execution");
        removeReportJsonFile();
    }
    @Override
    public void onExecutionFinish(){
        System.out.println("Generating the master report");
        generateReport();
        System.out.println("TestNG execution has finished");

    }
}
