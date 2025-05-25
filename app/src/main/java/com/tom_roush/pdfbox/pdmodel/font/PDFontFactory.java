package com.tom_roush.pdfbox.pdmodel.font;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.ResourceCache;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class PDFontFactory {
    private PDFontFactory() {
    }

    @Deprecated
    public static PDFont createDefaultFont() {
        return PDType1Font.HELVETICA;
    }

    public static PDCIDFont createDescendantFont(COSDictionary cOSDictionary, PDType0Font pDType0Font) {
        COSName cOSName = COSName.TYPE;
        COSName cOSName2 = COSName.FONT;
        COSName cOSName3 = cOSDictionary.getCOSName(cOSName, cOSName2);
        if (cOSName2.equals(cOSName3)) {
            COSName cOSName4 = cOSDictionary.getCOSName(COSName.SUBTYPE);
            if (COSName.CID_FONT_TYPE0.equals(cOSName4)) {
                return new PDCIDFontType0(cOSDictionary, pDType0Font);
            }
            if (COSName.CID_FONT_TYPE2.equals(cOSName4)) {
                return new PDCIDFontType2(cOSDictionary, pDType0Font);
            }
            throw new IOException("Invalid font type: " + cOSName3);
        }
        throw new IllegalArgumentException("Expected 'Font' dictionary but found '" + cOSName3.getName() + OperatorName.SHOW_TEXT_LINE);
    }

    public static PDFont createFont(COSDictionary cOSDictionary) {
        return createFont(cOSDictionary, null);
    }

    public static PDFont createFont(COSDictionary cOSDictionary, ResourceCache resourceCache) {
        COSName cOSName = COSName.TYPE;
        COSName cOSName2 = COSName.FONT;
        COSName cOSName3 = cOSDictionary.getCOSName(cOSName, cOSName2);
        if (!cOSName2.equals(cOSName3)) {
            cOSName3.getName();
        }
        COSName cOSName4 = cOSDictionary.getCOSName(COSName.SUBTYPE);
        if (COSName.TYPE1.equals(cOSName4)) {
            COSBase dictionaryObject = cOSDictionary.getDictionaryObject(COSName.FONT_DESC);
            if ((dictionaryObject instanceof COSDictionary) && ((COSDictionary) dictionaryObject).containsKey(COSName.FONT_FILE3)) {
                return new PDType1CFont(cOSDictionary);
            }
            return new PDType1Font(cOSDictionary);
        } else if (COSName.MM_TYPE1.equals(cOSName4)) {
            COSBase dictionaryObject2 = cOSDictionary.getDictionaryObject(COSName.FONT_DESC);
            if ((dictionaryObject2 instanceof COSDictionary) && ((COSDictionary) dictionaryObject2).containsKey(COSName.FONT_FILE3)) {
                return new PDType1CFont(cOSDictionary);
            }
            return new PDMMType1Font(cOSDictionary);
        } else if (COSName.TRUE_TYPE.equals(cOSName4)) {
            return new PDTrueTypeFont(cOSDictionary);
        } else {
            if (COSName.TYPE3.equals(cOSName4)) {
                return new PDType3Font(cOSDictionary, resourceCache);
            }
            if (COSName.TYPE0.equals(cOSName4)) {
                return new PDType0Font(cOSDictionary);
            }
            if (!COSName.CID_FONT_TYPE0.equals(cOSName4)) {
                if (!COSName.CID_FONT_TYPE2.equals(cOSName4)) {
                    Objects.toString(cOSName4);
                    return new PDType1Font(cOSDictionary);
                }
                throw new IllegalArgumentException("Type 2 descendant font not allowed");
            }
            throw new IllegalArgumentException("Type 0 descendant font not allowed");
        }
    }
}
