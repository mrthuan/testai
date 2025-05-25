package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f13350a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public int f13351b = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f13353e = -1;
    public long c = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13356h = false;

    /* renamed from: f  reason: collision with root package name */
    public int f13354f = 30;

    /* renamed from: d  reason: collision with root package name */
    public long f13352d = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f13355g = -1;

    /* renamed from: i  reason: collision with root package name */
    public String f13357i = null;

    public final int a(byte[] bArr, int i10, int i11) {
        int c = c(30, i10, bArr, i11);
        if (c == -1) {
            return -1;
        }
        if (this.c == -1) {
            byte[] bArr2 = this.f13350a;
            long b10 = ((c.b(2, bArr2) << 16) | c.b(0, bArr2)) & 4294967295L;
            this.c = b10;
            if (b10 == 67324752) {
                this.f13356h = false;
                byte[] bArr3 = this.f13350a;
                this.f13352d = ((c.b(20, bArr3) << 16) | c.b(18, bArr3)) & 4294967295L;
                this.f13355g = c.b(8, this.f13350a);
                this.f13353e = c.b(26, this.f13350a);
                int b11 = this.f13353e + 30 + c.b(28, this.f13350a);
                this.f13354f = b11;
                int length = this.f13350a.length;
                if (length < b11) {
                    do {
                        length += length;
                    } while (length < b11);
                    this.f13350a = Arrays.copyOf(this.f13350a, length);
                }
            } else {
                this.f13356h = true;
            }
        }
        int c10 = c(this.f13354f, i10 + c, bArr, i11 - c);
        if (c10 == -1) {
            return -1;
        }
        int i12 = c + c10;
        if (!this.f13356h && this.f13357i == null) {
            this.f13357i = new String(this.f13350a, 30, this.f13353e);
        }
        return i12;
    }

    public final l0 b() {
        int i10 = this.f13351b;
        int i11 = this.f13354f;
        if (i10 < i11) {
            return new l0(this.f13357i, this.f13352d, this.f13355g, true, this.f13356h, Arrays.copyOf(this.f13350a, i10));
        }
        l0 l0Var = new l0(this.f13357i, this.f13352d, this.f13355g, false, this.f13356h, Arrays.copyOf(this.f13350a, i11));
        this.f13351b = 0;
        this.f13353e = -1;
        this.c = -1L;
        this.f13356h = false;
        this.f13354f = 30;
        this.f13352d = -1L;
        this.f13355g = -1;
        this.f13357i = null;
        return l0Var;
    }

    public final int c(int i10, int i11, byte[] bArr, int i12) {
        int i13 = this.f13351b;
        if (i13 < i10) {
            int min = Math.min(i12, i10 - i13);
            System.arraycopy(bArr, i11, this.f13350a, this.f13351b, min);
            int i14 = this.f13351b + min;
            this.f13351b = i14;
            if (i14 < i10) {
                return -1;
            }
            return min;
        }
        return 0;
    }
}
