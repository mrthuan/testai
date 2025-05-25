package ud;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzej;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* compiled from: ADManager.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30279a = e.class.getName();

    /* renamed from: b  reason: collision with root package name */
    public static final String f30280b = k.class.getName();
    public static final String c = m.class.getName();

    /* renamed from: d  reason: collision with root package name */
    public static final String f30281d = h.class.getName();

    /* renamed from: e  reason: collision with root package name */
    public static final String f30282e = r.class.getName();

    /* renamed from: f  reason: collision with root package name */
    public static final String f30283f = q.class.getName();

    public static final void a() {
        RequestConfiguration.Builder a10 = zzej.b().f10175h.a();
        a10.c(1);
        a10.b(OperatorName.STROKING_COLOR_GRAY);
        MobileAds.b(a10.a());
    }
}
