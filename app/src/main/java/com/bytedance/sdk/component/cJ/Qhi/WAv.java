package com.bytedance.sdk.component.cJ.Qhi;

import java.nio.charset.Charset;

/* compiled from: MediaType.java */
/* loaded from: classes.dex */
public final class WAv {
    private String Qhi;
    private String cJ;

    private WAv(String str) {
        this.Qhi = str;
    }

    public static WAv Qhi(String str) {
        return new WAv(str);
    }

    public String Qhi() {
        return this.Qhi;
    }

    public Charset Qhi(Charset charset) {
        try {
            String str = this.cJ;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
