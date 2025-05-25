package com.tom_roush.pdfbox.cos;

import a6.h;

/* loaded from: classes2.dex */
public class COSObject extends COSBase implements COSUpdateInfo {
    private COSBase baseObject;
    private int generationNumber;
    private boolean needToBeUpdated;
    private long objectNumber;

    public COSObject(COSBase cOSBase) {
        setObject(cOSBase);
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) {
        if (getObject() != null) {
            return getObject().accept(iCOSVisitor);
        }
        return COSNull.NULL.accept(iCOSVisitor);
    }

    public COSBase getDictionaryObject(COSName cOSName) {
        COSBase cOSBase = this.baseObject;
        if (cOSBase instanceof COSDictionary) {
            return ((COSDictionary) cOSBase).getDictionaryObject(cOSName);
        }
        return null;
    }

    public int getGenerationNumber() {
        return this.generationNumber;
    }

    public COSBase getItem(COSName cOSName) {
        COSBase cOSBase = this.baseObject;
        if (cOSBase instanceof COSDictionary) {
            return ((COSDictionary) cOSBase).getItem(cOSName);
        }
        return null;
    }

    public COSBase getObject() {
        return this.baseObject;
    }

    public long getObjectNumber() {
        return this.objectNumber;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public boolean isNeedToBeUpdated() {
        return this.needToBeUpdated;
    }

    public void setGenerationNumber(int i10) {
        this.generationNumber = i10;
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z10) {
        this.needToBeUpdated = z10;
    }

    public final void setObject(COSBase cOSBase) {
        this.baseObject = cOSBase;
    }

    public void setObjectNumber(long j10) {
        this.objectNumber = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("COSObject{");
        sb2.append(this.objectNumber);
        sb2.append(", ");
        return h.g(sb2, this.generationNumber, "}");
    }
}
