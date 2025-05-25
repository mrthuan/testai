package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.util.Matrix;

/* loaded from: classes2.dex */
public class PDShadingType1 extends PDShading {
    private COSArray domain;

    public PDShadingType1(COSDictionary cOSDictionary) {
        super(cOSDictionary);
        this.domain = null;
    }

    public COSArray getDomain() {
        if (this.domain == null) {
            this.domain = (COSArray) getCOSObject().getDictionaryObject(COSName.DOMAIN);
        }
        return this.domain;
    }

    public Matrix getMatrix() {
        return Matrix.createMatrix(getCOSObject().getDictionaryObject(COSName.MATRIX));
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 1;
    }

    public void setDomain(COSArray cOSArray) {
        this.domain = cOSArray;
        getCOSObject().setItem(COSName.DOMAIN, (COSBase) cOSArray);
    }

    public void setMatrix(AffineTransform affineTransform) {
        COSArray cOSArray = new COSArray();
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i10 = 0; i10 < 6; i10++) {
            cOSArray.add((COSBase) new COSFloat((float) dArr[i10]));
        }
        getCOSObject().setItem(COSName.MATRIX, (COSBase) cOSArray);
    }
}
