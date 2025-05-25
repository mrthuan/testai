package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;

/* loaded from: classes2.dex */
public class PDPropBuildDataDict implements COSObjectable {
    private final COSDictionary dictionary;

    public PDPropBuildDataDict() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }

    public String getDate() {
        return this.dictionary.getString(COSName.DATE);
    }

    public long getMinimumRevision() {
        return this.dictionary.getLong(COSName.V);
    }

    public String getName() {
        return this.dictionary.getNameAsString(COSName.NAME);
    }

    public boolean getNonEFontNoWarn() {
        return this.dictionary.getBoolean(COSName.NON_EFONT_NO_WARN, true);
    }

    public String getOS() {
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.OS;
        COSBase item = cOSDictionary.getItem(cOSName);
        if (item instanceof COSArray) {
            return ((COSArray) item).getName(0);
        }
        return this.dictionary.getString(cOSName);
    }

    public boolean getPreRelease() {
        return this.dictionary.getBoolean(COSName.PRE_RELEASE, false);
    }

    public long getRevision() {
        return this.dictionary.getLong(COSName.R);
    }

    public boolean getTrustedMode() {
        return this.dictionary.getBoolean(COSName.TRUSTED_MODE, false);
    }

    public String getVersion() {
        return this.dictionary.getString("REx");
    }

    public void setDate(String str) {
        this.dictionary.setString(COSName.DATE, str);
    }

    public void setMinimumRevision(long j10) {
        this.dictionary.setLong(COSName.V, j10);
    }

    public void setName(String str) {
        this.dictionary.setName(COSName.NAME, str);
    }

    public void setNonEFontNoWarn(boolean z10) {
        this.dictionary.setBoolean(COSName.NON_EFONT_NO_WARN, z10);
    }

    public void setOS(String str) {
        if (str == null) {
            this.dictionary.removeItem(COSName.OS);
            return;
        }
        COSDictionary cOSDictionary = this.dictionary;
        COSName cOSName = COSName.OS;
        COSBase item = cOSDictionary.getItem(cOSName);
        if (!(item instanceof COSArray)) {
            item = new COSArray();
            item.setDirect(true);
            this.dictionary.setItem(cOSName, item);
        }
        ((COSArray) item).add(0, COSName.getPDFName(str));
    }

    public void setPreRelease(boolean z10) {
        this.dictionary.setBoolean(COSName.PRE_RELEASE, z10);
    }

    public void setRevision(long j10) {
        this.dictionary.setLong(COSName.R, j10);
    }

    public void setTrustedMode(boolean z10) {
        this.dictionary.setBoolean(COSName.TRUSTED_MODE, z10);
    }

    public void setVersion(String str) {
        this.dictionary.setString("REx", str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDPropBuildDataDict(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
