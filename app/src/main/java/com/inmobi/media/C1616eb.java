package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.eb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1616eb implements InterfaceC1670i9, F9, InterfaceC1719m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1616eb f15034a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f15035b;
    public static final List c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f15036d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile TelemetryConfig f15037e;

    /* renamed from: f  reason: collision with root package name */
    public static A3 f15038f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile C1818tb f15039g;

    /* renamed from: h  reason: collision with root package name */
    public static final C1602db f15040h;

    /* renamed from: i  reason: collision with root package name */
    public static C1754ob f15041i;

    static {
        C1616eb c1616eb = new C1616eb();
        f15034a = c1616eb;
        f15035b = "eb";
        ArrayList J = ge.a.J("AdLoadCalled", "AdLoadDroppedAtSDK", "AdLoadSuccessful", "AdLoadFailed", "ServerFill", "ServerNoFill", "ServerError", "AssetDownloaded", "AdShowCalled", "AdShowSuccessful", "AdShowFailed", "AdGetSignalsCalled", "AdGetSignalsSucceeded", "AdGetSignalsFailed", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "ParseSuccess", "PageStarted", "WebViewLoadFinished", "FireAdReady", "WebViewLoadCalled", "FireAdFailed", "ResourceCacheMiss", "ResourceCacheHit", "ResourceDiskCacheFileMissing", "ResourceDiskCacheFileEvicted", "LowAvailableSpaceForCache", "WebViewRenderProcessGoneEvent", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "landingsCompleteSuccess", "landingsCompleteFailed", "userclickClose", "userclickReload", "ImmersiveNotSupported", "AdNotReady");
        c = J;
        f15036d = new AtomicBoolean(false);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        Config a10 = C1705l2.a("telemetry", Ha.b(), c1616eb);
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        f15037e = (TelemetryConfig) a10;
        TelemetryConfig telemetryConfig = f15037e;
        f15039g = new C1818tb(new C1658hb(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), kotlin.collections.m.E0(J));
        f15040h = C1602db.f15020a;
    }

    public static final void b(String eventType, Map keyValueMap, EnumC1686jb telemetryEventType) {
        kotlin.jvm.internal.g.e(eventType, "eventType");
        kotlin.jvm.internal.g.e(keyValueMap, "keyValueMap");
        kotlin.jvm.internal.g.e(telemetryEventType, "telemetryEventType");
        Ha.a(new v4.a(2, eventType, keyValueMap, telemetryEventType));
    }

    public static final void c() {
        if (f15036d.getAndSet(true)) {
            return;
        }
        C1616eb c1616eb = f15034a;
        if (AbstractC1860x1.a((AbstractC1860x1) AbstractC1882ya.e()) > 0) {
            c1616eb.b();
        }
        Ha.f().a(new int[]{2, 1}, f15040h);
        f15041i = new C1754ob(f15037e);
    }

    @Override // com.inmobi.media.InterfaceC1719m2
    public final void a(Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfig = (TelemetryConfig) config;
            f15037e = telemetryConfig;
            f15039g = new C1818tb(new C1658hb(telemetryConfig.getEnabled(), telemetryConfig.getAssetConfig().isImageEnabled(), telemetryConfig.getAssetConfig().isGifEnabled(), telemetryConfig.getAssetConfig().isVideoEnabled(), telemetryConfig.isGeneralEventsDisabled(), telemetryConfig.getPriorityEventsList(), telemetryConfig.getSamplingFactor()), kotlin.collections.m.E0(c));
            C1754ob c1754ob = f15041i;
            if (c1754ob != null) {
                c1754ob.f15364a = telemetryConfig;
            }
        }
    }

    public final void b() {
        if (f15036d.get()) {
            C1862x3 eventConfig = f15037e.getEventConfig();
            eventConfig.f15632k = f15037e.getTelemetryUrl();
            A3 a32 = f15038f;
            if (a32 == null) {
                f15038f = new A3(AbstractC1882ya.e(), this, eventConfig, this);
            } else {
                a32.f14123i = eventConfig;
            }
            A3 a33 = f15038f;
            if (a33 != null) {
                C1862x3 c1862x3 = a33.f14123i;
                if (a33.f14120f.get() || c1862x3 == null) {
                    return;
                }
                a33.a(c1862x3.c, true);
            }
        }
    }

    public static final void c(String eventType, Map keyValueMap, EnumC1686jb telemetryEventType) {
        String str;
        kotlin.jvm.internal.g.e(eventType, "$eventType");
        kotlin.jvm.internal.g.e(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.g.e(telemetryEventType, "$telemetryEventType");
        Objects.toString(keyValueMap);
        try {
            if (f15039g == null) {
                return;
            }
            C1616eb c1616eb = f15034a;
            if (a(eventType, keyValueMap, telemetryEventType)) {
                return;
            }
            C1818tb c1818tb = f15039g;
            if (c1818tb != null) {
                int a10 = c1818tb.a(telemetryEventType, eventType);
                if (a10 == 0) {
                    keyValueMap.put("samplingRate", Integer.valueOf(pdf.pdfreader.viewer.editor.free.utils.t0.n0((1 - f15037e.getSamplingFactor()) * 100)));
                } else if (a10 != 1) {
                    return;
                } else {
                    keyValueMap.put("samplingRate", 100);
                }
                int ordinal = telemetryEventType.ordinal();
                if (ordinal == 0) {
                    str = "sdk";
                } else if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    str = "template";
                }
                C1728mb c1728mb = new C1728mb(eventType, null, str);
                keyValueMap.put("eventType", c1728mb.f15672a);
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.g.d(uuid, "toString(...)");
                keyValueMap.put("eventId", uuid);
                keyValueMap.put("isTemplateEvent", Boolean.valueOf(telemetryEventType == EnumC1686jb.f15239b));
                String jSONObject = new JSONObject(keyValueMap).toString();
                kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
                c1728mb.f15674d = jSONObject;
                AbstractC1860x1.a((AbstractC1860x1) AbstractC1882ya.e());
                int a11 = (AbstractC1860x1.a((AbstractC1860x1) AbstractC1882ya.e()) + 1) - f15037e.getMaxEventsToPersist();
                if (a11 > 0) {
                    AbstractC1882ya.e().a(a11);
                    int a12 = AbstractC1700kb.a() + a11;
                    if (a12 != -1) {
                        AbstractC1700kb.f15270b = a12;
                        C1851w5 c1851w5 = AbstractC1700kb.f15269a;
                        if (c1851w5 != null) {
                            c1851w5.a("count", a12);
                        }
                    }
                }
                AbstractC1882ya.e().a(c1728mb);
                AbstractC1860x1.a((AbstractC1860x1) AbstractC1882ya.e());
                c1616eb.b();
                return;
            }
            kotlin.jvm.internal.g.i("mTelemetryValidator");
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r0.f15143f.contains(r3) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r5.f15711a.f15140b == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        if (r5.f15711a.c == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r5.f15711a.f15141d == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r3, java.util.Map r4, com.inmobi.media.EnumC1686jb r5) {
        /*
            com.inmobi.media.tb r0 = com.inmobi.media.C1616eb.f15039g
            if (r0 == 0) goto L94
            java.lang.String r1 = "telemetryEventType"
            kotlin.jvm.internal.g.e(r5, r1)
            java.lang.String r1 = "keyValueMap"
            kotlin.jvm.internal.g.e(r4, r1)
            java.lang.String r1 = "eventType"
            kotlin.jvm.internal.g.e(r3, r1)
            com.inmobi.media.hb r1 = r0.f15478a
            boolean r1 = r1.f15139a
            r2 = 1
            if (r1 != 0) goto L1c
            goto L8f
        L1c:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L2c
            if (r5 != r2) goto L26
            goto L91
        L26:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L2c:
            com.inmobi.media.za r5 = r0.f15479b
            r5.getClass()
            com.inmobi.media.hb r0 = r5.f15711a
            boolean r1 = r0.f15142e
            if (r1 == 0) goto L40
            java.util.List r0 = r0.f15143f
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L40
            goto L8f
        L40:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L91
            java.lang.String r0 = "AssetDownloaded"
            boolean r3 = kotlin.jvm.internal.g.a(r3, r0)
            if (r3 == 0) goto L91
            java.lang.String r3 = "assetType"
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L91
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = "image"
            boolean r0 = kotlin.jvm.internal.g.a(r1, r0)
            if (r0 == 0) goto L6a
            com.inmobi.media.hb r0 = r5.f15711a
            boolean r0 = r0.f15140b
            if (r0 != 0) goto L6a
            goto L8f
        L6a:
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = "gif"
            boolean r0 = kotlin.jvm.internal.g.a(r1, r0)
            if (r0 == 0) goto L7d
            com.inmobi.media.hb r0 = r5.f15711a
            boolean r0 = r0.c
            if (r0 != 0) goto L7d
            goto L8f
        L7d:
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r4 = "video"
            boolean r3 = kotlin.jvm.internal.g.a(r4, r3)
            if (r3 == 0) goto L91
            com.inmobi.media.hb r3 = r5.f15711a
            boolean r3 = r3.f15141d
            if (r3 != 0) goto L91
        L8f:
            r3 = 0
            goto L92
        L91:
            r3 = r2
        L92:
            r3 = r3 ^ r2
            return r3
        L94:
            java.lang.String r3 = "mTelemetryValidator"
            kotlin.jvm.internal.g.i(r3)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1616eb.a(java.lang.String, java.util.Map, com.inmobi.media.jb):boolean");
    }

    @Override // com.inmobi.media.InterfaceC1670i9
    public final C1888z3 a() {
        int a10;
        String str;
        if (C1566b3.f14952a.p() == 1) {
            a10 = f15037e.getWifiConfig().a();
        } else {
            a10 = f15037e.getMobileConfig().a();
        }
        ArrayList F0 = kotlin.collections.m.F0(AbstractC1882ya.e().b(a10));
        if (!a("DatabaseMaxLimitReachedV2", kotlin.collections.q.y0(), EnumC1686jb.f15238a) && F0.size() < a10 && AbstractC1700kb.a() > 0) {
            int a11 = AbstractC1700kb.a();
            C1728mb c1728mb = new C1728mb("DatabaseMaxLimitReachedV2", null, "sdk");
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.g.d(uuid, "toString(...)");
            String jSONObject = new JSONObject(kotlin.collections.q.z0(new Pair("eventId", uuid), new Pair("eventType", "DatabaseMaxLimitReachedV2"), new Pair("samplingRate", 100), new Pair("isTemplateEvent", Boolean.FALSE), new Pair("eventLostCount", Integer.valueOf(a11)))).toString();
            kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
            c1728mb.f15674d = jSONObject;
            AbstractC1700kb.c = Integer.valueOf(c1728mb.c);
            F0.add(c1728mb);
        }
        if (!F0.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C1728mb) it.next()).c));
            }
            try {
                String b10 = Ha.b();
                if (b10 == null) {
                    b10 = "";
                }
                LinkedHashMap B0 = kotlin.collections.q.B0(new Pair("im-accid", b10), new Pair("version", "4.0.0"), new Pair("mk-version", Ia.a()), new Pair("u-appbid", I0.f14334a), new Pair("tp", Ia.d()));
                String f10 = Ia.f();
                if (f10 != null) {
                    B0.put("tp-v", f10);
                }
                JSONObject jSONObject2 = new JSONObject(B0);
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = F0.iterator();
                while (it2.hasNext()) {
                    C1728mb c1728mb2 = (C1728mb) it2.next();
                    if (kotlin.text.k.n0(c1728mb2.a()).toString().length() > 0) {
                        jSONArray.put(new JSONObject(c1728mb2.a()));
                    }
                }
                jSONObject2.put("payload", jSONArray);
                str = jSONObject2.toString();
            } catch (JSONException unused) {
                str = null;
            }
            if (str != null) {
                return new C1888z3(arrayList, str);
            }
        }
        return null;
    }
}
