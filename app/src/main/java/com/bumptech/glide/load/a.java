package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.util.List;
import w3.b;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int b10 = ((ImageHeaderParser) list.get(i10)).b(inputStream, bVar);
                if (b10 != -1) {
                    return b10;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType c = ((ImageHeaderParser) list.get(i10)).c(inputStream);
                inputStream.reset();
                if (c != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
