package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.a0;
import okhttp3.internal.connection.i;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.m;
import okhttp3.p;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final h f23284a;

    /* renamed from: b  reason: collision with root package name */
    public final okhttp3.a f23285b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final m f23286d;

    /* renamed from: e  reason: collision with root package name */
    public i.a f23287e;

    /* renamed from: f  reason: collision with root package name */
    public i f23288f;

    /* renamed from: g  reason: collision with root package name */
    public int f23289g;

    /* renamed from: h  reason: collision with root package name */
    public int f23290h;

    /* renamed from: i  reason: collision with root package name */
    public int f23291i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f23292j;

    public d(h connectionPool, okhttp3.a aVar, e eVar, m eventListener) {
        kotlin.jvm.internal.g.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.g.e(eventListener, "eventListener");
        this.f23284a = connectionPool;
        this.f23285b = aVar;
        this.c = eVar;
        this.f23286d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.f a(int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.d.a(int, int, int, boolean, boolean):okhttp3.internal.connection.f");
    }

    public final boolean b(p url) {
        kotlin.jvm.internal.g.e(url, "url");
        p pVar = this.f23285b.f23130i;
        if (url.f23367e == pVar.f23367e && kotlin.jvm.internal.g.a(url.f23366d, pVar.f23366d)) {
            return true;
        }
        return false;
    }

    public final void c(IOException e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        this.f23292j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f23289g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f23290h++;
        } else {
            this.f23291i++;
        }
    }
}
