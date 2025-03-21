package com.efa73.charleeemulator.core.domain;

/**
 * onTime: 차량 시동 ON 시간
 * offTime: 차량 시동 OFF 시간
 */
public class VehicleEventInfo {
    private final VehicleInfo vehicleInfo;
    private final VehicleCycleInfo vehicleCycleInfo;
    private final String onTime;
    private final String offTime;

    public VehicleEventInfo(VehicleInfo vehicleInfo, VehicleCycleInfo vehicleCycleInfo, String onTime, String offTime) {
        this.vehicleInfo = vehicleInfo;
        this.vehicleCycleInfo = vehicleCycleInfo;
        this.onTime = onTime;
        this.offTime = offTime;
    }
}
