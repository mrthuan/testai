package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDLinkAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDLinkAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAppearanceContentStream pDAppearanceContentStream;
        boolean strokingColorOnDemand;
        float[] fArr;
        PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) getAnnotation();
        if (pDAnnotationLink.getRectangle() == null) {
            return;
        }
        float lineWidth = getLineWidth();
        try {
            PDAppearanceContentStream normalAppearanceAsContentStream = getNormalAppearanceAsContentStream();
            try {
                PDColor color = pDAnnotationLink.getColor();
                if (color == null) {
                    color = new PDColor(new float[]{0.0f}, PDDeviceGray.INSTANCE);
                }
                strokingColorOnDemand = normalAppearanceAsContentStream.setStrokingColorOnDemand(color);
                normalAppearanceAsContentStream.setBorderLine(lineWidth, pDAnnotationLink.getBorderStyle(), pDAnnotationLink.getBorder());
            } catch (IOException e10) {
                e = e10;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                PDRectangle paddedRectangle = getPaddedRectangle(getRectangle(), lineWidth / 2.0f);
                float[] quadPoints = pDAnnotationLink.getQuadPoints();
                if (quadPoints != null) {
                    PDRectangle rectangle = pDAnnotationLink.getRectangle();
                    for (int i10 = 0; i10 < quadPoints.length / 2; i10++) {
                        int i11 = i10 * 2;
                        int i12 = i11 + 1;
                        if (!rectangle.contains(quadPoints[i11], quadPoints[i12])) {
                            float f10 = quadPoints[i11];
                            float f11 = quadPoints[i12];
                            rectangle.toString();
                            fArr = null;
                            break;
                        }
                    }
                }
                fArr = quadPoints;
                if (fArr == null) {
                    fArr = new float[]{paddedRectangle.getLowerLeftX(), paddedRectangle.getLowerLeftY(), paddedRectangle.getUpperRightX(), paddedRectangle.getLowerLeftY(), paddedRectangle.getUpperRightX(), paddedRectangle.getUpperRightY(), paddedRectangle.getLowerLeftX(), paddedRectangle.getUpperRightY()};
                }
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 7;
                    if (i14 < fArr.length) {
                        if (pDAnnotationLink.getBorderStyle() != null && pDAnnotationLink.getBorderStyle().getStyle().equals(PDBorderStyleDictionary.STYLE_UNDERLINE)) {
                            normalAppearanceAsContentStream.moveTo(fArr[i13], fArr[i13 + 1]);
                            normalAppearanceAsContentStream.lineTo(fArr[i13 + 2], fArr[i13 + 3]);
                        } else {
                            normalAppearanceAsContentStream.moveTo(fArr[i13], fArr[i13 + 1]);
                            normalAppearanceAsContentStream.lineTo(fArr[i13 + 2], fArr[i13 + 3]);
                            normalAppearanceAsContentStream.lineTo(fArr[i13 + 4], fArr[i13 + 5]);
                            normalAppearanceAsContentStream.lineTo(fArr[i13 + 6], fArr[i14]);
                            normalAppearanceAsContentStream.closePath();
                        }
                        i13 += 8;
                    } else {
                        normalAppearanceAsContentStream.drawShape(lineWidth, strokingColorOnDemand, false);
                        IOUtils.closeQuietly(normalAppearanceAsContentStream);
                        return;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                pDAppearanceContentStream = normalAppearanceAsContentStream;
                try {
                    e.getMessage();
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                } catch (Throwable th3) {
                    th = th3;
                    IOUtils.closeQuietly(pDAppearanceContentStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                pDAppearanceContentStream = normalAppearanceAsContentStream;
                IOUtils.closeQuietly(pDAppearanceContentStream);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            pDAppearanceContentStream = null;
        } catch (Throwable th5) {
            th = th5;
            pDAppearanceContentStream = null;
        }
    }

    public float getLineWidth() {
        PDAnnotationLink pDAnnotationLink = (PDAnnotationLink) getAnnotation();
        PDBorderStyleDictionary borderStyle = pDAnnotationLink.getBorderStyle();
        if (borderStyle != null) {
            return borderStyle.getWidth();
        }
        COSArray border = pDAnnotationLink.getBorder();
        if (border.size() >= 3) {
            COSBase object = border.getObject(2);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public PDLinkAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
