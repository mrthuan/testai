package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.util.Set;

/* loaded from: classes2.dex */
public class PDLineAppearanceHandler extends PDAbstractAppearanceHandler {
    static final int FONT_SIZE = 9;

    public PDLineAppearanceHandler(PDAnnotation pDAnnotation) {
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
        float f10;
        float f11;
        double d10;
        boolean z10;
        float f12;
        float f13;
        boolean z11;
        float f14;
        double d11;
        float f15;
        float f16;
        PDAnnotationLine pDAnnotationLine = (PDAnnotationLine) getAnnotation();
        PDRectangle rectangle = pDAnnotationLine.getRectangle();
        float[] line = pDAnnotationLine.getLine();
        if (line == null) {
            return;
        }
        AnnotationBorder annotationBorder = AnnotationBorder.getAnnotationBorder(pDAnnotationLine, pDAnnotationLine.getBorderStyle());
        PDColor color = pDAnnotationLine.getColor();
        if (color != null && color.getComponents().length != 0) {
            float leaderLineLength = pDAnnotationLine.getLeaderLineLength();
            float leaderLineExtensionLength = pDAnnotationLine.getLeaderLineExtensionLength();
            float leaderLineOffsetLength = pDAnnotationLine.getLeaderLineOffsetLength();
            float f17 = Float.MIN_VALUE;
            float f18 = Float.MAX_VALUE;
            float f19 = Float.MAX_VALUE;
            float f20 = Float.MIN_VALUE;
            for (int i10 = 0; i10 < line.length / 2; i10++) {
                int i11 = i10 * 2;
                float f21 = line[i11];
                float f22 = line[i11 + 1];
                f18 = Math.min(f18, f21);
                f19 = Math.min(f19, f22);
                f17 = Math.max(f17, f21);
                f20 = Math.max(f20, f22);
            }
            if (leaderLineLength < 0.0f) {
                leaderLineOffsetLength = -leaderLineOffsetLength;
                leaderLineExtensionLength = -leaderLineExtensionLength;
            }
            float f23 = annotationBorder.width;
            float f24 = f18;
            if (f23 < 1.0E-5d) {
                f23 = 1.0f;
            }
            float f25 = 10.0f * f23;
            float f26 = leaderLineLength + leaderLineOffsetLength;
            float f27 = leaderLineExtensionLength + f26;
            rectangle.setLowerLeftX(Math.min(f24 - Math.max(f25, Math.abs(f27)), rectangle.getLowerLeftX()));
            rectangle.setLowerLeftY(Math.min(f19 - Math.max(f25, Math.abs(f27)), rectangle.getLowerLeftY()));
            rectangle.setUpperRightX(Math.max(Math.max(f25, Math.abs(f27)) + f17, rectangle.getUpperRightX()));
            rectangle.setUpperRightY(Math.max(Math.max(f25, Math.abs(f27)) + f20, rectangle.getUpperRightY()));
            pDAnnotationLine.setRectangle(rectangle);
            PDAppearanceContentStream pDAppearanceContentStream = null;
            try {
                try {
                    pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                    setOpacity(pDAppearanceContentStream, pDAnnotationLine.getConstantOpacity());
                    boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(color);
                    float[] fArr = annotationBorder.dashArray;
                    if (fArr != null) {
                        pDAppearanceContentStream.setLineDashPattern(fArr, 0.0f);
                    }
                    pDAppearanceContentStream.setLineWidth(annotationBorder.width);
                    float f28 = line[0];
                    float f29 = line[1];
                    float f30 = line[2];
                    float f31 = line[3];
                    String contents = pDAnnotationLine.getContents();
                    if (contents == null) {
                        contents = "";
                    }
                    pDAppearanceContentStream.saveGraphicsState();
                    double atan2 = Math.atan2(f31 - f29, f30 - f28);
                    pDAppearanceContentStream.transform(Matrix.getRotateInstance(atan2, f28, f29));
                    float sqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
                    pDAppearanceContentStream.moveTo(0.0f, leaderLineOffsetLength);
                    pDAppearanceContentStream.lineTo(0.0f, f27);
                    pDAppearanceContentStream.moveTo(sqrt, leaderLineOffsetLength);
                    pDAppearanceContentStream.lineTo(sqrt, f27);
                    if (pDAnnotationLine.getCaption() && !contents.isEmpty()) {
                        PDType1Font pDType1Font = PDType1Font.HELVETICA;
                        try {
                            f15 = (pDType1Font.getStringWidth(pDAnnotationLine.getContents()) / 1000.0f) * 9.0f;
                        } catch (IllegalArgumentException unused) {
                            pDAnnotationLine.getContents();
                            f15 = 0.0f;
                        }
                        float f32 = (sqrt - f15) / 2.0f;
                        String captionPositioning = pDAnnotationLine.getCaptionPositioning();
                        Set<String> set = PDAbstractAppearanceHandler.SHORT_STYLES;
                        if (set.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            f12 = f26;
                            pDAppearanceContentStream.moveTo(f23, f12);
                            f13 = f30;
                        } else {
                            f12 = f26;
                            f13 = f30;
                            pDAppearanceContentStream.moveTo(0.0f, f12);
                        }
                        if ("Top".equals(captionPositioning)) {
                            f16 = 1.908f;
                        } else {
                            pDAppearanceContentStream.lineTo(f32 - f23, f12);
                            pDAppearanceContentStream.moveTo((sqrt - f32) + f23, f12);
                            f16 = -2.6f;
                        }
                        if (set.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.lineTo(sqrt - f23, f12);
                        } else {
                            pDAppearanceContentStream.lineTo(sqrt, f12);
                        }
                        z10 = strokingColorOnDemand;
                        pDAppearanceContentStream.drawShape(f23, z10, false);
                        float captionHorizontalOffset = pDAnnotationLine.getCaptionHorizontalOffset();
                        d10 = atan2;
                        float captionVerticalOffset = pDAnnotationLine.getCaptionVerticalOffset();
                        if (f15 > 0.0f) {
                            pDAppearanceContentStream.beginText();
                            pDAppearanceContentStream.setFont(pDType1Font, 9.0f);
                            pDAppearanceContentStream.newLineAtOffset(f32 + captionHorizontalOffset, f12 + f16 + captionVerticalOffset);
                            pDAppearanceContentStream.showText(pDAnnotationLine.getContents());
                            pDAppearanceContentStream.endText();
                        }
                        if (Float.compare(captionVerticalOffset, 0.0f) != 0) {
                            float f33 = (sqrt / 2.0f) + 0.0f;
                            pDAppearanceContentStream.moveTo(f33, f12);
                            pDAppearanceContentStream.lineTo(f33, f12 + captionVerticalOffset);
                            pDAppearanceContentStream.drawShape(f23, z10, false);
                        }
                        z11 = false;
                    } else {
                        d10 = atan2;
                        z10 = strokingColorOnDemand;
                        f12 = f26;
                        f13 = f30;
                        Set<String> set2 = PDAbstractAppearanceHandler.SHORT_STYLES;
                        if (set2.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            pDAppearanceContentStream.moveTo(f23, f12);
                        } else {
                            pDAppearanceContentStream.moveTo(0.0f, f12);
                        }
                        if (set2.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.lineTo(sqrt - f23, f12);
                        } else {
                            pDAppearanceContentStream.lineTo(sqrt, f12);
                        }
                        z11 = false;
                        pDAppearanceContentStream.drawShape(f23, z10, false);
                    }
                    pDAppearanceContentStream.restoreGraphicsState();
                    boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationLine.getInteriorColor());
                    if (annotationBorder.width >= 1.0E-5d) {
                        z11 = z10;
                    }
                    if (!"None".equals(pDAnnotationLine.getStartPointEndingStyle())) {
                        pDAppearanceContentStream.saveGraphicsState();
                        if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationLine.getStartPointEndingStyle())) {
                            d11 = d10;
                            pDAppearanceContentStream.transform(Matrix.getRotateInstance(d11, f28, f29));
                            drawStyle(pDAnnotationLine.getStartPointEndingStyle(), pDAppearanceContentStream, 0.0f, f12, f23, z11, nonStrokingColorOnDemand, false);
                            f14 = f12;
                        } else {
                            d11 = d10;
                            double d12 = f12;
                            f14 = f12;
                            drawStyle(pDAnnotationLine.getStartPointEndingStyle(), pDAppearanceContentStream, f28 - ((float) (d12 * Math.sin(d11))), f29 + ((float) (d12 * Math.cos(d11))), f23, z11, nonStrokingColorOnDemand, false);
                        }
                        pDAppearanceContentStream.restoreGraphicsState();
                    } else {
                        f14 = f12;
                        d11 = d10;
                    }
                    if (!"None".equals(pDAnnotationLine.getEndPointEndingStyle())) {
                        if (PDAbstractAppearanceHandler.ANGLED_STYLES.contains(pDAnnotationLine.getEndPointEndingStyle())) {
                            pDAppearanceContentStream.transform(Matrix.getRotateInstance(d11, f13, f31));
                            drawStyle(pDAnnotationLine.getEndPointEndingStyle(), pDAppearanceContentStream, 0.0f, f14, f23, z11, nonStrokingColorOnDemand, true);
                        } else {
                            double d13 = f14;
                            drawStyle(pDAnnotationLine.getEndPointEndingStyle(), pDAppearanceContentStream, f13 - ((float) (Math.sin(d11) * d13)), f31 + ((float) (d13 * Math.cos(d11))), f23, z11, nonStrokingColorOnDemand, true);
                        }
                    }
                } catch (IOException e10) {
                    e10.getMessage();
                }
            } finally {
                IOUtils.closeQuietly(null);
            }
        }
    }

    public PDLineAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
