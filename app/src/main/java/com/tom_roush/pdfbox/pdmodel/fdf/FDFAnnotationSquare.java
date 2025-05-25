package com.tom_roush.pdfbox.pdmodel.fdf;

import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import java.io.IOException;
import org.w3c.dom.Element;

/* loaded from: classes2.dex */
public class FDFAnnotationSquare extends FDFAnnotation {
    public static final String SUBTYPE = "Square";

    public FDFAnnotationSquare() {
        this.annot.setName(COSName.SUBTYPE, "Square");
    }

    private void initFringe(Element element) {
        String attribute = element.getAttribute("fringe");
        if (attribute != null && !attribute.isEmpty()) {
            String[] split = attribute.split(",");
            if (split.length == 4) {
                PDRectangle pDRectangle = new PDRectangle();
                pDRectangle.setLowerLeftX(Float.parseFloat(split[0]));
                pDRectangle.setLowerLeftY(Float.parseFloat(split[1]));
                pDRectangle.setUpperRightX(Float.parseFloat(split[2]));
                pDRectangle.setUpperRightY(Float.parseFloat(split[3]));
                setFringe(pDRectangle);
                return;
            }
            throw new IOException("Error: wrong amount of numbers in attribute 'fringe'");
        }
    }

    public PDRectangle getFringe() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.RD);
        if (cOSArray != null) {
            return new PDRectangle(cOSArray);
        }
        return null;
    }

    public AWTColor getInteriorColor() {
        COSArray cOSArray = (COSArray) this.annot.getDictionaryObject(COSName.IC);
        if (cOSArray != null) {
            float[] floatArray = cOSArray.toFloatArray();
            if (floatArray.length >= 3) {
                return new AWTColor(floatArray[0], floatArray[1], floatArray[2]);
            }
        }
        return null;
    }

    public final void setFringe(PDRectangle pDRectangle) {
        this.annot.setItem(COSName.RD, pDRectangle);
    }

    public final void setInteriorColor(AWTColor aWTColor) {
        COSArray cOSArray = null;
        if (aWTColor != null) {
            float[] rGBColorComponents = aWTColor.getRGBColorComponents(null);
            cOSArray = new COSArray();
            cOSArray.setFloatArray(rGBColorComponents);
        }
        this.annot.setItem(COSName.IC, (COSBase) cOSArray);
    }

    public FDFAnnotationSquare(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public FDFAnnotationSquare(Element element) {
        super(element);
        this.annot.setName(COSName.SUBTYPE, "Square");
        String attribute = element.getAttribute("interior-color");
        if (attribute != null && attribute.length() == 7 && attribute.charAt(0) == '#') {
            setInteriorColor(new AWTColor(Integer.parseInt(attribute.substring(1, 7), 16)));
        }
        initFringe(element);
    }
}
