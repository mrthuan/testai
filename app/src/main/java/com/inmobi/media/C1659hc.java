package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.text.Regex;

/* renamed from: com.inmobi.media.hc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1659hc implements InterfaceC1673ic {

    /* renamed from: a  reason: collision with root package name */
    public final AdConfig.VastVideoConfig f15145a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15146b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f15147d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f15148e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f15149f;

    /* renamed from: g  reason: collision with root package name */
    public Yb f15150g;

    /* renamed from: h  reason: collision with root package name */
    public String f15151h;

    /* renamed from: i  reason: collision with root package name */
    public int f15152i;

    public C1659hc(List trackers, AdConfig.VastVideoConfig vastVideoConfig) {
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(vastVideoConfig, "vastVideoConfig");
        this.f15145a = vastVideoConfig;
        ArrayList arrayList = new ArrayList();
        this.f15148e = arrayList;
        arrayList.addAll(trackers);
        this.f15146b = new ArrayList();
        this.f15149f = new ArrayList();
        this.f15152i = 0;
    }

    public static boolean a(double d10, double d11, double d12) {
        return d12 > d10 && d12 <= d11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d6, code lost:
        if (r3 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d8, code lost:
        r20.c = r3.f14926a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0182, code lost:
        if (r3 != null) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1659hc.b():java.lang.String");
    }

    public final int a() {
        List<String> split;
        String[] strArr;
        String str = this.f15147d;
        if (str != null && (split = new Regex(":").split(str, 0)) != null && (strArr = (String[]) split.toArray(new String[0])) != null && strArr.length > 2) {
            try {
                return (Integer.parseInt(strArr[1]) * 60) + ((int) Float.parseFloat(strArr[2]));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final void a(AdConfig.BitRateConfig bitRateConfig, CountDownLatch countDownLatch) {
        Iterator it = this.f15146b.iterator();
        while (it.hasNext()) {
            new C1575bc((Zb) it.next(), bitRateConfig.getHeaderTimeout(), countDownLatch).a();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1659hc(String str, String str2, String str3, List trackers, List companionAds, AdConfig.VastVideoConfig vastVideoConfig) {
        this(trackers, vastVideoConfig);
        kotlin.jvm.internal.g.e(trackers, "trackers");
        kotlin.jvm.internal.g.e(companionAds, "companionAds");
        kotlin.jvm.internal.g.e(vastVideoConfig, "vastVideoConfig");
        if (!companionAds.isEmpty()) {
            this.f15149f = new ArrayList(companionAds);
        }
        if (str != null) {
            this.f15146b.add(new Zb(str, 1000));
        }
        this.c = str;
        this.f15147d = str2;
        this.f15151h = str3;
    }
}
