package com.tom_roush.pdfbox.pdmodel;

import android.graphics.Path;
import b.a;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.PDXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDInlineImage;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.NumberFormatUtil;
import java.io.Closeable;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class PDPageContentStream implements Closeable {
    private final PDDocument document;
    private final Stack<PDFont> fontStack;
    private final byte[] formatBuffer;
    private final NumberFormat formatDecimal;
    private boolean inTextMode;
    private final Stack<PDColorSpace> nonStrokingColorSpaceStack;
    private OutputStream output;
    private PDResources resources;
    private boolean sourcePageHadContents;
    private final Stack<PDColorSpace> strokingColorSpaceStack;

    /* loaded from: classes2.dex */
    public enum AppendMode {
        OVERWRITE,
        APPEND,
        PREPEND;

        public boolean isOverwrite() {
            if (this == OVERWRITE) {
                return true;
            }
            return false;
        }

        public boolean isPrepend() {
            if (this == PREPEND) {
                return true;
            }
            return false;
        }
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage) {
        this(pDDocument, pDPage, AppendMode.OVERWRITE, true, false);
    }

    private COSName getName(PDColorSpace pDColorSpace) {
        if (!(pDColorSpace instanceof PDDeviceGray) && !(pDColorSpace instanceof PDDeviceRGB)) {
            return this.resources.add(pDColorSpace);
        }
        return COSName.getPDFName(pDColorSpace.getName());
    }

    private boolean isOutside255Interval(int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return false;
        }
        return true;
    }

    private boolean isOutsideOneInterval(double d10) {
        if (d10 >= 0.0d && d10 <= 1.0d) {
            return false;
        }
        return true;
    }

    private void setNonStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.nonStrokingColorSpaceStack.isEmpty()) {
            this.nonStrokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        Stack<PDColorSpace> stack = this.nonStrokingColorSpaceStack;
        stack.setElementAt(pDColorSpace, stack.size() - 1);
    }

    private void setStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.strokingColorSpaceStack.isEmpty()) {
            this.strokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        Stack<PDColorSpace> stack = this.strokingColorSpaceStack;
        stack.setElementAt(pDColorSpace, stack.size() - 1);
    }

    private void write(String str) {
        this.output.write(str.getBytes(Charsets.US_ASCII));
    }

    private void writeAffineTransform(AffineTransform affineTransform) {
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i10 = 0; i10 < 6; i10++) {
            writeOperand((float) dArr[i10]);
        }
    }

    private void writeBytes(byte[] bArr) {
        this.output.write(bArr);
    }

    private void writeLine() {
        this.output.write(10);
    }

    private void writeOperator(String str) {
        this.output.write(str.getBytes(Charsets.US_ASCII));
        this.output.write(10);
    }

    @Deprecated
    public void addBezier31(float f10, float f11, float f12, float f13) {
        curveTo1(f10, f11, f12, f13);
    }

    @Deprecated
    public void addBezier312(float f10, float f11, float f12, float f13, float f14, float f15) {
        curveTo(f10, f11, f12, f13, f14, f15);
    }

    @Deprecated
    public void addBezier32(float f10, float f11, float f12, float f13) {
        curveTo2(f10, f11, f12, f13);
    }

    public void addComment(String str) {
        if (str.indexOf(10) < 0 && str.indexOf(13) < 0) {
            this.output.write(37);
            this.output.write(str.getBytes(Charsets.US_ASCII));
            this.output.write(10);
            return;
        }
        throw new IllegalArgumentException("comment should not include a newline");
    }

    @Deprecated
    public void addLine(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            moveTo(f10, f11);
            lineTo(f12, f13);
            return;
        }
        throw new IllegalStateException("Error: addLine is not allowed within a text block.");
    }

    @Deprecated
    public void addPolygon(float[] fArr, float[] fArr2) {
        if (!this.inTextMode) {
            if (fArr.length == fArr2.length) {
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    if (i10 == 0) {
                        moveTo(fArr[i10], fArr2[i10]);
                    } else {
                        lineTo(fArr[i10], fArr2[i10]);
                    }
                }
                closeSubPath();
                return;
            }
            throw new IllegalArgumentException("Error: some points are missing coordinate");
        }
        throw new IllegalStateException("Error: addPolygon is not allowed within a text block.");
    }

    public void addRect(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperator(OperatorName.APPEND_RECT);
            return;
        }
        throw new IllegalStateException("Error: addRect is not allowed within a text block.");
    }

    @Deprecated
    public void appendCOSName(COSName cOSName) {
        cOSName.writePDF(this.output);
    }

    @Deprecated
    public void appendRawCommands(String str) {
        this.output.write(str.getBytes(Charsets.US_ASCII));
    }

    public void beginMarkedContent(COSName cOSName) {
        writeOperand(cOSName);
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT);
    }

    @Deprecated
    public void beginMarkedContentSequence(COSName cOSName) {
        beginMarkedContent(cOSName);
    }

    public void beginText() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.BEGIN_TEXT);
            this.inTextMode = true;
            return;
        }
        throw new IllegalStateException("Error: Nested beginText() calls are not allowed.");
    }

    public void clip() {
        if (!this.inTextMode) {
            writeOperator("W");
            writeOperator("n");
            return;
        }
        throw new IllegalStateException("Error: clip is not allowed within a text block.");
    }

    public void clipEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLIP_EVEN_ODD);
            writeOperator("n");
            return;
        }
        throw new IllegalStateException("Error: clipEvenOdd is not allowed within a text block.");
    }

    @Deprecated
    public void clipPath(Path.FillType fillType) {
        if (!this.inTextMode) {
            if (fillType == Path.FillType.WINDING) {
                writeOperator("W");
            } else if (fillType == Path.FillType.EVEN_ODD) {
                writeOperator(OperatorName.CLIP_EVEN_ODD);
            } else {
                throw new IllegalArgumentException("Error: unknown value for winding rule");
            }
            writeOperator("n");
            return;
        }
        throw new IllegalStateException("Error: clipPath is not allowed within a text block.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OutputStream outputStream = this.output;
        if (outputStream != null) {
            outputStream.close();
            this.output = null;
        }
    }

    public void closeAndFillAndStroke() {
        if (!this.inTextMode) {
            writeOperator("b");
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStroke is not allowed within a text block.");
    }

    public void closeAndFillAndStrokeEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.CLOSE_FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: closeAndFillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void closeAndStroke() {
        if (!this.inTextMode) {
            writeOperator("s");
            return;
        }
        throw new IllegalStateException("Error: closeAndStroke is not allowed within a text block.");
    }

    public void closePath() {
        if (!this.inTextMode) {
            writeOperator("h");
            return;
        }
        throw new IllegalStateException("Error: closePath is not allowed within a text block.");
    }

    @Deprecated
    public void closeSubPath() {
        closePath();
    }

    @Deprecated
    public void concatenate2CTM(double d10, double d11, double d12, double d13, double d14, double d15) {
        transform(new Matrix((float) d10, (float) d11, (float) d12, (float) d13, (float) d14, (float) d15));
    }

    public void curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperand(f14);
            writeOperand(f15);
            writeOperator("c");
            return;
        }
        throw new IllegalStateException("Error: curveTo is not allowed within a text block.");
    }

    public void curveTo1(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperator(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo1 is not allowed within a text block.");
    }

    public void curveTo2(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperator(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);
            return;
        }
        throw new IllegalStateException("Error: curveTo2 is not allowed within a text block.");
    }

    public void drawForm(PDFormXObject pDFormXObject) {
        if (!this.inTextMode) {
            writeOperand(this.resources.add(pDFormXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            return;
        }
        throw new IllegalStateException("Error: drawForm is not allowed within a text block.");
    }

    public void drawImage(PDImageXObject pDImageXObject, float f10, float f11) {
        drawImage(pDImageXObject, f10, f11, pDImageXObject.getWidth(), pDImageXObject.getHeight());
    }

    @Deprecated
    public void drawInlineImage(PDInlineImage pDInlineImage, float f10, float f11) {
        drawImage(pDInlineImage, f10, f11, pDInlineImage.getWidth(), pDInlineImage.getHeight());
    }

    @Deprecated
    public void drawLine(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            moveTo(f10, f11);
            lineTo(f12, f13);
            stroke();
            return;
        }
        throw new IllegalStateException("Error: drawLine is not allowed within a text block.");
    }

    @Deprecated
    public void drawPolygon(float[] fArr, float[] fArr2) {
        if (!this.inTextMode) {
            addPolygon(fArr, fArr2);
            stroke();
            return;
        }
        throw new IllegalStateException("Error: drawPolygon is not allowed within a text block.");
    }

    @Deprecated
    public void drawString(String str) {
        showText(str);
    }

    @Deprecated
    public void drawXObject(PDXObject pDXObject, float f10, float f11, float f12, float f13) {
        drawXObject(pDXObject, new AffineTransform(f12, 0.0f, 0.0f, f13, f10, f11));
    }

    public void endMarkedContent() {
        writeOperator(OperatorName.END_MARKED_CONTENT);
    }

    @Deprecated
    public void endMarkedContentSequence() {
        endMarkedContent();
    }

    public void endText() {
        if (this.inTextMode) {
            writeOperator(OperatorName.END_TEXT);
            this.inTextMode = false;
            return;
        }
        throw new IllegalStateException("Error: You must call beginText() before calling endText.");
    }

    @Deprecated
    public void fill(Path.FillType fillType) {
        if (fillType == Path.FillType.WINDING) {
            fill();
        } else if (fillType == Path.FillType.EVEN_ODD) {
            fillEvenOdd();
        } else {
            throw new IllegalArgumentException("Error: unknown value for winding rule");
        }
    }

    public void fillAndStroke() {
        if (!this.inTextMode) {
            writeOperator("B");
            return;
        }
        throw new IllegalStateException("Error: fillAndStroke is not allowed within a text block.");
    }

    public void fillAndStrokeEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.FILL_EVEN_ODD_AND_STROKE);
            return;
        }
        throw new IllegalStateException("Error: fillAndStrokeEvenOdd is not allowed within a text block.");
    }

    public void fillEvenOdd() {
        if (!this.inTextMode) {
            writeOperator(OperatorName.FILL_EVEN_ODD);
            return;
        }
        throw new IllegalStateException("Error: fillEvenOdd is not allowed within a text block.");
    }

    @Deprecated
    public void fillPolygon(float[] fArr, float[] fArr2) {
        if (!this.inTextMode) {
            addPolygon(fArr, fArr2);
            fill();
            return;
        }
        throw new IllegalStateException("Error: fillPolygon is not allowed within a text block.");
    }

    @Deprecated
    public void fillRect(float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            addRect(f10, f11, f12, f13);
            fill();
            return;
        }
        throw new IllegalStateException("Error: fillRect is not allowed within a text block.");
    }

    public void lineTo(float f10, float f11) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperator(OperatorName.LINE_TO);
            return;
        }
        throw new IllegalStateException("Error: lineTo is not allowed within a text block.");
    }

    @Deprecated
    public void moveTextPositionByAmount(float f10, float f11) {
        newLineAtOffset(f10, f11);
    }

    public void moveTo(float f10, float f11) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperator("m");
            return;
        }
        throw new IllegalStateException("Error: moveTo is not allowed within a text block.");
    }

    public void newLine() {
        if (this.inTextMode) {
            writeOperator(OperatorName.NEXT_LINE);
            return;
        }
        throw new IllegalStateException("Must call beginText() before newLine()");
    }

    public void newLineAtOffset(float f10, float f11) {
        if (this.inTextMode) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperator(OperatorName.MOVE_TEXT);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before newLineAtOffset()");
    }

    public void restoreGraphicsState() {
        if (!this.fontStack.isEmpty()) {
            this.fontStack.pop();
        }
        if (!this.strokingColorSpaceStack.isEmpty()) {
            this.strokingColorSpaceStack.pop();
        }
        if (!this.nonStrokingColorSpaceStack.isEmpty()) {
            this.nonStrokingColorSpaceStack.pop();
        }
        writeOperator(OperatorName.RESTORE);
    }

    public void saveGraphicsState() {
        if (!this.fontStack.isEmpty()) {
            Stack<PDFont> stack = this.fontStack;
            stack.push(stack.peek());
        }
        if (!this.strokingColorSpaceStack.isEmpty()) {
            Stack<PDColorSpace> stack2 = this.strokingColorSpaceStack;
            stack2.push(stack2.peek());
        }
        if (!this.nonStrokingColorSpaceStack.isEmpty()) {
            Stack<PDColorSpace> stack3 = this.nonStrokingColorSpaceStack;
            stack3.push(stack3.peek());
        }
        writeOperator(OperatorName.SAVE);
    }

    public void setCharacterSpacing(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_CHAR_SPACING);
    }

    public void setFont(PDFont pDFont, float f10) {
        if (this.fontStack.isEmpty()) {
            this.fontStack.add(pDFont);
        } else {
            Stack<PDFont> stack = this.fontStack;
            stack.setElementAt(pDFont, stack.size() - 1);
        }
        if (pDFont.willBeSubset()) {
            this.document.getFontsToSubset().add(pDFont);
        }
        writeOperand(this.resources.add(pDFont));
        writeOperand(f10);
        writeOperator(OperatorName.SET_FONT_AND_SIZE);
    }

    public void setGraphicsStateParameters(PDExtendedGraphicsState pDExtendedGraphicsState) {
        writeOperand(this.resources.add(pDExtendedGraphicsState));
        writeOperator(OperatorName.SET_GRAPHICS_STATE_PARAMS);
    }

    public void setHorizontalScaling(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_TEXT_HORIZONTAL_SCALING);
    }

    @Deprecated
    public void setLeading(double d10) {
        setLeading((float) d10);
    }

    public void setLineCapStyle(int i10) {
        if (!this.inTextMode) {
            if (i10 >= 0 && i10 <= 2) {
                writeOperand(i10);
                writeOperator(OperatorName.SET_LINE_CAPSTYLE);
                return;
            }
            throw new IllegalArgumentException("Error: unknown value for line cap style");
        }
        throw new IllegalStateException("Error: setLineCapStyle is not allowed within a text block.");
    }

    public void setLineDashPattern(float[] fArr, float f10) {
        if (!this.inTextMode) {
            write("[");
            for (float f11 : fArr) {
                writeOperand(f11);
            }
            write("] ");
            writeOperand(f10);
            writeOperator("d");
            return;
        }
        throw new IllegalStateException("Error: setLineDashPattern is not allowed within a text block.");
    }

    public void setLineJoinStyle(int i10) {
        if (!this.inTextMode) {
            if (i10 >= 0 && i10 <= 2) {
                writeOperand(i10);
                writeOperator(OperatorName.SET_LINE_JOINSTYLE);
                return;
            }
            throw new IllegalArgumentException("Error: unknown value for line join style");
        }
        throw new IllegalStateException("Error: setLineJoinStyle is not allowed within a text block.");
    }

    public void setLineWidth(float f10) {
        if (!this.inTextMode) {
            writeOperand(f10);
            writeOperator(OperatorName.SET_LINE_WIDTH);
            return;
        }
        throw new IllegalStateException("Error: setLineWidth is not allowed within a text block.");
    }

    public void setMiterLimit(float f10) {
        if (!this.inTextMode) {
            if (f10 > 0.0d) {
                writeOperand(f10);
                writeOperator(OperatorName.SET_LINE_MITERLIMIT);
                return;
            }
            throw new IllegalArgumentException("A miter limit <= 0 is invalid and will not render in Acrobat Reader");
        }
        throw new IllegalStateException("Error: setMiterLimit is not allowed within a text block.");
    }

    public void setNonStrokingColor(PDColor pDColor) {
        if (this.nonStrokingColorSpaceStack.isEmpty() || this.nonStrokingColorSpaceStack.peek() != pDColor.getColorSpace()) {
            writeOperand(getName(pDColor.getColorSpace()));
            writeOperator(OperatorName.NON_STROKING_COLORSPACE);
            setNonStrokingColorSpaceStack(pDColor.getColorSpace());
        }
        for (float f10 : pDColor.getComponents()) {
            writeOperand(f10);
        }
        writeOperator(OperatorName.NON_STROKING_COLOR);
    }

    @Deprecated
    public void setNonStrokingColorSpace(PDColorSpace pDColorSpace) {
        setNonStrokingColorSpaceStack(pDColorSpace);
        writeOperand(getName(pDColorSpace));
        writeOperator(OperatorName.NON_STROKING_COLORSPACE);
    }

    public void setRenderingMode(RenderingMode renderingMode) {
        writeOperand(renderingMode.intValue());
        writeOperator(OperatorName.SET_TEXT_RENDERINGMODE);
    }

    public void setStrokingColor(PDColor pDColor) {
        if (this.strokingColorSpaceStack.isEmpty() || this.strokingColorSpaceStack.peek() != pDColor.getColorSpace()) {
            writeOperand(getName(pDColor.getColorSpace()));
            writeOperator(OperatorName.STROKING_COLORSPACE);
            setStrokingColorSpaceStack(pDColor.getColorSpace());
        }
        for (float f10 : pDColor.getComponents()) {
            writeOperand(f10);
        }
        writeOperator(OperatorName.STROKING_COLOR);
    }

    @Deprecated
    public void setStrokingColorSpace(PDColorSpace pDColorSpace) {
        setStrokingColorSpaceStack(pDColorSpace);
        writeOperand(getName(pDColorSpace));
        writeOperator(OperatorName.STROKING_COLORSPACE);
    }

    @Deprecated
    public void setTextMatrix(double d10, double d11, double d12, double d13, double d14, double d15) {
        setTextMatrix(new Matrix((float) d10, (float) d11, (float) d12, (float) d13, (float) d14, (float) d15));
    }

    public void setTextRise(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_TEXT_RISE);
    }

    @Deprecated
    public void setTextRotation(double d10, double d11, double d12) {
        setTextMatrix(Matrix.getRotateInstance(d10, (float) d11, (float) d12));
    }

    @Deprecated
    public void setTextScaling(double d10, double d11, double d12, double d13) {
        setTextMatrix(new Matrix((float) d10, 0.0f, 0.0f, (float) d11, (float) d12, (float) d13));
    }

    @Deprecated
    public void setTextTranslation(double d10, double d11) {
        setTextMatrix(Matrix.getTranslateInstance((float) d10, (float) d11));
    }

    public void setWordSpacing(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_WORD_SPACING);
    }

    public void shadingFill(PDShading pDShading) {
        if (!this.inTextMode) {
            writeOperand(this.resources.add(pDShading));
            writeOperator(OperatorName.SHADING_FILL);
            return;
        }
        throw new IllegalStateException("Error: shadingFill is not allowed within a text block.");
    }

    public void showText(String str) {
        showTextInternal(str);
        write(" ");
        writeOperator(OperatorName.SHOW_TEXT);
    }

    public void showTextInternal(String str) {
        if (this.inTextMode) {
            if (!this.fontStack.isEmpty()) {
                PDFont peek = this.fontStack.peek();
                if (peek.willBeSubset()) {
                    int i10 = 0;
                    while (i10 < str.length()) {
                        int codePointAt = str.codePointAt(i10);
                        peek.addToSubset(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    }
                }
                COSWriter.writeString(peek.encode(str), this.output);
                return;
            }
            throw new IllegalStateException("Must call setFont() before showText()");
        }
        throw new IllegalStateException("Must call beginText() before showText()");
    }

    public void showTextWithPositioning(Object[] objArr) {
        write("[");
        for (Object obj : objArr) {
            if (obj instanceof String) {
                showTextInternal((String) obj);
            } else if (obj instanceof Float) {
                writeOperand(((Float) obj).floatValue());
            } else {
                throw new IllegalArgumentException("Argument must consist of array of Float and String types");
            }
        }
        write("] ");
        writeOperator(OperatorName.SHOW_TEXT_ADJUSTED);
    }

    public void stroke() {
        if (!this.inTextMode) {
            writeOperator("S");
            return;
        }
        throw new IllegalStateException("Error: stroke is not allowed within a text block.");
    }

    public void transform(Matrix matrix) {
        writeAffineTransform(matrix.createAffineTransform());
        writeOperator(OperatorName.CONCAT);
    }

    public void writeOperand(float f10) {
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            int formatFloatFast = NumberFormatUtil.formatFloatFast(f10, this.formatDecimal.getMaximumFractionDigits(), this.formatBuffer);
            if (formatFloatFast == -1) {
                write(this.formatDecimal.format(f10));
            } else {
                this.output.write(this.formatBuffer, 0, formatFloatFast);
            }
            this.output.write(32);
            return;
        }
        throw new IllegalArgumentException(f10 + " is not a finite number");
    }

    @Deprecated
    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, boolean z10, boolean z11) {
        this(pDDocument, pDPage, z10, z11, false);
    }

    @Deprecated
    public void appendRawCommands(byte[] bArr) {
        this.output.write(bArr);
    }

    @Deprecated
    public void beginMarkedContentSequence(COSName cOSName, COSName cOSName2) {
        writeOperand(cOSName);
        writeOperand(cOSName2);
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    @Deprecated
    public void concatenate2CTM(AffineTransform affineTransform) {
        transform(new Matrix(affineTransform));
    }

    public void drawImage(PDImageXObject pDImageXObject, float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            saveGraphicsState();
            transform(new Matrix(new AffineTransform(f12, 0.0f, 0.0f, f13, f10, f11)));
            writeOperand(this.resources.add(pDImageXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void drawInlineImage(PDInlineImage pDInlineImage, float f10, float f11, float f12, float f13) {
        drawImage(pDInlineImage, f10, f11, f12, f13);
    }

    public void setLeading(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_TEXT_LEADING);
    }

    @Deprecated
    public void setTextMatrix(AffineTransform affineTransform) {
        setTextMatrix(new Matrix(affineTransform));
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, AppendMode appendMode, boolean z10) {
        this(pDDocument, pDPage, appendMode, z10, false);
    }

    @Deprecated
    public void appendRawCommands(int i10) {
        this.output.write(i10);
    }

    public void beginMarkedContent(COSName cOSName, PDPropertyList pDPropertyList) {
        writeOperand(cOSName);
        writeOperand(this.resources.add(pDPropertyList));
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    @Deprecated
    public void drawXObject(PDXObject pDXObject, AffineTransform affineTransform) {
        if (!this.inTextMode) {
            COSName add = this.resources.add(pDXObject, pDXObject instanceof PDImageXObject ? "Im" : StandardStructureTypes.FORM);
            saveGraphicsState();
            transform(new Matrix(affineTransform));
            writeOperand(add);
            writeOperator(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawXObject is not allowed within a text block.");
    }

    public void setTextMatrix(Matrix matrix) {
        if (this.inTextMode) {
            writeAffineTransform(matrix.createAffineTransform());
            writeOperator(OperatorName.SET_MATRIX);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before setTextMatrix");
    }

    @Deprecated
    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, boolean z10, boolean z11, boolean z12) {
        this(pDDocument, pDPage, z10 ? AppendMode.APPEND : AppendMode.OVERWRITE, z11, z12);
    }

    @Deprecated
    public void appendRawCommands(double d10) {
        this.output.write(this.formatDecimal.format(d10).getBytes(Charsets.US_ASCII));
    }

    public PDPageContentStream(PDDocument pDDocument, PDPage pDPage, AppendMode appendMode, boolean z10, boolean z11) {
        COSArray cOSArray;
        this.inTextMode = false;
        this.fontStack = new Stack<>();
        this.nonStrokingColorSpaceStack = new Stack<>();
        this.strokingColorSpaceStack = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.formatDecimal = numberInstance;
        this.formatBuffer = new byte[32];
        this.sourcePageHadContents = false;
        this.document = pDDocument;
        COSName cOSName = z10 ? COSName.FLATE_DECODE : null;
        if (!appendMode.isOverwrite() && pDPage.hasContents()) {
            PDStream pDStream = new PDStream(pDDocument);
            COSDictionary cOSObject = pDPage.getCOSObject();
            COSName cOSName2 = COSName.CONTENTS;
            COSBase dictionaryObject = cOSObject.getDictionaryObject(cOSName2);
            if (dictionaryObject instanceof COSArray) {
                cOSArray = (COSArray) dictionaryObject;
            } else {
                COSArray cOSArray2 = new COSArray();
                cOSArray2.add(dictionaryObject);
                cOSArray = cOSArray2;
            }
            if (appendMode.isPrepend()) {
                cOSArray.add(0, pDStream.getCOSObject());
            } else {
                cOSArray.add(pDStream);
            }
            if (z11) {
                PDStream pDStream2 = new PDStream(pDDocument);
                this.output = pDStream2.createOutputStream(cOSName);
                saveGraphicsState();
                close();
                cOSArray.add(0, pDStream2.getCOSObject());
            }
            pDPage.getCOSObject().setItem(cOSName2, (COSBase) cOSArray);
            this.output = pDStream.createOutputStream(cOSName);
            if (z11) {
                restoreGraphicsState();
            }
        } else {
            this.sourcePageHadContents = pDPage.hasContents();
            PDStream pDStream3 = new PDStream(pDDocument);
            pDPage.setContents(pDStream3);
            this.output = pDStream3.createOutputStream(cOSName);
        }
        PDResources resources = pDPage.getResources();
        this.resources = resources;
        if (resources == null) {
            PDResources pDResources = new PDResources();
            this.resources = pDResources;
            pDPage.setResources(pDResources);
        }
        numberInstance.setMaximumFractionDigits(5);
        numberInstance.setGroupingUsed(false);
    }

    @Deprecated
    public void appendRawCommands(float f10) {
        this.output.write(this.formatDecimal.format(f10).getBytes(Charsets.US_ASCII));
    }

    public void fill() {
        if (!this.inTextMode) {
            writeOperator("f");
            return;
        }
        throw new IllegalStateException("Error: fill is not allowed within a text block.");
    }

    private void writeOperand(int i10) {
        write(this.formatDecimal.format(i10));
        this.output.write(32);
    }

    private void writeOperand(COSName cOSName) {
        cOSName.writePDF(this.output);
        this.output.write(32);
    }

    public void setNonStrokingColor(AWTColor aWTColor) {
        setNonStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void setStrokingColor(AWTColor aWTColor) {
        setStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void drawImage(PDImageXObject pDImageXObject, Matrix matrix) {
        if (!this.inTextMode) {
            saveGraphicsState();
            transform(new Matrix(matrix.createAffineTransform()));
            writeOperand(this.resources.add(pDImageXObject));
            writeOperator(OperatorName.DRAW_OBJECT);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void setNonStrokingColor(float[] fArr) {
        if (!this.nonStrokingColorSpaceStack.isEmpty()) {
            for (float f10 : fArr) {
                writeOperand(f10);
            }
            this.nonStrokingColorSpaceStack.peek();
            writeOperator(OperatorName.NON_STROKING_COLOR);
            return;
        }
        throw new IllegalStateException("The color space must be set before setting a color");
    }

    @Deprecated
    public void setStrokingColor(float[] fArr) {
        if (!this.strokingColorSpaceStack.isEmpty()) {
            for (float f10 : fArr) {
                writeOperand(f10);
            }
            this.strokingColorSpaceStack.peek();
            writeOperator(OperatorName.STROKING_COLOR);
            return;
        }
        throw new IllegalStateException("The color space must be set before setting a color");
    }

    public void drawImage(PDInlineImage pDInlineImage, float f10, float f11) {
        drawImage(pDInlineImage, f10, f11, pDInlineImage.getWidth(), pDInlineImage.getHeight());
    }

    public void setNonStrokingColor(float f10, float f11, float f12) {
        if (!isOutsideOneInterval(f10) && !isOutsideOneInterval(f11) && !isOutsideOneInterval(f12)) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperator(OperatorName.NON_STROKING_RGB);
            setNonStrokingColorSpaceStack(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
    }

    public void setStrokingColor(float f10, float f11, float f12) {
        if (!isOutsideOneInterval(f10) && !isOutsideOneInterval(f11) && !isOutsideOneInterval(f12)) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperator(OperatorName.STROKING_COLOR_RGB);
            setStrokingColorSpaceStack(PDDeviceRGB.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12)));
    }

    public void drawImage(PDInlineImage pDInlineImage, float f10, float f11, float f12, float f13) {
        if (!this.inTextMode) {
            saveGraphicsState();
            transform(new Matrix(f12, 0.0f, 0.0f, f13, f10, f11));
            StringBuilder sb2 = new StringBuilder("BI\n /W ");
            sb2.append(pDInlineImage.getWidth());
            sb2.append("\n /H ");
            sb2.append(pDInlineImage.getHeight());
            sb2.append("\n /CS /");
            sb2.append(pDInlineImage.getColorSpace().getName());
            COSArray decode = pDInlineImage.getDecode();
            if (decode != null && decode.size() > 0) {
                sb2.append("\n /D [");
                Iterator<COSBase> it = decode.iterator();
                while (it.hasNext()) {
                    sb2.append(((COSNumber) it.next()).intValue());
                    sb2.append(" ");
                }
                sb2.append("]");
            }
            if (pDInlineImage.isStencil()) {
                sb2.append("\n /IM true");
            }
            sb2.append("\n /BPC ");
            sb2.append(pDInlineImage.getBitsPerComponent());
            write(sb2.toString());
            writeLine();
            writeOperator(OperatorName.BEGIN_INLINE_IMAGE_DATA);
            writeBytes(pDInlineImage.getData());
            writeLine();
            writeOperator(OperatorName.END_INLINE_IMAGE);
            restoreGraphicsState();
            return;
        }
        throw new IllegalStateException("Error: drawImage is not allowed within a text block.");
    }

    @Deprecated
    public void setNonStrokingColor(int i10, int i11, int i12) {
        if (!isOutside255Interval(i10) && !isOutside255Interval(i11) && !isOutside255Interval(i12)) {
            setNonStrokingColor(i10 / 255.0f, i11 / 255.0f, i12 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    @Deprecated
    public void setStrokingColor(int i10, int i11, int i12) {
        if (!isOutside255Interval(i10) && !isOutside255Interval(i11) && !isOutside255Interval(i12)) {
            setStrokingColor(i10 / 255.0f, i11 / 255.0f, i12 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public void setNonStrokingColor(int i10, int i11, int i12, int i13) {
        if (!isOutside255Interval(i10) && !isOutside255Interval(i11) && !isOutside255Interval(i12) && !isOutside255Interval(i13)) {
            setNonStrokingColor(i10 / 255.0f, i11 / 255.0f, i12 / 255.0f, i13 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d,%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    @Deprecated
    public void setStrokingColor(int i10, int i11, int i12, int i13) {
        if (!isOutside255Interval(i10) && !isOutside255Interval(i11) && !isOutside255Interval(i12) && !isOutside255Interval(i13)) {
            setStrokingColor(i10 / 255.0f, i11 / 255.0f, i12 / 255.0f, i13 / 255.0f);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..255, but are " + String.format("(%d,%d,%d,%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    @Deprecated
    public void setNonStrokingColor(double d10, double d11, double d12, double d13) {
        setNonStrokingColor((float) d10, (float) d11, (float) d12, (float) d13);
    }

    public void setStrokingColor(float f10, float f11, float f12, float f13) {
        if (!isOutsideOneInterval(f10) && !isOutsideOneInterval(f11) && !isOutsideOneInterval(f12) && !isOutsideOneInterval(f13)) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperator(OperatorName.STROKING_COLOR_CMYK);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public void setNonStrokingColor(float f10, float f11, float f12, float f13) {
        if (!isOutsideOneInterval(f10) && !isOutsideOneInterval(f11) && !isOutsideOneInterval(f12) && !isOutsideOneInterval(f13)) {
            writeOperand(f10);
            writeOperand(f11);
            writeOperand(f12);
            writeOperand(f13);
            writeOperator(OperatorName.NON_STROKING_CMYK);
            return;
        }
        throw new IllegalArgumentException("Parameters must be within 0..1, but are " + String.format("(%.2f,%.2f,%.2f,%.2f)", Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13)));
    }

    public PDPageContentStream(PDDocument pDDocument, PDAppearanceStream pDAppearanceStream) {
        this(pDDocument, pDAppearanceStream, pDAppearanceStream.getStream().createOutputStream());
    }

    @Deprecated
    public void setStrokingColor(int i10) {
        if (!isOutside255Interval(i10)) {
            setStrokingColor(i10 / 255.0f);
            return;
        }
        throw new IllegalArgumentException(a.c("Parameter must be within 0..255, but is ", i10));
    }

    public PDPageContentStream(PDDocument pDDocument, PDAppearanceStream pDAppearanceStream, OutputStream outputStream) {
        this.inTextMode = false;
        this.fontStack = new Stack<>();
        this.nonStrokingColorSpaceStack = new Stack<>();
        this.strokingColorSpaceStack = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.formatDecimal = numberInstance;
        this.formatBuffer = new byte[32];
        this.sourcePageHadContents = false;
        this.document = pDDocument;
        this.output = outputStream;
        this.resources = pDAppearanceStream.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    public void setNonStrokingColor(int i10) {
        if (!isOutside255Interval(i10)) {
            setNonStrokingColor(i10 / 255.0f);
            return;
        }
        throw new IllegalArgumentException(a.c("Parameter must be within 0..255, but is ", i10));
    }

    @Deprecated
    public void setStrokingColor(double d10) {
        setStrokingColor((float) d10);
    }

    public PDPageContentStream(PDDocument pDDocument, PDFormXObject pDFormXObject, OutputStream outputStream) {
        this.inTextMode = false;
        this.fontStack = new Stack<>();
        this.nonStrokingColorSpaceStack = new Stack<>();
        this.strokingColorSpaceStack = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.formatDecimal = numberInstance;
        this.formatBuffer = new byte[32];
        this.sourcePageHadContents = false;
        this.document = pDDocument;
        this.output = outputStream;
        this.resources = pDFormXObject.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    @Deprecated
    public void setNonStrokingColor(double d10) {
        setNonStrokingColor((float) d10);
    }

    public void setStrokingColor(float f10) {
        if (!isOutsideOneInterval(f10)) {
            writeOperand(f10);
            writeOperator(OperatorName.STROKING_COLOR_GRAY);
            setStrokingColorSpaceStack(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f10);
    }

    public void setNonStrokingColor(float f10) {
        if (!isOutsideOneInterval(f10)) {
            writeOperand(f10);
            writeOperator(OperatorName.NON_STROKING_GRAY);
            setNonStrokingColorSpaceStack(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f10);
    }

    public PDPageContentStream(PDDocument pDDocument, PDTilingPattern pDTilingPattern, OutputStream outputStream) {
        this.inTextMode = false;
        this.fontStack = new Stack<>();
        this.nonStrokingColorSpaceStack = new Stack<>();
        this.strokingColorSpaceStack = new Stack<>();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.formatDecimal = numberInstance;
        this.formatBuffer = new byte[32];
        this.sourcePageHadContents = false;
        this.document = pDDocument;
        this.output = outputStream;
        this.resources = pDTilingPattern.getResources();
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }
}
