package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class x0 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f13427a = new p1();

    /* renamed from: b  reason: collision with root package name */
    public final File f13428b;
    public final d2 c;

    /* renamed from: d  reason: collision with root package name */
    public long f13429d;

    /* renamed from: e  reason: collision with root package name */
    public long f13430e;

    /* renamed from: f  reason: collision with root package name */
    public FileOutputStream f13431f;

    /* renamed from: g  reason: collision with root package name */
    public l0 f13432g;

    public x0(File file, d2 d2Var) {
        this.f13428b = file;
        this.c = d2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        l0 l0Var;
        int i12;
        int i13 = i10;
        int i14 = i11;
        while (i14 > 0) {
            if (this.f13429d == 0 && this.f13430e == 0) {
                p1 p1Var = this.f13427a;
                int a10 = p1Var.a(bArr, i13, i14);
                if (a10 == -1) {
                    return;
                }
                i13 += a10;
                i14 -= a10;
                l0 b10 = p1Var.b();
                this.f13432g = b10;
                boolean z10 = b10.f13293e;
                d2 d2Var = this.c;
                if (z10) {
                    this.f13429d = 0L;
                    byte[] bArr2 = b10.f13294f;
                    d2Var.k(bArr2.length, bArr2);
                    this.f13430e = this.f13432g.f13294f.length;
                } else {
                    if ((b10.a() == 0) && !this.f13432g.g()) {
                        d2Var.i(this.f13432g.f13294f);
                        File file = new File(this.f13428b, this.f13432g.f13290a);
                        file.getParentFile().mkdirs();
                        this.f13429d = this.f13432g.f13291b;
                        this.f13431f = new FileOutputStream(file);
                    } else {
                        byte[] bArr3 = this.f13432g.f13294f;
                        d2Var.k(bArr3.length, bArr3);
                        this.f13429d = this.f13432g.f13291b;
                    }
                }
            }
            int i15 = i13;
            int i16 = i14;
            if (this.f13432g.g()) {
                i13 = i15;
                i14 = i16;
            } else {
                long j10 = i16;
                l0 l0Var2 = this.f13432g;
                if (l0Var2.f13293e) {
                    this.c.d(this.f13430e, bArr, i15, i16);
                    this.f13430e += j10;
                    i12 = i16;
                } else {
                    if (l0Var2.a() == 0) {
                        i12 = (int) Math.min(j10, this.f13429d);
                        this.f13431f.write(bArr, i15, i12);
                        long j11 = this.f13429d - i12;
                        this.f13429d = j11;
                        if (j11 == 0) {
                            this.f13431f.close();
                        }
                    } else {
                        int min = (int) Math.min(j10, this.f13429d);
                        this.c.d((this.f13432g.f13291b + l0Var.f13294f.length) - this.f13429d, bArr, i15, min);
                        this.f13429d -= min;
                        i12 = min;
                    }
                }
                i14 = i16 - i12;
                i13 = i15 + i12;
            }
        }
    }
}
