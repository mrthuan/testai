package t6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import u6.g;
import v6.h;
import v6.n;
import w6.i;
import ya.d;
import ya.e;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final d f29953a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f29954b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f29955d;

    /* renamed from: e  reason: collision with root package name */
    public final e7.a f29956e;

    /* renamed from: f  reason: collision with root package name */
    public final e7.a f29957f;

    /* renamed from: g  reason: collision with root package name */
    public final int f29958g;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f29959a;

        /* renamed from: b  reason: collision with root package name */
        public final g f29960b;
        public final String c;

        public a(URL url, g gVar, String str) {
            this.f29959a = url;
            this.f29960b = gVar;
            this.c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* renamed from: t6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0377b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29961a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f29962b;
        public final long c;

        public C0377b(int i10, URL url, long j10) {
            this.f29961a = i10;
            this.f29962b = url;
            this.c = j10;
        }
    }

    public b(Context context, e7.a aVar, e7.a aVar2) {
        e eVar = new e();
        com.google.android.datatransport.cct.internal.a.f9880a.a(eVar);
        eVar.f32105d = true;
        this.f29953a = new d(eVar);
        this.c = context;
        this.f29954b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = t6.a.c;
        try {
            this.f29955d = new URL(str);
            this.f29956e = aVar2;
            this.f29957f = aVar;
            this.f29958g = 130000;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(a0.a.h("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x041b A[Catch: IOException -> 0x0468, TryCatch #7 {IOException -> 0x0468, blocks: (B:78:0x0299, B:81:0x02a2, B:85:0x02b0, B:86:0x02ba, B:88:0x0300, B:96:0x0327, B:98:0x0339, B:99:0x0344, B:107:0x0365, B:160:0x0417, B:162:0x041b, B:165:0x042a, B:167:0x042f, B:169:0x0433, B:178:0x044a, B:180:0x0454, B:182:0x045e, B:108:0x036f, B:118:0x03a2, B:138:0x03c2, B:157:0x03f0, B:159:0x0404, B:90:0x0307, B:95:0x0324, B:156:0x03ef, B:155:0x03ec, B:109:0x0373, B:111:0x037d, B:116:0x039d, B:128:0x03b3, B:127:0x03b0), top: B:192:0x0299, inners: #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x042a A[Catch: IOException -> 0x0468, TryCatch #7 {IOException -> 0x0468, blocks: (B:78:0x0299, B:81:0x02a2, B:85:0x02b0, B:86:0x02ba, B:88:0x0300, B:96:0x0327, B:98:0x0339, B:99:0x0344, B:107:0x0365, B:160:0x0417, B:162:0x041b, B:165:0x042a, B:167:0x042f, B:169:0x0433, B:178:0x044a, B:180:0x0454, B:182:0x045e, B:108:0x036f, B:118:0x03a2, B:138:0x03c2, B:157:0x03f0, B:159:0x0404, B:90:0x0307, B:95:0x0324, B:156:0x03ef, B:155:0x03ec, B:109:0x0373, B:111:0x037d, B:116:0x039d, B:128:0x03b3, B:127:0x03b0), top: B:192:0x0299, inners: #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042f A[EDGE_INSN: B:217:0x042f->B:167:0x042f ?: BREAK  , SYNTHETIC] */
    @Override // w6.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.runtime.backends.a a(w6.a r31) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.b.a(w6.a):com.google.android.datatransport.runtime.backends.a");
    }

    @Override // w6.i
    public final h b(n nVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.f29954b.getActiveNetworkInfo();
        h.a i10 = nVar.i();
        int i11 = Build.VERSION.SDK_INT;
        Map<String, String> map = i10.f30706f;
        if (map != null) {
            map.put("sdk-version", String.valueOf(i11));
            i10.a("model", Build.MODEL);
            i10.a("hardware", Build.HARDWARE);
            i10.a("device", Build.DEVICE);
            i10.a("product", Build.PRODUCT);
            i10.a("os-uild", Build.ID);
            i10.a("manufacturer", Build.MANUFACTURER);
            i10.a("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            Map<String, String> map2 = i10.f30706f;
            if (map2 != null) {
                map2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    type = NetworkConnectionInfo.NetworkType.NONE.getValue();
                } else {
                    type = activeNetworkInfo.getType();
                }
                Map<String, String> map3 = i10.f30706f;
                if (map3 != null) {
                    map3.put("net-type", String.valueOf(type));
                    int i12 = -1;
                    if (activeNetworkInfo == null) {
                        subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
                        } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    Map<String, String> map4 = i10.f30706f;
                    if (map4 != null) {
                        map4.put("mobile-subtype", String.valueOf(subtype));
                        i10.a("country", Locale.getDefault().getCountry());
                        i10.a("locale", Locale.getDefault().getLanguage());
                        Context context = this.c;
                        i10.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
                            i12 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            Log.isLoggable(z6.a.b("CctTransportBackend"), 6);
                        }
                        i10.a("application_build", Integer.toString(i12));
                        return i10.b();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }
}
