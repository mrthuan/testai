package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationFileAttachment extends FDFAnnotation {
    public static final String SUBTYPE = "FileAttachment";

    public FDFAnnotationFileAttachment() {
        this.annot.setName(COSName.SUBTYPE, "FileAttachment");
    }

    public FDFAnnotationFileAttachment(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationFileAttachment(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "FileAttachment");
    }
}
