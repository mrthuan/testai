package com.tom_roush.pdfbox.text;

import com.tom_roush.fontbox.ttf.TrueTypeFont;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.android.PDFBoxResourceLoader;
import com.tom_roush.pdfbox.contentstream.PDFStreamEngine;
import com.tom_roush.pdfbox.contentstream.operator.DrawObject;
import com.tom_roush.pdfbox.contentstream.operator.state.Concatenate;
import com.tom_roush.pdfbox.contentstream.operator.state.Restore;
import com.tom_roush.pdfbox.contentstream.operator.state.Save;
import com.tom_roush.pdfbox.contentstream.operator.state.SetGraphicsStateParameters;
import com.tom_roush.pdfbox.contentstream.operator.state.SetMatrix;
import com.tom_roush.pdfbox.contentstream.operator.text.BeginText;
import com.tom_roush.pdfbox.contentstream.operator.text.EndText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveText;
import com.tom_roush.pdfbox.contentstream.operator.text.MoveTextSetLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.NextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.SetCharSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.SetFontAndSize;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextHorizontalScaling;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextLeading;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRenderingMode;
import com.tom_roush.pdfbox.contentstream.operator.text.SetTextRise;
import com.tom_roush.pdfbox.contentstream.operator.text.SetWordSpacing;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowText;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextAdjusted;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLine;
import com.tom_roush.pdfbox.contentstream.operator.text.ShowTextLineAndSpace;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDCIDFontType2;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDFontDescriptor;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import com.tom_roush.pdfbox.pdmodel.font.PDTrueTypeFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType0Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class LegacyPDFStreamEngine extends PDFStreamEngine {
    private final Map<COSDictionary, Float> fontHeightMap = new WeakHashMap();
    private final GlyphList glyphList;
    private int pageRotation;
    private PDRectangle pageSize;
    private Matrix translateMatrix;

    public LegacyPDFStreamEngine() {
        InputStream resourceAsStream;
        addOperator(new BeginText());
        addOperator(new Concatenate());
        addOperator(new DrawObject());
        addOperator(new EndText());
        addOperator(new SetGraphicsStateParameters());
        addOperator(new Save());
        addOperator(new Restore());
        addOperator(new NextLine());
        addOperator(new SetCharSpacing());
        addOperator(new MoveText());
        addOperator(new MoveTextSetLeading());
        addOperator(new SetFontAndSize());
        addOperator(new ShowText());
        addOperator(new ShowTextAdjusted());
        addOperator(new SetTextLeading());
        addOperator(new SetMatrix());
        addOperator(new SetTextRenderingMode());
        addOperator(new SetTextRise());
        addOperator(new SetWordSpacing());
        addOperator(new SetTextHorizontalScaling());
        addOperator(new ShowTextLine());
        addOperator(new ShowTextLineAndSpace());
        if (PDFBoxResourceLoader.isReady()) {
            resourceAsStream = PDFBoxResourceLoader.getStream("com/tom_roush/pdfbox/resources/glyphlist/additional.txt");
        } else {
            resourceAsStream = GlyphList.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/glyphlist/additional.txt");
        }
        this.glyphList = new GlyphList(GlyphList.getAdobeGlyphList(), resourceAsStream);
    }

    public float computeFontHeight(PDFont pDFont) {
        BoundingBox boundingBox = pDFont.getBoundingBox();
        if (boundingBox.getLowerLeftY() < -32768.0f) {
            boundingBox.setLowerLeftY(-(boundingBox.getLowerLeftY() + 65536.0f));
        }
        float height = boundingBox.getHeight() / 2.0f;
        PDFontDescriptor fontDescriptor = pDFont.getFontDescriptor();
        if (fontDescriptor != null) {
            float capHeight = fontDescriptor.getCapHeight();
            if (Float.compare(capHeight, 0.0f) != 0 && (capHeight < height || Float.compare(height, 0.0f) == 0)) {
                height = capHeight;
            }
            float ascent = fontDescriptor.getAscent();
            float descent = fontDescriptor.getDescent();
            if (capHeight > ascent && ascent > 0.0f && descent < 0.0f) {
                float f10 = (ascent - descent) / 2.0f;
                if (f10 < height || Float.compare(height, 0.0f) == 0) {
                    height = f10;
                }
            }
        }
        if (pDFont instanceof PDType3Font) {
            return pDFont.getFontMatrix().transformPoint(0.0f, height).y;
        }
        return height / 1000.0f;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void processPage(PDPage pDPage) {
        this.pageRotation = pDPage.getRotation();
        PDRectangle cropBox = pDPage.getCropBox();
        this.pageSize = cropBox;
        if (cropBox.getLowerLeftX() == 0.0f && this.pageSize.getLowerLeftY() == 0.0f) {
            this.translateMatrix = null;
        } else {
            this.translateMatrix = Matrix.getTranslateInstance(-this.pageSize.getLowerLeftX(), -this.pageSize.getLowerLeftY());
        }
        super.processPage(pDPage);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDFStreamEngine
    public void showGlyph(Matrix matrix, PDFont pDFont, int i10, String str, Vector vector) {
        float f10;
        float f11;
        String str2;
        Matrix concatenate;
        TrueTypeFont trueTypeFont;
        PDGraphicsState graphicsState = getGraphicsState();
        Matrix currentTransformationMatrix = graphicsState.getCurrentTransformationMatrix();
        float fontSize = graphicsState.getTextState().getFontSize();
        float horizontalScaling = graphicsState.getTextState().getHorizontalScaling() / 100.0f;
        Matrix textMatrix = getTextMatrix();
        float x4 = vector.getX();
        if (pDFont.isVertical()) {
            x4 = pDFont.getWidth(i10) / 1000.0f;
            if (pDFont instanceof PDTrueTypeFont) {
                trueTypeFont = ((PDTrueTypeFont) pDFont).getTrueTypeFont();
            } else {
                if (pDFont instanceof PDType0Font) {
                    PDCIDFont descendantFont = ((PDType0Font) pDFont).getDescendantFont();
                    if (descendantFont instanceof PDCIDFontType2) {
                        trueTypeFont = ((PDCIDFontType2) descendantFont).getTrueTypeFont();
                    }
                }
                trueTypeFont = null;
            }
            if (trueTypeFont != null && trueTypeFont.getUnitsPerEm() != 1000) {
                x4 *= 1000.0f / trueTypeFont.getUnitsPerEm();
            }
        }
        Matrix multiply = Matrix.getTranslateInstance(x4 * fontSize * horizontalScaling, vector.getY() * fontSize).multiply(textMatrix).multiply(currentTransformationMatrix);
        float translateX = multiply.getTranslateX();
        float translateY = multiply.getTranslateY();
        float translateX2 = translateX - matrix.getTranslateX();
        Float f12 = this.fontHeightMap.get(pDFont.getCOSObject());
        if (f12 == null) {
            f12 = Float.valueOf(computeFontHeight(pDFont));
            this.fontHeightMap.put(pDFont.getCOSObject(), f12);
        }
        float scalingFactorY = matrix.getScalingFactorY() * f12.floatValue();
        if (pDFont instanceof PDType3Font) {
            f10 = pDFont.getFontMatrix().getScaleX();
        } else {
            f10 = 0.001f;
        }
        float f13 = f10;
        try {
            f11 = pDFont.getSpaceWidth() * f13;
        } catch (Throwable th2) {
            th2.getMessage();
            f11 = 0.0f;
        }
        if (f11 == 0.0f) {
            f11 = pDFont.getAverageFontWidth() * f13 * 0.8f;
        }
        if (f11 == 0.0f) {
            f11 = 1.0f;
        }
        float scalingFactorX = matrix.getScalingFactorX() * f11;
        String unicode = pDFont.toUnicode(i10, this.glyphList);
        if (unicode == null) {
            if (pDFont instanceof PDSimpleFont) {
                str2 = new String(new char[]{(char) i10});
            } else {
                return;
            }
        } else {
            str2 = unicode;
        }
        Matrix matrix2 = this.translateMatrix;
        if (matrix2 == null) {
            concatenate = matrix;
        } else {
            concatenate = Matrix.concatenate(matrix2, matrix);
            translateX -= this.pageSize.getLowerLeftX();
            translateY -= this.pageSize.getLowerLeftY();
        }
        processTextPosition(new TextPosition(this.pageRotation, this.pageSize.getWidth(), this.pageSize.getHeight(), concatenate, translateX, translateY, Math.abs(scalingFactorY), translateX2, Math.abs(scalingFactorX), str2, new int[]{i10}, pDFont, fontSize, (int) (textMatrix.getScalingFactorX() * fontSize)));
    }

    public void processTextPosition(TextPosition textPosition) {
    }
}
