package s3;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.pdfeditor.Annotation;
import s3.a;

/* compiled from: StandardGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f29730a;
    public final a.InterfaceC0373a c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f29732d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f29733e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f29734f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f29735g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f29736h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f29737i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f29738j;

    /* renamed from: k  reason: collision with root package name */
    public int f29739k;

    /* renamed from: l  reason: collision with root package name */
    public c f29740l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f29741m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f29742n;

    /* renamed from: o  reason: collision with root package name */
    public int f29743o;

    /* renamed from: p  reason: collision with root package name */
    public int f29744p;

    /* renamed from: q  reason: collision with root package name */
    public int f29745q;

    /* renamed from: r  reason: collision with root package name */
    public int f29746r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f29747s;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f29731b = new int[256];

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f29748t = Bitmap.Config.ARGB_8888;

    public e(g4.b bVar, c cVar, ByteBuffer byteBuffer, int i10) {
        byte[] bArr;
        int[] iArr;
        this.c = bVar;
        this.f29740l = new c();
        synchronized (this) {
            if (i10 > 0) {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f29743o = 0;
                this.f29740l = cVar;
                this.f29739k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f29732d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f29732d.order(ByteOrder.LITTLE_ENDIAN);
                this.f29742n = false;
                Iterator it = cVar.f29720e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f29712g == 3) {
                        this.f29742n = true;
                        break;
                    }
                }
                this.f29744p = highestOneBit;
                int i11 = cVar.f29721f;
                this.f29746r = i11 / highestOneBit;
                int i12 = cVar.f29722g;
                this.f29745q = i12 / highestOneBit;
                int i13 = i11 * i12;
                w3.b bVar2 = ((g4.b) this.c).f17629b;
                if (bVar2 == null) {
                    bArr = new byte[i13];
                } else {
                    bArr = (byte[]) bVar2.c(i13, byte[].class);
                }
                this.f29737i = bArr;
                a.InterfaceC0373a interfaceC0373a = this.c;
                int i14 = this.f29746r * this.f29745q;
                w3.b bVar3 = ((g4.b) interfaceC0373a).f17629b;
                if (bVar3 == null) {
                    iArr = new int[i14];
                } else {
                    iArr = (int[]) bVar3.c(i14, int[].class);
                }
                this.f29738j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        }
    }

    @Override // s3.a
    public final synchronized Bitmap a() {
        b bVar;
        byte[] bArr;
        if (this.f29740l.c <= 0 || this.f29739k < 0) {
            if (Log.isLoggable(Annotation.KEY_E, 3)) {
                int i10 = this.f29740l.c;
            }
            this.f29743o = 1;
        }
        int i11 = this.f29743o;
        if (i11 != 1 && i11 != 2) {
            this.f29743o = 0;
            if (this.f29733e == null) {
                w3.b bVar2 = ((g4.b) this.c).f17629b;
                if (bVar2 == null) {
                    bArr = new byte[FunctionEval.FunctionID.EXTERNAL_FUNC];
                } else {
                    bArr = (byte[]) bVar2.c(FunctionEval.FunctionID.EXTERNAL_FUNC, byte[].class);
                }
                this.f29733e = bArr;
            }
            b bVar3 = (b) this.f29740l.f29720e.get(this.f29739k);
            int i12 = this.f29739k - 1;
            if (i12 >= 0) {
                bVar = (b) this.f29740l.f29720e.get(i12);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.f29716k;
            if (iArr == null) {
                iArr = this.f29740l.f29717a;
            }
            this.f29730a = iArr;
            if (iArr == null) {
                Log.isLoggable(Annotation.KEY_E, 3);
                this.f29743o = 1;
                return null;
            }
            if (bVar3.f29711f) {
                System.arraycopy(iArr, 0, this.f29731b, 0, iArr.length);
                int[] iArr2 = this.f29731b;
                this.f29730a = iArr2;
                iArr2[bVar3.f29713h] = 0;
                if (bVar3.f29712g == 2 && this.f29739k == 0) {
                    this.f29747s = Boolean.TRUE;
                }
            }
            return i(bVar3, bVar);
        }
        Log.isLoggable(Annotation.KEY_E, 3);
        return null;
    }

    @Override // s3.a
    public final void b() {
        this.f29739k = (this.f29739k + 1) % this.f29740l.c;
    }

    @Override // s3.a
    public final int c() {
        return this.f29740l.c;
    }

    @Override // s3.a
    public final void clear() {
        w3.b bVar;
        w3.b bVar2;
        w3.b bVar3;
        this.f29740l = null;
        byte[] bArr = this.f29737i;
        a.InterfaceC0373a interfaceC0373a = this.c;
        if (bArr != null && (bVar3 = ((g4.b) interfaceC0373a).f17629b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f29738j;
        if (iArr != null && (bVar2 = ((g4.b) interfaceC0373a).f17629b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f29741m;
        if (bitmap != null) {
            ((g4.b) interfaceC0373a).f17628a.d(bitmap);
        }
        this.f29741m = null;
        this.f29732d = null;
        this.f29747s = null;
        byte[] bArr2 = this.f29733e;
        if (bArr2 != null && (bVar = ((g4.b) interfaceC0373a).f17629b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // s3.a
    public final int d() {
        int i10;
        c cVar = this.f29740l;
        int i11 = cVar.c;
        if (i11 > 0 && (i10 = this.f29739k) >= 0) {
            if (i10 >= 0 && i10 < i11) {
                return ((b) cVar.f29720e.get(i10)).f29714i;
            }
            return -1;
        }
        return 0;
    }

    @Override // s3.a
    public final int e() {
        return this.f29739k;
    }

    @Override // s3.a
    public final int f() {
        return (this.f29738j.length * 4) + this.f29732d.limit() + this.f29737i.length;
    }

    public final Bitmap g() {
        Bitmap.Config config;
        Boolean bool = this.f29747s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f29748t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c = ((g4.b) this.c).f17628a.c(this.f29746r, this.f29745q, config);
        c.setHasAlpha(true);
        return c;
    }

    @Override // s3.a
    public final ByteBuffer getData() {
        return this.f29732d;
    }

    public final void h(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.f29748t = config;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3.f29725j == r36.f29713h) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap i(s3.b r36, s3.b r37) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.e.i(s3.b, s3.b):android.graphics.Bitmap");
    }
}
