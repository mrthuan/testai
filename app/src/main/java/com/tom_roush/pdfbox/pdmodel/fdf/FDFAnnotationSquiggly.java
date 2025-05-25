package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationSquiggly extends FDFAnnotationTextMarkup {
    public static final String SUBTYPE = "Squiggly";

    public FDFAnnotationSquiggly() {
        this.annot.setName(COSName.SUBTYPE, "Squiggly");
    }

    public FDFAnnotationSquiggly(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationSquiggly(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Squiggly");
    }
}
