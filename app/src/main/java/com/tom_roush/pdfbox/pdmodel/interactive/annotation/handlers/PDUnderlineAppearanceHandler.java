package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDUnderlineAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDUnderlineAppearanceHandler(PDAnnotation pDAnnotation) {
        super(pDAnnotation);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateAppearanceStreams() {
        generateNormalAppearance();
        generateRolloverAppearance();
        generateDownAppearance();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateNormalAppearance() {
        PDAnnotationTextMarkup pDAnnotationTextMarkup = (PDAnnotationTextMarkup) getAnnotation();
        PDRectangle rectangle = pDAnnotationTextMarkup.getRectangle();
        float[] quadPoints = pDAnnotationTextMarkup.getQuadPoints();
        if (quadPoints == null) {
            return;
        }
        AnnotationBorder annotationBorder = AnnotationBorder.getAnnotationBorder(pDAnnotationTextMarkup, pDAnnotationTextMarkup.getBorderStyle());
        PDColor color = pDAnnotationTextMarkup.getColor();
        if (color != null && color.getComponents().length != 0) {
            float f10 = 0.0f;
            if (Float.compare(annotationBorder.width, 0.0f) == 0) {
                annotationBorder.width = 1.5f;
            }
            int i10 = 0;
            float f11 = Float.MIN_VALUE;
            float f12 = Float.MAX_VALUE;
            float f13 = Float.MAX_VALUE;
            float f14 = Float.MIN_VALUE;
            for (int i11 = 0; i11 < quadPoints.length / 2; i11++) {
                int i12 = i11 * 2;
                float f15 = quadPoints[i12];
                float f16 = quadPoints[i12 + 1];
                f12 = Math.min(f12, f15);
                f13 = Math.min(f13, f16);
                f11 = Math.max(f11, f15);
                f14 = Math.max(f14, f16);
            }
            rectangle.setLowerLeftX(Math.min(f12 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f13 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max((annotationBorder.width / 2.0f) + f11, rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max((annotationBorder.width / 2.0f) + f14, rectangle.getUpperRightY()));
            pDAnnotationTextMarkup.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                    setOpacity(pDAppearanceContentStream, pDAnnotationTextMarkup.getConstantOpacity());
                    pDAppearanceContentStream.setStrokingColor(color);
                    float[] fArr = annotationBorder.dashArray;
                    if (fArr != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(annotationBorder.width);
                    while (i10 < quadPoints.length / 8) {
                        int i13 = i10 * 8;
                        int i14 = i13 + 4;
                        int i15 = i13 + 1;
                        int i16 = i13 + 5;
                        float sqrt = (float) Math.sqrt(Math.pow(quadPoints[i13] - quadPoints[i14], 2.0d) + Math.pow(quadPoints[i15] - quadPoints[i16], 2.0d));
                        float f17 = quadPoints[i14];
                        float f18 = quadPoints[i16];
                        if (Float.compare(sqrt, f10) != 0) {
                            f17 += (((quadPoints[i13] - quadPoints[i14]) / sqrt) * sqrt) / 7.0f;
                            f18 += (sqrt / 7.0f) * ((quadPoints[i15] - quadPoints[i16]) / sqrt);
                        }
                        int i17 = i13 + 2;
                        int i18 = i13 + 6;
                        int i19 = i13 + 3;
                        int i20 = i13 + 7;
                        float sqrt2 = (float) Math.sqrt(Math.pow(quadPoints[i17] - quadPoints[i18], 2.0d) + Math.pow(quadPoints[i19] - quadPoints[i20], 2.0d));
                        float f19 = quadPoints[i18];
                        float f20 = quadPoints[i20];
                        if (Float.compare(sqrt2, 0.0f) != 0) {
                            f19 += (((quadPoints[i17] - quadPoints[i18]) / sqrt2) * sqrt2) / 7.0f;
                            f20 += (((quadPoints[i19] - quadPoints[i20]) / sqrt2) * sqrt2) / 7.0f;
                        }
                        pDAppearanceContentStream.moveTo(f17, f18);
                        pDAppearanceContentStream.lineTo(f19, f20);
                        i10++;
                        f10 = 0.0f;
                    }
                    pDAppearanceContentStream.stroke();
                } catch (IOException e10) {
                    e10.getMessage();
                }
            } finally {
                IOUtils.closeQuietly(pDAppearanceContentStream);
            }
        }
    }

    public PDUnderlineAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
