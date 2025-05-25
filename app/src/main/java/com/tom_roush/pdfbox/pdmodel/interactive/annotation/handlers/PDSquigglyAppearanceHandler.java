package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDFormContentStream;
import com.tom_roush.pdfbox.pdmodel.PDPatternContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDSquigglyAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDSquigglyAppearanceHandler(PDAnnotation pDAnnotation) {
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
        int i10;
        PDAppearanceContentStream pDAppearanceContentStream;
        PDAppearanceContentStream normalAppearanceAsContentStream;
        PDFormContentStream pDFormContentStream;
        PDFormContentStream pDFormContentStream2;
        PDPatternContentStream pDPatternContentStream;
        PDPatternContentStream pDPatternContentStream2;
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
            int i11 = 0;
            float f10 = Float.MIN_VALUE;
            int i12 = 0;
            float f11 = Float.MAX_VALUE;
            float f12 = Float.MAX_VALUE;
            float f13 = Float.MIN_VALUE;
            while (true) {
                i10 = 2;
                if (i12 >= quadPoints.length / 2) {
                    break;
                }
                int i13 = i12 * 2;
                float f14 = quadPoints[i13];
                float f15 = quadPoints[i13 + 1];
                f11 = Math.min(f11, f14);
                f12 = Math.min(f12, f15);
                f10 = Math.max(f10, f14);
                f13 = Math.max(f13, f15);
                i12++;
            }
            rectangle.setLowerLeftX(Math.min(f11 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f12 - (annotationBorder.width / 2.0f), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max((annotationBorder.width / 2.0f) + f10, rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max((annotationBorder.width / 2.0f) + f13, rectangle.getUpperRightY()));
            pDAnnotationTextMarkup.setRectangle(rectangle);
            try {
                normalAppearanceAsContentStream = getNormalAppearanceAsContentStream();
                try {
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
                pDAppearanceContentStream = null;
            } catch (Throwable th3) {
                th = th3;
                pDAppearanceContentStream = null;
            }
            try {
                setOpacity(normalAppearanceAsContentStream, pDAnnotationTextMarkup.getConstantOpacity());
                normalAppearanceAsContentStream.setStrokingColor(color);
                while (i11 < quadPoints.length / 8) {
                    int i14 = i11 * 8;
                    float f16 = quadPoints[i14 + 1];
                    float f17 = quadPoints[i14 + 5];
                    float f18 = f16 - f17;
                    float f19 = f18 / 40.0f;
                    normalAppearanceAsContentStream.transform(new Matrix(f19, 0.0f, 0.0f, f19 / 1.8f, quadPoints[i14 + 4], f17));
                    PDFormXObject pDFormXObject = new PDFormXObject(createCOSStream());
                    int i15 = i14 + 2;
                    pDFormXObject.setBBox(new PDRectangle(-0.5f, -0.5f, (((quadPoints[i15] - quadPoints[i14]) / f18) * 40.0f) + 0.5f, 13.0f));
                    pDFormXObject.setResources(new PDResources());
                    pDFormXObject.setMatrix(AffineTransform.getTranslateInstance(0.5d, 0.5d));
                    normalAppearanceAsContentStream.drawForm(pDFormXObject);
                    try {
                        pDFormContentStream2 = new PDFormContentStream(pDFormXObject);
                    } catch (Throwable th4) {
                        th = th4;
                        pDFormContentStream = null;
                    }
                    try {
                        PDTilingPattern pDTilingPattern = new PDTilingPattern();
                        pDTilingPattern.setBBox(new PDRectangle(0.0f, 0.0f, 10.0f, 12.0f));
                        pDTilingPattern.setXStep(10.0f);
                        pDTilingPattern.setYStep(13.0f);
                        pDTilingPattern.setTilingType(3);
                        pDTilingPattern.setPaintType(i10);
                        try {
                            pDPatternContentStream2 = new PDPatternContentStream(pDTilingPattern);
                        } catch (Throwable th5) {
                            th = th5;
                            pDPatternContentStream = null;
                        }
                        try {
                            pDPatternContentStream2.setLineCapStyle(1);
                            pDPatternContentStream2.setLineJoinStyle(1);
                            pDPatternContentStream2.setLineWidth(1.0f);
                            pDPatternContentStream2.setMiterLimit(10.0f);
                            pDPatternContentStream2.moveTo(0.0f, 1.0f);
                            pDPatternContentStream2.lineTo(5.0f, 11.0f);
                            pDPatternContentStream2.lineTo(10.0f, 1.0f);
                            pDPatternContentStream2.stroke();
                            IOUtils.closeQuietly(pDPatternContentStream2);
                            pDFormXObject.getResources().add(pDTilingPattern);
                            pDFormContentStream2.addRect(0.0f, 0.0f, ((quadPoints[i15] - quadPoints[i14]) / f18) * 40.0f, 12.0f);
                            pDFormContentStream2.fill();
                            IOUtils.closeQuietly(pDFormContentStream2);
                            i11++;
                            i10 = 2;
                        } catch (Throwable th6) {
                            th = th6;
                            pDPatternContentStream = pDPatternContentStream2;
                            IOUtils.closeQuietly(pDPatternContentStream);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        pDFormContentStream = pDFormContentStream2;
                        IOUtils.closeQuietly(pDFormContentStream);
                        throw th;
                    }
                }
                IOUtils.closeQuietly(normalAppearanceAsContentStream);
            } catch (IOException e12) {
                e = e12;
                pDAppearanceContentStream = normalAppearanceAsContentStream;
                try {
                    e.getMessage();
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                } catch (Throwable th8) {
                    th = th8;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                pDAppearanceContentStream = normalAppearanceAsContentStream;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        }
    }

    public PDSquigglyAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
