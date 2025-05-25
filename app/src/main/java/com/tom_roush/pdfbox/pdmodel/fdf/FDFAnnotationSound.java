package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationSound extends FDFAnnotation {
    public static final String SUBTYPE = "Sound";

    public FDFAnnotationSound() {
        this.annot.setName(COSName.SUBTYPE, "Sound");
    }

    public FDFAnnotationSound(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationSound(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Sound");
    }
}
