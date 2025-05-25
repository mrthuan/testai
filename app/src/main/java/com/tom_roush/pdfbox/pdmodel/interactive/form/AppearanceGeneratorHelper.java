package com.tom_roush.pdfbox.pdmodel.interactive.form;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import b.a;
import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.harmony.awt.geom.AffineTransform;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdfwriter.ContentStreamWriter;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.font.PDSimpleFont;
import com.tom_roush.pdfbox.pdmodel.font.PDType3CharProc;
import com.tom_roush.pdfbox.pdmodel.font.PDType3Font;
import com.tom_roush.pdfbox.pdmodel.font.PDVectorFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionJavaScript;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainText;
import com.tom_roush.pdfbox.pdmodel.interactive.form.PlainTextFormatter;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class AppearanceGeneratorHelper {
    private static final float DEFAULT_FONT_SIZE = 12.0f;
    private static final float DEFAULT_PADDING = 0.5f;
    private static final int FONTSCALE = 1000;
    private static final float MAXIMUM_FONT_SIZE = 300.0f;
    private static final float MINIMUM_FONT_SIZE = 4.0f;
    private PDDefaultAppearanceString defaultAppearance;
    private final PDVariableText field;
    private String value;
    private static final Operator BMC = Operator.getOperator(OperatorName.BEGIN_MARKED_CONTENT);
    private static final Operator EMC = Operator.getOperator(OperatorName.END_MARKED_CONTENT);
    private static final float[] HIGHLIGHT_COLOR = {0.6f, 0.75686276f, 0.84313726f};

    public AppearanceGeneratorHelper(PDVariableText pDVariableText) {
        this.field = pDVariableText;
        validateAndEnsureAcroFormResources();
        try {
            this.defaultAppearance = pDVariableText.getDefaultAppearanceString();
        } catch (IOException e10) {
            throw new IOException("Could not process default appearance string '" + pDVariableText.getDefaultAppearance() + "' for field '" + pDVariableText.getFullyQualifiedName() + OperatorName.SHOW_TEXT_LINE, e10);
        }
    }

    private PDRectangle applyPadding(PDRectangle pDRectangle, float f10) {
        float lowerLeftX = pDRectangle.getLowerLeftX() + f10;
        float lowerLeftY = pDRectangle.getLowerLeftY() + f10;
        float f11 = f10 * 2.0f;
        return new PDRectangle(lowerLeftX, lowerLeftY, pDRectangle.getWidth() - f11, pDRectangle.getHeight() - f11);
    }

    private float calculateFontSize(PDFont pDFont, PDRectangle pDRectangle) {
        float fontSize = this.defaultAppearance.getFontSize();
        if (fontSize == 0.0f) {
            if (isMultiLine()) {
                PlainText plainText = new PlainText(this.value);
                if (plainText.getParagraphs() == null) {
                    return DEFAULT_FONT_SIZE;
                }
                float width = pDRectangle.getWidth() - pDRectangle.getLowerLeftX();
                float f10 = 4.0f;
                while (f10 <= DEFAULT_FONT_SIZE) {
                    int i10 = 0;
                    for (PlainText.Paragraph paragraph : plainText.getParagraphs()) {
                        i10 += paragraph.getLines(pDFont, f10, width).size();
                    }
                    if (pDFont.getBoundingBox().getHeight() * (f10 / 1000.0f) * i10 > pDRectangle.getHeight()) {
                        return Math.max(f10 - 1.0f, (float) MINIMUM_FONT_SIZE);
                    }
                    f10 += 1.0f;
                }
                return Math.min(f10, (float) DEFAULT_FONT_SIZE);
            }
            float scaleY = pDFont.getFontMatrix().getScaleY() * 1000.0f;
            float width2 = (pDRectangle.getWidth() / (pDFont.getFontMatrix().getScaleX() * pDFont.getStringWidth(this.value))) * pDFont.getFontMatrix().getScaleX() * 1000.0f;
            float scaleY2 = pDFont.getFontMatrix().getScaleY() * (pDFont.getFontDescriptor().getCapHeight() + (-pDFont.getFontDescriptor().getDescent()));
            if (scaleY2 <= 0.0f) {
                scaleY2 = pDFont.getFontMatrix().getScaleY() * pDFont.getBoundingBox().getHeight();
            }
            return Math.min((pDRectangle.getHeight() / scaleY2) * scaleY, width2);
        }
        return fontSize;
    }

    private AffineTransform calculateMatrix(PDRectangle pDRectangle, int i10) {
        float f10;
        if (i10 == 0) {
            return new AffineTransform();
        }
        float f11 = 0.0f;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    f10 = 0.0f;
                } else {
                    f10 = pDRectangle.getUpperRightX();
                }
            } else {
                f11 = pDRectangle.getUpperRightY();
                f10 = pDRectangle.getUpperRightX();
            }
        } else {
            f11 = pDRectangle.getUpperRightY();
            f10 = 0.0f;
        }
        return Matrix.getRotateInstance(Math.toRadians(i10), f11, f10).createAffineTransform();
    }

    private String getFormattedValue(String str) {
        PDFormFieldAdditionalActions actions = this.field.getActions();
        if (actions != null && actions.getF() != null && this.field.getAcroForm().getScriptingHandler() != null) {
            return this.field.getAcroForm().getScriptingHandler().format((PDActionJavaScript) this.field.getActions().getF(), str);
        }
        return str;
    }

    private int getTextAlign(PDAnnotationWidget pDAnnotationWidget) {
        return pDAnnotationWidget.getCOSObject().getInt(COSName.Q, this.field.getQ());
    }

    private PDDefaultAppearanceString getWidgetDefaultAppearanceString(PDAnnotationWidget pDAnnotationWidget) {
        return new PDDefaultAppearanceString((COSString) pDAnnotationWidget.getCOSObject().getDictionaryObject(COSName.DA), this.field.getAcroForm().getDefaultResources());
    }

    private void initializeAppearanceContent(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream) {
        float f10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.field.getAcroForm().getDocument(), pDAppearanceStream, (OutputStream) byteArrayOutputStream);
        PDAppearanceCharacteristicsDictionary appearanceCharacteristics = pDAnnotationWidget.getAppearanceCharacteristics();
        if (appearanceCharacteristics != null) {
            PDColor background = appearanceCharacteristics.getBackground();
            if (background != null) {
                pDPageContentStream.setNonStrokingColor(background);
                PDRectangle resolveBoundingBox = resolveBoundingBox(pDAnnotationWidget, pDAppearanceStream);
                pDPageContentStream.addRect(resolveBoundingBox.getLowerLeftX(), resolveBoundingBox.getLowerLeftY(), resolveBoundingBox.getWidth(), resolveBoundingBox.getHeight());
                pDPageContentStream.fill();
            }
            PDColor borderColour = appearanceCharacteristics.getBorderColour();
            if (borderColour != null) {
                pDPageContentStream.setStrokingColor(borderColour);
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            PDBorderStyleDictionary borderStyle = pDAnnotationWidget.getBorderStyle();
            if (borderStyle != null && borderStyle.getWidth() > 0.0f) {
                f10 = borderStyle.getWidth();
            }
            if (f10 > 0.0f && borderColour != null) {
                if (f10 != 1.0f) {
                    pDPageContentStream.setLineWidth(f10);
                }
                PDRectangle applyPadding = applyPadding(resolveBoundingBox(pDAnnotationWidget, pDAppearanceStream), Math.max((float) DEFAULT_PADDING, f10 / 2.0f));
                pDPageContentStream.addRect(applyPadding.getLowerLeftX(), applyPadding.getLowerLeftY(), applyPadding.getWidth(), applyPadding.getHeight());
                pDPageContentStream.closeAndStroke();
            }
        }
        pDPageContentStream.close();
        byteArrayOutputStream.close();
        writeToStream(byteArrayOutputStream.toByteArray(), pDAppearanceStream);
    }

    private void insertGeneratedAppearance(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream, OutputStream outputStream) {
        float f10;
        float resolveDescent;
        float f11;
        float f12;
        PDPageContentStream pDPageContentStream = new PDPageContentStream(this.field.getAcroForm().getDocument(), pDAppearanceStream, outputStream);
        PDRectangle resolveBoundingBox = resolveBoundingBox(pDAnnotationWidget, pDAppearanceStream);
        if (pDAnnotationWidget.getBorderStyle() != null) {
            f10 = pDAnnotationWidget.getBorderStyle().getWidth();
        } else {
            f10 = 0.0f;
        }
        PDRectangle applyPadding = applyPadding(resolveBoundingBox, Math.max(1.0f, f10));
        PDRectangle applyPadding2 = applyPadding(applyPadding, Math.max(1.0f, f10));
        pDPageContentStream.saveGraphicsState();
        pDPageContentStream.addRect(applyPadding.getLowerLeftX(), applyPadding.getLowerLeftY(), applyPadding.getWidth(), applyPadding.getHeight());
        pDPageContentStream.clip();
        PDFont font = this.defaultAppearance.getFont();
        if (font != null) {
            if (font.getName().contains("+")) {
                this.defaultAppearance.getFontName().getName();
                this.field.getFullyQualifiedName();
                font.getName();
                this.defaultAppearance.getFontName().getName();
            }
            float fontSize = this.defaultAppearance.getFontSize();
            if (fontSize == 0.0f) {
                fontSize = calculateFontSize(font, applyPadding2);
            }
            float f13 = fontSize;
            if (this.field instanceof PDListBox) {
                insertGeneratedListboxSelectionHighlight(pDPageContentStream, pDAppearanceStream, font, f13);
            }
            pDPageContentStream.beginText();
            this.defaultAppearance.writeTo(pDPageContentStream, f13);
            float f14 = f13 / 1000.0f;
            float height = font.getBoundingBox().getHeight() * f14;
            if (font.getFontDescriptor() != null) {
                f11 = font.getFontDescriptor().getCapHeight() * f14;
                resolveDescent = font.getFontDescriptor().getDescent();
            } else {
                float resolveCapHeight = resolveCapHeight(font);
                resolveDescent = resolveDescent(font);
                f11 = resolveCapHeight * f14;
            }
            float f15 = resolveDescent * f14;
            PDVariableText pDVariableText = this.field;
            if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isMultiline()) {
                f12 = applyPadding2.getUpperRightY() - height;
            } else if (f11 > applyPadding.getHeight()) {
                f12 = applyPadding.getLowerLeftY() + (-f15);
            } else {
                float lowerLeftY = applyPadding.getLowerLeftY() + ((applyPadding.getHeight() - f11) / 2.0f);
                float f16 = -f15;
                if (lowerLeftY - applyPadding.getLowerLeftY() < f16) {
                    f12 = Math.min(applyPadding2.getLowerLeftY() + f16, Math.max(lowerLeftY, (applyPadding2.getHeight() - applyPadding2.getLowerLeftY()) - f11));
                } else {
                    f12 = lowerLeftY;
                }
            }
            float lowerLeftX = applyPadding2.getLowerLeftX();
            if (shallComb()) {
                insertGeneratedCombAppearance(pDPageContentStream, pDAppearanceStream, font, f13);
            } else if (this.field instanceof PDListBox) {
                insertGeneratedListboxAppearance(pDPageContentStream, pDAppearanceStream, applyPadding2, font, f13);
            } else {
                PlainText plainText = new PlainText(this.value);
                AppearanceStyle appearanceStyle = new AppearanceStyle();
                appearanceStyle.setFont(font);
                appearanceStyle.setFontSize(f13);
                appearanceStyle.setLeading(font.getBoundingBox().getHeight() * f14);
                new PlainTextFormatter.Builder(pDPageContentStream).style(appearanceStyle).text(plainText).width(applyPadding2.getWidth()).wrapLines(isMultiLine()).initialOffset(lowerLeftX, f12).textAlign(getTextAlign(pDAnnotationWidget)).build().format();
            }
            pDPageContentStream.endText();
            pDPageContentStream.restoreGraphicsState();
            pDPageContentStream.close();
            return;
        }
        throw new IllegalArgumentException("font is null, check whether /DA entry is incomplete or incorrect");
    }

    private void insertGeneratedCombAppearance(PDPageContentStream pDPageContentStream, PDAppearanceStream pDAppearanceStream, PDFont pDFont, float f10) {
        int maxLen = ((PDTextField) this.field).getMaxLen();
        int min = Math.min(this.value.length(), maxLen);
        PDRectangle applyPadding = applyPadding(pDAppearanceStream.getBBox(), 1.0f);
        float width = pDAppearanceStream.getBBox().getWidth() / maxLen;
        float height = ((pDAppearanceStream.getBBox().getHeight() - ((pDFont.getFontDescriptor().getAscent() / 1000.0f) * f10)) / 2.0f) + applyPadding.getLowerLeftY();
        float f11 = width / 2.0f;
        int i10 = 0;
        float f12 = 0.0f;
        while (i10 < min) {
            int i11 = i10 + 1;
            String substring = this.value.substring(i10, i11);
            float stringWidth = ((pDFont.getStringWidth(substring) / 1000.0f) * f10) / 2.0f;
            pDPageContentStream.newLineAtOffset(((f12 / 2.0f) + f11) - (stringWidth / 2.0f), height);
            pDPageContentStream.showText(substring);
            f11 = width;
            height = 0.0f;
            f12 = stringWidth;
            i10 = i11;
        }
    }

    private void insertGeneratedListboxAppearance(PDPageContentStream pDPageContentStream, PDAppearanceStream pDAppearanceStream, PDRectangle pDRectangle, PDFont pDFont, float f10) {
        pDPageContentStream.setNonStrokingColor(0.0f);
        int q5 = this.field.getQ();
        if (q5 != 1 && q5 != 2) {
            if (q5 != 0) {
                throw new IOException(a.c("Error: Unknown justification value:", q5));
            }
        } else {
            float width = (pDAppearanceStream.getBBox().getWidth() - ((pDFont.getStringWidth(this.value) / 1000.0f) * f10)) - MINIMUM_FONT_SIZE;
            if (q5 == 1) {
                width /= 2.0f;
            }
            pDPageContentStream.newLineAtOffset(width, 0.0f);
        }
        List<String> optionsDisplayValues = ((PDListBox) this.field).getOptionsDisplayValues();
        int size = optionsDisplayValues.size();
        float upperRightY = pDRectangle.getUpperRightY();
        int topIndex = ((PDListBox) this.field).getTopIndex();
        for (int i10 = topIndex; i10 < size; i10++) {
            if (i10 == topIndex) {
                upperRightY -= (pDFont.getFontDescriptor().getAscent() / 1000.0f) * f10;
            } else {
                upperRightY -= (pDFont.getBoundingBox().getHeight() / 1000.0f) * f10;
                pDPageContentStream.beginText();
            }
            pDPageContentStream.newLineAtOffset(pDRectangle.getLowerLeftX(), upperRightY);
            pDPageContentStream.showText(optionsDisplayValues.get(i10));
            if (i10 != size - 1) {
                pDPageContentStream.endText();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    private void insertGeneratedListboxSelectionHighlight(PDPageContentStream pDPageContentStream, PDAppearanceStream pDAppearanceStream, PDFont pDFont, float f10) {
        ?? selectedOptionsIndex = ((PDListBox) this.field).getSelectedOptionsIndex();
        List<String> value = ((PDListBox) this.field).getValue();
        List<String> optionsExportValues = ((PDListBox) this.field).getOptionsExportValues();
        if (!value.isEmpty() && !optionsExportValues.isEmpty() && selectedOptionsIndex.isEmpty()) {
            selectedOptionsIndex = new ArrayList();
            for (String str : value) {
                selectedOptionsIndex.add(Integer.valueOf(optionsExportValues.indexOf(str)));
            }
        }
        int topIndex = ((PDListBox) this.field).getTopIndex();
        float height = (pDFont.getBoundingBox().getHeight() * f10) / 1000.0f;
        PDRectangle applyPadding = applyPadding(pDAppearanceStream.getBBox(), 1.0f);
        for (Integer num : selectedOptionsIndex) {
            int intValue = num.intValue();
            float[] fArr = HIGHLIGHT_COLOR;
            pDPageContentStream.setNonStrokingColor(fArr[0], fArr[1], fArr[2]);
            pDPageContentStream.addRect(applyPadding.getLowerLeftX(), (applyPadding.getUpperRightY() - (((intValue - topIndex) + 1) * height)) + 2.0f, applyPadding.getWidth(), height);
            pDPageContentStream.fill();
        }
        pDPageContentStream.setNonStrokingColor(0.0f);
    }

    private boolean isMultiLine() {
        PDVariableText pDVariableText = this.field;
        if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isMultiline()) {
            return true;
        }
        return false;
    }

    private static boolean isValidAppearanceStream(PDAppearanceEntry pDAppearanceEntry) {
        PDRectangle bBox;
        if (pDAppearanceEntry == null || !pDAppearanceEntry.isStream() || (bBox = pDAppearanceEntry.getAppearanceStream().getBBox()) == null || Math.abs(bBox.getWidth()) <= 0.0f || Math.abs(bBox.getHeight()) <= 0.0f) {
            return false;
        }
        return true;
    }

    private PDAppearanceStream prepareNormalAppearanceStream(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceStream pDAppearanceStream = new PDAppearanceStream(this.field.getAcroForm().getDocument());
        int resolveRotation = resolveRotation(pDAnnotationWidget);
        PDRectangle rectangle = pDAnnotationWidget.getRectangle();
        PointF transformPoint = Matrix.getRotateInstance(Math.toRadians(resolveRotation), 0.0f, 0.0f).transformPoint(rectangle.getWidth(), rectangle.getHeight());
        PDRectangle pDRectangle = new PDRectangle(Math.abs(transformPoint.x), Math.abs(transformPoint.y));
        pDAppearanceStream.setBBox(pDRectangle);
        AffineTransform calculateMatrix = calculateMatrix(pDRectangle, resolveRotation);
        if (!calculateMatrix.isIdentity()) {
            pDAppearanceStream.setMatrix(calculateMatrix);
        }
        pDAppearanceStream.setFormType(1);
        pDAppearanceStream.setResources(new PDResources());
        return pDAppearanceStream;
    }

    private PDRectangle resolveBoundingBox(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream) {
        PDRectangle bBox = pDAppearanceStream.getBBox();
        if (bBox == null) {
            return pDAnnotationWidget.getRectangle().createRetranslatedRectangle();
        }
        return bBox;
    }

    private float resolveCapHeight(PDFont pDFont) {
        return resolveGlyphHeight(pDFont, StandardStructureTypes.H.codePointAt(0));
    }

    private float resolveDescent(PDFont pDFont) {
        return resolveGlyphHeight(pDFont, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT.codePointAt(0)) - resolveGlyphHeight(pDFont, "a".codePointAt(0));
    }

    private float resolveGlyphHeight(PDFont pDFont, int i10) {
        Path path = null;
        if (pDFont instanceof PDType3Font) {
            PDType3Font pDType3Font = (PDType3Font) pDFont;
            PDType3CharProc charProc = pDType3Font.getCharProc(i10);
            if (charProc != null) {
                BoundingBox boundingBox = pDType3Font.getBoundingBox();
                PDRectangle glyphBBox = charProc.getGlyphBBox();
                if (glyphBBox != null) {
                    glyphBBox.setLowerLeftX(Math.max(boundingBox.getLowerLeftX(), glyphBBox.getLowerLeftX()));
                    glyphBBox.setLowerLeftY(Math.max(boundingBox.getLowerLeftY(), glyphBBox.getLowerLeftY()));
                    glyphBBox.setUpperRightX(Math.min(boundingBox.getUpperRightX(), glyphBBox.getUpperRightX()));
                    glyphBBox.setUpperRightY(Math.min(boundingBox.getUpperRightY(), glyphBBox.getUpperRightY()));
                    path = glyphBBox.toGeneralPath();
                }
            }
        } else if (pDFont instanceof PDVectorFont) {
            path = ((PDVectorFont) pDFont).getPath(i10);
        } else if (pDFont instanceof PDSimpleFont) {
            PDSimpleFont pDSimpleFont = (PDSimpleFont) pDFont;
            path = pDSimpleFont.getPath(pDSimpleFont.getEncoding().getName(i10));
        } else {
            pDFont.getClass().toString();
        }
        if (path == null) {
            return -1.0f;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return rectF.height();
    }

    private int resolveRotation(PDAnnotationWidget pDAnnotationWidget) {
        PDAppearanceCharacteristicsDictionary appearanceCharacteristics = pDAnnotationWidget.getAppearanceCharacteristics();
        if (appearanceCharacteristics != null) {
            return appearanceCharacteristics.getRotation();
        }
        return 0;
    }

    private void setAppearanceContent(PDAnnotationWidget pDAnnotationWidget, PDAppearanceStream pDAppearanceStream) {
        this.defaultAppearance.copyNeededResourcesTo(pDAppearanceStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ContentStreamWriter contentStreamWriter = new ContentStreamWriter(byteArrayOutputStream);
        List<Object> list = tokenize(pDAppearanceStream);
        Operator operator = BMC;
        int indexOf = list.indexOf(operator);
        if (indexOf == -1) {
            contentStreamWriter.writeTokens(list);
            contentStreamWriter.writeTokens(COSName.TX, operator);
        } else {
            contentStreamWriter.writeTokens(list.subList(0, indexOf + 1));
        }
        insertGeneratedAppearance(pDAnnotationWidget, pDAppearanceStream, byteArrayOutputStream);
        Operator operator2 = EMC;
        int indexOf2 = list.indexOf(operator2);
        if (indexOf2 == -1) {
            contentStreamWriter.writeTokens(operator2);
        } else {
            contentStreamWriter.writeTokens(list.subList(indexOf2, list.size()));
        }
        byteArrayOutputStream.close();
        writeToStream(byteArrayOutputStream.toByteArray(), pDAppearanceStream);
    }

    private boolean shallComb() {
        PDVariableText pDVariableText = this.field;
        if ((pDVariableText instanceof PDTextField) && ((PDTextField) pDVariableText).isComb() && !((PDTextField) this.field).isMultiline() && !((PDTextField) this.field).isPassword() && !((PDTextField) this.field).isFileSelect()) {
            return true;
        }
        return false;
    }

    private List<Object> tokenize(PDAppearanceStream pDAppearanceStream) {
        PDFStreamParser pDFStreamParser = new PDFStreamParser(pDAppearanceStream);
        pDFStreamParser.parse();
        return pDFStreamParser.getTokens();
    }

    private void validateAndEnsureAcroFormResources() {
        PDResources resources;
        if (this.field.getAcroForm().getDefaultResources() == null) {
            return;
        }
        PDResources defaultResources = this.field.getAcroForm().getDefaultResources();
        for (PDAnnotationWidget pDAnnotationWidget : this.field.getWidgets()) {
            PDAppearanceStream normalAppearanceStream = pDAnnotationWidget.getNormalAppearanceStream();
            if (normalAppearanceStream != null && (resources = normalAppearanceStream.getResources()) != null) {
                for (COSName cOSName : resources.getFontNames()) {
                    try {
                        if (defaultResources.getFont(cOSName) == null) {
                            Objects.toString(cOSName);
                            defaultResources.put(cOSName, resources.getFont(cOSName));
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    private void writeToStream(byte[] bArr, PDAppearanceStream pDAppearanceStream) {
        OutputStream createOutputStream = pDAppearanceStream.getCOSObject().createOutputStream();
        createOutputStream.write(bArr);
        createOutputStream.close();
    }

    public void setAppearanceValue(String str) {
        PDAppearanceStream pDAppearanceStream;
        this.value = getFormattedValue(str);
        PDVariableText pDVariableText = this.field;
        if ((pDVariableText instanceof PDTextField) && !((PDTextField) pDVariableText).isMultiline()) {
            this.value = this.value.replaceAll("\\u000D\\u000A|[\\u000A\\u000B\\u000C\\u000D\\u0085\\u2028\\u2029]", " ");
        }
        for (PDAnnotationWidget pDAnnotationWidget : this.field.getWidgets()) {
            if (pDAnnotationWidget.getCOSObject().containsKey("PMD")) {
                this.field.getFullyQualifiedName();
            } else {
                PDDefaultAppearanceString pDDefaultAppearanceString = this.defaultAppearance;
                if (pDAnnotationWidget.getCOSObject().getDictionaryObject(COSName.DA) != null) {
                    this.defaultAppearance = getWidgetDefaultAppearanceString(pDAnnotationWidget);
                }
                if (pDAnnotationWidget.getRectangle() == null) {
                    pDAnnotationWidget.getCOSObject().removeItem(COSName.AP);
                    this.field.getFullyQualifiedName();
                } else {
                    PDAppearanceDictionary appearance = pDAnnotationWidget.getAppearance();
                    if (appearance == null) {
                        appearance = new PDAppearanceDictionary();
                        pDAnnotationWidget.setAppearance(appearance);
                    }
                    PDAppearanceEntry normalAppearance = appearance.getNormalAppearance();
                    if (isValidAppearanceStream(normalAppearance)) {
                        pDAppearanceStream = normalAppearance.getAppearanceStream();
                    } else {
                        PDAppearanceStream prepareNormalAppearanceStream = prepareNormalAppearanceStream(pDAnnotationWidget);
                        appearance.setNormalAppearance(prepareNormalAppearanceStream);
                        pDAppearanceStream = prepareNormalAppearanceStream;
                    }
                    if (pDAnnotationWidget.getAppearanceCharacteristics() != null || pDAppearanceStream.getContentStream().getLength() == 0) {
                        initializeAppearanceContent(pDAnnotationWidget, pDAppearanceStream);
                    }
                    setAppearanceContent(pDAnnotationWidget, pDAppearanceStream);
                    this.defaultAppearance = pDDefaultAppearanceString;
                }
            }
        }
    }
}
