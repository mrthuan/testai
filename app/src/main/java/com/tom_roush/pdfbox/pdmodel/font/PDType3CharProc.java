package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.contentstream.PDContentStream;
import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdfparser.PDFStreamParser;
import com.tom_roush.pdfbox.pdmodel.PDResources;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.util.Matrix;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class PDType3CharProc implements COSObjectable, PDContentStream {
    private final COSStream charStream;
    private final PDType3Font font;

    public PDType3CharProc(PDType3Font pDType3Font, COSStream cOSStream) {
        this.font = pDType3Font;
        this.charStream = cOSStream;
    }

    private float parseWidth(Operator operator, List<COSBase> list) {
        if (!operator.getName().equals(OperatorName.TYPE3_D0) && !operator.getName().equals(OperatorName.TYPE3_D1)) {
            throw new IOException("First operator must be d0 or d1");
        }
        COSBase cOSBase = list.get(0);
        if (cOSBase instanceof COSNumber) {
            return ((COSNumber) cOSBase).floatValue();
        }
        throw new IOException("Unexpected argument type: ".concat(cOSBase.getClass().getName()));
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDRectangle getBBox() {
        return this.font.getFontBBox();
    }

    public PDStream getContentStream() {
        return new PDStream(this.charStream);
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public InputStream getContents() {
        return this.charStream.createInputStream();
    }

    public PDType3Font getFont() {
        return this.font;
    }

    public PDRectangle getGlyphBBox() {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(this);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                if (!((Operator) parseNextToken).getName().equals(OperatorName.TYPE3_D1) || arrayList.size() != 6) {
                    return null;
                }
                for (int i10 = 0; i10 < 6; i10++) {
                    if (!(arrayList.get(i10) instanceof COSNumber)) {
                        return null;
                    }
                }
                return new PDRectangle(((COSNumber) arrayList.get(2)).floatValue(), ((COSNumber) arrayList.get(3)).floatValue(), ((COSNumber) arrayList.get(4)).floatValue() - ((COSNumber) arrayList.get(2)).floatValue(), ((COSNumber) arrayList.get(5)).floatValue() - ((COSNumber) arrayList.get(3)).floatValue());
            }
            arrayList.add((COSBase) parseNextToken);
        }
        return null;
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public Matrix getMatrix() {
        return this.font.getFontMatrix();
    }

    @Override // com.tom_roush.pdfbox.contentstream.PDContentStream
    public PDResources getResources() {
        return this.font.getResources();
    }

    public float getWidth() {
        ArrayList arrayList = new ArrayList();
        PDFStreamParser pDFStreamParser = new PDFStreamParser(this);
        for (Object parseNextToken = pDFStreamParser.parseNextToken(); parseNextToken != null; parseNextToken = pDFStreamParser.parseNextToken()) {
            if (parseNextToken instanceof Operator) {
                return parseWidth((Operator) parseNextToken, arrayList);
            }
            arrayList.add((COSBase) parseNextToken);
        }
        throw new IOException("Unexpected end of stream");
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSStream getCOSObject() {
        return this.charStream;
    }
}
