package com.inmobi.media;

import android.app.NotificationManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;

/* renamed from: com.inmobi.media.b3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1566b3 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1566b3 f14952a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ ig.h[] f14953b;
    public static long c;

    /* renamed from: d  reason: collision with root package name */
    public static String f14954d;

    /* renamed from: e  reason: collision with root package name */
    public static final C1564b1 f14955e;

    /* renamed from: f  reason: collision with root package name */
    public static final C1564b1 f14956f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f14957g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pair f14958h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f14959i;

    /* renamed from: j  reason: collision with root package name */
    public static final String f14960j;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C1566b3.class, "maxDeviceVolume", "getMaxDeviceVolume()I", 0);
        kotlin.jvm.internal.j jVar = kotlin.jvm.internal.i.f19949a;
        jVar.getClass();
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C1566b3.class, "curDeviceVolume", "getCurDeviceVolume()I", 0);
        jVar.getClass();
        f14953b = new ig.h[]{propertyReference1Impl, propertyReference1Impl2};
        f14952a = new C1566b3();
        c = -1L;
        f14955e = new C1564b1((Integer) 15, (cg.a) C1552a3.f14931a, false, 12);
        f14956f = new C1564b1((Integer) 0, (cg.a) Z2.f14901a, true, 8);
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.g.d(RELEASE, "RELEASE");
        f14957g = RELEASE;
        f14958h = new Pair("d-api-lev", "" + Build.VERSION.SDK_INT);
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.g.d(MANUFACTURER, "MANUFACTURER");
        f14959i = MANUFACTURER;
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.g.d(MODEL, "MODEL");
        f14960j = MODEL;
    }

    public static final boolean A() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public static void H() {
        Ha.a(new com.facebook.appevents.e(2));
    }

    public static final void I() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            long availableBytes = statFs.getAvailableBytes();
            long availableBytes2 = statFs2.getAvailableBytes() + availableBytes;
            if (Environment.getExternalStorageState().equals("mounted")) {
                availableBytes = availableBytes2;
            }
            c = availableBytes / 1048576;
        } catch (Exception e10) {
            Q4.c.a(new J1(e10));
        }
    }

    public static void J() {
        Ha.a(new com.facebook.appevents.a(5));
    }

    public static final void K() {
        List<Object> storageVolumes;
        String uuid;
        UUID uuid2;
        String state;
        long freeBytes;
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        Object systemService = d10.getSystemService("storagestats");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager e10 = bb.j.e(systemService);
        Object systemService2 = d10.getSystemService("storage");
        kotlin.jvm.internal.g.c(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.g.d(storageVolumes, "getStorageVolumes(...)");
        long j10 = 0;
        for (Object obj : storageVolumes) {
            StorageVolume b10 = com.google.android.gms.internal.ads.q.b(obj);
            uuid = b10.getUuid();
            if (uuid == null) {
                uuid2 = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.g.b(uuid2);
            } else {
                try {
                    uuid2 = UUID.fromString(uuid);
                    kotlin.jvm.internal.g.b(uuid2);
                } catch (Exception unused) {
                }
            }
            state = b10.getState();
            if (state.equals("mounted")) {
                try {
                    freeBytes = e10.getFreeBytes(uuid2);
                    j10 += freeBytes;
                } catch (Exception e11) {
                    J1 j12 = new J1(e11);
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(j12);
                }
            }
        }
        c = j10 / 1048576;
    }

    public static void L() {
        Ha.a(new a6.c(3));
    }

    public static final void M() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            float blockCountLong = ((float) statFs.getBlockCountLong()) * ((float) statFs.getBlockSizeLong());
            float blockCountLong2 = (((float) statFs2.getBlockCountLong()) * ((float) statFs2.getBlockSizeLong())) + blockCountLong;
            if (Environment.getExternalStorageState().equals("mounted")) {
                blockCountLong = blockCountLong2;
            }
            f14954d = "" + (blockCountLong / ((float) 1048576));
        } catch (Exception e10) {
            Q4.c.a(new J1(e10));
        }
    }

    public static void N() {
        Ha.a(new d6.b(3));
    }

    public static final void O() {
        List<Object> storageVolumes;
        String uuid;
        UUID uuid2;
        String state;
        long totalBytes;
        Context d10 = Ha.d();
        if (d10 == null) {
            return;
        }
        Object systemService = d10.getSystemService("storagestats");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.app.usage.StorageStatsManager");
        StorageStatsManager e10 = bb.j.e(systemService);
        Object systemService2 = d10.getSystemService("storage");
        kotlin.jvm.internal.g.c(systemService2, "null cannot be cast to non-null type android.os.storage.StorageManager");
        storageVolumes = ((StorageManager) systemService2).getStorageVolumes();
        kotlin.jvm.internal.g.d(storageVolumes, "getStorageVolumes(...)");
        long j10 = 0;
        for (Object obj : storageVolumes) {
            StorageVolume b10 = com.google.android.gms.internal.ads.q.b(obj);
            uuid = b10.getUuid();
            if (uuid == null) {
                uuid2 = StorageManager.UUID_DEFAULT;
                kotlin.jvm.internal.g.b(uuid2);
            } else {
                try {
                    uuid2 = UUID.fromString(uuid);
                    kotlin.jvm.internal.g.b(uuid2);
                } catch (Exception unused) {
                }
            }
            state = b10.getState();
            if (state.equals("mounted")) {
                try {
                    totalBytes = e10.getTotalBytes(uuid2);
                    j10 += totalBytes;
                } catch (Exception e11) {
                    J1 j12 = new J1(e11);
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(j12);
                }
            }
        }
        f14954d = "" + (j10 / 1048576);
    }

    public static String o() {
        ConnectivityManager connectivityManager;
        String str;
        Context d10 = Ha.d();
        if (d10 == null || !AbstractC1684j9.a(d10, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        Object systemService = d10.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return "";
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e10) {
            e10.toString();
        }
        if (networkInfo == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 28) {
            int type = networkInfo.getType();
            int subtype = networkInfo.getSubtype();
            if (type != 0) {
                if (type != 1) {
                    str = String.valueOf(type);
                }
                return "1";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(type);
            sb2.append('|');
            sb2.append(subtype);
            str = sb2.toString();
            return str;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return "";
        }
        if (networkCapabilities.hasTransport(0)) {
            str = "0|" + networkInfo.getSubtype();
        } else {
            if (!networkCapabilities.hasTransport(1)) {
                if (networkCapabilities.hasTransport(2)) {
                    str = "7";
                } else if (networkCapabilities.hasTransport(3)) {
                    str = "9";
                } else if (networkCapabilities.hasTransport(4)) {
                    str = "17";
                } else if (networkCapabilities.hasTransport(5)) {
                    str = "10";
                } else if (networkCapabilities.hasTransport(6)) {
                    str = "11";
                } else {
                    str = "8";
                }
            }
            return "1";
        }
        return str;
    }

    public static final String q() {
        int p10 = f14952a.p();
        if (p10 != 0) {
            if (p10 != 1) {
                return "NIL";
            }
            return "wifi";
        }
        return "carrier";
    }

    public static final boolean y() {
        return true;
    }

    public static final boolean z() {
        return true;
    }

    public final boolean B() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public final int a(Context context, boolean z10) {
        if (context == null || z10) {
            return 0;
        }
        int intValue = ((Number) f14956f.getValue(this, f14953b[1])).intValue();
        int m10 = m();
        if (m10 <= 0) {
            return 0;
        }
        return (intValue * 100) / m10;
    }

    public final Pair<String, String> b() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        if (Settings.Global.getInt(d10.getContentResolver(), "airplane_mode_on", 0) != 0) {
            return new Pair<>("d-airplane-m", "1");
        }
        return new Pair<>("d-airplane-m", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
    }

    public final Pair<String, String> c() {
        return f14958h;
    }

    public final Pair<String, String> d() {
        if (Build.VERSION.SDK_INT >= 26) {
            J();
        } else {
            H();
        }
        long j10 = c;
        if (j10 != -1) {
            return new Pair<>("d-av-disk", String.valueOf(j10));
        }
        return null;
    }

    public final long e() {
        return c;
    }

    public final Pair<String, String> f() {
        String str;
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        Intent a10 = AbstractC1579c2.a(d10, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i10 = -1;
        if (a10 != null) {
            i10 = a10.getIntExtra("status", -1);
        }
        if (i10 == 2) {
            str = "1";
        } else {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        return new Pair<>("d-bat-chrg", str);
    }

    public final Pair<String, String> g() {
        Context d10 = Ha.d();
        Integer num = null;
        if (d10 == null) {
            return null;
        }
        Intent a10 = AbstractC1579c2.a(d10, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (a10 != null) {
            num = Integer.valueOf((int) ((a10.getIntExtra("level", -1) * 100) / a10.getIntExtra("scale", -1)));
        }
        return new Pair<>("d-bat-lev", "" + num);
    }

    public final Pair<String, String> h() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        Object systemService = d10.getSystemService("power");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        if (((PowerManager) systemService).isPowerSaveMode()) {
            return new Pair<>("d-bat-sav", "1");
        }
        return new Pair<>("d-bat-sav", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
    }

    public final Pair<String, String> i() {
        String str;
        int i10 = Resources.getSystem().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            if (i10 != 32) {
                return null;
            }
            str = "1";
        } else {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        return new Pair<>("d-drk-m", str);
    }

    public final Pair<String, String> j() {
        String str;
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        Object systemService = d10.getSystemService("notification");
        kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            if (currentInterruptionFilter != 2 && currentInterruptionFilter != 3 && currentInterruptionFilter != 4) {
                str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
            } else {
                str = "1";
            }
            return new Pair<>("d-dnd", str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> k() {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = com.inmobi.media.Ha.d()
            if (r1 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            kotlin.jvm.internal.g.c(r1, r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            java.util.List r2 = r1.getEnabledInputMethodList()
            java.lang.String r3 = "getEnabledInputMethodList(...)"
            kotlin.jvm.internal.g.d(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L95
            java.lang.Object r3 = r2.next()
            android.view.inputmethod.InputMethodInfo r3 = (android.view.inputmethod.InputMethodInfo) r3
            r4 = 1
            java.util.List r3 = r1.getEnabledInputMethodSubtypeList(r3, r4)
            java.lang.String r4 = "getEnabledInputMethodSubtypeList(...)"
            kotlin.jvm.internal.g.d(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L27
            java.lang.Object r4 = r3.next()
            android.view.inputmethod.InputMethodSubtype r4 = (android.view.inputmethod.InputMethodSubtype) r4
            java.lang.String r5 = r4.getMode()
            java.lang.String r6 = "keyboard"
            boolean r5 = kotlin.jvm.internal.g.a(r5, r6)
            if (r5 == 0) goto L41
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L7b
            java.lang.String r5 = com.google.android.gms.internal.ads.b.f(r4)
            java.lang.String r6 = "getLanguageTag(...)"
            kotlin.jvm.internal.g.d(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto L7b
            java.lang.String r4 = com.google.android.gms.internal.ads.b.f(r4)
            java.util.Locale r4 = java.util.Locale.forLanguageTag(r4)
            java.lang.String r4 = r4.getLanguage()
            goto L88
        L7b:
            java.util.Locale r5 = new java.util.Locale
            java.lang.String r4 = r4.getLocale()
            r5.<init>(r4)
            java.lang.String r4 = r5.getLanguage()
        L88:
            kotlin.jvm.internal.g.b(r4)
            int r5 = r4.length()
            if (r5 <= 0) goto L41
            r0.add(r4)
            goto L41
        L95:
            kotlin.Pair r1 = new kotlin.Pair
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.g.d(r0, r2)
            java.lang.String r2 = "d-key-lang"
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1566b3.k():kotlin.Pair");
    }

    public final String l() {
        return f14959i;
    }

    public final int m() {
        return ((Number) f14955e.getValue(this, f14953b[0])).intValue();
    }

    public final String n() {
        return f14960j;
    }

    public final int p() {
        String o10 = o();
        if (kotlin.text.j.M(o10, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES, false)) {
            return 0;
        }
        if (kotlin.text.j.M(o10, "1", false)) {
            return 1;
        }
        return 2;
    }

    public final String s() {
        return f14957g;
    }

    public final Pair<String, String> t() {
        if (Build.VERSION.SDK_INT >= 26) {
            N();
        } else {
            L();
        }
        String str = f14954d;
        if (str != null) {
            return new Pair<>("d-tot-disk", str);
        }
        return null;
    }

    public final Pair<String, String> u() {
        Context d10 = Ha.d();
        if (d10 == null) {
            return null;
        }
        Intent a10 = AbstractC1579c2.a(d10, null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        if (a10 != null && a10.getIntExtra("state", 0) == 1) {
            return new Pair<>("d-w-h", "1");
        }
        return new Pair<>("d-w-h", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
    }

    public final void v() {
        d();
        t();
        m();
    }

    public final boolean w() {
        return true;
    }

    public final boolean x() {
        return true;
    }

    public final String a(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        Object systemService = context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
        return networkOperatorName == null ? "" : networkOperatorName;
    }

    public final Map<String, String> a(boolean z10) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("os-v", f14957g);
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.g.d(BRAND, "BRAND");
            hashMap.put("d-brand-name", BRAND);
            hashMap.put("d-manufacturer-name", f14959i);
            hashMap.put("d-model-name", f14960j);
            hashMap.put("d-nettype-raw", o());
            String locale = Locale.getDefault().toString();
            kotlin.jvm.internal.g.d(locale, "toString(...)");
            hashMap.put("d-localization", locale);
            String language = Locale.getDefault().getLanguage();
            kotlin.jvm.internal.g.d(language, "getLanguage(...)");
            hashMap.put("d-language", language);
            hashMap.put("d-media-volume", String.valueOf(a(Ha.d(), z10)));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public static /* synthetic */ void r() {
    }

    public final Y2 a() {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        return new Y2(maxMemory, freeMemory, maxMemory - freeMemory);
    }
}
