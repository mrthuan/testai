package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDURIDictionary implements COSObjectable {
    private final COSDictionary uriDictionary;

    public PDURIDictionary() {
        this.uriDictionary = new COSDictionary();
    }

    public String getBase() {
        return getCOSObject().getString("Base");
    }

    public void setBase(String str) {
        getCOSObject().setString("Base", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.uriDictionary;
    }

    public PDURIDictionary(COSDictionary cOSDictionary) {
        this.uriDictionary = cOSDictionary;
    }
}
