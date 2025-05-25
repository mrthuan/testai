package com.tom_roush.pdfbox.pdmodel.interactive.action;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.filespecification.PDFileSpecification;

/* loaded from: classes2.dex */
public class PDActionImportData extends PDAction {
    public static final String SUB_TYPE = "ImportData";

    public PDActionImportData() {
        setSubType(SUB_TYPE);
    }

    public PDFileSpecification getFile() {
        return PDFileSpecification.createFS(this.action.getDictionaryObject(COSName.F));
    }

    public void setFile(PDFileSpecification pDFileSpecification) {
        this.action.setItem(COSName.F, pDFileSpecification);
    }

    public PDActionImportData(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
