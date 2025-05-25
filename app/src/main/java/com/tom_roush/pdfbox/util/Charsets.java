package com.tom_roush.pdfbox.util;

import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public final class Charsets {
    public static final Charset US_ASCII = Charset.forName(CharEncoding.US_ASCII);
    public static final Charset UTF_16BE = Charset.forName(CharEncoding.UTF_16BE);
    public static final Charset UTF_16LE = Charset.forName(CharEncoding.UTF_16LE);
    public static final Charset ISO_8859_1 = Charset.forName(CharEncoding.ISO_8859_1);
    public static final Charset WINDOWS_1252 = Charset.forName("Windows-1252");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Charsets() {
    }
}
