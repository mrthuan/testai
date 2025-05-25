package com.tom_roush.fontbox.util;

import java.nio.charset.Charset;
import lib.zj.office.fc.codec.CharEncoding;

/* loaded from: classes2.dex */
public final class Charsets {
    public static final Charset ISO_8859_1 = Charset.forName(CharEncoding.ISO_8859_1);
    public static final Charset UTF_16 = Charset.forName(CharEncoding.UTF_16);
    public static final Charset UTF_16BE = Charset.forName(CharEncoding.UTF_16BE);
    public static final Charset US_ASCII = Charset.forName(CharEncoding.US_ASCII);
    public static final Charset ISO_10646 = Charset.forName("ISO-10646-UCS-2");

    private Charsets() {
    }
}
