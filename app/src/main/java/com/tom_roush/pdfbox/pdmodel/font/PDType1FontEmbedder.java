package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.fontbox.afm.FontMetrics;
import com.tom_roush.fontbox.encoding.BuiltInEncoding;
import com.tom_roush.fontbox.pfb.PfbParser;
import com.tom_roush.fontbox.type1.Type1Font;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.PDRectangle;
import com.tom_roush.pdfbox.pdmodel.common.PDStream;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Encoding;
import com.tom_roush.pdfbox.pdmodel.font.encoding.GlyphList;
import com.tom_roush.pdfbox.pdmodel.font.encoding.Type1Encoding;
import java.io.InputStream;
import java.util.ArrayList;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PDType1FontEmbedder {
    private final Encoding fontEncoding;
    private final Type1Font type1;

    public PDType1FontEmbedder(PDDocument pDDocument, COSDictionary cOSDictionary, InputStream inputStream, Encoding encoding) {
        cOSDictionary.setItem(COSName.SUBTYPE, COSName.TYPE1);
        byte[] byteArray = IOUtils.toByteArray(inputStream);
        PfbParser pfbParser = new PfbParser(byteArray);
        Type1Font createWithPFB = Type1Font.createWithPFB(byteArray);
        this.type1 = createWithPFB;
        if (encoding == null) {
            this.fontEncoding = Type1Encoding.fromFontBox(createWithPFB.getEncoding());
        } else {
            this.fontEncoding = encoding;
        }
        PDFontDescriptor buildFontDescriptor = buildFontDescriptor(createWithPFB);
        PDStream pDStream = new PDStream(pDDocument, pfbParser.getInputStream(), COSName.FLATE_DECODE);
        pDStream.getCOSObject().setInt("Length", pfbParser.size());
        int i10 = 0;
        while (i10 < pfbParser.getLengths().length) {
            COSStream cOSObject = pDStream.getCOSObject();
            StringBuilder sb2 = new StringBuilder("Length");
            int i11 = i10 + 1;
            sb2.append(i11);
            cOSObject.setInt(sb2.toString(), pfbParser.getLengths()[i10]);
            i10 = i11;
        }
        buildFontDescriptor.setFontFile(pDStream);
        cOSDictionary.setItem(COSName.FONT_DESC, buildFontDescriptor);
        cOSDictionary.setName(COSName.BASE_FONT, this.type1.getName());
        ArrayList arrayList = new ArrayList(256);
        for (int i12 = 0; i12 <= 255; i12++) {
            arrayList.add(Integer.valueOf(Math.round(this.type1.getWidth(this.fontEncoding.getName(i12)))));
        }
        cOSDictionary.setInt(COSName.FIRST_CHAR, 0);
        cOSDictionary.setInt(COSName.LAST_CHAR, FunctionEval.FunctionID.EXTERNAL_FUNC);
        cOSDictionary.setItem(COSName.WIDTHS, COSArrayList.converterToCOSArray(arrayList));
        cOSDictionary.setItem(COSName.ENCODING, encoding);
    }

    public static PDFontDescriptor buildFontDescriptor(Type1Font type1Font) {
        boolean z10 = type1Font.getEncoding() instanceof BuiltInEncoding;
        PDFontDescriptor pDFontDescriptor = new PDFontDescriptor();
        pDFontDescriptor.setFontName(type1Font.getName());
        pDFontDescriptor.setFontFamily(type1Font.getFamilyName());
        pDFontDescriptor.setNonSymbolic(!z10);
        pDFontDescriptor.setSymbolic(z10);
        pDFontDescriptor.setFontBoundingBox(new PDRectangle(type1Font.getFontBBox()));
        pDFontDescriptor.setItalicAngle(type1Font.getItalicAngle());
        pDFontDescriptor.setAscent(type1Font.getFontBBox().getUpperRightY());
        pDFontDescriptor.setDescent(type1Font.getFontBBox().getLowerLeftY());
        pDFontDescriptor.setCapHeight(type1Font.getBlueValues().get(2).floatValue());
        pDFontDescriptor.setStemV(0.0f);
        return pDFontDescriptor;
    }

    public Encoding getFontEncoding() {
        return this.fontEncoding;
    }

    public GlyphList getGlyphList() {
        return GlyphList.getAdobeGlyphList();
    }

    public Type1Font getType1Font() {
        return this.type1;
    }

    public static PDFontDescriptor buildFontDescriptor(FontMetrics fontMetrics) {
        boolean equals = fontMetrics.getEncodingScheme().equals("FontSpecific");
        PDFontDescriptor pDFontDescriptor = new PDFontDescriptor();
        pDFontDescriptor.setFontName(fontMetrics.getFontName());
        pDFontDescriptor.setFontFamily(fontMetrics.getFamilyName());
        pDFontDescriptor.setNonSymbolic(!equals);
        pDFontDescriptor.setSymbolic(equals);
        pDFontDescriptor.setFontBoundingBox(new PDRectangle(fontMetrics.getFontBBox()));
        pDFontDescriptor.setItalicAngle(fontMetrics.getItalicAngle());
        pDFontDescriptor.setAscent(fontMetrics.getAscender());
        pDFontDescriptor.setDescent(fontMetrics.getDescender());
        pDFontDescriptor.setCapHeight(fontMetrics.getCapHeight());
        pDFontDescriptor.setXHeight(fontMetrics.getXHeight());
        pDFontDescriptor.setAverageWidth(fontMetrics.getAverageCharacterWidth());
        pDFontDescriptor.setCharacterSet(fontMetrics.getCharacterSet());
        pDFontDescriptor.setStemV(0.0f);
        return pDFontDescriptor;
    }
}
