package com.tom_roush.pdfbox.pdmodel.font;

/* loaded from: classes2.dex */
public final class FontMappers {
    private static FontMapper instance;

    /* loaded from: classes2.dex */
    public static class DefaultFontMapper {
        private static final FontMapper INSTANCE = new FontMapperImpl();

        private DefaultFontMapper() {
        }
    }

    private FontMappers() {
    }

    public static FontMapper instance() {
        if (instance == null) {
            instance = DefaultFontMapper.INSTANCE;
        }
        return instance;
    }

    public static synchronized void set(FontMapper fontMapper) {
        synchronized (FontMappers.class) {
            instance = fontMapper;
        }
    }
}
