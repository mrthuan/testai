package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDPageContentStream;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.font.PDFont;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColorSpace;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceGray;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
class PDDefaultAppearanceString {
    private static final float DEFAULT_FONT_SIZE = 12.0f;
    private final PDResources defaultResources;
    private PDFont font;
    private PDColor fontColor;
    private COSName fontName;
    private float fontSize = DEFAULT_FONT_SIZE;

    public PDDefaultAppearanceString(COSString cOSString, PDResources pDResources) {
        if (cOSString != null) {
            if (pDResources != null) {
                this.defaultResources = pDResources;
                processAppearanceStringOperators(cOSString.getBytes());
                return;
            }
            throw new IllegalArgumentException("/DR is a required entry");
        }
        throw new IllegalArgumentException("/DA is a required entry. Please set a default appearance first.");
    }

    private void processAppearanceStringOperators(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(bArr);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                processOperator((Operator) parseNextToken, arrayList);
                arrayList = new ArrayList();
            } else {
                arrayList.add((COSBase) parseNextToken);
            }
        }
    }

    private void processOperator(Operator operator, List<COSBase> list) {
        String name = operator.getName();
        if (OperatorName.SET_FONT_AND_SIZE.equals(name)) {
            processSetFont(list);
        } else if (OperatorName.NON_STROKING_GRAY.equals(name)) {
            processSetFontColor(list);
        } else if (OperatorName.NON_STROKING_RGB.equals(name)) {
            processSetFontColor(list);
        } else if (OperatorName.NON_STROKING_CMYK.equals(name)) {
            processSetFontColor(list);
        }
    }

    private void processSetFont(List<COSBase> list) {
        if (list.size() >= 2) {
            COSBase cOSBase = list.get(0);
            COSBase cOSBase2 = list.get(1);
            if (!(cOSBase instanceof COSName) || !(cOSBase2 instanceof COSNumber)) {
                return;
            }
            COSName cOSName = (COSName) cOSBase;
            PDFont font = this.defaultResources.getFont(cOSName);
            float floatValue = ((COSNumber) cOSBase2).floatValue();
            if (font != null) {
                setFontName(cOSName);
                setFont(font);
                setFontSize(floatValue);
                return;
            }
            throw new IOException("Could not find font: /" + cOSName.getName());
        }
        throw new IOException("Missing operands for set font operator " + Arrays.toString(list.toArray()));
    }

    private void processSetFontColor(List<COSBase> list) {
        PDColorSpace pDColorSpace;
        int size = list.size();
        if (size != 1) {
            if (size != 3) {
                if (size == 4) {
                    pDColorSpace = PDDeviceRGB.INSTANCE;
                } else {
                    throw new IOException("Missing operands for set non stroking color operator " + Arrays.toString(list.toArray()));
                }
            } else {
                pDColorSpace = PDDeviceRGB.INSTANCE;
            }
        } else {
            pDColorSpace = PDDeviceGray.INSTANCE;
        }
        COSArray cOSArray = new COSArray();
        cOSArray.addAll(list);
        setFontColor(new PDColor(cOSArray, pDColorSpace));
    }

    public void copyNeededResourcesTo(PDAppearanceStream pDAppearanceStream) {
        PDResources resources = pDAppearanceStream.getResources();
        if (resources == null) {
            resources = new PDResources();
            pDAppearanceStream.setResources(resources);
        }
        if (resources.getFont(this.fontName) == null) {
            resources.put(this.fontName, getFont());
        }
    }

    public PDFont getFont() {
        return this.font;
    }

    public PDColor getFontColor() {
        return this.fontColor;
    }

    public COSName getFontName() {
        return this.fontName;
    }

    public float getFontSize() {
        return this.fontSize;
    }

    public void setFont(PDFont pDFont) {
        this.font = pDFont;
    }

    public void setFontColor(PDColor pDColor) {
        this.fontColor = pDColor;
    }

    public void setFontName(COSName cOSName) {
        this.fontName = cOSName;
    }

    public void setFontSize(float f10) {
        this.fontSize = f10;
    }

    public void writeTo(PDPageContentStream pDPageContentStream, float f10) {
        float fontSize = getFontSize();
        if (fontSize != 0.0f) {
            f10 = fontSize;
        }
        pDPageContentStream.setFont(getFont(), f10);
        if (getFontColor() != null) {
            pDPageContentStream.setNonStrokingColor(getFontColor());
        }
    }
}
