package com.tom_roush.pdfbox.pdmodel.common.filespecification;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;

/* loaded from: classes2.dex */
public class PDSimpleFileSpecification extends PDFileSpecification {
    private COSString file;

    public PDSimpleFileSpecification() {
        this.file = new COSString("");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.file;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public String getFile() {
        return this.file.getString();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification
    public void setFile(String str) {
        this.file = new COSString(str);
    }

    public PDSimpleFileSpecification(COSString cOSString) {
        this.file = cOSString;
    }
}
