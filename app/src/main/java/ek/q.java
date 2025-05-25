package ek;

import com.google.android.gms.common.api.Api;
import ek.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Writer.kt */
/* loaded from: classes3.dex */
public final class q implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f16777g = Logger.getLogger(c.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final kk.g f16778a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16779b;
    public final kk.f c;

    /* renamed from: d  reason: collision with root package name */
    public int f16780d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16781e;

    /* renamed from: f  reason: collision with root package name */
    public final b.C0212b f16782f;

    public q(kk.g gVar, boolean z10) {
        this.f16778a = gVar;
        this.f16779b = z10;
        kk.f fVar = new kk.f();
        this.c = fVar;
        this.f16780d = 16384;
        this.f16782f = new b.C0212b(fVar);
    }

    public final synchronized void a(t peerSettings) {
        int i10;
        int i11;
        kotlin.jvm.internal.g.e(peerSettings, "peerSettings");
        if (!this.f16781e) {
            int i12 = this.f16780d;
            int i13 = peerSettings.f16788a;
            if ((i13 & 32) != 0) {
                i12 = peerSettings.f16789b[5];
            }
            this.f16780d = i12;
            if ((i13 & 2) != 0) {
                i10 = peerSettings.f16789b[1];
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                b.C0212b c0212b = this.f16782f;
                if ((i13 & 2) != 0) {
                    i11 = peerSettings.f16789b[1];
                } else {
                    i11 = -1;
                }
                c0212b.getClass();
                int min = Math.min(i11, 16384);
                int i14 = c0212b.f16662e;
                if (i14 != min) {
                    if (min < i14) {
                        c0212b.c = Math.min(c0212b.c, min);
                    }
                    c0212b.f16661d = true;
                    c0212b.f16662e = min;
                    int i15 = c0212b.f16666i;
                    if (min < i15) {
                        if (min == 0) {
                            kotlin.collections.f.B(c0212b.f16663f, null);
                            c0212b.f16664g = c0212b.f16663f.length - 1;
                            c0212b.f16665h = 0;
                            c0212b.f16666i = 0;
                        } else {
                            c0212b.a(i15 - min);
                        }
                    }
                }
            }
            c(0, 0, 4, 1);
            this.f16778a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(boolean z10, int i10, kk.f fVar, int i11) {
        if (!this.f16781e) {
            c(i10, i11, 0, z10 ? 1 : 0);
            if (i11 > 0) {
                kotlin.jvm.internal.g.b(fVar);
                this.f16778a.D(fVar, i11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void c(int i10, int i11, int i12, int i13) {
        boolean z10;
        Level level = Level.FINE;
        Logger logger = f16777g;
        boolean z11 = false;
        if (logger.isLoggable(level)) {
            c.f16667a.getClass();
            logger.fine(c.a(i10, i11, i12, i13, false));
        }
        if (i11 <= this.f16780d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((Integer.MIN_VALUE & i10) == 0) {
                z11 = true;
            }
            if (z11) {
                byte[] bArr = ak.b.f665a;
                kk.g gVar = this.f16778a;
                kotlin.jvm.internal.g.e(gVar, "<this>");
                gVar.writeByte((i11 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar.writeByte((i11 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar.writeByte(i11 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar.writeByte(i12 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar.writeByte(i13 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                gVar.writeInt(i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.g.h(Integer.valueOf(i10), "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f16780d + ": " + i11).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16781e = true;
        this.f16778a.close();
    }

    public final synchronized void d(int i10, ErrorCode errorCode, byte[] bArr) {
        boolean z10;
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        if (!this.f16781e) {
            boolean z11 = false;
            if (errorCode.getHttpCode() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(0, bArr.length + 8, 7, 0);
                this.f16778a.writeInt(i10);
                this.f16778a.writeInt(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z11 = true;
                }
                if (!z11) {
                    this.f16778a.write(bArr);
                }
                this.f16778a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void f(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        if (!this.f16781e) {
            this.f16782f.d(arrayList);
            long j10 = this.c.f19826b;
            long min = Math.min(this.f16780d, j10);
            int i12 = (j10 > min ? 1 : (j10 == min ? 0 : -1));
            if (i12 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (z10) {
                i11 |= 1;
            }
            c(i10, (int) min, 1, i11);
            this.f16778a.D(this.c, min);
            if (i12 > 0) {
                l(i10, j10 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f16781e) {
            this.f16778a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(int i10, int i11, boolean z10) {
        int i12;
        if (!this.f16781e) {
            if (z10) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            c(0, 8, 6, i12);
            this.f16778a.writeInt(i10);
            this.f16778a.writeInt(i11);
            this.f16778a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void i(int i10, ErrorCode errorCode) {
        boolean z10;
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        if (!this.f16781e) {
            if (errorCode.getHttpCode() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(i10, 4, 3, 0);
                this.f16778a.writeInt(errorCode.getHttpCode());
                this.f16778a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(t settings) {
        int i10;
        kotlin.jvm.internal.g.e(settings, "settings");
        if (!this.f16781e) {
            c(0, Integer.bitCount(settings.f16788a) * 6, 4, 0);
            int i11 = 0;
            while (i11 < 10) {
                int i12 = i11 + 1;
                boolean z10 = true;
                if (((1 << i11) & settings.f16788a) == 0) {
                    z10 = false;
                }
                if (z10) {
                    if (i11 != 4) {
                        if (i11 != 7) {
                            i10 = i11;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 3;
                    }
                    this.f16778a.writeShort(i10);
                    this.f16778a.writeInt(settings.f16789b[i11]);
                }
                i11 = i12;
            }
            this.f16778a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i10, long j10) {
        boolean z10;
        if (!this.f16781e) {
            if (j10 != 0 && j10 <= 2147483647L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(i10, 4, 8, 0);
                this.f16778a.writeInt((int) j10);
                this.f16778a.flush();
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.g.h(Long.valueOf(j10), "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ").toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void l(int i10, long j10) {
        int i11;
        while (j10 > 0) {
            long min = Math.min(this.f16780d, j10);
            j10 -= min;
            int i12 = (int) min;
            if (j10 == 0) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            c(i10, i12, 9, i11);
            this.f16778a.D(this.c, min);
        }
    }
}
