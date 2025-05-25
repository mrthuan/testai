package com.tom_roush.pdfbox.contentstream;

import android.graphics.PointF;
import android.graphics.RectF;
import com.tom_roush.pdfbox.contentstream.operator.MissingOperandException;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorProcessor;
import com.tom_roush.pdfbox.contentstream.operator.state.EmptyGraphicsStackException;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.filter.MissingImageReaderException;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.MissingResourceException;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType1Font;
import com.tom_roush.pdfbox.pdmodel.font.PDType3CharProc;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.graphics.PDLineDashPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.blend.BlendMode;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDTransparencyGroup;
import com.tom_roush.pdfbox.pdmodel.graphics.pattern.PDTilingPattern;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDGraphicsState;
import com.tom_roush.pdfbox.pdmodel.graphics.state.PDTextState;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.util.Matrix;
import com.tom_roush.pdfbox.util.Vector;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class PDFStreamEngine {
    private PDPage currentPage;
    private Matrix initialMatrix;
    private boolean isProcessingPage;
    private PDResources resources;
    private Matrix textLineMatrix;
    private Matrix textMatrix;
    private final Map<String, OperatorProcessor> operators = new HashMap(80);
    private Deque<PDGraphicsState> graphicsStack = new ArrayDeque();
    private int level = 0;

    private void clipToRect(PDRectangle pDRectangle) {
        if (pDRectangle != null) {
            getGraphicsState().intersectClippingPath(pDRectangle.transform(getGraphicsState().getCurrentTransformationMatrix()));
        }
    }

    private void initPage(PDPage pDPage) {
        if (pDPage != null) {
            this.currentPage = pDPage;
            this.graphicsStack.clear();
            this.graphicsStack.push(new PDGraphicsState(pDPage.getCropBox()));
            this.textMatrix = null;
            this.textLineMatrix = null;
            this.resources = null;
            this.initialMatrix = pDPage.getMatrix();
            return;
        }
        throw new IllegalArgumentException("Page cannot be null");
    }

    private void popResources(PDResources pDResources) {
        this.resources = pDResources;
    }

    private void processStream(PDContentStream pDContentStream) {
        PDResources pushResources = pushResources(pDContentStream);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        Matrix matrix = this.initialMatrix;
        PDGraphicsState graphicsState = getGraphicsState();
        graphicsState.getCurrentTransformationMatrix().concatenate(pDContentStream.getMatrix());
        this.initialMatrix = graphicsState.getCurrentTransformationMatrix().m11clone();
        clipToRect(pDContentStream.getBBox());
        processStreamOperators(pDContentStream);
        this.initialMatrix = matrix;
        restoreGraphicsStack(saveGraphicsStack);
        popResources(pushResources);
    }

    private void processStreamOperators(PDContentStream pDContentStream) {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(pDContentStream);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                processOperator((Operator) parseNextToken, arrayList);
                arrayList = new ArrayList();
            } else {
                arrayList.add((COSBase) parseNextToken);
            }
        }
    }

    private PDResources pushResources(PDContentStream pDContentStream) {
        PDResources pDResources = this.resources;
        PDResources resources = pDContentStream.getResources();
        if (resources != null) {
            this.resources = resources;
        } else if (this.resources == null) {
            this.resources = this.currentPage.getResources();
        }
        if (this.resources == null) {
            this.resources = new PDResources();
        }
        return pDResources;
    }

    public final void addOperator(OperatorProcessor operatorProcessor) {
        operatorProcessor.setContext(this);
        this.operators.put(operatorProcessor.getName(), operatorProcessor);
    }

    public void applyTextAdjustment(float f10, float f11) {
        this.textMatrix.concatenate(Matrix.getTranslateInstance(f10, f11));
    }

    public void decreaseLevel() {
        this.level--;
    }

    public PDAppearanceStream getAppearance(PDAnnotation pDAnnotation) {
        return pDAnnotation.getNormalAppearanceStream();
    }

    public PDPage getCurrentPage() {
        return this.currentPage;
    }

    public int getGraphicsStackSize() {
        return this.graphicsStack.size();
    }

    public PDGraphicsState getGraphicsState() {
        return this.graphicsStack.peek();
    }

    public Matrix getInitialMatrix() {
        return this.initialMatrix;
    }

    public int getLevel() {
        return this.level;
    }

    public PDResources getResources() {
        return this.resources;
    }

    public Matrix getTextLineMatrix() {
        return this.textLineMatrix;
    }

    public Matrix getTextMatrix() {
        return this.textMatrix;
    }

    public void increaseLevel() {
        this.level++;
    }

    public void operatorException(Operator operator, List<COSBase> list, IOException iOException) {
        if (!(iOException instanceof MissingOperandException) && !(iOException instanceof MissingResourceException) && !(iOException instanceof MissingImageReaderException)) {
            if (iOException instanceof EmptyGraphicsStackException) {
                iOException.getMessage();
                return;
            } else if (operator.getName().equals(OperatorName.DRAW_OBJECT)) {
                iOException.getMessage();
                return;
            } else {
                throw iOException;
            }
        }
        iOException.getMessage();
    }

    public void processAnnotation(PDAnnotation pDAnnotation, PDAppearanceStream pDAppearanceStream) {
        PDResources pushResources = pushResources(pDAppearanceStream);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        PDRectangle bBox = pDAppearanceStream.getBBox();
        PDRectangle rectangle = pDAnnotation.getRectangle();
        if (rectangle != null && rectangle.getWidth() > 0.0f && rectangle.getHeight() > 0.0f && bBox != null && bBox.getWidth() > 0.0f && bBox.getHeight() > 0.0f) {
            Matrix matrix = pDAppearanceStream.getMatrix();
            RectF rectF = new RectF();
            bBox.transform(matrix).computeBounds(rectF, true);
            Matrix translateInstance = Matrix.getTranslateInstance(rectangle.getLowerLeftX(), rectangle.getLowerLeftY());
            translateInstance.concatenate(Matrix.getScaleInstance(rectangle.getWidth() / rectF.width(), rectangle.getHeight() / rectF.height()));
            translateInstance.concatenate(Matrix.getTranslateInstance(-rectF.left, -rectF.top));
            Matrix concatenate = Matrix.concatenate(translateInstance, matrix);
            getGraphicsState().setCurrentTransformationMatrix(concatenate);
            clipToRect(bBox);
            this.initialMatrix = concatenate.m11clone();
            processStreamOperators(pDAppearanceStream);
        }
        restoreGraphicsStack(saveGraphicsStack);
        popResources(pushResources);
    }

    public void processChildStream(PDContentStream pDContentStream, PDPage pDPage) {
        if (!this.isProcessingPage) {
            initPage(pDPage);
            processStream(pDContentStream);
            this.currentPage = null;
            return;
        }
        throw new IllegalStateException("Current page has already been set via  #processPage(PDPage) call #processChildStream(PDContentStream) instead");
    }

    public void processOperator(String str, List<COSBase> list) {
        processOperator(Operator.getOperator(str), list);
    }

    public void processPage(PDPage pDPage) {
        initPage(pDPage);
        if (pDPage.hasContents()) {
            this.isProcessingPage = true;
            processStream(pDPage);
            this.isProcessingPage = false;
        }
    }

    public void processSoftMask(PDTransparencyGroup pDTransparencyGroup) {
        saveGraphicsState();
        getGraphicsState().setCurrentTransformationMatrix(getGraphicsState().getSoftMask().getInitialTransformationMatrix());
        processTransparencyGroup(pDTransparencyGroup);
        restoreGraphicsState();
    }

    public final void processTilingPattern(PDTilingPattern pDTilingPattern, PDColor pDColor, PDColorSpace pDColorSpace) {
        processTilingPattern(pDTilingPattern, pDColor, pDColorSpace, pDTilingPattern.getMatrix());
    }

    public void processTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) {
        if (this.currentPage != null) {
            PDResources pushResources = pushResources(pDTransparencyGroup);
            Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
            Matrix matrix = this.initialMatrix;
            PDGraphicsState graphicsState = getGraphicsState();
            this.initialMatrix = graphicsState.getCurrentTransformationMatrix().m11clone();
            graphicsState.getCurrentTransformationMatrix().concatenate(pDTransparencyGroup.getMatrix());
            graphicsState.setBlendMode(BlendMode.NORMAL);
            graphicsState.setAlphaConstant(1.0d);
            graphicsState.setNonStrokeAlphaConstant(1.0d);
            graphicsState.setSoftMask(null);
            clipToRect(pDTransparencyGroup.getBBox());
            processStreamOperators(pDTransparencyGroup);
            this.initialMatrix = matrix;
            restoreGraphicsStack(saveGraphicsStack);
            popResources(pushResources);
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    public void processType3Stream(PDType3CharProc pDType3CharProc, Matrix matrix) {
        if (this.currentPage != null) {
            PDResources pushResources = pushResources(pDType3CharProc);
            Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
            getGraphicsState().setCurrentTransformationMatrix(matrix);
            getGraphicsState().getCurrentTransformationMatrix().concatenate(pDType3CharProc.getMatrix());
            Matrix matrix2 = this.textMatrix;
            this.textMatrix = new Matrix();
            Matrix matrix3 = this.textLineMatrix;
            this.textLineMatrix = new Matrix();
            processStreamOperators(pDType3CharProc);
            this.textMatrix = matrix2;
            this.textLineMatrix = matrix3;
            restoreGraphicsStack(saveGraphicsStack);
            popResources(pushResources);
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    @Deprecated
    public void registerOperatorProcessor(String str, OperatorProcessor operatorProcessor) {
        operatorProcessor.setContext(this);
        this.operators.put(str, operatorProcessor);
    }

    public final void restoreGraphicsStack(Deque<PDGraphicsState> deque) {
        this.graphicsStack = deque;
    }

    public void restoreGraphicsState() {
        this.graphicsStack.pop();
    }

    public final Deque<PDGraphicsState> saveGraphicsStack() {
        Deque<PDGraphicsState> deque = this.graphicsStack;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.graphicsStack = arrayDeque;
        arrayDeque.add(deque.peek().m9clone());
        return deque;
    }

    public void saveGraphicsState() {
        Deque<PDGraphicsState> deque = this.graphicsStack;
        deque.push(deque.peek().m9clone());
    }

    public void setLineDashPattern(COSArray cOSArray, int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        getGraphicsState().setLineDashPattern(new PDLineDashPattern(cOSArray, i10));
    }

    public void setTextLineMatrix(Matrix matrix) {
        this.textLineMatrix = matrix;
    }

    public void setTextMatrix(Matrix matrix) {
        this.textMatrix = matrix;
    }

    public void showAnnotation(PDAnnotation pDAnnotation) {
        PDAppearanceStream appearance = getAppearance(pDAnnotation);
        if (appearance != null) {
            processAnnotation(pDAnnotation, appearance);
        }
    }

    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i10, String str, Vector vector) {
    }

    public void showForm(PDFormXObject pDFormXObject) {
        if (this.currentPage != null) {
            if (pDFormXObject.getCOSObject().getLength() > 0) {
                processStream(pDFormXObject);
                return;
            }
            return;
        }
        throw new IllegalStateException("No current page, call #processChildStream(PDContentStream, PDPage) instead");
    }

    public void showGlyph(Matrix matrix, PDFont pDFont, int i10, String str, Vector vector) {
        if (pDFont instanceof PDType3Font) {
            showType3Glyph(matrix, (PDType3Font) pDFont, i10, vector);
        } else {
            showFontGlyph(matrix, pDFont, i10, vector);
        }
    }

    public void showText(byte[] bArr) {
        float f10;
        float f11;
        PDGraphicsState graphicsState = getGraphicsState();
        PDTextState textState = graphicsState.getTextState();
        PDFont font = textState.getFont();
        if (font == null) {
            font = PDType1Font.HELVETICA;
        }
        float fontSize = textState.getFontSize();
        float horizontalScaling = textState.getHorizontalScaling() / 100.0f;
        float characterSpacing = textState.getCharacterSpacing();
        Matrix matrix = new Matrix(fontSize * horizontalScaling, 0.0f, 0.0f, fontSize, 0.0f, textState.getRise());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() > 0) {
            int available = byteArrayInputStream.available();
            int readCode = font.readCode(byteArrayInputStream);
            float f12 = 0.0f;
            if (available - byteArrayInputStream.available() == 1 && readCode == 32) {
                f10 = textState.getWordSpacing() + 0.0f;
            } else {
                f10 = 0.0f;
            }
            Matrix multiply = matrix.multiply(this.textMatrix).multiply(graphicsState.getCurrentTransformationMatrix());
            if (font.isVertical()) {
                multiply.translate(font.getPositionVector(readCode));
            }
            Vector displacement = font.getDisplacement(readCode);
            showGlyph(multiply, font, readCode, displacement);
            if (font.isVertical()) {
                f11 = (displacement.getY() * fontSize) + characterSpacing + f10;
            } else {
                f12 = ((displacement.getX() * fontSize) + characterSpacing + f10) * horizontalScaling;
                f11 = 0.0f;
            }
            this.textMatrix.concatenate(Matrix.getTranslateInstance(f12, f11));
        }
    }

    public void showTextString(byte[] bArr) {
        showText(bArr);
    }

    public void showTextStrings(COSArray cOSArray) {
        boolean z10;
        float f10;
        PDTextState textState = getGraphicsState().getTextState();
        float fontSize = textState.getFontSize();
        float horizontalScaling = textState.getHorizontalScaling() / 100.0f;
        PDFont font = textState.getFont();
        if (font != null) {
            z10 = font.isVertical();
        } else {
            z10 = false;
        }
        Iterator<COSBase> it = cOSArray.iterator();
        while (it.hasNext()) {
            COSBase next = it.next();
            if (next instanceof COSNumber) {
                float floatValue = ((COSNumber) next).floatValue();
                float f11 = 0.0f;
                if (z10) {
                    f10 = ((-floatValue) / 1000.0f) * fontSize;
                } else {
                    f11 = ((-floatValue) / 1000.0f) * fontSize * horizontalScaling;
                    f10 = 0.0f;
                }
                applyTextAdjustment(f11, f10);
            } else if (next instanceof COSString) {
                showText(((COSString) next).getBytes());
            } else {
                throw new IOException("Unknown type " + next.getClass().getSimpleName() + " in array for TJ operation:" + next);
            }
        }
    }

    public void showTransparencyGroup(PDTransparencyGroup pDTransparencyGroup) {
        processTransparencyGroup(pDTransparencyGroup);
    }

    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i10, String str, Vector vector) {
        PDType3CharProc charProc = pDType3Font.getCharProc(i10);
        if (charProc != null) {
            processType3Stream(charProc, matrix);
        }
    }

    public float transformWidth(float f10) {
        Matrix currentTransformationMatrix = getGraphicsState().getCurrentTransformationMatrix();
        float shearX = currentTransformationMatrix.getShearX() + currentTransformationMatrix.getScaleX();
        float shearY = currentTransformationMatrix.getShearY() + currentTransformationMatrix.getScaleY();
        return f10 * ((float) Math.sqrt(((shearY * shearY) + (shearX * shearX)) * 0.5d));
    }

    public PointF transformedPoint(float f10, float f11) {
        float[] fArr = {f10, f11};
        getGraphicsState().getCurrentTransformationMatrix().createAffineTransform().transform(fArr, 0, fArr, 0, 1);
        return new PointF(fArr[0], fArr[1]);
    }

    public final void processTilingPattern(PDTilingPattern pDTilingPattern, PDColor pDColor, PDColorSpace pDColorSpace, Matrix matrix) {
        PDResources pushResources = pushResources(pDTilingPattern);
        Matrix matrix2 = this.initialMatrix;
        this.initialMatrix = Matrix.concatenate(matrix2, matrix);
        Deque<PDGraphicsState> saveGraphicsStack = saveGraphicsStack();
        RectF rectF = new RectF();
        pDTilingPattern.getBBox().transform(matrix).computeBounds(rectF, true);
        this.graphicsStack.push(new PDGraphicsState(new PDRectangle(rectF.left, rectF.top, rectF.width(), rectF.height())));
        PDGraphicsState graphicsState = getGraphicsState();
        if (pDColorSpace != null) {
            PDColor pDColor2 = new PDColor(pDColor.getComponents(), pDColorSpace);
            graphicsState.setNonStrokingColorSpace(pDColorSpace);
            graphicsState.setNonStrokingColor(pDColor2);
            graphicsState.setStrokingColorSpace(pDColorSpace);
            graphicsState.setStrokingColor(pDColor2);
        }
        graphicsState.getCurrentTransformationMatrix().concatenate(matrix);
        clipToRect(pDTilingPattern.getBBox());
        Matrix matrix3 = this.textMatrix;
        Matrix matrix4 = this.textLineMatrix;
        processStreamOperators(pDTilingPattern);
        this.textMatrix = matrix3;
        this.textLineMatrix = matrix4;
        this.initialMatrix = matrix2;
        restoreGraphicsStack(saveGraphicsStack);
        popResources(pushResources);
    }

    public void showFontGlyph(Matrix matrix, PDFont pDFont, int i10, Vector vector) {
        showFontGlyph(matrix, pDFont, i10, pDFont.toUnicode(i10), vector);
    }

    public void processOperator(Operator operator, List<COSBase> list) {
        OperatorProcessor operatorProcessor = this.operators.get(operator.getName());
        if (operatorProcessor != null) {
            operatorProcessor.setContext(this);
            try {
                operatorProcessor.process(operator, list);
                return;
            } catch (IOException e10) {
                operatorException(operator, list, e10);
                return;
            }
        }
        unsupportedOperator(operator, list);
    }

    public void showType3Glyph(Matrix matrix, PDType3Font pDType3Font, int i10, Vector vector) {
        showType3Glyph(matrix, pDType3Font, i10, pDType3Font.toUnicode(i10), vector);
    }

    public void showGlyph(Matrix matrix, PDFont pDFont, int i10, Vector vector) {
        showGlyph(matrix, pDFont, i10, pDFont.toUnicode(i10), vector);
    }

    public void beginText() {
    }

    public void endMarkedContentSequence() {
    }

    public void endText() {
    }

    public void beginMarkedContentSequence(COSName cOSName, COSDictionary cOSDictionary) {
    }

    public void unsupportedOperator(Operator operator, List<COSBase> list) {
    }
}
