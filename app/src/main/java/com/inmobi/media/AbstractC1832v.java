package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1832v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f15504a = "h";

    public static void a(C1646h ad2, JSONObject adJson, String str, long j10, A4 a42) {
        kotlin.jvm.internal.g.e(ad2, "ad");
        kotlin.jvm.internal.g.e(adJson, "adJson");
        ad2.a();
        long optLong = adJson.optLong("expiry", TimeUnit.MILLISECONDS.toSeconds(j10));
        ad2.a(adJson, str, optLong <= 0 ? -1L : TimeUnit.SECONDS.toMillis(optLong));
        if (kotlin.jvm.internal.g.a("inmobiJson", ad2.u())) {
            try {
                JSONObject jSONObject = adJson.getJSONObject("pubContent");
                if (a42 != null) {
                    String TAG = f15504a;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
                    ((B4) a42).a(TAG, jSONObject2);
                }
                if (jSONObject.isNull("rootContainer")) {
                    if (a42 != null) {
                        String TAG2 = f15504a;
                        kotlin.jvm.internal.g.d(TAG2, "TAG");
                        ((B4) a42).b(TAG2, "Missing key (rootContainer) in the ad markup");
                        return;
                    }
                    return;
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("rootContainer");
                JSONArray jSONArray = new JSONArray();
                kotlin.jvm.internal.g.b(jSONObject3);
                Iterator it = b(jSONObject3, a42).iterator();
                while (it.hasNext()) {
                    a(jSONArray, (String) it.next(), (byte) 2);
                }
                Iterator it2 = a(jSONObject3, a42).iterator();
                while (it2.hasNext()) {
                    a(jSONArray, (String) it2.next(), (byte) 1);
                }
                boolean d10 = d(jSONObject3, a42);
                ad2.a(jSONArray);
                ad2.a(d10);
            } catch (Exception e10) {
                kotlin.jvm.internal.g.d(f15504a, "TAG");
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }

    public static ArrayList b(JSONObject jSONObject, A4 a42) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.g.b(jSONArray);
        } catch (JSONException e10) {
            if (a42 != null) {
                String str = f15504a;
                StringBuilder a10 = A5.a(str, "TAG", "Error getting getImageAssetUrls (");
                a10.append(e10.getMessage());
                a10.append(')');
                ((B4) a42).b(str, a10.toString());
            }
        }
        if (AbstractC1579c2.a(jSONArray)) {
            return arrayList;
        }
        String string = jSONObject.getString("assetType");
        if (kotlin.text.j.G("image", string, true)) {
            if (!jSONObject.isNull("preload") && jSONObject.getBoolean("preload")) {
                String string2 = jSONArray.getString(0);
                kotlin.jvm.internal.g.d(string2, "getString(...)");
                arrayList.add(string2);
            }
        } else if (kotlin.text.j.G("container", string, true)) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.g.b(jSONObject2);
                arrayList.addAll(b(jSONObject2, a42));
            }
        }
        return arrayList;
    }

    public static String c(JSONObject jSONObject, A4 a42) {
        String str;
        String str2;
        int i10;
        boolean z10;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.g.b(jSONArray);
            if (AbstractC1579c2.a(jSONArray)) {
                return "";
            }
            String string = jSONObject.getString("assetType");
            if (kotlin.text.j.G("video", string, true)) {
                str = jSONArray.getString(0);
            } else if (!kotlin.text.j.G("container", string, true)) {
                str = "";
            } else {
                int length = jSONArray.length();
                str2 = "";
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    kotlin.jvm.internal.g.b(jSONObject2);
                    str2 = c(jSONObject2, a42);
                    int length2 = str2.length() - 1;
                    int i12 = 0;
                    boolean z11 = false;
                    while (i12 <= length2) {
                        if (!z11) {
                            i10 = i12;
                        } else {
                            i10 = length2;
                        }
                        if (kotlin.jvm.internal.g.f(str2.charAt(i10), 32) <= 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z11) {
                            if (!z10) {
                                z11 = true;
                            } else {
                                i12++;
                            }
                        } else if (!z10) {
                            break;
                        } else {
                            length2--;
                        }
                    }
                    if (str2.subSequence(i12, length2 + 1).toString().length() > 0) {
                        break;
                    }
                }
                kotlin.jvm.internal.g.b(str2);
                return str2;
            }
            str2 = str;
            kotlin.jvm.internal.g.b(str2);
            return str2;
        } catch (JSONException e10) {
            if (a42 != null) {
                String str3 = f15504a;
                StringBuilder a10 = A5.a(str3, "TAG", "Error getting VAST video XML (");
                a10.append(e10.getMessage());
                a10.append(')');
                ((B4) a42).b(str3, a10.toString());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public static boolean d(JSONObject jSONObject, A4 a42) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.g.b(jSONArray);
            if (AbstractC1579c2.a(jSONArray)) {
                return false;
            }
            String string = jSONObject.getString("assetType");
            if (kotlin.text.j.G("webview", string, true)) {
                if (jSONObject.isNull("preload") || !jSONObject.getBoolean("preload")) {
                    return false;
                }
                return true;
            } else if (!kotlin.text.j.G("container", string, true)) {
                return false;
            } else {
                int length = jSONArray.length();
                boolean z10 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    kotlin.jvm.internal.g.b(jSONObject2);
                    z10 = d(jSONObject2, a42);
                    if (z10) {
                        break;
                    }
                }
                return z10;
            }
        } catch (JSONException e10) {
            if (a42 != null) {
                String str = f15504a;
                StringBuilder a10 = A5.a(str, "TAG", "Error getting preload webview flag (");
                a10.append(e10.getMessage());
                a10.append(')');
                ((B4) a42).b(str, a10.toString());
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3 A[Catch: JSONException -> 0x0212, TryCatch #0 {JSONException -> 0x0212, blocks: (B:98:0x01e8, B:100:0x01f3, B:102:0x01fd), top: B:139:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0249 A[Catch: JSONException -> 0x0268, TryCatch #2 {JSONException -> 0x0268, blocks: (B:114:0x023e, B:116:0x0249, B:118:0x0253), top: B:143:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.inmobi.media.C1646h a(com.inmobi.media.C1646h r20, com.inmobi.commons.core.configs.AdConfig r21, com.inmobi.media.A4 r22) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC1832v.a(com.inmobi.media.h, com.inmobi.commons.core.configs.AdConfig, com.inmobi.media.A4):com.inmobi.media.h");
    }

    public static void a(JSONArray jSONArray, String str, byte b10) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (int) b10);
        jSONObject.put(InMobiNetworkValues.URL, str);
        jSONArray.put(jSONObject);
    }

    public static ArrayList a(JSONObject jSONObject, A4 a42) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.g.b(jSONArray);
        } catch (JSONException e10) {
            if (a42 != null) {
                String str = f15504a;
                StringBuilder a10 = A5.a(str, "TAG", "Error getting getGifAssetUrls (");
                a10.append(e10.getMessage());
                a10.append(')');
                ((B4) a42).b(str, a10.toString());
            }
        }
        if (AbstractC1579c2.a(jSONArray)) {
            return arrayList;
        }
        String string = jSONObject.getString("assetType");
        if (kotlin.text.j.G(ContentTypes.EXTENSION_GIF, string, true)) {
            String string2 = jSONArray.getString(0);
            kotlin.jvm.internal.g.d(string2, "getString(...)");
            arrayList.add(string2);
        } else if (kotlin.text.j.G("container", string, true)) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.g.b(jSONObject2);
                arrayList.addAll(a(jSONObject2, a42));
            }
        }
        return arrayList;
    }
}
