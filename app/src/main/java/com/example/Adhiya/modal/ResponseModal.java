package com.example.Adhiya.modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResponseModal<T> {

    @SerializedName("object")
    @Expose
    private List<T> object;

    @SerializedName("status")
    @Expose
    private int status;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("canAdd")
    @Expose
    private String canAdd;
    @SerializedName("canEdit")
    @Expose
    private String canEdit;
    @SerializedName("canView")
    @Expose
    private String canView;
    @SerializedName("canDelete")
    @Expose
    private String canDelete;


    public List<T> getObject() {
        return object;
    }

    public void setObject(List<T> object) {
        this.object = object;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(String canAdd) {
        this.canAdd = canAdd;
    }

    public String getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(String canEdit) {
        this.canEdit = canEdit;
    }

    public String getCanView() {
        return canView;
    }

    public void setCanView(String canView) {
        this.canView = canView;
    }

    public String getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(String canDelete) {
        this.canDelete = canDelete;
    }
}
