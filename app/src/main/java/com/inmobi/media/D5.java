package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.webkit.URLUtil;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class D5 {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f14191h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14192a;

    /* renamed from: b  reason: collision with root package name */
    public final E5 f14193b;
    public final I1 c;

    /* renamed from: d  reason: collision with root package name */
    public final O9 f14194d;

    /* renamed from: e  reason: collision with root package name */
    public final A9 f14195e;

    /* renamed from: f  reason: collision with root package name */
    public final L5 f14196f;

    /* renamed from: g  reason: collision with root package name */
    public final A4 f14197g;

    public D5(Context context, E5 landingPageState, I1 i12, O9 o92, A9 redirectionValidator, L5 l52, A4 a42) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(landingPageState, "landingPageState");
        kotlin.jvm.internal.g.e(redirectionValidator, "redirectionValidator");
        this.f14192a = context;
        this.f14193b = landingPageState;
        this.c = i12;
        this.f14194d = o92;
        this.f14195e = redirectionValidator;
        this.f14196f = l52;
        this.f14197g = a42;
    }

    public final void a(String eventType, Map keyValueMap) {
        L5 l52;
        kotlin.jvm.internal.g.e(eventType, "eventType");
        kotlin.jvm.internal.g.e(keyValueMap, "keyValueMap");
        if (kotlin.jvm.internal.g.a(eventType, "clickStartCalled") && (l52 = this.f14196f) != null) {
            l52.f14431h = System.currentTimeMillis();
        }
        L5 l53 = this.f14196f;
        if (l53 != null) {
            keyValueMap.put("plType", l53.f14426b);
            keyValueMap.put("plId", Long.valueOf(this.f14196f.f14425a));
            keyValueMap.put("adType", this.f14196f.c);
            keyValueMap.put("markupType", this.f14196f.f14427d);
            keyValueMap.put("creativeType", this.f14196f.f14428e);
            keyValueMap.put("metadataBlob", this.f14196f.f14429f);
            keyValueMap.put("isRewarded", Boolean.valueOf(this.f14196f.f14430g));
            keyValueMap.put("latency", Long.valueOf(System.currentTimeMillis() - this.f14196f.f14431h));
        }
        ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(new com.facebook.appevents.g(3, keyValueMap, eventType));
    }

    public final C5 b(String str, String str2, String str3, K5 k52) {
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).c("D5", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter(InMobiNetworkValues.URL);
        if (queryParameter != null && queryParameter.length() != 0) {
            int a10 = T2.a(this.f14192a, queryParameter, this.f14195e, str, this.f14197g);
            if (a10 != 0 && a10 != 1) {
                O9 o92 = this.f14194d;
                if (o92 != null) {
                    o92.f14559a.a(str2, "Invalid URL", str);
                }
                A4 a43 = this.f14197g;
                if (a43 != null) {
                    ((B4) a43).c("D5", "InmobiNativeBrowser scheme url handling failed");
                }
                if (k52.f14395b) {
                    a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("errorCode", Integer.valueOf(a10)), new Pair("trigger", k52.f14394a)));
                }
                return new C5(2, Integer.valueOf(a10));
            }
            c(str, str2, str3);
            A4 a44 = this.f14197g;
            if (a44 != null) {
                ((B4) a44).c("D5", "InmobiNativeBrowser scheme url handled successfully");
            }
            if (k52.f14395b) {
                a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", k52.f14394a)));
            }
            return new C5(1);
        }
        O9 o93 = this.f14194d;
        if (o93 != null) {
            o93.f14559a.a(str2, "Invalid URL", str);
        }
        A4 a45 = this.f14197g;
        if (a45 != null) {
            ((B4) a45).c("D5", "InMobiNativeBrowserScheme url is Empty or null");
        }
        if (k52.f14395b) {
            a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("errorCode", 2), new Pair("trigger", k52.f14394a)));
        }
        return new C5(3, 2);
    }

    public final void c(String str, String str2, String str3) {
        O9 o92 = this.f14194d;
        if (o92 != null) {
            o92.f14559a.getListener().a();
        }
        O9 o93 = this.f14194d;
        if (o93 != null) {
            S9.a(o93.f14559a, str, str2, str3);
        }
    }

    public final int d(String str, String str2, String str3) {
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).a("D5", "In processInternalNativeRequest");
        }
        try {
            return e(str, str2, str3);
        } catch (Exception e10) {
            O9 o92 = this.f14194d;
            if (o92 != null) {
                o92.f14559a.a(str2, "Unexpected error", PDWindowsLaunchParams.OPERATION_OPEN);
            }
            Z5.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            A4 a43 = this.f14197g;
            if (a43 != null) {
                ((B4) a43).b("D5", Cc.a(e10, A5.a("D5", "TAG", "SDK encountered unexpected error in handling open() request from creative ")));
            }
            return 9;
        }
    }

    public final int e(String api, String str, String str2) {
        String a10;
        kotlin.jvm.internal.g.e(api, "api");
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).c("D5", AbstractC1890z5.a("D5", "TAG", "processOpenCCTRequest - url - ", str2));
        }
        if (str2 != null && (!kotlin.text.j.M(str2, "http", false) || URLUtil.isValidUrl(str2))) {
            String a11 = O2.a(this.f14192a);
            try {
                try {
                    boolean z10 = this.f14193b.c;
                    if (a11 != null && z10) {
                        M1 m12 = new M1(str2, this.f14192a, this.c, this.f14195e, api);
                        N2 n22 = m12.f14451e;
                        Context context = m12.f14452f;
                        if (n22.f14515a == null && context != null && (a10 = O2.a(context)) != null) {
                            L2 l22 = new L2(n22);
                            n22.f14516b = l22;
                            u.d.a(context, a10, l22);
                        }
                        A4 a43 = this.f14197g;
                        if (a43 == null) {
                            return 0;
                        }
                        ((B4) a43).c("D5", "Default and Internal Native handled successfully");
                        return 0;
                    }
                    A4 a44 = this.f14197g;
                    if (a44 != null) {
                        ((B4) a44).a("D5", "ChromeCustomTab fallback to Embedded");
                    }
                    return b(str2, api);
                } catch (Exception e10) {
                    A4 a45 = this.f14197g;
                    if (a45 != null) {
                        ((B4) a45).a("D5", "Exception occurred while opening External ", e10);
                    }
                    return 9;
                }
            } catch (Exception unused) {
                int a12 = AbstractC1551a2.a(this.f14192a, str2, this.f14195e, api);
                if (a12 == 0 || a12 == 1) {
                    O9 o92 = this.f14194d;
                    if (o92 != null) {
                        S9.a(o92.f14559a, api, str, str2);
                    }
                    O9 o93 = this.f14194d;
                    if (o93 != null) {
                        o93.f14559a.getListener().a();
                        return a12;
                    }
                    return a12;
                }
                return a12;
            }
        }
        A4 a46 = this.f14197g;
        if (a46 != null) {
            ((B4) a46).c("D5", api + " called with invalid url (" + str2 + ')');
        }
        O9 o94 = this.f14194d;
        if (o94 != null) {
            o94.f14559a.a(str, "Invalid URL", api);
            return 3;
        }
        return 3;
    }

    public final void f(String str, String url, String str2) {
        kotlin.jvm.internal.g.e(url, "url");
        try {
            AbstractC1551a2.a(this.f14192a, url, this.f14195e, "openExternal");
            c("openExternal", str, url);
        } catch (ActivityNotFoundException e10) {
            A4 a42 = this.f14197g;
            if (a42 != null) {
                StringBuilder a10 = A5.a("D5", "TAG", "Error message in processing openExternal: ");
                a10.append(e10.getMessage());
                ((B4) a42).b("D5", a10.toString());
            }
            O9 o92 = this.f14194d;
            if (o92 != null) {
                StringBuilder sb2 = new StringBuilder("Cannot resolve URI (");
                try {
                    String encode = URLEncoder.encode(url, "UTF-8");
                    kotlin.jvm.internal.g.b(encode);
                    url = encode;
                } catch (UnsupportedEncodingException unused) {
                }
                sb2.append(url);
                sb2.append(')');
                String message = sb2.toString();
                kotlin.jvm.internal.g.e(message, "message");
                o92.f14559a.a(str, message, "openExternal");
            }
            if (str2 != null) {
                f(str, str2, null);
            }
        } catch (URISyntaxException e11) {
            A4 a43 = this.f14197g;
            if (a43 != null) {
                StringBuilder a11 = A5.a("D5", "TAG", "Error message in processing openExternal: ");
                a11.append(e11.getMessage());
                ((B4) a43).b("D5", a11.toString());
            }
            O9 o93 = this.f14194d;
            if (o93 != null) {
                StringBuilder sb3 = new StringBuilder("Cannot resolve URI (");
                try {
                    String encode2 = URLEncoder.encode(url, "UTF-8");
                    kotlin.jvm.internal.g.b(encode2);
                    url = encode2;
                } catch (UnsupportedEncodingException unused2) {
                }
                sb3.append(url);
                sb3.append(')');
                String message2 = sb3.toString();
                kotlin.jvm.internal.g.e(message2, "message");
                o93.f14559a.a(str, message2, "openExternal");
            }
            if (str2 != null) {
                f(str, str2, null);
            }
        } catch (Exception e12) {
            O9 o94 = this.f14194d;
            if (o94 != null) {
                o94.f14559a.a(str, "Unexpected error", "openExternal");
            }
            Z5.a((byte) 1, "D5", "Could not open URL SDK encountered an unexpected error");
            A4 a44 = this.f14197g;
            if (a44 != null) {
                ((B4) a44).b("D5", Cc.a(e12, A5.a("D5", "TAG", "SDK encountered unexpected error in handling openExternal() request from creative ")));
            }
        }
    }

    public static final void a(Map keyValueMap, String eventType) {
        kotlin.jvm.internal.g.e(keyValueMap, "$keyValueMap");
        kotlin.jvm.internal.g.e(eventType, "$eventType");
        keyValueMap.put("networkType", C1566b3.q());
        C1616eb c1616eb = C1616eb.f15034a;
        C1616eb.b(eventType, keyValueMap, EnumC1686jb.f15238a);
    }

    public final int b(String url, String api) {
        long currentTimeMillis;
        J j10;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(api, "api");
        if (url.length() == 0) {
            A4 a42 = this.f14197g;
            if (a42 != null) {
                ((B4) a42).b("D5", "processOpenEmbeddedRequest failed due to empty URL");
                return 2;
            }
            return 2;
        }
        if (P0.a(this.f14192a, url, this.f14195e, api, this.f14197g)) {
            return 0;
        }
        Uri parse = Uri.parse(url);
        kotlin.jvm.internal.g.d(parse, "parse(...)");
        if (AbstractC1551a2.a(parse)) {
            Intent intent = new Intent(this.f14192a, InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f14195e.getViewTouchTimestamp());
            L5 l52 = this.f14196f;
            if (l52 != null) {
                currentTimeMillis = l52.f14431h;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            intent.putExtra("clickStartTime", currentTimeMillis);
            A4 a43 = this.f14197g;
            if (a43 != null) {
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.g.d(uuid, "toString(...)");
                HashMap hashMap = AbstractC1747o4.f15359a;
                AbstractC1747o4.f15359a.put(uuid, new WeakReference(a43));
                intent.putExtra("loggerCacheKey", uuid);
            }
            O9 o92 = this.f14194d;
            if (o92 != null) {
                intent.putExtra("creativeId", o92.f14559a.getCreativeId());
                intent.putExtra("impressionId", o92.f14559a.getImpressionId());
                intent.putExtra("placementId", o92.f14559a.getPlacementId());
                V9 v92 = o92.f14559a.f14661h;
                intent.putExtra("placementType", (v92 == null || (j10 = v92.f14749a) == null) ? null : j10.m());
                intent.putExtra("adType", o92.f14559a.getAdType());
                intent.putExtra("markupType", o92.f14559a.getMarkupType());
                intent.putExtra("creativeType", o92.f14559a.f14684s0);
                V9 v93 = o92.f14559a.f14661h;
                intent.putExtra("metaDataBlob", v93 != null ? v93.c : null);
                V9 v94 = o92.f14559a.f14661h;
                intent.putExtra("isRewarded", v94 != null ? v94.f14754g : false);
                SparseArray sparseArray = InMobiAdActivity.f14092j;
                S9 s92 = o92.f14559a;
                InMobiAdActivity.f14093k = s92;
                Ha.f14324a.a(s92.getContainerContext(), intent);
            }
            O9 o93 = this.f14194d;
            if (o93 != null) {
                S9.a(o93.f14559a, null, null, url);
            }
            return 1;
        }
        A4 a44 = this.f14197g;
        if (a44 != null) {
            ((B4) a44).b("D5", "Embedded request unable to handle ".concat(url));
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
        r7 = r16.f14197g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a9, code lost:
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
        ((com.inmobi.media.B4) r7).c("D5", "default - internal native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b2, code lost:
        r1 = d(r17, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
        if (r8.equals("IN_NATIVE") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0195, code lost:
        if (r8.equals("DEFAULT") == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.C5 a(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.D5.a(java.lang.String, java.lang.String, java.lang.String, boolean):com.inmobi.media.C5");
    }

    public final void b(String str, String str2, String str3) {
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).c("D5", str + " called with invalid url (" + str3 + ')');
        }
        O9 o92 = this.f14194d;
        if (o92 != null) {
            o92.f14559a.a(str2, "Invalid URL", str);
        }
    }

    public final String a(String str) {
        return B5.a(str, this.f14193b.f14225b);
    }

    public final int a(String str, String str2) {
        String a10 = a(str2);
        if (str2 != null && str2.length() != 0) {
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                a("landingsStartSuccess", kotlin.collections.q.B0(new Pair("trigger", a10)));
                if (kotlin.jvm.internal.g.a(parse.getScheme(), "inmobinativebrowser")) {
                    b("customExpand", str, str2, new K5(a10, true));
                    return 2;
                }
                if (kotlin.jvm.internal.g.a(parse.getScheme(), "inmobideeplink")) {
                    if (a("customExpand", str, str2, new K5(a10, true)).f14160a == 1) {
                        return 2;
                    }
                } else if (P0.a(this.f14192a, str2, this.f14195e, "customExpand", this.f14197g)) {
                    c("customExpand", str, str2);
                    a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", a10)));
                    return 2;
                } else if (AbstractC1551a2.a(parse)) {
                    return 3;
                } else {
                    int a11 = T2.a(this.f14192a, str2, this.f14195e, "customExpand", this.f14197g);
                    if (a11 != 0 && a11 != 1) {
                        A4 a42 = this.f14197g;
                        if (a42 != null) {
                            ((B4) a42).b("D5", "CustomExpand handling failed");
                        }
                    } else {
                        c("customExpand", str, str2);
                        a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", a10)));
                        A4 a43 = this.f14197g;
                        if (a43 != null) {
                            ((B4) a43).c("D5", "Deeplink url handled successfully");
                            return 2;
                        }
                        return 2;
                    }
                }
                return 4;
            }
            b("customExpand", str, str2);
            a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 4), new Pair("trigger", a10)));
            return 1;
        }
        b("customExpand", str, str2);
        a("landingsStartFailed", kotlin.collections.q.B0(new Pair("errorCode", 2), new Pair("trigger", a10)));
        return 1;
    }

    public final C5 a(String str, String str2, String str3, K5 k52) {
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).a("D5", "In processInMobiDeepLinkScheme");
        }
        Uri parse = Uri.parse(str3);
        int a10 = a(str, parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"));
        if (a10 != 0 && a10 != 1) {
            int a11 = a(str, parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"));
            if (a11 != 0 && a11 != 1) {
                O9 o92 = this.f14194d;
                if (o92 != null) {
                    o92.f14559a.a(str2, "Invalid URL", str);
                }
                A4 a43 = this.f14197g;
                if (a43 != null) {
                    ((B4) a43).c("D5", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                if (k52.f14395b) {
                    a("landingsCompleteFailed", kotlin.collections.q.B0(new Pair("errorCode", Integer.valueOf(a11)), new Pair("trigger", k52.f14394a)));
                }
                return new C5(2, Integer.valueOf(a11));
            }
            A4 a44 = this.f14197g;
            if (a44 != null) {
                ((B4) a44).c("D5", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            c(str, str2, str3);
            if (k52.f14395b) {
                a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", k52.f14394a)));
            }
            return new C5(1);
        }
        A4 a45 = this.f14197g;
        if (a45 != null) {
            ((B4) a45).c("D5", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        c(str, str2, str3);
        if (k52.f14395b) {
            a("landingsCompleteSuccess", kotlin.collections.q.B0(new Pair("trigger", k52.f14394a)));
        }
        return new C5(1);
    }

    public final int a(String str, String str2, String str3) {
        A4 a42 = this.f14197g;
        if (a42 != null) {
            ((B4) a42).c("D5", androidx.appcompat.view.menu.d.d("inMobiDeepLinkSchemeUrlHandled - url - ", str2, " trackingUrl ", str3));
        }
        if (str2 != null && str2.length() != 0) {
            int a10 = T2.a(this.f14192a, str2, this.f14195e, str, this.f14197g);
            if (a10 != 0 && a10 != 1) {
                A4 a43 = this.f14197g;
                if (a43 != null) {
                    ((B4) a43).c("D5", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                    return a10;
                }
                return a10;
            }
            if (AbstractC1579c2.a(str3)) {
                Y1 y12 = Y1.f14860a;
                kotlin.jvm.internal.g.b(str3);
                y12.a(str3, true, this.f14197g);
            } else {
                A4 a44 = this.f14197g;
                if (a44 != null) {
                    ((B4) a44).b("D5", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            A4 a45 = this.f14197g;
            if (a45 != null) {
                ((B4) a45).c("D5", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        A4 a46 = this.f14197g;
        if (a46 != null) {
            ((B4) a46).b("D5", "InMobiDeepLinkScheme url is Empty or null");
            return 2;
        }
        return 2;
    }
}
