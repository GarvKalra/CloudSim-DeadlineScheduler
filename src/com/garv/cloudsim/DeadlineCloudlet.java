package com.garv.cloudsim;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;

public class DeadlineCloudlet extends Cloudlet {
    private double deadline;

    public DeadlineCloudlet(int cloudletId, long cloudletLength, int pesNumber,
                            long fileSize, long outputSize,
                            UtilizationModel utilizationModelCpu,
                            UtilizationModel utilizationModelRam,
                            UtilizationModel utilizationModelBw,
                            double deadline) {
        super(cloudletId, cloudletLength, pesNumber, fileSize, outputSize,
              utilizationModelCpu, utilizationModelRam, utilizationModelBw);
        this.deadline = deadline;
    }

    public double getDeadline() {
        return deadline;
    }

    public void setDeadline(double deadline) {
        this.deadline = deadline;
    }
}


