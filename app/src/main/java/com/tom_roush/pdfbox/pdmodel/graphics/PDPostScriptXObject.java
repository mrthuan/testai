package com.tom_roush.pdfbox.pdmodel.graphics;

import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;

/* loaded from: classes2.dex */
public class PDPostScriptXObject extends PDXObject {
    public PDPostScriptXObject(COSStream cOSStream) {
        super(cOSStream, COSName.PS);
    }
}
