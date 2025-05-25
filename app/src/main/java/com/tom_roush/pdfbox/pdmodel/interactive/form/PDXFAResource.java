package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInputStream;
import com.tom_roush.pdfbox.cos.COSStream;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.util.XMLUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.w3c.dom.Document;

/* loaded from: classes2.dex */
public final class PDXFAResource implements COSObjectable {
    private static final int BUFFER_SIZE = 1024;
    private final COSBase xfa;

    public PDXFAResource(COSBase cOSBase) {
        this.xfa = cOSBase;
    }

    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        COSInputStream cOSInputStream = null;
        try {
            if (getCOSObject() instanceof COSArray) {
                byte[] bArr = new byte[1024];
                COSArray cOSArray = (COSArray) getCOSObject();
                for (int i10 = 1; i10 < cOSArray.size(); i10 += 2) {
                    COSBase object = cOSArray.getObject(i10);
                    if (object instanceof COSStream) {
                        cOSInputStream = ((COSStream) object).createInputStream();
                        while (true) {
                            int read = cOSInputStream.read(bArr, 0, 1024);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.flush();
                    }
                }
            } else if (this.xfa.getCOSObject() instanceof COSStream) {
                byte[] bArr2 = new byte[1024];
                cOSInputStream = ((COSStream) this.xfa.getCOSObject()).createInputStream();
                while (true) {
                    int read2 = cOSInputStream.read(bArr2, 0, 1024);
                    if (read2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read2);
                }
                byteArrayOutputStream.flush();
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (0 != 0) {
                cOSInputStream.close();
            }
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSBase getCOSObject() {
        return this.xfa;
    }

    public Document getDocument() {
        return XMLUtil.parse(new ByteArrayInputStream(getBytes()), true);
    }
}
