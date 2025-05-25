package com.tom_roush.pdfbox.pdmodel.graphics.form;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;

/* loaded from: classes2.dex */
public final class PDTransparencyGroupAttributes implements COSObjectable {
    private PDColorSpace colorSpace;
    private final COSDictionary dictionary;

    public PDTransparencyGroupAttributes() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.S, (COSBase) COSName.TRANSPARENCY);
    }

    public PDColorSpace getColorSpace() {
        return getColorSpace(null);
    }

    public boolean isIsolated() {
        return getCOSObject().getBoolean(COSName.I, false);
    }

    public boolean isKnockout() {
        return getCOSObject().getBoolean(COSName.K, false);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDColorSpace getColorSpace(PDResources pDResources) {
        if (this.colorSpace == null) {
            COSDictionary cOSObject = getCOSObject();
            COSName cOSName = COSName.CS;
            if (cOSObject.containsKey(cOSName)) {
                this.colorSpace = PDColorSpace.create(getCOSObject().getDictionaryObject(cOSName), pDResources);
            }
        }
        return this.colorSpace;
    }

    public PDTransparencyGroupAttributes(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
    }
}
