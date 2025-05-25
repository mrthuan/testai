package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1633g0 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1591d0 f15080a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1767pb f15081b;
    public final J c;

    /* renamed from: d  reason: collision with root package name */
    public final String f15082d;

    /* renamed from: e  reason: collision with root package name */
    public long f15083e;

    /* renamed from: f  reason: collision with root package name */
    public A4 f15084f;

    /* renamed from: g  reason: collision with root package name */
    public final C1619f0 f15085g;

    /* renamed from: h  reason: collision with root package name */
    public final C1605e0 f15086h;

    public C1633g0(InterfaceC1591d0 mAdStoreListener, InterfaceC1767pb mTelemetryListener, J mAdPlacement) {
        kotlin.jvm.internal.g.e(mAdStoreListener, "mAdStoreListener");
        kotlin.jvm.internal.g.e(mTelemetryListener, "mTelemetryListener");
        kotlin.jvm.internal.g.e(mAdPlacement, "mAdPlacement");
        this.f15080a = mAdStoreListener;
        this.f15081b = mTelemetryListener;
        this.c = mAdPlacement;
        this.f15082d = "g0";
        this.f15085g = new C1619f0(this);
        this.f15086h = new C1605e0(this);
    }

    public final C1577c0 a(D networkRequest, Integer num) {
        F f10;
        kotlin.jvm.internal.g.e(networkRequest, "networkRequest");
        if (num != null && SystemClock.elapsedRealtime() - this.f15083e < num.intValue() * 1000) {
            throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST), (short) 2009);
        }
        Map map = networkRequest.D;
        if (map == null) {
            map = new HashMap();
        }
        networkRequest.D = map;
        this.f15083e = SystemClock.elapsedRealtime();
        try {
            H8 b10 = networkRequest.b();
            f10 = new F(b10);
            try {
                b10.b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            f10 = null;
        }
        D8 d82 = f10 != null ? f10.f14240a.c : null;
        if (f10 == null) {
            a(kotlin.collections.q.B0(new Pair("errorCode", (short) 2108)));
            throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
        } else if (d82 == null) {
            ((AbstractC1846w0) this.f15080a).g0();
            try {
                return a(new JSONObject(f10.f14240a.a()));
            } catch (JSONException e10) {
                a(kotlin.collections.q.B0(new Pair("errorCode", (short) 2113)));
                A4 a42 = this.f15084f;
                if (a42 != null) {
                    String TAG = this.f15082d;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    ((B4) a42).a(TAG, "Error while parsing ad response.", e10);
                }
                throw new C1845w(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 0);
            }
        } else {
            a(kotlin.collections.q.B0(new Pair("errorCode", d82.f14201a.toString())));
            InMobiAdRequestStatus inMobiAdRequestStatus = f10.f14241b;
            if (inMobiAdRequestStatus == null) {
                return null;
            }
            throw new C1845w(inMobiAdRequestStatus, (short) 0);
        }
    }

    public static String a() {
        String b10 = Ha.b();
        if (b10 != null) {
            JSONObject jSONObject = new JSONObject();
            LinkedHashMap linkedHashMap = C1732n2.f15334a;
            jSONObject.put("root", C1705l2.a("root", b10, null).getLastUpdateTimeStamp());
            jSONObject.put("ads", C1705l2.a("ads", b10, null).getLastUpdateTimeStamp());
            jSONObject.put("telemetry", C1705l2.a("telemetry", b10, null).getLastUpdateTimeStamp());
            jSONObject.put("crashReporting", C1705l2.a("crashReporting", b10, null).getLastUpdateTimeStamp());
            jSONObject.put("signals", C1705l2.a("signals", b10, null).getLastUpdateTimeStamp());
            return jSONObject.toString();
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x018b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final com.inmobi.media.C1577c0 a(org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1633g0.a(org.json.JSONObject):com.inmobi.media.c0");
    }

    public final void a(Boolean bool) {
        LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f15083e)), new Pair("networkType", C1566b3.q()), new Pair("plId", Long.valueOf(this.c.l())));
        String m10 = this.c.m();
        if (m10 != null) {
            B0.put("plType", m10);
        }
        if (bool != null) {
            B0.put("isRewarded", bool);
        }
        String b10 = this.c.b();
        if (b10 != null) {
            B0.put("adType", b10);
        }
        ((AbstractC1846w0) this.f15081b).b("ServerFill", B0);
    }

    public final void a(Map payload) {
        kotlin.jvm.internal.g.e(payload, "payload");
        payload.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f15083e));
        String b10 = this.c.b();
        if (b10 != null) {
            payload.put("adType", b10);
        }
        payload.put("networkType", C1566b3.q());
        payload.put("plId", Long.valueOf(this.c.l()));
        String m10 = this.c.m();
        if (m10 != null) {
            payload.put("plType", m10);
        }
        ((AbstractC1846w0) this.f15081b).b("ServerError", payload);
    }
}
