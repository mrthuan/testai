package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class o0 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f13343a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f13344b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13345d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13346e;

    public o0(InputStream inputStream) {
        super(inputStream);
        this.f13343a = new p1();
        this.f13344b = new byte[4096];
        this.f13345d = false;
        this.f13346e = false;
    }

    public final l0 a() {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.f13344b;
            } while (read(bArr, 0, bArr.length) != -1);
            if (this.f13345d && !this.f13346e) {
                boolean b10 = b(30);
                p1 p1Var = this.f13343a;
                if (!b10) {
                    this.f13345d = true;
                    return p1Var.b();
                }
                l0 b11 = p1Var.b();
                if (b11.f13293e) {
                    this.f13346e = true;
                    return b11;
                } else if (b11.f13291b != 4294967295L) {
                    int i10 = p1Var.f13354f - 30;
                    int length = this.f13344b.length;
                    long j10 = i10;
                    if (j10 > length) {
                        do {
                            length += length;
                        } while (length < j10);
                        this.f13344b = Arrays.copyOf(this.f13344b, length);
                    }
                    if (!b(i10)) {
                        this.f13345d = true;
                        return p1Var.b();
                    }
                    l0 b12 = p1Var.b();
                    this.c = b12.f13291b;
                    return b12;
                } else {
                    throw new ck("Files bigger than 4GiB are not supported.");
                }
            }
            return new l0(null, -1L, -1, false, false, null);
        }
        if (this.f13345d) {
        }
        return new l0(null, -1L, -1, false, false, null);
    }

    public final boolean b(int i10) {
        int max = Math.max(0, super.read(this.f13344b, 0, i10));
        p1 p1Var = this.f13343a;
        if (max != i10) {
            int i11 = i10 - max;
            if (Math.max(0, super.read(this.f13344b, max, i11)) != i11) {
                p1Var.a(this.f13344b, 0, max);
                return false;
            }
        }
        p1Var.a(this.f13344b, 0, i10);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.c;
        if (j10 <= 0 || this.f13345d) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i10, (int) Math.min(j10, i11)));
        this.c -= max;
        if (max == 0) {
            this.f13345d = true;
            return 0;
        }
        return max;
    }
}
