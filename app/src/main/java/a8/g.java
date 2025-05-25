package a8;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f163a;

    /* renamed from: b  reason: collision with root package name */
    public final String f164b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f165d;

    /* renamed from: e  reason: collision with root package name */
    public final long f166e;

    /* renamed from: f  reason: collision with root package name */
    public final long f167f;

    /* renamed from: g  reason: collision with root package name */
    public final long f168g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f169h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f170i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f171j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f172k;

    public g(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z10;
        boolean z11;
        boolean z12;
        Preconditions.f(str);
        Preconditions.f(str2);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.b(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.b(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.b(z12);
        Preconditions.b(j14 >= 0);
        this.f163a = str;
        this.f164b = str2;
        this.c = j10;
        this.f165d = j11;
        this.f166e = j12;
        this.f167f = j13;
        this.f168g = j14;
        this.f169h = l10;
        this.f170i = l11;
        this.f171j = l12;
        this.f172k = bool;
    }

    public final g a(Long l10, Long l11, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new g(this.f163a, this.f164b, this.c, this.f165d, this.f166e, this.f167f, this.f168g, this.f169h, l10, l11, bool);
    }

    public final g b(long j10, long j11) {
        return new g(this.f163a, this.f164b, this.c, this.f165d, this.f166e, this.f167f, j10, Long.valueOf(j11), this.f170i, this.f171j, this.f172k);
    }
}
