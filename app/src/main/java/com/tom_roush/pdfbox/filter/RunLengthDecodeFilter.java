package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
final class RunLengthDecodeFilter extends Filter {
    private static final int RUN_LENGTH_EOD = 128;

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i10) {
        byte[] bArr = new byte[128];
        while (true) {
            int read = inputStream.read();
            if (read == -1 || read == 128) {
                break;
            }
            if (read <= 127) {
                int i11 = read + 1;
                while (i11 > 0) {
                    int read2 = inputStream.read(bArr, 0, i11);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    i11 -= read2;
                }
            } else {
                int read3 = inputStream.read();
                if (read3 == -1) {
                    break;
                }
                for (int i12 = 0; i12 < 257 - read; i12++) {
                    outputStream.write(read3);
                }
            }
        }
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
    }
}
