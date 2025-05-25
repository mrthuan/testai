package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.LoggingBehavior;
import com.facebook.a;
import com.facebook.appevents.r;
import com.facebook.internal.g;
import com.facebook.internal.j;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* compiled from: AppEventsLoggerImpl.kt */
/* loaded from: classes.dex */
public final class l {
    public static ScheduledThreadPoolExecutor c;

    /* renamed from: d  reason: collision with root package name */
    public static final AppEventsLogger$FlushBehavior f9612d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f9613e;

    /* renamed from: f  reason: collision with root package name */
    public static String f9614f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f9615g;

    /* renamed from: a  reason: collision with root package name */
    public final String f9616a;

    /* renamed from: b  reason: collision with root package name */
    public final AccessTokenAppIdPair f9617b;

    /* compiled from: AppEventsLoggerImpl.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: AppEventsLoggerImpl.kt */
        /* renamed from: com.facebook.appevents.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0141a implements g.a {
            @Override // com.facebook.internal.g.a
            public final void a(String str) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l.c;
                com.facebook.d.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString(Constants.INSTALL_REFERRER, str).apply();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #4 {all -> 0x0085, blocks: (B:16:0x0042, B:34:0x0078, B:19:0x0051, B:21:0x0057, B:25:0x0066), top: B:83:0x0042 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void a(com.facebook.appevents.AppEvent r9, com.facebook.appevents.AccessTokenAppIdPair r10) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.l.a.a(com.facebook.appevents.AppEvent, com.facebook.appevents.AccessTokenAppIdPair):void");
        }

        public static Pair b(Bundle bundle, r rVar) {
            String str;
            String str2 = "1";
            if (c6.g.d()) {
                str = "1";
            } else {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            Map<OperationalDataEnum, Pair<Set<String>, Set<String>>> map = r.f9657b;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            Pair b10 = r.a.b(operationalDataEnum, "is_implicit_purchase_logging_enabled", str, bundle, rVar);
            Bundle bundle2 = (Bundle) b10.getFirst();
            r rVar2 = (r) b10.getSecond();
            if (!com.facebook.n.c()) {
                str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            }
            Pair b11 = r.a.b(operationalDataEnum, "is_autolog_app_events_enabled", str2, bundle2, rVar2);
            return new Pair((Bundle) b11.getFirst(), (r) b11.getSecond());
        }

        public static AppEventsLogger$FlushBehavior c() {
            AppEventsLogger$FlushBehavior appEventsLogger$FlushBehavior;
            synchronized (l.c()) {
                if (!k6.a.b(l.class)) {
                    appEventsLogger$FlushBehavior = l.f9612d;
                } else {
                    appEventsLogger$FlushBehavior = null;
                }
            }
            return appEventsLogger$FlushBehavior;
        }

        public static String d() {
            C0141a c0141a = new C0141a();
            if (!com.facebook.d.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(com.facebook.d.a()).build();
                try {
                    build.startConnection(new com.facebook.internal.h(build, c0141a));
                } catch (Exception unused) {
                }
            }
            return com.facebook.d.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
        }

        public static void e() {
            synchronized (l.c()) {
                if (l.b() != null) {
                    return;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                if (!k6.a.b(l.class)) {
                    l.c = scheduledThreadPoolExecutor;
                }
                tf.d dVar = tf.d.f30009a;
                com.facebook.appevents.a aVar = new com.facebook.appevents.a(1);
                ScheduledThreadPoolExecutor b10 = l.b();
                if (b10 != null) {
                    b10.scheduleAtFixedRate(aVar, 0L, 86400L, TimeUnit.SECONDS);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
    }

    static {
        new a();
        f9612d = AppEventsLogger$FlushBehavior.AUTO;
        f9613e = new Object();
    }

    public l(String str, String str2) {
        com.facebook.internal.q.e();
        this.f9616a = str;
        Date date = com.facebook.a.f9420l;
        com.facebook.a b10 = a.b.b();
        if (b10 != null && !new Date().after(b10.f9423a) && (str2 == null || kotlin.jvm.internal.g.a(str2, b10.f9429h))) {
            this.f9617b = new AccessTokenAppIdPair(b10);
        } else {
            if (str2 == null) {
                Context a10 = com.facebook.d.a();
                com.facebook.internal.p pVar = com.facebook.internal.p.f9815a;
                com.facebook.internal.q.c(a10, "context");
                str2 = com.facebook.d.b();
            }
            this.f9617b = new AccessTokenAppIdPair(null, str2);
        }
        a.e();
    }

    public static final /* synthetic */ String a() {
        if (k6.a.b(l.class)) {
            return null;
        }
        try {
            return f9614f;
        } catch (Throwable th2) {
            k6.a.a(l.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (k6.a.b(l.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th2) {
            k6.a.a(l.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (k6.a.b(l.class)) {
            return null;
        }
        try {
            return f9613e;
        } catch (Throwable th2) {
            k6.a.a(l.class, th2);
            return null;
        }
    }

    public static /* synthetic */ void g(l lVar, String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (k6.a.b(l.class)) {
            return;
        }
        try {
            lVar.f(str, d10, bundle, z10, uuid, null);
        } catch (Throwable th2) {
            k6.a.a(l.class, th2);
        }
    }

    public final void d(Bundle bundle, String str) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            g(this, str, null, bundle, false, c6.e.a());
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void e(String str, double d10, Bundle bundle) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            g(this, str, Double.valueOf(d10), bundle, false, c6.e.a());
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0166 A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x0013, B:15:0x0022, B:17:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:26:0x0046, B:34:0x0060, B:55:0x00a2, B:57:0x00ae, B:60:0x00b4, B:63:0x00bd, B:65:0x00c2, B:66:0x00c6, B:68:0x00cc, B:70:0x00d4, B:73:0x00dc, B:80:0x00e9, B:83:0x00f1, B:85:0x0123, B:88:0x0131, B:92:0x0142, B:105:0x0166, B:106:0x0178, B:108:0x0180, B:109:0x0183, B:113:0x019a, B:116:0x01ac, B:118:0x01bf, B:64:0x00c0, B:37:0x0068, B:39:0x0072, B:42:0x0078, B:45:0x0081, B:47:0x0086, B:48:0x008a, B:50:0x0090, B:52:0x0098, B:46:0x0084, B:28:0x004c, B:30:0x0054, B:32:0x005a, B:95:0x014d, B:98:0x0157), top: B:128:0x0013, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090 A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x0013, B:15:0x0022, B:17:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:26:0x0046, B:34:0x0060, B:55:0x00a2, B:57:0x00ae, B:60:0x00b4, B:63:0x00bd, B:65:0x00c2, B:66:0x00c6, B:68:0x00cc, B:70:0x00d4, B:73:0x00dc, B:80:0x00e9, B:83:0x00f1, B:85:0x0123, B:88:0x0131, B:92:0x0142, B:105:0x0166, B:106:0x0178, B:108:0x0180, B:109:0x0183, B:113:0x019a, B:116:0x01ac, B:118:0x01bf, B:64:0x00c0, B:37:0x0068, B:39:0x0072, B:42:0x0078, B:45:0x0081, B:47:0x0086, B:48:0x008a, B:50:0x0090, B:52:0x0098, B:46:0x0084, B:28:0x004c, B:30:0x0054, B:32:0x005a, B:95:0x014d, B:98:0x0157), top: B:128:0x0013, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x0013, B:15:0x0022, B:17:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:26:0x0046, B:34:0x0060, B:55:0x00a2, B:57:0x00ae, B:60:0x00b4, B:63:0x00bd, B:65:0x00c2, B:66:0x00c6, B:68:0x00cc, B:70:0x00d4, B:73:0x00dc, B:80:0x00e9, B:83:0x00f1, B:85:0x0123, B:88:0x0131, B:92:0x0142, B:105:0x0166, B:106:0x0178, B:108:0x0180, B:109:0x0183, B:113:0x019a, B:116:0x01ac, B:118:0x01bf, B:64:0x00c0, B:37:0x0068, B:39:0x0072, B:42:0x0078, B:45:0x0081, B:47:0x0086, B:48:0x008a, B:50:0x0090, B:52:0x0098, B:46:0x0084, B:28:0x004c, B:30:0x0054, B:32:0x005a, B:95:0x014d, B:98:0x0157), top: B:128:0x0013, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0131 A[Catch: all -> 0x013f, TRY_ENTER, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x0013, B:15:0x0022, B:17:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:26:0x0046, B:34:0x0060, B:55:0x00a2, B:57:0x00ae, B:60:0x00b4, B:63:0x00bd, B:65:0x00c2, B:66:0x00c6, B:68:0x00cc, B:70:0x00d4, B:73:0x00dc, B:80:0x00e9, B:83:0x00f1, B:85:0x0123, B:88:0x0131, B:92:0x0142, B:105:0x0166, B:106:0x0178, B:108:0x0180, B:109:0x0183, B:113:0x019a, B:116:0x01ac, B:118:0x01bf, B:64:0x00c0, B:37:0x0068, B:39:0x0072, B:42:0x0078, B:45:0x0081, B:47:0x0086, B:48:0x008a, B:50:0x0090, B:52:0x0098, B:46:0x0084, B:28:0x004c, B:30:0x0054, B:32:0x005a, B:95:0x014d, B:98:0x0157), top: B:128:0x0013, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0142 A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #5 {all -> 0x013f, blocks: (B:7:0x0013, B:15:0x0022, B:17:0x0028, B:20:0x0032, B:22:0x0038, B:24:0x003e, B:26:0x0046, B:34:0x0060, B:55:0x00a2, B:57:0x00ae, B:60:0x00b4, B:63:0x00bd, B:65:0x00c2, B:66:0x00c6, B:68:0x00cc, B:70:0x00d4, B:73:0x00dc, B:80:0x00e9, B:83:0x00f1, B:85:0x0123, B:88:0x0131, B:92:0x0142, B:105:0x0166, B:106:0x0178, B:108:0x0180, B:109:0x0183, B:113:0x019a, B:116:0x01ac, B:118:0x01bf, B:64:0x00c0, B:37:0x0068, B:39:0x0072, B:42:0x0078, B:45:0x0081, B:47:0x0086, B:48:0x008a, B:50:0x0090, B:52:0x0098, B:46:0x0084, B:28:0x004c, B:30:0x0054, B:32:0x005a, B:95:0x014d, B:98:0x0157), top: B:128:0x0013, inners: #6 }] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Currency] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.Currency] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r15, java.lang.Double r16, android.os.Bundle r17, boolean r18, java.util.UUID r19, com.facebook.appevents.r r20) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.l.f(java.lang.String, java.lang.Double, android.os.Bundle, boolean, java.util.UUID, com.facebook.appevents.r):void");
    }

    public final void h(String str, Bundle bundle) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            g(this, str, null, bundle, true, c6.e.a());
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void i(BigDecimal bigDecimal, Currency currency, Bundle bundle, r rVar) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                j.a aVar = com.facebook.internal.j.f9803d;
                j.a.a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "purchaseAmount cannot be null");
            } else if (currency == null) {
                j.a aVar2 = com.facebook.internal.j.f9803d;
                j.a.a(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", "currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                f("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, true, c6.e.a(), rVar);
                if (a.c() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY) {
                    i.c(FlushReason.EAGER_FLUSHING_EVENT);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public l(Context context, String str) {
        this(com.facebook.internal.p.k(context), str);
    }
}
