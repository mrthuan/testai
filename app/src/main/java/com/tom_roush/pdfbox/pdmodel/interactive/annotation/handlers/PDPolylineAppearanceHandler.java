package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDPolylineAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDPolylineAppearanceHandler(PDAnnotation pDAnnotation) {
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
        String str;
        PDAnnotationMarkup pDAnnotationMarkup;
        boolean z10;
        boolean z11;
        boolean z12;
        String str2 = "None";
        PDAnnotationMarkup pDAnnotationMarkup2 = (PDAnnotationMarkup) getAnnotation();
        PDRectangle rectangle = pDAnnotationMarkup2.getRectangle();
        float[] vertices = pDAnnotationMarkup2.getVertices();
        if (vertices != null && vertices.length >= 4) {
            AnnotationBorder annotationBorder = AnnotationBorder.getAnnotationBorder(pDAnnotationMarkup2, pDAnnotationMarkup2.getBorderStyle());
            PDColor color = pDAnnotationMarkup2.getColor();
            if (color != null && color.getComponents().length != 0 && Float.compare(annotationBorder.width, 0.0f) != 0) {
                float f10 = Float.MIN_VALUE;
                float f11 = Float.MAX_VALUE;
                float f12 = Float.MAX_VALUE;
                float f13 = Float.MIN_VALUE;
                for (int i10 = 0; i10 < vertices.length / 2; i10++) {
                    int i11 = i10 * 2;
                    float f14 = vertices[i11];
                    float f15 = vertices[i11 + 1];
                    f11 = Math.min(f11, f14);
                    f12 = Math.min(f12, f15);
                    f10 = Math.max(f10, f14);
                    f13 = Math.max(f13, f15);
                }
                rectangle.setLowerLeftX(Math.min(f11 - (annotationBorder.width * 10.0f), rectangle.getLowerLeftX()));
                rectangle.setLowerLeftY(Math.min(f12 - (annotationBorder.width * 10.0f), rectangle.getLowerLeftY()));
                rectangle.setUpperRightX(Math.max((annotationBorder.width * 10.0f) + f10, rectangle.getUpperRightX()));
                rectangle.setUpperRightY(Math.max((annotationBorder.width * 10.0f) + f13, rectangle.getUpperRightY()));
                pDAnnotationMarkup2.setRectangle(rectangle);
                PDAppearanceContentStream pDAppearanceContentStream = null;
                try {
                    try {
                        pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                        boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationMarkup2.getInteriorColor());
                        setOpacity(pDAppearanceContentStream, pDAnnotationMarkup2.getConstantOpacity());
                        boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(color);
                        float[] fArr = annotationBorder.dashArray;
                        if (fArr != null) {
                            pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                        }
                        pDAppearanceContentStream.setLineWidth(annotationBorder.width);
                        int i12 = 0;
                        while (i12 < vertices.length / 2) {
                            int i13 = i12 * 2;
                            float f16 = vertices[i13];
                            float f17 = vertices[i13 + 1];
                            if (i12 == 0) {
                                if (PDAbstractAppearanceHandler.SHORT_STYLES.contains(pDAnnotationMarkup2.getStartPointEndingStyle())) {
                                    float f18 = vertices[2];
                                    float f19 = vertices[3];
                                    z10 = strokingColorOnDemand;
                                    z11 = nonStrokingColorOnDemand;
                                    str = str2;
                                    pDAnnotationMarkup = pDAnnotationMarkup2;
                                    float sqrt = (float) Math.sqrt(Math.pow(f16 - f18, 2.0d) + Math.pow(f17 - f19, 2.0d));
                                    if (Float.compare(sqrt, 0.0f) != 0) {
                                        float f20 = annotationBorder.width;
                                        f16 += ((f18 - f16) / sqrt) * f20;
                                        f17 += ((f19 - f17) / sqrt) * f20;
                                    }
                                } else {
                                    str = str2;
                                    pDAnnotationMarkup = pDAnnotationMarkup2;
                                    z10 = strokingColorOnDemand;
                                    z11 = nonStrokingColorOnDemand;
                                }
                                pDAppearanceContentStream.moveTo(f16, f17);
                                z12 = false;
                            } else {
                                str = str2;
                                pDAnnotationMarkup = pDAnnotationMarkup2;
                                z10 = strokingColorOnDemand;
                                z11 = nonStrokingColorOnDemand;
                                if (i12 == (vertices.length / 2) - 1 && PDAbstractAppearanceHandler.SHORT_STYLES.contains(pDAnnotationMarkup.getEndPointEndingStyle())) {
                                    float f21 = vertices[vertices.length - 4];
                                    float f22 = vertices[vertices.length - 3];
                                    float sqrt2 = (float) Math.sqrt(Math.pow(f21 - f16, 2.0d) + Math.pow(f22 - f17, 2.0d));
                                    z12 = false;
                                    if (Float.compare(sqrt2, 0.0f) != 0) {
                                        float f23 = annotationBorder.width;
                                        f16 -= ((f16 - f21) / sqrt2) * f23;
                                        f17 -= ((f17 - f22) / sqrt2) * f23;
                                    }
                                } else {
                                    z12 = false;
                                }
                                pDAppearanceContentStream.lineTo(f16, f17);
                            }
                            i12++;
                            nonStrokingColorOnDemand = z11;
                            strokingColorOnDemand = z10;
                            str2 = str;
                            pDAnnotationMarkup2 = pDAnnotationMarkup;
                        }
                        String str3 = str2;
                        PDAnnotationMarkup pDAnnotationMarkup3 = pDAnnotationMarkup2;
                        boolean z13 = strokingColorOnDemand;
                        boolean z14 = nonStrokingColorOnDemand;
                        pDAppearanceContentStream.stroke();
                        if (!str3.equals(pDAnnotationMarkup3.getStartPointEndingStyle())) {
                            float f24 = vertices[2];
                            float f25 = vertices[3];
                            float f26 = vertices[0];
                            float f27 = vertices[1];
                            pDAppearanceContentStream.saveGraphicsState();
                            if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationMarkup3.getStartPointEndingStyle())) {
                                pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.atan2(f25 - f27, f24 - f26), f26, f27));
                            } else {
                                pDAppearanceContentStream.transform(Matrix.getTranslateInstance(f26, f27));
                            }
                            drawStyle(pDAnnotationMarkup3.getStartPointEndingStyle(), pDAppearanceContentStream, 0.0f, 0.0f, annotationBorder.width, z13, z14, false);
                            pDAppearanceContentStream.restoreGraphicsState();
                        }
                        if (!str3.equals(pDAnnotationMarkup3.getEndPointEndingStyle())) {
                            float f28 = vertices[vertices.length - 4];
                            float f29 = vertices[vertices.length - 3];
                            float f30 = vertices[vertices.length - 2];
                            float f31 = vertices[vertices.length - 1];
                            if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationMarkup3.getEndPointEndingStyle())) {
                                pDAppearanceContentStream.transform(Matrix.getRotateInstance(Math.atan2(f31 - f29, f30 - f28), f30, f31));
                            } else {
                                pDAppearanceContentStream.transform(Matrix.getTranslateInstance(f30, f31));
                            }
                            drawStyle(pDAnnotationMarkup3.getEndPointEndingStyle(), pDAppearanceContentStream, 0.0f, 0.0f, annotationBorder.width, z13, z14, true);
                        }
                    } catch (IOException e10) {
                        e10.getMessage();
                    }
                } finally {
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                }
            }
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

    public PDPolylineAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
