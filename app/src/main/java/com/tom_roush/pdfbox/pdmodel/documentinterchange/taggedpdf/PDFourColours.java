package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDGamma;

/* loaded from: classes2.dex */
public class PDFourColours implements COSObjectable {
    private final COSArray array;

    public PDFourColours() {
        COSArray cOSArray = new COSArray();
        this.array = cOSArray;
        COSNull cOSNull = COSNull.NULL;
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
        cOSArray.add((COSBase) cOSNull);
    }

    private PDGamma getColourByIndex(int i10) {
        COSBase object = this.array.getObject(i10);
        if (object instanceof COSArray) {
            return new PDGamma((COSArray) object);
        }
        return null;
    }

    private void setColourByIndex(int i10, PDGamma pDGamma) {
        COSBase cOSArray;
        if (pDGamma == null) {
            cOSArray = COSNull.NULL;
        } else {
            cOSArray = pDGamma.getCOSArray();
        }
        this.array.set(i10, cOSArray);
    }

    public PDGamma getAfterColour() {
        return getColourByIndex(1);
    }

    public PDGamma getBeforeColour() {
        return getColourByIndex(0);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.array;
    }

    public PDGamma getEndColour() {
        return getColourByIndex(3);
    }

    public PDGamma getStartColour() {
        return getColourByIndex(2);
    }

    public void setAfterColour(PDGamma pDGamma) {
        setColourByIndex(1, pDGamma);
    }

    public void setBeforeColour(PDGamma pDGamma) {
        setColourByIndex(0, pDGamma);
    }

    public void setEndColour(PDGamma pDGamma) {
        setColourByIndex(3, pDGamma);
    }

    public void setStartColour(PDGamma pDGamma) {
        setColourByIndex(2, pDGamma);
    }

    public PDFourColours(COSArray cOSArray) {
        this.array = cOSArray;
        if (cOSArray.size() < 4) {
            for (int size = cOSArray.size() - 1; size < 4; size++) {
                this.array.add((COSBase) COSNull.NULL);
            }
        }
    }
}
