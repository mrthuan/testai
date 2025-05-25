package com.tom_roush.pdfbox.pdmodel.common.filespecification;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class PDFileSpecification implements COSObjectable {
    public static PDFileSpecification createFS(COSBase cOSBase) {
        PDFileSpecification pDComplexFileSpecification;
        if (cOSBase == null) {
            return null;
        }
        if (cOSBase instanceof COSString) {
            pDComplexFileSpecification = new PDSimpleFileSpecification((COSString) cOSBase);
        } else if (cOSBase instanceof COSDictionary) {
            pDComplexFileSpecification = new PDComplexFileSpecification((COSDictionary) cOSBase);
        } else {
            throw new IOException("Error: Unknown file specification " + cOSBase);
        }
        return pDComplexFileSpecification;
    }

    public abstract String getFile();

    public abstract void setFile(String str);
}
