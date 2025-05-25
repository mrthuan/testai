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
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDCircleAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDCircleAppearanceHandler(PDAnnotation pDAnnotation) {
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
        float lineWidth = getLineWidth();
        PDAnnotationSquareCircle pDAnnotationSquareCircle = (PDAnnotationSquareCircle) getAnnotation();
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                boolean strokingColorOnDemand = pDAppearanceContentStream.setStrokingColorOnDemand(getColor());
                boolean nonStrokingColorOnDemand = pDAppearanceContentStream.setNonStrokingColorOnDemand(pDAnnotationSquareCircle.getInteriorColor());
                setOpacity(pDAppearanceContentStream, pDAnnotationSquareCircle.getConstantOpacity());
                pDAppearanceContentStream.setBorderLine(lineWidth, pDAnnotationSquareCircle.getBorderStyle(), pDAnnotationSquareCircle.getBorder());
                PDBorderEffectDictionary borderEffect = pDAnnotationSquareCircle.getBorderEffect();
                if (borderEffect != null && borderEffect.getStyle().equals("C")) {
                    CloudyBorder cloudyBorder = new CloudyBorder(pDAppearanceContentStream, borderEffect.getIntensity(), lineWidth, getRectangle());
                    cloudyBorder.createCloudyEllipse(pDAnnotationSquareCircle.getRectDifference());
                    pDAnnotationSquareCircle.setRectangle(cloudyBorder.getRectangle());
                    pDAnnotationSquareCircle.setRectDifference(cloudyBorder.getRectDifference());
                    PDAppearanceStream normalAppearanceStream = pDAnnotationSquareCircle.getNormalAppearanceStream();
                    normalAppearanceStream.setBBox(cloudyBorder.getBBox());
                    normalAppearanceStream.setMatrix(cloudyBorder.getMatrix());
                } else {
                    PDRectangle handleBorderBox = handleBorderBox(pDAnnotationSquareCircle, lineWidth);
                    float lowerLeftX = handleBorderBox.getLowerLeftX();
                    float lowerLeftY = handleBorderBox.getLowerLeftY();
                    float upperRightX = handleBorderBox.getUpperRightX();
                    float upperRightY = handleBorderBox.getUpperRightY();
                    float width = (handleBorderBox.getWidth() / 2.0f) + lowerLeftX;
                    float height = (handleBorderBox.getHeight() / 2.0f) + lowerLeftY;
                    float height2 = (handleBorderBox.getHeight() / 2.0f) * 0.55555415f;
                    float width2 = (handleBorderBox.getWidth() / 2.0f) * 0.55555415f;
                    pDAppearanceContentStream.moveTo(width, upperRightY);
                    float f10 = width + width2;
                    float f11 = height + height2;
                    pDAppearanceContentStream.curveTo(f10, upperRightY, upperRightX, f11, upperRightX, height);
                    float f12 = height - height2;
                    pDAppearanceContentStream.curveTo(upperRightX, f12, f10, lowerLeftY, width, lowerLeftY);
                    float f13 = width - width2;
                    pDAppearanceContentStream.curveTo(f13, lowerLeftY, lowerLeftX, f12, lowerLeftX, height);
                    pDAppearanceContentStream.curveTo(lowerLeftX, f11, f13, upperRightY, width, upperRightY);
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

    public PDCircleAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
