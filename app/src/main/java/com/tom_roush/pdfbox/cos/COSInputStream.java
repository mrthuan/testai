package com.tom_roush.pdfbox.cos;

import a0.a;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.io.RandomAccess;
import com.tom_roush.pdfbox.io.RandomAccessInputStream;
import com.tom_roush.pdfbox.io.RandomAccessOutputStream;
import com.tom_roush.pdfbox.io.ScratchFile;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class COSInputStream extends FilterInputStream {
    private final List<DecodeResult> decodeResults;

    private COSInputStream(InputStream inputStream, List<DecodeResult> list) {
        super(inputStream);
        this.decodeResults = list;
    }

    public static COSInputStream create(List<Filter> list, COSDictionary cOSDictionary, InputStream inputStream, ScratchFile scratchFile) {
        return create(list, cOSDictionary, inputStream, scratchFile, DecodeOptions.DEFAULT);
    }

    public DecodeResult getDecodeResult() {
        if (this.decodeResults.isEmpty()) {
            return DecodeResult.DEFAULT;
        }
        return (DecodeResult) a.f(this.decodeResults, -1);
    }

    public static COSInputStream create(List<Filter> list, COSDictionary cOSDictionary, InputStream inputStream, ScratchFile scratchFile, DecodeOptions decodeOptions) {
        InputStream byteArrayInputStream;
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            if (new HashSet(list).size() == list.size()) {
                InputStream inputStream2 = inputStream;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    if (scratchFile != null) {
                        final RandomAccess createBuffer = scratchFile.createBuffer();
                        arrayList.add(list.get(i10).decode(inputStream2, new RandomAccessOutputStream(createBuffer), cOSDictionary, i10, decodeOptions));
                        byteArrayInputStream = new RandomAccessInputStream(createBuffer) { // from class: com.tom_roush.pdfbox.cos.COSInputStream.1
                            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                            public void close() {
                                createBuffer.close();
                            }
                        };
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        arrayList.add(list.get(i10).decode(inputStream2, byteArrayOutputStream, cOSDictionary, i10, decodeOptions));
                        byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    }
                    inputStream2 = byteArrayInputStream;
                }
                inputStream = inputStream2;
            } else {
                throw new IOException("Duplicate");
            }
        }
        return new COSInputStream(inputStream, arrayList);
    }
}
