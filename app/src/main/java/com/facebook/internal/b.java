package com.facebook.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.FacebookRequestError;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FacebookRequestErrorClassification.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f9753d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static b f9754e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f9755a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Set<Integer>> f9756b;
    public final Map<Integer, Set<Integer>> c;

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static b b() {
            return new b(null, kotlin.collections.q.z0(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), kotlin.collections.q.z0(new Pair(102, null), new Pair(190, null), new Pair(Integer.valueOf((int) TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
        }

        public static HashMap c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i11 = 0; i11 < length2; i11++) {
                            int optInt2 = optJSONArray2.optInt(i11);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        public final synchronized b a() {
            b bVar;
            if (b.f9754e == null) {
                b.f9754e = b();
            }
            bVar = b.f9754e;
            kotlin.jvm.internal.g.c(bVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            return bVar;
        }
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    /* renamed from: com.facebook.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0147b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9757a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            try {
                iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9757a = iArr;
        }
    }

    public b(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.f9755a = hashMap;
        this.f9756b = hashMap2;
        this.c = hashMap3;
    }
}
