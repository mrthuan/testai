package com.tom_roush.pdfbox.pdmodel;

import b.a;
import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdfwriter.COSWriter;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDImageXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.image.PDInlineImage;
import com.tom_roush.pdfbox.pdmodel.graphics.shading.PDShading;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.RenderingMode;
import com.tom_roush.pdfbox.util.Charsets;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.NumberFormatUtil;
import java.io.Closeable;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
abstract class PDAbstractContentStream implements Closeable {
    protected final PDDocument document;
    private final byte[] formatBuffer;
    private final NumberFormat formatDecimal;
    protected final OutputStream outputStream;
    protected final PDResources resources;
    protected boolean inTextMode = false;
    protected final Deque<PDFont> fontStack = new ArrayDeque();
    protected final Deque<PDColorSpace> nonStrokingColorSpaceStack = new ArrayDeque();
    protected final Deque<PDColorSpace> strokingColorSpaceStack = new ArrayDeque();

    public PDAbstractContentStream(PDDocument pDDocument, OutputStream outputStream, PDResources pDResources) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        this.formatDecimal = numberInstance;
        this.formatBuffer = new byte[32];
        this.document = pDDocument;
        this.outputStream = outputStream;
        this.resources = pDResources;
        numberInstance.setMaximumFractionDigits(4);
        numberInstance.setGroupingUsed(false);
    }

    private boolean isOutsideOneInterval(double d10) {
        if (d10 >= 0.0d && d10 <= 1.0d) {
            return false;
        }
        return true;
    }

    private void writeAffineTransform(AffineTransform affineTransform) {
        double[] dArr = new double[6];
        affineTransform.getMatrix(dArr);
        for (int i10 = 0; i10 < 6; i10++) {
            writeOperand((float) dArr[i10]);
        }
    }

    public void addComment(String str) {
        if (str.indexOf(10) < 0 && str.indexOf(13) < 0) {
            this.outputStream.write(37);
            this.outputStream.write(str.getBytes(Charsets.US_ASCII));
            this.outputStream.write(10);
            return;
        }
        throw new IllegalArgumentException("comment should not include a newline");
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

    public void beginMarkedContent(COSName cOSName) {
        writeOperand(cOSName);
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.outputStream.close();
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

    public void endMarkedContent() {
        writeOperator(OperatorName.END_MARKED_CONTENT);
    }

    public void endText() {
        if (this.inTextMode) {
            writeOperator(OperatorName.END_TEXT);
            this.inTextMode = false;
            return;
        }
        throw new IllegalStateException("Error: You must call beginText() before calling endText.");
    }

    public void fill() {
        if (!this.inTextMode) {
            writeOperator("f");
            return;
        }
        throw new IllegalStateException("Error: fill is not allowed within a text block.");
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

    public COSName getName(PDColorSpace pDColorSpace) {
        if (!(pDColorSpace instanceof PDDeviceGray) && !(pDColorSpace instanceof PDDeviceRGB)) {
            return this.resources.add(pDColorSpace);
        }
        return COSName.getPDFName(pDColorSpace.getName());
    }

    public boolean isOutside255Interval(int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return false;
        }
        return true;
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
        if (!this.inTextMode) {
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
            return;
        }
        throw new IllegalStateException("Error: Restoring the graphics state is not allowed within text objects.");
    }

    public void saveGraphicsState() {
        if (!this.inTextMode) {
            if (!this.fontStack.isEmpty()) {
                Deque<PDFont> deque = this.fontStack;
                deque.push(deque.peek());
            }
            if (!this.strokingColorSpaceStack.isEmpty()) {
                Deque<PDColorSpace> deque2 = this.strokingColorSpaceStack;
                deque2.push(deque2.peek());
            }
            if (!this.nonStrokingColorSpaceStack.isEmpty()) {
                Deque<PDColorSpace> deque3 = this.nonStrokingColorSpaceStack;
                deque3.push(deque3.peek());
            }
            writeOperator(OperatorName.SAVE);
            return;
        }
        throw new IllegalStateException("Error: Saving the graphics state is not allowed within text objects.");
    }

    public void setCharacterSpacing(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_CHAR_SPACING);
    }

    public void setFont(PDFont pDFont, float f10) {
        if (this.fontStack.isEmpty()) {
            this.fontStack.add(pDFont);
        } else {
            this.fontStack.pop();
            this.fontStack.push(pDFont);
        }
        if (pDFont.willBeSubset()) {
            PDDocument pDDocument = this.document;
            if (pDDocument != null) {
                pDDocument.getFontsToSubset().add(pDFont);
            } else {
                pDFont.getName();
            }
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

    public void setLeading(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_TEXT_LEADING);
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

    public void setMaximumFractionDigits(int i10) {
        this.formatDecimal.setMaximumFractionDigits(i10);
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

    public void setNonStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.nonStrokingColorSpaceStack.isEmpty()) {
            this.nonStrokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        this.nonStrokingColorSpaceStack.pop();
        this.nonStrokingColorSpaceStack.push(pDColorSpace);
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

    public void setStrokingColorSpaceStack(PDColorSpace pDColorSpace) {
        if (this.strokingColorSpaceStack.isEmpty()) {
            this.strokingColorSpaceStack.add(pDColorSpace);
            return;
        }
        this.strokingColorSpaceStack.pop();
        this.strokingColorSpaceStack.push(pDColorSpace);
    }

    public void setTextMatrix(Matrix matrix) {
        if (this.inTextMode) {
            writeAffineTransform(matrix.createAffineTransform());
            writeOperator(OperatorName.SET_MATRIX);
            return;
        }
        throw new IllegalStateException("Error: must call beginText() before setTextMatrix");
    }

    public void setTextRise(float f10) {
        writeOperand(f10);
        writeOperator(OperatorName.SET_TEXT_RISE);
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
                byte[] encode = peek.encode(str);
                if (peek.willBeSubset()) {
                    int i10 = 0;
                    while (i10 < str.length()) {
                        int codePointAt = str.codePointAt(i10);
                        peek.addToSubset(codePointAt);
                        i10 += Character.charCount(codePointAt);
                    }
                }
                COSWriter.writeString(encode, this.outputStream);
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
        if (!this.inTextMode) {
            writeAffineTransform(matrix.createAffineTransform());
            writeOperator(OperatorName.CONCAT);
            return;
        }
        throw new IllegalStateException("Error: Modifying the current transformation matrix is not allowed within text objects.");
    }

    public void write(String str) {
        this.outputStream.write(str.getBytes(Charsets.US_ASCII));
    }

    public void writeBytes(byte[] bArr) {
        this.outputStream.write(bArr);
    }

    public void writeLine() {
        this.outputStream.write(10);
    }

    public void writeOperand(float f10) {
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            int formatFloatFast = NumberFormatUtil.formatFloatFast(f10, this.formatDecimal.getMaximumFractionDigits(), this.formatBuffer);
            if (formatFloatFast == -1) {
                write(this.formatDecimal.format(f10));
            } else {
                this.outputStream.write(this.formatBuffer, 0, formatFloatFast);
            }
            this.outputStream.write(32);
            return;
        }
        throw new IllegalArgumentException(f10 + " is not a finite number");
    }

    public void writeOperator(String str) {
        this.outputStream.write(str.getBytes(Charsets.US_ASCII));
        this.outputStream.write(10);
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

    public void write(byte[] bArr) {
        this.outputStream.write(bArr);
    }

    public void beginMarkedContent(COSName cOSName, PDPropertyList pDPropertyList) {
        writeOperand(cOSName);
        writeOperand(this.resources.add(pDPropertyList));
        writeOperator(OperatorName.BEGIN_MARKED_CONTENT_SEQ);
    }

    public void writeOperand(int i10) {
        write(this.formatDecimal.format(i10));
        this.outputStream.write(32);
    }

    public void setNonStrokingColor(AWTColor aWTColor) {
        setNonStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void setStrokingColor(AWTColor aWTColor) {
        setStrokingColor(new PDColor(new float[]{aWTColor.getRed() / 255.0f, aWTColor.getGreen() / 255.0f, aWTColor.getBlue() / 255.0f}, PDDeviceRGB.INSTANCE));
    }

    public void writeOperand(COSName cOSName) {
        cOSName.writePDF(this.outputStream);
        this.outputStream.write(32);
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

    public void drawImage(PDInlineImage pDInlineImage, float f10, float f11) {
        drawImage(pDInlineImage, f10, f11, pDInlineImage.getWidth(), pDInlineImage.getHeight());
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

    public void setStrokingColor(float f10) {
        if (!isOutsideOneInterval(f10)) {
            writeOperand(f10);
            writeOperator(OperatorName.STROKING_COLOR_GRAY);
            setStrokingColorSpaceStack(PDDeviceGray.INSTANCE);
            return;
        }
        throw new IllegalArgumentException("Parameter must be within 0..1, but is " + f10);
    }

    public void setNonStrokingColor(int i10) {
        if (!isOutside255Interval(i10)) {
            setNonStrokingColor(i10 / 255.0f);
            return;
        }
        throw new IllegalArgumentException(a.c("Parameter must be within 0..255, but is ", i10));
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
}
