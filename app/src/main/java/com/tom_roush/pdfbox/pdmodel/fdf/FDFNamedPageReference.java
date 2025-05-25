package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

/* loaded from: classes2.dex */
public class FDFNamedPageReference implements COSObjectable {
    private final COSDictionary ref;

    public FDFNamedPageReference() {
        this.ref = new COSDictionary();
    }

    public PDFileSpecification getFileSpecification() {
        return PDFileSpecification.createFS(this.ref.getDictionaryObject(COSName.F));
    }

    public String getName() {
        return this.ref.getString(COSName.NAME);
    }

    public void setFileSpecification(PDFileSpecification pDFileSpecification) {
        this.ref.setItem(COSName.F, pDFileSpecification);
    }

    public void setName(String str) {
        this.ref.setString(COSName.NAME, str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.ref;
    }

    public FDFNamedPageReference(COSDictionary cOSDictionary) {
        this.ref = cOSDictionary;
    }
}
