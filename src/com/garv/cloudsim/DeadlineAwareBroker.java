package com.garv.cloudsim;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.DatacenterBroker;

import java.util.Collections;
import java.util.Comparator;

public class DeadlineAwareBroker extends DatacenterBroker {

    public DeadlineAwareBroker(String name) throws Exception {
        super(name);
    }

    @Override
    protected void submitCloudlets() {
        // Sort cloudlets by deadline before submitting
        Collections.sort(getCloudletList(), new Comparator<Cloudlet>() {
            @Override
            public int compare(Cloudlet c1, Cloudlet c2) {
                double d1 = ((DeadlineCloudlet) c1).getDeadline();
                double d2 = ((DeadlineCloudlet) c2).getDeadline();
                return Double.compare(d1, d2);
            }
        });

        super.submitCloudlets();
    }
}


