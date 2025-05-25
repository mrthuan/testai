package s3;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f29728b;
    public c c;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f29727a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f29729d = 0;

    public final boolean a() {
        if (this.c.f29718b != 0) {
            return true;
        }
        return false;
    }

    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        boolean z13;
        if (this.f29728b != null) {
            if (a()) {
                return this.c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.c.f29718b = 1;
            } else {
                this.c.f29721f = f();
                this.c.f29722g = f();
                int c = c();
                c cVar = this.c;
                if ((c & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f29723h = z10;
                cVar.f29724i = (int) Math.pow(2.0d, (c & 7) + 1);
                this.c.f29725j = c();
                c cVar2 = this.c;
                c();
                cVar2.getClass();
                if (this.c.f29723h && !a()) {
                    c cVar3 = this.c;
                    cVar3.f29717a = e(cVar3.f29724i);
                    c cVar4 = this.c;
                    cVar4.f29726k = cVar4.f29717a[cVar4.f29725j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c10 = c();
                    if (c10 != 33) {
                        if (c10 != 44) {
                            if (c10 != 59) {
                                this.c.f29718b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.c;
                            if (cVar5.f29719d == null) {
                                cVar5.f29719d = new b();
                            }
                            this.c.f29719d.f29707a = f();
                            this.c.f29719d.f29708b = f();
                            this.c.f29719d.c = f();
                            this.c.f29719d.f29709d = f();
                            int c11 = c();
                            if ((c11 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c11 & 7) + 1);
                            b bVar = this.c.f29719d;
                            if ((c11 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f29710e = z12;
                            if (z11) {
                                bVar.f29716k = e(pow);
                            } else {
                                bVar.f29716k = null;
                            }
                            this.c.f29719d.f29715j = this.f29728b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.c;
                                cVar6.c++;
                                cVar6.f29720e.add(cVar6.f29719d);
                            }
                        }
                    } else {
                        int c12 = c();
                        if (c12 != 1) {
                            if (c12 != 249) {
                                if (c12 != 254) {
                                    if (c12 != 255) {
                                        g();
                                    } else {
                                        d();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.f29727a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.c.getClass();
                                                }
                                                if (this.f29729d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            g();
                                        }
                                    }
                                } else {
                                    g();
                                }
                            } else {
                                this.c.f29719d = new b();
                                c();
                                int c13 = c();
                                b bVar2 = this.c.f29719d;
                                int i12 = (c13 & 28) >> 2;
                                bVar2.f29712g = i12;
                                if (i12 == 0) {
                                    bVar2.f29712g = 1;
                                }
                                if ((c13 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f29711f = z13;
                                int f10 = f();
                                if (f10 < 2) {
                                    f10 = 10;
                                }
                                b bVar3 = this.c.f29719d;
                                bVar3.f29714i = f10 * 10;
                                bVar3.f29713h = c();
                                c();
                            }
                        } else {
                            g();
                        }
                    }
                }
                c cVar7 = this.c;
                if (cVar7.c < 0) {
                    cVar7.f29718b = 1;
                }
            }
            return this.c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f29728b.get() & 255;
        } catch (Exception unused) {
            this.c.f29718b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.f29729d = c;
        if (c > 0) {
            int i10 = 0;
            while (true) {
                try {
                    int i11 = this.f29729d;
                    if (i10 < i11) {
                        int i12 = i11 - i10;
                        this.f29728b.get(this.f29727a, i10, i12);
                        i10 += i12;
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    Log.isLoggable("GifHeaderParser", 3);
                    this.c.f29718b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f29728b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.f29718b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f29728b.getShort();
    }

    public final void g() {
        int c;
        do {
            c = c();
            this.f29728b.position(Math.min(this.f29728b.position() + c, this.f29728b.limit()));
        } while (c > 0);
    }
}
