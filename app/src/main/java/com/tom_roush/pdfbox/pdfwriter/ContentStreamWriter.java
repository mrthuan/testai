package com.tom_roush.pdfbox.pdfwriter;

import com.tom_roush.pdfbox.contentstream.operator.Operator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ContentStreamWriter {
    private final OutputStream output;
    public static final byte[] SPACE = {32};
    public static final byte[] EOL = {10};

    public ContentStreamWriter(OutputStream outputStream) {
        this.output = outputStream;
    }

    private void writeObject(Object obj) {
        if (obj instanceof COSString) {
            COSWriter.writeString((COSString) obj, this.output);
            this.output.write(SPACE);
        } else if (obj instanceof COSFloat) {
            ((COSFloat) obj).writePDF(this.output);
            this.output.write(SPACE);
        } else if (obj instanceof COSInteger) {
            ((COSInteger) obj).writePDF(this.output);
            this.output.write(SPACE);
        } else if (obj instanceof COSBoolean) {
            ((COSBoolean) obj).writePDF(this.output);
            this.output.write(SPACE);
        } else if (obj instanceof COSName) {
            ((COSName) obj).writePDF(this.output);
            this.output.write(SPACE);
        } else if (obj instanceof COSArray) {
            COSArray cOSArray = (COSArray) obj;
            this.output.write(COSWriter.ARRAY_OPEN);
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                writeObject(cOSArray.get(i10));
            }
            this.output.write(COSWriter.ARRAY_CLOSE);
            this.output.write(SPACE);
        } else if (obj instanceof COSDictionary) {
            this.output.write(COSWriter.DICT_OPEN);
            for (Map.Entry<COSName, COSBase> entry : ((COSDictionary) obj).entrySet()) {
                if (entry.getValue() != null) {
                    writeObject(entry.getKey());
                    writeObject(entry.getValue());
                }
            }
            this.output.write(COSWriter.DICT_CLOSE);
            this.output.write(SPACE);
        } else if (obj instanceof Operator) {
            Operator operator = (Operator) obj;
            if (operator.getName().equals(OperatorName.BEGIN_INLINE_IMAGE)) {
                this.output.write(OperatorName.BEGIN_INLINE_IMAGE.getBytes(Charsets.ISO_8859_1));
                this.output.write(EOL);
                COSDictionary imageParameters = operator.getImageParameters();
                for (COSName cOSName : imageParameters.keySet()) {
                    COSBase dictionaryObject = imageParameters.getDictionaryObject(cOSName);
                    cOSName.writePDF(this.output);
                    this.output.write(SPACE);
                    writeObject(dictionaryObject);
                    this.output.write(EOL);
                }
                OutputStream outputStream = this.output;
                Charset charset = Charsets.ISO_8859_1;
                outputStream.write(OperatorName.BEGIN_INLINE_IMAGE_DATA.getBytes(charset));
                OutputStream outputStream2 = this.output;
                byte[] bArr = EOL;
                outputStream2.write(bArr);
                this.output.write(operator.getImageData());
                this.output.write(bArr);
                this.output.write(OperatorName.END_INLINE_IMAGE.getBytes(charset));
                this.output.write(bArr);
                return;
            }
            this.output.write(operator.getName().getBytes(Charsets.ISO_8859_1));
            this.output.write(EOL);
        } else if (obj instanceof COSNull) {
            this.output.write("null".getBytes(Charsets.ISO_8859_1));
            this.output.write(SPACE);
        } else {
            throw new IOException("Error:Unknown type in content stream:" + obj);
        }
    }

    public void writeToken(COSBase cOSBase) {
        writeObject(cOSBase);
    }

    public void writeTokens(Object... objArr) {
        for (Object obj : objArr) {
            writeObject(obj);
        }
        this.output.write("\n".getBytes(Charsets.US_ASCII));
    }

    public void writeToken(Operator operator) {
        writeObject(operator);
    }

    public void writeTokens(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            writeObject(it.next());
        }
    }
}
