package com.tom_roush.pdfbox.cos;

/* loaded from: classes2.dex */
public interface ICOSVisitor {
    Object visitFromArray(COSArray cOSArray);

    Object visitFromBoolean(COSBoolean cOSBoolean);

    Object visitFromDictionary(COSDictionary cOSDictionary);

    Object visitFromDocument(COSDocument cOSDocument);

    Object visitFromFloat(COSFloat cOSFloat);

    Object visitFromInt(COSInteger cOSInteger);

    Object visitFromName(COSName cOSName);

    Object visitFromNull(COSNull cOSNull);

    Object visitFromStream(COSStream cOSStream);

    Object visitFromString(COSString cOSString);
}
