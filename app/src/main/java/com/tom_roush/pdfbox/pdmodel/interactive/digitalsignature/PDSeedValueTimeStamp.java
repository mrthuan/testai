package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;

/* loaded from: classes2.dex */
public class PDSeedValueTimeStamp {
    private final COSDictionary dictionary;

    public PDSeedValueTimeStamp() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public String getURL() {
        return this.dictionary.getString(COSName.URL);
    }

    public boolean isTimestampRequired() {
        if (this.dictionary.getInt(COSName.FT, 0) == 0) {
            return false;
        }
        return true;
    }

    public void setTimestampRequired(boolean z10) {
        this.dictionary.setInt(COSName.FT, z10 ? 1 : 0);
    }

    public void setURL(String str) {
        this.dictionary.setString(COSName.URL, str);
    }

    public PDSeedValueTimeStamp(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
