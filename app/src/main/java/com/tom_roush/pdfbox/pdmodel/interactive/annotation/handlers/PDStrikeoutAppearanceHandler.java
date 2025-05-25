package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import androidx.activity.r;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDStrikeoutAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDStrikeoutAppearanceHandler(PDAnnotation pDAnnotation) {
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
        char c;
        PDAnnotationTextMarkup pDAnnotationTextMarkup = (PDAnnotationTextMarkup) getAnnotation();
        PDRectangle rectangle = pDAnnotationTextMarkup.getRectangle();
        float[] quadPoints = pDAnnotationTextMarkup.getQuadPoints();
        if (quadPoints == null) {
            return;
        }
        AnnotationBorder annotationBorder = AnnotationBorder.getAnnotationBorder(pDAnnotationTextMarkup, pDAnnotationTextMarkup.getBorderStyle());
        PDColor color = pDAnnotationTextMarkup.getColor();
        if (color != null && color.getComponents().length != 0) {
            if (Float.compare(annotationBorder.width, 0.0f) == 0) {
                annotationBorder.width = 1.5f;
            }
            int i10 = 0;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            float f12 = Float.MAX_VALUE;
            float f13 = Float.MIN_VALUE;
            for (int i11 = 0; i11 < quadPoints.length / 2; i11++) {
                int i12 = i11 * 2;
                float f14 = quadPoints[i12];
                float f15 = quadPoints[i12 + 1];
                f11 = Math.min(f11, f14);
                f12 = Math.min(f12, f15);
                f10 = Math.max(f10, f14);
                f13 = Math.max(f13, f15);
            }
            rectangle.setLowerLeftX(Math.min(f11 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f12 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max((annotationBorder.width / 2.0f) + f10, rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max((annotationBorder.width / 2.0f) + f13, rectangle.getUpperRightY()));
            pDAnnotationTextMarkup.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
                try {
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
                        float f16 = quadPoints[i14];
                        float f17 = quadPoints[i16];
                        if (Float.compare(sqrt, 0.0f) != 0) {
                            float f18 = sqrt / 2.0f;
                            float f19 = annotationBorder.width;
                            f16 = r.l(f18, f19, (quadPoints[i13] - quadPoints[i14]) / sqrt, f16);
                            f17 = r.l(f18, f19, (quadPoints[i15] - quadPoints[i16]) / sqrt, f17);
                        }
                        int i17 = i13 + 2;
                        int i18 = i13 + 6;
                        int i19 = i13 + 3;
                        int i20 = i13 + 7;
                        int i21 = i10;
                        float sqrt2 = (float) Math.sqrt(Math.pow(quadPoints[i17] - quadPoints[i18], 2.0d) + Math.pow(quadPoints[i19] - quadPoints[i20], 2.0d));
                        float f20 = quadPoints[i18];
                        float f21 = quadPoints[i20];
                        if (Float.compare(sqrt2, 0.0f) != 0) {
                            c = 0;
                            float f22 = sqrt2 / 2.0f;
                            float f23 = annotationBorder.width;
                            f20 = r.l(f22, f23, (quadPoints[i17] - quadPoints[i18]) / sqrt2, f20);
                            f21 = r.l(f22, f23, (quadPoints[i19] - quadPoints[i20]) / sqrt2, f21);
                        } else {
                            c = 0;
                        }
                        pDAppearanceContentStream.moveTo(f16, f17);
                        pDAppearanceContentStream.lineTo(f20, f21);
                        i10 = i21 + 1;
                    }
                    pDAppearanceContentStream.stroke();
                } catch (IOException e11) {
                    e = e11;
                    e.getMessage();
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                }
                IOUtils.closeQuietly(pDAppearanceContentStream);
            } catch (Throwable th3) {
                th = th3;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        }
    }

    public PDStrikeoutAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
