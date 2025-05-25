package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDInkAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDInkAppearanceHandler(PDAnnotation pDAnnotation) {
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
        float[][] inkList;
        float[][] inkList2;
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) getAnnotation();
        AnnotationBorder annotationBorder = AnnotationBorder.getAnnotationBorder(pDAnnotationMarkup, pDAnnotationMarkup.getBorderStyle());
        PDColor color = pDAnnotationMarkup.getColor();
        if (color != null && color.getComponents().length != 0 && Float.compare(annotationBorder.width, 0.0f) != 0) {
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            float f12 = Float.MAX_VALUE;
            float f13 = Float.MIN_VALUE;
            for (float[] fArr : pDAnnotationMarkup.getInkList()) {
                int length = fArr.length / 2;
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    float f14 = fArr[i11];
                    float f15 = fArr[i11 + 1];
                    f11 = Math.min(f11, f14);
                    f12 = Math.min(f12, f15);
                    f10 = Math.max(f10, f14);
                    f13 = Math.max(f13, f15);
                }
            }
            PDRectangle rectangle = pDAnnotationMarkup.getRectangle();
            rectangle.setLowerLeftX(Math.min(f11 - (annotationBorder.width * 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f12 - (annotationBorder.width * 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max((annotationBorder.width * 2.0f) + f10, rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max((annotationBorder.width * 2.0f) + f13, rectangle.getUpperRightY()));
            pDAnnotationMarkup.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
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
                try {
                    setOpacity(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                    pDAppearanceContentStream.setStrokingColor(color);
                    float[] fArr2 = annotationBorder.dashArray;
                    if (fArr2 != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr2, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(annotationBorder.width);
                    for (float[] fArr3 : pDAnnotationMarkup.getInkList()) {
                        int length2 = fArr3.length / 2;
                        for (int i12 = 0; i12 < length2; i12++) {
                            int i13 = i12 * 2;
                            float f16 = fArr3[i13];
                            float f17 = fArr3[i13 + 1];
                            if (i12 == 0) {
                                pDAppearanceContentStream.moveTo(f16, f17);
                            } else {
                                pDAppearanceContentStream.lineTo(f16, f17);
                            }
                        }
                        pDAppearanceContentStream.stroke();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                e.getMessage();
                IOUtils.closeQuietly(pDAppearanceContentStream);
            }
            IOUtils.closeQuietly(pDAppearanceContentStream);
        }
    }

    public PDInkAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
