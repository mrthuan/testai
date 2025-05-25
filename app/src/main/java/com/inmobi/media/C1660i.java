package com.inmobi.media;

import com.google.android.gms.common.api.Api;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: com.inmobi.media.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1660i {

    /* renamed from: b  reason: collision with root package name */
    public int f15154b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f15155d;

    /* renamed from: g  reason: collision with root package name */
    public long f15158g;

    /* renamed from: h  reason: collision with root package name */
    public long f15159h;

    /* renamed from: a  reason: collision with root package name */
    public final int f15153a = new Random().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: e  reason: collision with root package name */
    public final long f15156e = System.currentTimeMillis();

    /* renamed from: f  reason: collision with root package name */
    public final long f15157f = System.currentTimeMillis();

    public final C1660i a(String url, String locationOnDisk, H8 response, int i10, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        long j13;
        long j14;
        int i11;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(locationOnDisk, "locationOnDisk");
        kotlin.jvm.internal.g.e(response, "response");
        Map map = response.f14323e;
        long currentTimeMillis = System.currentTimeMillis();
        List list = map != null ? (List) map.get("Date") : null;
        int i12 = 0;
        int i13 = 1;
        long a10 = (list == null || !(list.isEmpty() ^ true)) ? 0L : a((String) list.get(0));
        List list2 = map != null ? (List) map.get("Cache-Control") : null;
        if (list2 == null || !(!list2.isEmpty())) {
            z10 = false;
            j11 = 0;
            z11 = false;
            j12 = 0;
        } else {
            String[] strArr = (String[]) kotlin.text.k.h0((String) list2.get(0), new String[]{","}, 0, 6).toArray(new String[0]);
            int length = strArr.length;
            int i14 = 0;
            z11 = false;
            j11 = 0;
            j12 = 0;
            while (i14 < length) {
                String str = strArr[i14];
                int i15 = i12;
                int length2 = str.length() - 1;
                int i16 = i15;
                while (true) {
                    if (i15 > length2) {
                        i11 = i13;
                        break;
                    }
                    boolean z12 = kotlin.jvm.internal.g.f(str.charAt(i16 == 0 ? i15 : length2), 32) <= 0;
                    if (i16 == 0) {
                        if (z12) {
                            i15++;
                        } else {
                            i13 = 1;
                            i16 = 1;
                        }
                    } else if (!z12) {
                        i11 = 1;
                        break;
                    } else {
                        length2--;
                    }
                    i13 = 1;
                }
                String a11 = C6.a(length2, i11, str, i15);
                if (!kotlin.jvm.internal.g.a("no-cache", a11) && !kotlin.jvm.internal.g.a("no-store", a11)) {
                    if (kotlin.text.j.M(a11, "max-age=", false)) {
                        try {
                            String substring = a11.substring(8);
                            kotlin.jvm.internal.g.d(substring, "this as java.lang.String).substring(startIndex)");
                            j11 = Long.parseLong(substring);
                        } catch (Exception unused) {
                        }
                    } else if (kotlin.text.j.M(a11, "stale-while-revalidate=", false)) {
                        String substring2 = a11.substring(23);
                        kotlin.jvm.internal.g.d(substring2, "this as java.lang.String).substring(startIndex)");
                        j12 = Long.parseLong(substring2);
                    } else if (kotlin.jvm.internal.g.a("must-revalidate", a11) || kotlin.jvm.internal.g.a("proxy-revalidate", a11)) {
                        z11 = true;
                    }
                }
                i14++;
                i12 = 0;
                i13 = 1;
            }
            z10 = true;
        }
        List list3 = map != null ? (List) map.get("Expires") : null;
        long a12 = (list3 == null || !(list3.isEmpty() ^ true)) ? 0L : a((String) list3.get(0));
        if (z10) {
            long j15 = 1000;
            j14 = (j11 * j15) + currentTimeMillis;
            if (!z11) {
                Long.signum(j12);
                j13 = (j12 * j15) + j14;
            }
            j13 = j14;
        } else if (1 > a10 || a10 > a12) {
            j13 = 0;
            j14 = 0;
        } else {
            j14 = (a12 - a10) + currentTimeMillis;
            j13 = j14;
        }
        this.c = url;
        this.f15155d = locationOnDisk;
        this.f15154b = i10;
        long j16 = (1000 * j10) + currentTimeMillis;
        this.f15158g = j16;
        this.f15159h = j14;
        this.f15158g = Math.min(j16, j13);
        return this;
    }

    public static long a(String str) {
        try {
            Date parse = new SimpleDateFormat("EEE,dd MMM yyyy HH:mm:ss z", Locale.ENGLISH).parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
            return 0L;
        }
    }
}
