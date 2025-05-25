package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class PDMetadata extends PDStream {
    public PDMetadata(PDDocument pDDocument) {
        super(pDDocument);
        getCOSObject().setName(COSName.TYPE, "Metadata");
        getCOSObject().setName(COSName.SUBTYPE, "XML");
    }

    public InputStream exportXMPMetadata() {
        return createInputStream();
    }

    public void importXMPMetadata(byte[] bArr) {
        OutputStream createOutputStream = createOutputStream();
        createOutputStream.write(bArr);
        createOutputStream.close();
    }

    public PDMetadata(PDDocument pDDocument, InputStream inputStream) {
        super(pDDocument, inputStream);
        getCOSObject().setName(COSName.TYPE, "Metadata");
        getCOSObject().setName(COSName.SUBTYPE, "XML");
    }

    public PDMetadata(COSStream cOSStream) {
        super(cOSStream);
    }
}
