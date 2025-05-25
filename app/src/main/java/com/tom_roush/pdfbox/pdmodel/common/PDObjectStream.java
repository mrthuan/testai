package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;

/* loaded from: classes2.dex */
public class PDObjectStream extends PDStream {
    public PDObjectStream(COSStream cOSStream) {
        super(cOSStream);
    }

    public static PDObjectStream createStream(PDDocument pDDocument) {
        PDObjectStream pDObjectStream = new PDObjectStream(pDDocument.getDocument().createCOSStream());
        pDObjectStream.getCOSObject().setItem(COSName.TYPE, (COSBase) COSName.OBJ_STM);
        return pDObjectStream;
    }

    public PDObjectStream getExtends() {
        COSStream cOSStream = (COSStream) getCOSObject().getDictionaryObject(COSName.EXTENDS);
        if (cOSStream != null) {
            return new PDObjectStream(cOSStream);
        }
        return null;
    }

    public int getFirstByteOffset() {
        return getCOSObject().getInt(COSName.FIRST, 0);
    }

    public int getNumberOfObjects() {
        return getCOSObject().getInt(COSName.N, 0);
    }

    public String getType() {
        return getCOSObject().getNameAsString(COSName.TYPE);
    }

    public void setExtends(PDObjectStream pDObjectStream) {
        getCOSObject().setItem(COSName.EXTENDS, pDObjectStream);
    }

    public void setFirstByteOffset(int i10) {
        getCOSObject().setInt(COSName.FIRST, i10);
    }

    public void setNumberOfObjects(int i10) {
        getCOSObject().setInt(COSName.N, i10);
    }
}
