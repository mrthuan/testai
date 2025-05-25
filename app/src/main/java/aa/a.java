package aa;

import android.text.TextUtils;
import da.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: AbtExperimentInfo.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f466g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final SimpleDateFormat f467h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a  reason: collision with root package name */
    public final String f468a;

    /* renamed from: b  reason: collision with root package name */
    public final String f469b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final Date f470d;

    /* renamed from: e  reason: collision with root package name */
    public final long f471e;

    /* renamed from: f  reason: collision with root package name */
    public final long f472f;

    public a(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f468a = str;
        this.f469b = str2;
        this.c = str3;
        this.f470d = date;
        this.f471e = j10;
        this.f472f = j11;
    }

    public final a.b a(String str) {
        a.b bVar = new a.b();
        bVar.f16167a = str;
        bVar.f16178m = this.f470d.getTime();
        bVar.f16168b = this.f468a;
        bVar.c = this.f469b;
        String str2 = this.c;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        bVar.f16169d = str2;
        bVar.f16170e = this.f471e;
        bVar.f16175j = this.f472f;
        return bVar;
    }
}
