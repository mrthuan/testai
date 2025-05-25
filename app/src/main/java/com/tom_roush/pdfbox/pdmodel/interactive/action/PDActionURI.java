package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.util.Charsets;

/* loaded from: classes2.dex */
public class PDActionURI extends PDAction {
    public static final String SUB_TYPE = "URI";

    public PDActionURI() {
        setSubType(SUB_TYPE);
    }

    @Deprecated
    public String getS() {
        return this.action.getNameAsString(COSName.S);
    }

    public String getURI() {
        COSDictionary cOSDictionary = this.action;
        COSName cOSName = COSName.URI;
        COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSString) {
            byte[] bytes = ((COSString) dictionaryObject).getBytes();
            if (bytes.length >= 2) {
                byte b10 = bytes[0];
                if ((b10 & 255) == 254 && (bytes[1] & 255) == 255) {
                    return this.action.getString(cOSName);
                }
                if ((b10 & 255) == 255 && (bytes[1] & 255) == 254) {
                    return this.action.getString(cOSName);
                }
            }
            return new String(bytes, Charsets.UTF_8);
        }
        return null;
    }

    @Deprecated
    public void setS(String str) {
        this.action.setName(COSName.S, str);
    }

    public void setTrackMousePosition(boolean z10) {
        this.action.setBoolean("IsMap", z10);
    }

    public void setURI(String str) {
        this.action.setString(COSName.URI, str);
    }

    public boolean shouldTrackMousePosition() {
        return this.action.getBoolean("IsMap", false);
    }

    public PDActionURI(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
