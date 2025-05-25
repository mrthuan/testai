package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent;

/* loaded from: classes2.dex */
public class PDArtifactMarkedContent extends PDMarkedContent {
    public PDArtifactMarkedContent(COSDictionary cOSDictionary) {
        super(COSName.ARTIFACT, cOSDictionary);
    }

    private boolean isAttached(String str) {
        COSArray cOSArray = (COSArray) getProperties().getDictionaryObject(COSName.ATTACHED);
        if (cOSArray != null) {
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                if (str.equals(cOSArray.getName(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    public PDRectangle getBBox() {
        COSArray cOSArray = (COSArray) getProperties().getDictionaryObject(COSName.BBOX);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public String getSubtype() {
        return getProperties().getNameAsString(COSName.SUBTYPE);
    }

    public String getType() {
        return getProperties().getNameAsString(COSName.TYPE);
    }

    public boolean isBottomAttached() {
        return isAttached("Bottom");
    }

    public boolean isLeftAttached() {
        return isAttached("Left");
    }

    public boolean isRightAttached() {
        return isAttached("Right");
    }

    public boolean isTopAttached() {
        return isAttached("Top");
    }
}
