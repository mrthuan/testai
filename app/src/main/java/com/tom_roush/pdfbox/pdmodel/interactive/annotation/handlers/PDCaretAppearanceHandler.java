package com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers;

import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDAppearanceContentStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PDCaretAppearanceHandler extends PDAbstractAppearanceHandler {
    public PDCaretAppearanceHandler(PDAnnotation pDAnnotation) {
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
        PDAnnotationMarkup pDAnnotationMarkup = (PDAnnotationMarkup) getAnnotation();
        PDAppearanceContentStream pDAppearanceContentStream = null;
        try {
            try {
                pDAppearanceContentStream = getNormalAppearanceAsContentStream();
                pDAppearanceContentStream.setStrokingColor(getColor());
                pDAppearanceContentStream.setNonStrokingColor(getColor());
                setOpacity(pDAppearanceContentStream, pDAnnotationMarkup.getConstantOpacity());
                PDRectangle rectangle = getRectangle();
                PDRectangle pDRectangle = new PDRectangle(rectangle.getWidth(), rectangle.getHeight());
                if (!pDAnnotationMarkup.getCOSObject().containsKey(COSName.RD)) {
                    float min = Math.min(rectangle.getHeight() / 10.0f, 5.0f);
                    pDAnnotationMarkup.setRectDifferences(min);
                    float f10 = -min;
                    float f11 = min * 2.0f;
                    PDRectangle pDRectangle2 = new PDRectangle(f10, f10, rectangle.getWidth() + f11, rectangle.getHeight() + f11);
                    Matrix matrix = pDAnnotationMarkup.getNormalAppearanceStream().getMatrix();
                    matrix.transformPoint(min, min);
                    pDAnnotationMarkup.getNormalAppearanceStream().setMatrix(matrix.createAffineTransform());
                    pDAnnotationMarkup.setRectangle(new PDRectangle(rectangle.getLowerLeftX() - min, rectangle.getLowerLeftY() - min, rectangle.getWidth() + f11, rectangle.getHeight() + f11));
                    pDRectangle = pDRectangle2;
                }
                pDAnnotationMarkup.getNormalAppearanceStream().setBBox(pDRectangle);
                float width = rectangle.getWidth() / 2.0f;
                float height = rectangle.getHeight() / 2.0f;
                pDAppearanceContentStream.moveTo(0.0f, 0.0f);
                pDAppearanceContentStream.curveTo(width, 0.0f, width, height, width, rectangle.getHeight());
                pDAppearanceContentStream.curveTo(width, height, width, 0.0f, rectangle.getWidth(), 0.0f);
                pDAppearanceContentStream.closePath();
                pDAppearanceContentStream.fill();
            } catch (IOException e10) {
                e10.getMessage();
            }
        } finally {
            IOUtils.closeQuietly(pDAppearanceContentStream);
        }
    }

    public PDCaretAppearanceHandler(PDAnnotation pDAnnotation, PDDocument pDDocument) {
        super(pDAnnotation, pDDocument);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateDownAppearance() {
    }

    @Override // com.tom_roush.pdfbox.pdmodel.interactive.annotation.handlers.PDAppearanceHandler
    public void generateRolloverAppearance() {
    }
}
