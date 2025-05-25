package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDWindowsLaunchParams implements COSObjectable {
    public static final String OPERATION_OPEN = "open";
    public static final String OPERATION_PRINT = "print";
    protected COSDictionary params;

    public PDWindowsLaunchParams() {
        this.params = new COSDictionary();
    }

    public String getDirectory() {
        return this.params.getString(COSName.D);
    }

    public String getExecuteParam() {
        return this.params.getString(COSName.P);
    }

    public String getFilename() {
        return this.params.getString(COSName.F);
    }

    public String getOperation() {
        return this.params.getString(COSName.O, OPERATION_OPEN);
    }

    public void setDirectory(String str) {
        this.params.setString(COSName.D, str);
    }

    public void setExecuteParam(String str) {
        this.params.setString(COSName.P, str);
    }

    public void setFilename(String str) {
        this.params.setString(COSName.F, str);
    }

    public void setOperation(String str) {
        this.params.setString(COSName.D, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.params;
    }

    public PDWindowsLaunchParams(COSDictionary cOSDictionary) {
        this.params = cOSDictionary;
    }
}
