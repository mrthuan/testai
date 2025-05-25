package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* renamed from: com.inmobi.media.f3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1622f3 {

    /* renamed from: a  reason: collision with root package name */
    public final C1636g3 f15045a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean[] f15046b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C1664i3 f15047d;

    public C1622f3(C1664i3 c1664i3, C1636g3 c1636g3) {
        boolean[] zArr;
        this.f15047d = c1664i3;
        this.f15045a = c1636g3;
        if (c1636g3.c) {
            zArr = null;
        } else {
            zArr = new boolean[c1664i3.f15174h];
        }
        this.f15046b = zArr;
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        C1608e3 c1608e3;
        synchronized (this.f15047d) {
            C1636g3 c1636g3 = this.f15045a;
            if (c1636g3.f15090d == this) {
                if (!c1636g3.c) {
                    this.f15046b[i10] = true;
                }
                File b10 = c1636g3.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(b10);
                } catch (FileNotFoundException unused) {
                    this.f15047d.f15168a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b10);
                    } catch (FileNotFoundException unused2) {
                        return C1664i3.f15167q;
                    }
                }
                c1608e3 = new C1608e3(this, fileOutputStream);
            } else {
                throw new IllegalStateException();
            }
        }
        return c1608e3;
    }

    public final void a(String str, int i10) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            outputStreamWriter = new OutputStreamWriter(a(i10), Ub.f14742b);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            outputStreamWriter.write(str);
            Ub.a(outputStreamWriter);
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter2 = outputStreamWriter;
            Ub.a(outputStreamWriter2);
            throw th;
        }
    }
}
