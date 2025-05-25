package com.tom_roush.pdfbox.pdmodel.interactive.annotation;

import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.graphics.form.PDFormXObject;

/* loaded from: classes2.dex */
public class PDAppearanceStream extends PDFormXObject {
    public PDAppearanceStream(COSStream cOSStream) {
        super(cOSStream);
    }

    public PDAppearanceStream(PDDocument pDDocument) {
        super(pDDocument);
    }
}
