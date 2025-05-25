package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.util.Matrix;

/* loaded from: classes2.dex */
public class PDShadingType7 extends PDMeshBasedShadingType {
    public PDShadingType7(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDMeshBasedShadingType
    public Patch generatePatch(PointF[] pointFArr, float[][] fArr) {
        return new TensorPatch(pointFArr, fArr);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDMeshBasedShadingType, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDTriangleBasedShadingType, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public RectF getBounds(AffineTransform affineTransform, Matrix matrix) {
        return getBounds(affineTransform, matrix, 16);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShadingType4, com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading
    public int getShadingType() {
        return 7;
    }
}
