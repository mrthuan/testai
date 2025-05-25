package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import w3.b;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        ImageType(boolean z10) {
            this.hasAlpha = z10;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);
}
