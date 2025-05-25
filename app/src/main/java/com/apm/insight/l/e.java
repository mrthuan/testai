package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class e extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    private MessageDigest f6645a;

    /* renamed from: b  reason: collision with root package name */
    private Charset f6646b;
    private a c;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f6646b = null;
        this.f6645a = messageDigest;
        this.c = aVar;
        if (messageDigest != null) {
            this.f6646b = Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i10) {
        super.write(i10);
        MessageDigest messageDigest = this.f6645a;
        if (messageDigest != null) {
            messageDigest.update((byte) i10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        super.write(str, i10, i11);
        if (this.f6645a != null) {
            a aVar = this.c;
            if (aVar == null || aVar.a(str)) {
                this.f6645a.update(this.f6646b.encode(CharBuffer.wrap(str, i10, i11 + i10)).array());
            }
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        super.write(cArr, i10, i11);
        MessageDigest messageDigest = this.f6645a;
        if (messageDigest != null) {
            messageDigest.update(this.f6646b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
