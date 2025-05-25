package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.w9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1855w9 {

    /* renamed from: a  reason: collision with root package name */
    public static int f15586a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f15587b = null;
    public static String c = null;

    /* renamed from: d  reason: collision with root package name */
    public static String f15588d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f15589e = null;

    /* renamed from: f  reason: collision with root package name */
    public static String f15590f = null;

    /* renamed from: g  reason: collision with root package name */
    public static String f15591g = null;

    /* renamed from: h  reason: collision with root package name */
    public static String f15592h = null;

    /* renamed from: i  reason: collision with root package name */
    public static int f15593i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public static String f15594j;

    /* renamed from: k  reason: collision with root package name */
    public static String f15595k;

    /* renamed from: l  reason: collision with root package name */
    public static String f15596l;

    /* renamed from: m  reason: collision with root package name */
    public static String f15597m;

    /* renamed from: n  reason: collision with root package name */
    public static Location f15598n;

    public static void a(boolean z10) {
        f15587b = Boolean.valueOf(z10);
        Context d10 = Ha.d();
        if (d10 != null) {
            Ha.a(new qb.i1(d10, z10, 0));
        }
    }

    public static Location b() {
        Location location = f15598n;
        if (location != null) {
            return location;
        }
        Context d10 = Ha.d();
        Location location2 = null;
        if (d10 == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        String string = AbstractC1838v5.a(d10, "user_info_store").f15579a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new Regex(",").split(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f15598n = location2;
        return location2;
    }

    public static boolean c() {
        Boolean bool = f15587b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context d10 = Ha.d();
        if (d10 != null) {
            ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
            f15587b = Boolean.valueOf(AbstractC1838v5.a(d10, "user_info_store").f15579a.getBoolean("user_age_restricted", false));
        }
        Boolean bool2 = f15587b;
        if (bool2 == null) {
            return false;
        }
        return bool2.booleanValue();
    }

    public static final void a(Context it, boolean z10) {
        kotlin.jvm.internal.g.e(it, "$it");
        ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
        AbstractC1838v5.a(it, "user_info_store").a("user_age_restricted", z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap a() {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1855w9.a():java.util.HashMap");
    }
}
