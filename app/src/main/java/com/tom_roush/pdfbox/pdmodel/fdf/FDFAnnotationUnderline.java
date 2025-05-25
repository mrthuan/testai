package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationUnderline extends FDFAnnotationTextMarkup {
    public static final String SUBTYPE = "Underline";

    public FDFAnnotationUnderline() {
        this.annot.setName(COSName.SUBTYPE, "Underline");
    }

    public FDFAnnotationUnderline(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationUnderline(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Underline");
    }
}
