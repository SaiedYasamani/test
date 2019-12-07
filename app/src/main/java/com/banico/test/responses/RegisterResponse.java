package com.banico.test.responses;

import com.google.gson.annotations.SerializedName;

public class RegisterResponse {

    @SerializedName("trace_no")
    private
    long TraceNumber;
    @SerializedName("resp")
    private
    int ResponseCode;
    @SerializedName("desc")
    private
    String Description;
    @SerializedName("mti")
    private
    String MTI;
    @SerializedName("sldt")
    private
    String ServerLocalData;
    @SerializedName("pr_code")
    private
    int ProcessCode;
    @SerializedName("ex_data")
    private
    ExtraData ExtraData;

    public long getTraceNumber() {
        return TraceNumber;
    }

    public void setTraceNumber(long traceNumber) {
        TraceNumber = traceNumber;
    }

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMTI() {
        return MTI;
    }

    public void setMTI(String MTI) {
        this.MTI = MTI;
    }

    public String getServerLocalData() {
        return ServerLocalData;
    }

    public void setServerLocalData(String serverLocalData) {
        ServerLocalData = serverLocalData;
    }

    public int getProcessCode() {
        return ProcessCode;
    }

    public void setProcessCode(int processCode) {
        ProcessCode = processCode;
    }

    public RegisterResponse.ExtraData getExtraData() {
        return ExtraData;
    }

    public void setExtraData(RegisterResponse.ExtraData extraData) {
        ExtraData = extraData;
    }

    private class ExtraData{
        @SerializedName("balance")
        String Balance;
        @SerializedName("app_id")
        String AppId;

        public String getBalance() {
            return Balance;
        }

        public void setBalance(String balance) {
            Balance = balance;
        }

        public String getAppId() {
            return AppId;
        }

        public void setAppId(String appId) {
            AppId = appId;
        }
    }
}
