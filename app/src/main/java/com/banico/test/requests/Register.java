package com.banico.test.requests;

import com.google.gson.annotations.SerializedName;

public class Register {

    public Register(long appId, String appInfo, long traceNumber, String address, String deviceCode, int MTI, String clientLocalDate, int processCode, Register.ExtraData extraData) {
        AppId = appId;
        AppInfo = appInfo;
        TraceNumber = traceNumber;
        Address = address;
        DeviceCode = deviceCode;
        this.MTI = MTI;
        ClientLocalDate = clientLocalDate;
        ProcessCode = processCode;
        ExtraData = extraData;
    }

    @SerializedName("app_id")
    private
    long AppId;
    @SerializedName("app_info")
    private
    String AppInfo;
    @SerializedName("trace_no")
    private
    long TraceNumber;
    @SerializedName("addr")
    private
    String Address;
    @SerializedName("dev_id")
    private
    String DeviceCode;
    @SerializedName("mti")
    private
    int MTI;
    @SerializedName("cltd")
    private
    String ClientLocalDate;
    @SerializedName("pr_code")
    private
    int ProcessCode;
    @SerializedName("ex_data")
    private
    ExtraData ExtraData;

    public long getAppId() {
        return AppId;
    }

    public void setAppId(long appId) {
        AppId = appId;
    }

    public String getAppInfo() {
        return AppInfo;
    }

    public void setAppInfo(String appInfo) {
        AppInfo = appInfo;
    }

    public long getTraceNumber() {
        return TraceNumber;
    }

    public void setTraceNumber(long traceNumber) {
        TraceNumber = traceNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDeviceCode() {
        return DeviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        DeviceCode = deviceCode;
    }

    public int getMTI() {
        return MTI;
    }

    public void setMTI(int MTI) {
        this.MTI = MTI;
    }

    public String getClientLocalDate() {
        return ClientLocalDate;
    }

    public void setClientLocalDate(String clientLocalDate) {
        ClientLocalDate = clientLocalDate;
    }

    public int getProcessCode() {
        return ProcessCode;
    }

    public void setProcessCode(int processCode) {
        ProcessCode = processCode;
    }

    public Register.ExtraData getExtraData() {
        return ExtraData;
    }

    public void setExtraData(Register.ExtraData extraData) {
        ExtraData = extraData;
    }

    private class ExtraData{

        @SerializedName("reg_code")
        String RegCode;

        @SerializedName("cell_no")
        String CellNo;

        @SerializedName("act_code")
        String ActCode;

        @SerializedName("os_code")
        String OsCode;

        @SerializedName("os_ver")
        String OsVersion;

        @SerializedName("dev_tp")
        String DeviceType;

        @SerializedName("dev_mod")
        String DeviceModel;

        @SerializedName("screen_size")
        String ScreenSize;

        @SerializedName("gcm_reg_id")
        String GCMRegId;

        @SerializedName("store_id")
        String StoreId;

        public String getRegCode() {
            return RegCode;
        }

        public void setRegCode(String regCode) {
            RegCode = regCode;
        }

        public String getCellNo() {
            return CellNo;
        }

        public void setCellNo(String cellNo) {
            CellNo = cellNo;
        }

        public String getActCode() {
            return ActCode;
        }

        public void setActCode(String actCode) {
            ActCode = actCode;
        }

        public String getOsCode() {
            return OsCode;
        }

        public void setOsCode(String osCode) {
            OsCode = osCode;
        }

        public String getOsVersion() {
            return OsVersion;
        }

        public void setOsVersion(String osVersion) {
            OsVersion = osVersion;
        }

        public String getDeviceType() {
            return DeviceType;
        }

        public void setDeviceType(String deviceType) {
            DeviceType = deviceType;
        }

        public String getDeviceModel() {
            return DeviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            DeviceModel = deviceModel;
        }

        public String getScreenSize() {
            return ScreenSize;
        }

        public void setScreenSize(String screenSize) {
            ScreenSize = screenSize;
        }

        public String getGCMRegId() {
            return GCMRegId;
        }

        public void setGCMRegId(String GCMRegId) {
            this.GCMRegId = GCMRegId;
        }

        public String getStoreId() {
            return StoreId;
        }

        public void setStoreId(String storeId) {
            StoreId = storeId;
        }
    }
}
