package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.appevents.r;
import com.facebook.internal.FeatureManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.i;
import kotlin.text.k;

/* compiled from: InAppPurchaseManager.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static String f9595d;

    /* renamed from: a  reason: collision with root package name */
    public static final g f9593a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<a6.a, List<Pair<Long, Pair<Bundle, r>>>> f9594b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<a6.a, List<Pair<Long, Pair<Bundle, r>>>> c = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicBoolean f9596e = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseManager.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9597a;

        static {
            int[] iArr = new int[InAppPurchaseUtils.BillingClientVersion.values().length];
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V2_V4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppPurchaseUtils.BillingClientVersion.V5_V7.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f9597a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f4 A[Catch: all -> 0x02b5, TryCatch #2 {, blocks: (B:4:0x0005, B:9:0x0010, B:13:0x001b, B:20:0x002c, B:22:0x0039, B:24:0x0074, B:26:0x0085, B:28:0x008a, B:35:0x0098, B:36:0x00a2, B:38:0x00a8, B:40:0x00e0, B:43:0x00ea, B:49:0x00f8, B:55:0x0108, B:59:0x0115, B:63:0x011e, B:73:0x013c, B:77:0x0145, B:81:0x0156, B:46:0x00ef, B:50:0x00ff, B:87:0x017f, B:88:0x0185, B:91:0x0195, B:93:0x019c, B:94:0x01a5, B:97:0x01be, B:99:0x01c6, B:100:0x01ce, B:102:0x01d6, B:111:0x0215, B:105:0x01ec, B:107:0x01f4, B:108:0x01fc, B:110:0x0204, B:25:0x007d, B:112:0x021c, B:113:0x0220, B:115:0x0226, B:117:0x022e, B:121:0x024a, B:122:0x024f, B:124:0x0255, B:126:0x0275, B:129:0x027d, B:131:0x0283, B:132:0x028d, B:133:0x0297, B:135:0x029d, B:136:0x02a8, B:118:0x023b, B:67:0x0131), top: B:148:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204 A[Catch: all -> 0x02b5, TryCatch #2 {, blocks: (B:4:0x0005, B:9:0x0010, B:13:0x001b, B:20:0x002c, B:22:0x0039, B:24:0x0074, B:26:0x0085, B:28:0x008a, B:35:0x0098, B:36:0x00a2, B:38:0x00a8, B:40:0x00e0, B:43:0x00ea, B:49:0x00f8, B:55:0x0108, B:59:0x0115, B:63:0x011e, B:73:0x013c, B:77:0x0145, B:81:0x0156, B:46:0x00ef, B:50:0x00ff, B:87:0x017f, B:88:0x0185, B:91:0x0195, B:93:0x019c, B:94:0x01a5, B:97:0x01be, B:99:0x01c6, B:100:0x01ce, B:102:0x01d6, B:111:0x0215, B:105:0x01ec, B:107:0x01f4, B:108:0x01fc, B:110:0x0204, B:25:0x007d, B:112:0x021c, B:113:0x0220, B:115:0x0226, B:117:0x022e, B:121:0x024a, B:122:0x024f, B:124:0x0255, B:126:0x0275, B:129:0x027d, B:131:0x0283, B:132:0x028d, B:133:0x0297, B:135:0x029d, B:136:0x02a8, B:118:0x023b, B:67:0x0131), top: B:148:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098 A[Catch: all -> 0x02b5, TryCatch #2 {, blocks: (B:4:0x0005, B:9:0x0010, B:13:0x001b, B:20:0x002c, B:22:0x0039, B:24:0x0074, B:26:0x0085, B:28:0x008a, B:35:0x0098, B:36:0x00a2, B:38:0x00a8, B:40:0x00e0, B:43:0x00ea, B:49:0x00f8, B:55:0x0108, B:59:0x0115, B:63:0x011e, B:73:0x013c, B:77:0x0145, B:81:0x0156, B:46:0x00ef, B:50:0x00ff, B:87:0x017f, B:88:0x0185, B:91:0x0195, B:93:0x019c, B:94:0x01a5, B:97:0x01be, B:99:0x01c6, B:100:0x01ce, B:102:0x01d6, B:111:0x0215, B:105:0x01ec, B:107:0x01f4, B:108:0x01fc, B:110:0x0204, B:25:0x007d, B:112:0x021c, B:113:0x0220, B:115:0x0226, B:117:0x022e, B:121:0x024a, B:122:0x024f, B:124:0x0255, B:126:0x0275, B:129:0x027d, B:131:0x0283, B:132:0x028d, B:133:0x0297, B:135:0x029d, B:136:0x02a8, B:118:0x023b, B:67:0x0131), top: B:148:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized android.os.Bundle c(java.util.List<a6.a> r28, long r29, boolean r31, java.util.List<kotlin.Pair<android.os.Bundle, com.facebook.appevents.r>> r32) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.g.c(java.util.List, long, boolean, java.util.List):android.os.Bundle");
    }

    public static final void d() {
        if (k6.a.b(g.class)) {
            return;
        }
        try {
            if (!f9596e.get()) {
                return;
            }
            InAppPurchaseUtils.BillingClientVersion a10 = f9593a.a();
            int i10 = a.f9597a[a10.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4 && FeatureManager.c(FeatureManager.Feature.IapLoggingLib5To7)) {
                        b.b(com.facebook.d.a(), a10);
                        return;
                    }
                    return;
                } else if (FeatureManager.c(FeatureManager.Feature.IapLoggingLib2)) {
                    b.b(com.facebook.d.a(), a10);
                    return;
                } else {
                    com.facebook.appevents.iap.a.b(InAppPurchaseUtils.BillingClientVersion.V2_V4);
                    return;
                }
            }
            com.facebook.appevents.iap.a.b(InAppPurchaseUtils.BillingClientVersion.V1);
        } catch (Throwable th2) {
            k6.a.a(g.class, th2);
        }
    }

    public final InAppPurchaseUtils.BillingClientVersion a() {
        boolean z10;
        try {
            if (k6.a.b(this)) {
                return null;
            }
            try {
                Context a10 = com.facebook.d.a();
                ApplicationInfo applicationInfo = a10.getPackageManager().getApplicationInfo(a10.getPackageName(), 128);
                kotlin.jvm.internal.g.d(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
                String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
                if (string == null) {
                    return InAppPurchaseUtils.BillingClientVersion.NONE;
                }
                List h02 = k.h0(string, new String[]{"."}, 3, 2);
                if (string.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                String concat = "GPBL.".concat(string);
                if (!k6.a.b(g.class)) {
                    try {
                        f9595d = concat;
                    } catch (Throwable th2) {
                        k6.a.a(g.class, th2);
                    }
                }
                Integer E = i.E((String) h02.get(0));
                if (E != null) {
                    int intValue = E.intValue();
                    if (intValue == 1) {
                        return InAppPurchaseUtils.BillingClientVersion.V1;
                    }
                    if (intValue < 5) {
                        return InAppPurchaseUtils.BillingClientVersion.V2_V4;
                    }
                    return InAppPurchaseUtils.BillingClientVersion.V5_V7;
                }
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            } catch (Exception unused) {
                return InAppPurchaseUtils.BillingClientVersion.V5_V7;
            }
        } catch (Throwable th3) {
            k6.a.a(this, th3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:6:0x000a, B:10:0x0016, B:11:0x001a, B:13:0x0020, B:15:0x0038, B:19:0x0040, B:26:0x004d, B:27:0x0057, B:29:0x005d, B:31:0x006f, B:34:0x0075, B:41:0x0082, B:44:0x008a, B:7:0x000f), top: B:50:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(android.os.Bundle r10, com.facebook.appevents.r r11, android.os.Bundle r12, com.facebook.appevents.r r13, boolean r14, boolean r15) {
        /*
            r9 = this;
            boolean r0 = k6.a.b(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r15 == 0) goto Lf
            java.util.List r15 = a6.i.c(r14)     // Catch: java.lang.Throwable -> L93
            goto L13
        Lf:
            java.util.List r15 = a6.i.b(r14)     // Catch: java.lang.Throwable -> L93
        L13:
            if (r15 != 0) goto L16
            return r1
        L16:
            java.util.Iterator r15 = r15.iterator()     // Catch: java.lang.Throwable -> L93
        L1a:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L92
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L93
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L93
            java.util.Map<com.facebook.appevents.OperationalDataEnum, kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> r2 = com.facebook.appevents.r.f9657b     // Catch: java.lang.Throwable -> L93
            com.facebook.appevents.OperationalDataEnum r2 = com.facebook.appevents.OperationalDataEnum.IAPParameters     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r0.getFirst()     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = com.facebook.appevents.r.a.c(r2, r3, r10, r11)     // Catch: java.lang.Throwable -> L93
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L93
            goto L3c
        L3b:
            r2 = r1
        L3c:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L49
            int r5 = r2.length()     // Catch: java.lang.Throwable -> L93
            if (r5 != 0) goto L47
            goto L49
        L47:
            r5 = r3
            goto L4a
        L49:
            r5 = r4
        L4a:
            if (r5 == 0) goto L4d
            goto L1a
        L4d:
            java.lang.Object r5 = r0.getSecond()     // Catch: java.lang.Throwable -> L93
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L93
        L57:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r6 == 0) goto L1a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L93
            java.util.Map<com.facebook.appevents.OperationalDataEnum, kotlin.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> r7 = com.facebook.appevents.r.f9657b     // Catch: java.lang.Throwable -> L93
            com.facebook.appevents.OperationalDataEnum r7 = com.facebook.appevents.OperationalDataEnum.IAPParameters     // Catch: java.lang.Throwable -> L93
            java.lang.Object r7 = com.facebook.appevents.r.a.c(r7, r6, r12, r13)     // Catch: java.lang.Throwable -> L93
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L72
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L93
            goto L73
        L72:
            r7 = r1
        L73:
            if (r7 == 0) goto L7e
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L93
            if (r8 != 0) goto L7c
            goto L7e
        L7c:
            r8 = r3
            goto L7f
        L7e:
            r8 = r4
        L7f:
            if (r8 == 0) goto L82
            goto L57
        L82:
            boolean r7 = kotlin.jvm.internal.g.a(r7, r2)     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L57
            if (r14 == 0) goto L91
            java.lang.Object r10 = r0.getFirst()     // Catch: java.lang.Throwable -> L93
            r6 = r10
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L93
        L91:
            return r6
        L92:
            return r1
        L93:
            r10 = move-exception
            k6.a.a(r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.iap.g.b(android.os.Bundle, com.facebook.appevents.r, android.os.Bundle, com.facebook.appevents.r, boolean, boolean):java.lang.String");
    }
}
