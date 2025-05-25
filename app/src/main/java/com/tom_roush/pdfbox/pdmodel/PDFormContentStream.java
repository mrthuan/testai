package com.tom_roush.pdfbox.pdmodel;

import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDInlineImage;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.util.Matrix;

/* loaded from: classes2.dex */
public final class PDFormContentStream extends PDAbstractContentStream {
    public PDFormContentStream(PDFormXObject pDFormXObject) {
        super(null, pDFormXObject.getContentStream().createOutputStream(), pDFormXObject.getResources());
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void addComment(String str) {
        super.addComment(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void addRect(float f10, float f11, float f12, float f13) {
        super.addRect(f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void beginMarkedContent(COSName cOSName) {
        super.beginMarkedContent(cOSName);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void beginText() {
        super.beginText();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void clip() {
        super.clip();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void clipEvenOdd() {
        super.clipEvenOdd();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void closeAndFillAndStroke() {
        super.closeAndFillAndStroke();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void closeAndFillAndStrokeEvenOdd() {
        super.closeAndFillAndStrokeEvenOdd();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void closeAndStroke() {
        super.closeAndStroke();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void closePath() {
        super.closePath();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        super.curveTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void curveTo1(float f10, float f11, float f12, float f13) {
        super.curveTo1(f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void curveTo2(float f10, float f11, float f12, float f13) {
        super.curveTo2(f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawForm(PDFormXObject pDFormXObject) {
        super.drawForm(pDFormXObject);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawImage(PDImageXObject pDImageXObject, float f10, float f11) {
        super.drawImage(pDImageXObject, f10, f11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void endMarkedContent() {
        super.endMarkedContent();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void endText() {
        super.endText();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void fill() {
        super.fill();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void fillAndStroke() {
        super.fillAndStroke();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void fillAndStrokeEvenOdd() {
        super.fillAndStrokeEvenOdd();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void fillEvenOdd() {
        super.fillEvenOdd();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void lineTo(float f10, float f11) {
        super.lineTo(f10, f11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void moveTo(float f10, float f11) {
        super.moveTo(f10, f11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void newLine() {
        super.newLine();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void newLineAtOffset(float f10, float f11) {
        super.newLineAtOffset(f10, f11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void restoreGraphicsState() {
        super.restoreGraphicsState();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void saveGraphicsState() {
        super.saveGraphicsState();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setCharacterSpacing(float f10) {
        super.setCharacterSpacing(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setFont(PDFont pDFont, float f10) {
        super.setFont(pDFont, f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setGraphicsStateParameters(PDExtendedGraphicsState pDExtendedGraphicsState) {
        super.setGraphicsStateParameters(pDExtendedGraphicsState);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setHorizontalScaling(float f10) {
        super.setHorizontalScaling(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setLeading(float f10) {
        super.setLeading(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setLineCapStyle(int i10) {
        super.setLineCapStyle(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setLineDashPattern(float[] fArr, float f10) {
        super.setLineDashPattern(fArr, f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setLineJoinStyle(int i10) {
        super.setLineJoinStyle(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setLineWidth(float f10) {
        super.setLineWidth(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setMiterLimit(float f10) {
        super.setMiterLimit(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(float f10) {
        super.setNonStrokingColor(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setRenderingMode(RenderingMode renderingMode) {
        super.setRenderingMode(renderingMode);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setStrokingColor(float f10) {
        super.setStrokingColor(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setTextMatrix(Matrix matrix) {
        super.setTextMatrix(matrix);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setTextRise(float f10) {
        super.setTextRise(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setWordSpacing(float f10) {
        super.setWordSpacing(f10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void shadingFill(PDShading pDShading) {
        super.shadingFill(pDShading);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void showText(String str) {
        super.showText(str);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void showTextWithPositioning(Object[] objArr) {
        super.showTextWithPositioning(objArr);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void stroke() {
        super.stroke();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void transform(Matrix matrix) {
        super.transform(matrix);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void beginMarkedContent(COSName cOSName, PDPropertyList pDPropertyList) {
        super.beginMarkedContent(cOSName, pDPropertyList);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawImage(PDImageXObject pDImageXObject, float f10, float f11, float f12, float f13) {
        super.drawImage(pDImageXObject, f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(float f10, float f11, float f12) {
        super.setNonStrokingColor(f10, f11, f12);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setStrokingColor(float f10, float f11, float f12) {
        super.setStrokingColor(f10, f11, f12);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawImage(PDImageXObject pDImageXObject, Matrix matrix) {
        super.drawImage(pDImageXObject, matrix);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(float f10, float f11, float f12, float f13) {
        super.setNonStrokingColor(f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setStrokingColor(float f10, float f11, float f12, float f13) {
        super.setStrokingColor(f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawImage(PDInlineImage pDInlineImage, float f10, float f11) {
        super.drawImage(pDInlineImage, f10, f11);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(int i10) {
        super.setNonStrokingColor(i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    @Deprecated
    public /* bridge */ /* synthetic */ void setStrokingColor(int i10, int i11, int i12) {
        super.setStrokingColor(i10, i11, i12);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void drawImage(PDInlineImage pDInlineImage, float f10, float f11, float f12, float f13) {
        super.drawImage(pDInlineImage, f10, f11, f12, f13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    @Deprecated
    public /* bridge */ /* synthetic */ void setNonStrokingColor(int i10, int i11, int i12) {
        super.setNonStrokingColor(i10, i11, i12);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setStrokingColor(AWTColor aWTColor) {
        super.setStrokingColor(aWTColor);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(int i10, int i11, int i12, int i13) {
        super.setNonStrokingColor(i10, i11, i12, i13);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setStrokingColor(PDColor pDColor) {
        super.setStrokingColor(pDColor);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(AWTColor aWTColor) {
        super.setNonStrokingColor(aWTColor);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.PDAbstractContentStream
    public /* bridge */ /* synthetic */ void setNonStrokingColor(PDColor pDColor) {
        super.setNonStrokingColor(pDColor);
    }
}
