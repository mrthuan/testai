package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class PDPolygonAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDPolygonAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    private float[][] getPathArray(PDAnnotationMarkup pDAnnotationMarkup) {
        float[][] path = pDAnnotationMarkup.getPath();
        if (path == null) {
            float[] vertices = pDAnnotationMarkup.getVertices();
            if (vertices == null) {
                return null;
            }
            int length = vertices.length / 2;
            float[][] fArr = (float[][]) Array.newInstance(Float.TYPE, length, 2);
            for (int i10 = 0; i10 < length; i10++) {
                float[] fArr2 = fArr[i10];
                int i11 = i10 * 2;
                fArr2[0] = vertices[i11];
                fArr2[1] = vertices[i11 + 1];
            }
            return fArr;
        }
        return path;
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateNormalAppearance() {
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) getAnnotation();
        float lineWidth = getLineWidth();
        PDRectangle rectangle = pDAnnotationMarkup.getRectangle();
        float[][] pathArray = getPathArray(pDAnnotationMarkup);
        if (pathArray == null) {
            return;
        }
        float f10 = Float.MAX_VALUE;
        float f11 = Float.MIN_VALUE;
        float f12 = Float.MIN_VALUE;
        float f13 = Float.MAX_VALUE;
        for (float[] fArr : pathArray) {
            int i10 = 0;
            while (true) {
                if (i10 < fArr.length / 2) {
                    int i11 = i10 * 2;
                    float f14 = fArr[i11];
                    float f15 = fArr[i11 + 1];
                    f10 = Math.min(f10, f14);
                    f13 = Math.min(f13, f15);
                    f11 = Math.max(f11, f14);
                    f12 = Math.max(f12, f15);
                    i10++;
                }
            }
        }
        rectangle.setLowerLeftX(Math.min(f10 - lineWidth, rectangle.getLowerLeftX()));
        rectangle.setLowerLeftY(Math.min(f13 - lineWidth, rectangle.getLowerLeftY()));
        rectangle.setUpperRightX(Math.max(f11 + lineWidth, rectangle.getUpperRightX()));
        rectangle.setUpperRightY(Math.max(f12 + lineWidth, rectangle.getUpperRightY()));
        pDAnnotationMarkup.setRectangle(rectangle);
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(getColor());
                boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationMarkup.getInteriorColor());
                setOpacity(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                pDAppearanceContentStream.setBorderLine(lineWidth, pDAnnotationMarkup.getBorderStyle(), pDAnnotationMarkup.getBorder());
                PDBorderEffectDictionary borderEffect = pDAnnotationMarkup.getBorderEffect();
                if (borderEffect != null && borderEffect.getStyle().equals("C")) {
                    CloudyBorder cloudyBorder = new CloudyBorder(pDAppearanceContentStream, borderEffect.getIntensity(), lineWidth, getRectangle());
                    cloudyBorder.createCloudyPolygon(pathArray);
                    pDAnnotationMarkup.setRectangle(cloudyBorder.getRectangle());
                    PDAppearanceStream normalAppearanceStream = pDAnnotationMarkup.getNormalAppearanceStream();
                    normalAppearanceStream.setBBox(cloudyBorder.getBBox());
                    normalAppearanceStream.setMatrix(cloudyBorder.getMatrix());
                } else {
                    for (int i12 = 0; i12 < pathArray.length; i12++) {
                        float[] fArr2 = pathArray[i12];
                        if (i12 == 0 && fArr2.length == 2) {
                            pDAppearanceContentStream.moveTo(fArr2[0], fArr2[1]);
                        } else if (fArr2.length == 2) {
                            pDAppearanceContentStream.lineTo(fArr2[0], fArr2[1]);
                        } else if (fArr2.length == 6) {
                            pDAppearanceContentStream.curveTo(fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5]);
                        }
                    }
                    pDAppearanceContentStream.closePath();
                }
                pDAppearanceContentStream.drawShape(lineWidth, strokingColorOnDemand, nonStrokingColorOnDemand);
            } catch (IOException e10) {
                e10.getMessage();
            }
        } finally {
            IOUtils.closeQuietly(pDAppearanceContentStream);
        }
    }

    public float getLineWidth() {
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) getAnnotation();
        PDBorderStyleDictionary borderStyle = pDAnnotationMarkup.getBorderStyle();
        if (borderStyle != null) {
            return borderStyle.getWidth();
        }
        COSArray border = pDAnnotationMarkup.getBorder();
        if (border.size() >= 3) {
            COSBase object = border.getObject(2);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public PDPolygonAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
