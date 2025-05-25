package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
final class FlateFilter extends Filter {
    private static final int BUFFER_SIZE = 16384;

    private void decompress(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int read = inputStream.read(bArr);
        if (read > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, read);
            byte[] bArr2 = new byte[1024];
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        int inflate = inflater.inflate(bArr2);
                        if (inflate != 0) {
                            outputStream.write(bArr2, 0, inflate);
                            z10 = true;
                        } else if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                            break;
                        } else {
                            inflater.setInput(bArr, 0, inputStream.read(bArr));
                        }
                    } catch (DataFormatException e10) {
                        if (!z10) {
                            throw e10;
                        }
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        try {
            decompress(inputStream, Predictor.wrapPredictor(outputStream, getDecodeParams(cOSDictionary, i10)));
            return new DecodeResult(cOSDictionary);
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        Deflater deflater = new Deflater(Filter.getCompressionLevel());
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
        int available = inputStream.available();
        if (available > 0) {
            byte[] bArr = new byte[Math.min(available, 16384)];
            while (true) {
                int read = inputStream.read(bArr, 0, Math.min(available, 16384));
                if (read == -1) {
                    break;
                }
                deflaterOutputStream.write(bArr, 0, read);
            }
        }
        deflaterOutputStream.close();
        outputStream.flush();
        deflater.end();
    }
}
