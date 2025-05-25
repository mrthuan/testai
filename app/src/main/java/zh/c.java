package zh;

import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: AttributeSetImpl.java */
/* loaded from: classes3.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public int f32376a = 0;

    /* renamed from: b  reason: collision with root package name */
    public short[] f32377b = new short[10];
    public int[] c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public int[] f32378d;

    public static int c(m mVar, short s4) {
        m a10;
        if (mVar == null) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        int b10 = mVar.c.b(s4, false);
        if (b10 != Integer.MIN_VALUE) {
            return b10;
        }
        int i10 = mVar.f32393b;
        if (i10 < 0 || (a10 = n.f32394b.a(i10)) == null) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        return c(a10, s4);
    }

    /* renamed from: a */
    public final c clone() {
        c cVar = new c();
        cVar.f32376a = this.f32376a;
        int i10 = this.f32376a;
        short[] sArr = new short[i10];
        System.arraycopy(this.f32377b, 0, sArr, 0, i10);
        cVar.f32377b = sArr;
        int i11 = this.f32376a;
        int[] iArr = new int[i11];
        System.arraycopy(this.c, 0, iArr, 0, i11);
        cVar.c = iArr;
        return cVar;
    }

    public final int b(short s4, boolean z10) {
        int i10;
        m a10;
        int d10;
        int d11 = d(s4);
        if (d11 >= 0) {
            return this.c[d11];
        }
        if (!z10) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        if (s4 < 4095 && (d10 = d(0)) >= 0) {
            i10 = c(n.f32394b.a(this.c[d10]), s4);
        } else {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        int d12 = d(4096);
        if (d12 >= 0 && (a10 = n.f32394b.a(this.c[d12])) != null) {
            return c(a10, s4);
        }
        return i10;
    }

    public final int d(int i10) {
        for (int i11 = 0; i11 < this.f32376a; i11++) {
            if (this.f32377b[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public final void e(int i10, short s4) {
        int i11 = this.f32376a;
        short[] sArr = this.f32377b;
        if (i11 >= sArr.length) {
            int i12 = i11 + 5;
            short[] sArr2 = new short[i12];
            System.arraycopy(sArr, 0, sArr2, 0, i11);
            this.f32377b = sArr2;
            int[] iArr = new int[i12];
            System.arraycopy(this.c, 0, iArr, 0, this.f32376a);
            this.c = iArr;
        }
        int d10 = d(s4);
        if (d10 >= 0) {
            this.c[d10] = i10;
            return;
        }
        short[] sArr3 = this.f32377b;
        int i13 = this.f32376a;
        sArr3[i13] = s4;
        this.c[i13] = i10;
        this.f32376a = i13 + 1;
    }
}
