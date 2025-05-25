package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.IOException;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public abstract class FDFAnnotationTextMarkup extends FDFAnnotation {
    public FDFAnnotationTextMarkup() {
    }

    public float[] getCoords() {
        COSArray cOSArray = (COSArray) this.annot.getItem(COSName.QUADPOINTS);
        if (cOSArray != null) {
            return cOSArray.toFloatArray();
        }
        return null;
    }

    public void setCoords(float[] fArr) {
        COSArray cOSArray = new COSArray();
        cOSArray.setFloatArray(fArr);
        this.annot.setItem(COSName.QUADPOINTS, (COSBase) cOSArray);
    }

    public FDFAnnotationTextMarkup(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationTextMarkup(Element element) {
        super(element);
        String attribute = element.getAttribute("coords");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            if (split.length >= 8) {
                float[] fArr = new float[split.length];
                for (int i10 = 0; i10 < split.length; i10++) {
                    fArr[i10] = Float.parseFloat(split[i10]);
                }
                setCoords(fArr);
                return;
            }
            throw new IOException("Error: too little numbers in attribute 'coords'");
        }
        throw new IOException("Error: missing attribute 'coords'");
    }
}
