package okhttp3;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* compiled from: CacheControl.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final d f23157n;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23158a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23159b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23160d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f23161e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23162f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23163g;

    /* renamed from: h  reason: collision with root package name */
    public final int f23164h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23165i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f23166j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f23167k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f23168l;

    /* renamed from: m  reason: collision with root package name */
    public String f23169m;

    /* compiled from: CacheControl.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23170a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23171b;
        public final int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f23172d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final int f23173e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23174f;

        public final d a() {
            return new d(this.f23170a, this.f23171b, this.c, -1, false, false, false, this.f23172d, this.f23173e, this.f23174f, false, false, null);
        }
    }

    /* compiled from: CacheControl.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public static int a(int i10, String str, String str2) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                boolean z10 = false;
                if (kotlin.text.k.U(str2, str.charAt(i10), 0, false, 2) >= 0) {
                    z10 = true;
                }
                if (z10) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okhttp3.d b(okhttp3.o r25) {
            /*
                Method dump skipped, instructions count: 405
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.d.b.b(okhttp3.o):okhttp3.d");
        }
    }

    static {
        a aVar = new a();
        aVar.f23170a = true;
        aVar.a();
        a aVar2 = new a();
        aVar2.f23174f = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.g.e(timeUnit, "timeUnit");
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds((long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (seconds <= 2147483647L) {
            i10 = (int) seconds;
        }
        aVar2.f23172d = i10;
        f23157n = aVar2.a();
    }

    public d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f23158a = z10;
        this.f23159b = z11;
        this.c = i10;
        this.f23160d = i11;
        this.f23161e = z12;
        this.f23162f = z13;
        this.f23163g = z14;
        this.f23164h = i12;
        this.f23165i = i13;
        this.f23166j = z15;
        this.f23167k = z16;
        this.f23168l = z17;
        this.f23169m = str;
    }

    public final String toString() {
        boolean z10;
        String str = this.f23169m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f23158a) {
                sb2.append("no-cache, ");
            }
            if (this.f23159b) {
                sb2.append("no-store, ");
            }
            int i10 = this.c;
            if (i10 != -1) {
                sb2.append("max-age=");
                sb2.append(i10);
                sb2.append(", ");
            }
            int i11 = this.f23160d;
            if (i11 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i11);
                sb2.append(", ");
            }
            if (this.f23161e) {
                sb2.append("private, ");
            }
            if (this.f23162f) {
                sb2.append("public, ");
            }
            if (this.f23163g) {
                sb2.append("must-revalidate, ");
            }
            int i12 = this.f23164h;
            if (i12 != -1) {
                sb2.append("max-stale=");
                sb2.append(i12);
                sb2.append(", ");
            }
            int i13 = this.f23165i;
            if (i13 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i13);
                sb2.append(", ");
            }
            if (this.f23166j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f23167k) {
                sb2.append("no-transform, ");
            }
            if (this.f23168l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f23169m = sb3;
            return sb3;
        }
        return str;
    }
}
