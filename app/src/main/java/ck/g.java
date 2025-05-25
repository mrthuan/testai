package ck;

import java.util.regex.Pattern;
import kk.t;
import okhttp3.r;
import okhttp3.z;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes3.dex */
public final class g extends z {

    /* renamed from: a  reason: collision with root package name */
    public final String f5705a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5706b;
    public final kk.h c;

    public g(String str, long j10, t tVar) {
        this.f5705a = str;
        this.f5706b = j10;
        this.c = tVar;
    }

    @Override // okhttp3.z
    public final long c() {
        return this.f5706b;
    }

    @Override // okhttp3.z
    public final r d() {
        String str = this.f5705a;
        if (str == null) {
            return null;
        }
        Pattern pattern = r.c;
        return r.a.b(str);
    }

    @Override // okhttp3.z
    public final kk.h f() {
        return this.c;
    }
}
