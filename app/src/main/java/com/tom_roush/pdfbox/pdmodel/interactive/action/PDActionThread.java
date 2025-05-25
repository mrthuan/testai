package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

/* loaded from: classes2.dex */
public class PDActionThread extends PDAction {
    public static final String SUB_TYPE = "Thread";

    public PDActionThread() {
        setSubType(SUB_TYPE);
    }

    public COSBase getB() {
        return this.action.getDictionaryObject(COSName.B);
    }

    public COSBase getD() {
        return this.action.getDictionaryObject(COSName.D);
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(this.action.getDictionaryObject(COSName.F));
    }

    public void setB(COSBase cOSBase) {
        this.action.setItem(COSName.B, cOSBase);
    }

    public void setD(COSBase cOSBase) {
        this.action.setItem(COSName.D, cOSBase);
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.action.setItem(COSName.F, pDFileSpecification);
    }

    public PDActionThread(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
