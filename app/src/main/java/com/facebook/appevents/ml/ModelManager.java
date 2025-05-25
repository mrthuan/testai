package com.facebook.appevents.ml;

import android.os.Bundle;
import android.text.TextUtils;
import c6.h;
import com.facebook.e;
import d6.d;
import h5.e;
import hg.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ModelManager.kt */
/* loaded from: classes.dex */
public final class ModelManager {

    /* renamed from: a  reason: collision with root package name */
    public static final ModelManager f9619a = new ModelManager();

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap f9620b = new ConcurrentHashMap();
    public static final List<String> c = ge.a.I("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f9621d = ge.a.I("none", "address", "health");

    /* compiled from: ModelManager.kt */
    /* loaded from: classes.dex */
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: ModelManager.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9623a;

            static {
                int[] iArr = new int[Task.values().length];
                try {
                    iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9623a = iArr;
            }
        }

        public final String toKey() {
            int i10 = a.f9623a[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "app_event_pred";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "integrity_detect";
        }

        public final String toUseCase() {
            int i10 = a.f9623a[ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    /* compiled from: ModelManager.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f9624a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9625b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9626d;

        /* renamed from: e  reason: collision with root package name */
        public final float[] f9627e;

        /* renamed from: f  reason: collision with root package name */
        public File f9628f;

        /* renamed from: g  reason: collision with root package name */
        public com.facebook.appevents.ml.a f9629g;

        /* renamed from: h  reason: collision with root package name */
        public Runnable f9630h;

        /* compiled from: ModelManager.kt */
        /* renamed from: com.facebook.appevents.ml.ModelManager$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0142a {
            public static a a(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i10;
                float[] fArr;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i10 = jSONObject.getInt("version_id");
                        ModelManager modelManager = ModelManager.f9619a;
                        JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
                        if (!k6.a.b(ModelManager.class)) {
                            modelManager.getClass();
                            if (!k6.a.b(modelManager) && jSONArray != null) {
                                try {
                                    fArr = new float[jSONArray.length()];
                                    int length = jSONArray.length();
                                    for (int i11 = 0; i11 < length; i11++) {
                                        try {
                                            String string = jSONArray.getString(i11);
                                            g.d(string, "jsonArray.getString(i)");
                                            fArr[i11] = Float.parseFloat(string);
                                        } catch (JSONException unused) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    k6.a.a(modelManager, th2);
                                }
                                g.d(useCase, "useCase");
                                g.d(assetUri, "assetUri");
                            }
                        }
                        fArr = null;
                        g.d(useCase, "useCase");
                        g.d(assetUri, "assetUri");
                    } catch (Exception unused2) {
                        return null;
                    }
                }
                return new a(useCase, assetUri, optString, i10, fArr);
            }

            public static void b(a aVar, ArrayList arrayList) {
                File[] listFiles;
                boolean z10;
                File a10 = d.a();
                int i10 = aVar.f9626d;
                String str = aVar.f9624a;
                if (a10 != null && (listFiles = a10.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        String str2 = str + '_' + i10;
                        for (File file : listFiles) {
                            String name = file.getName();
                            g.d(name, "name");
                            if (j.M(name, str, false) && !j.M(name, str2, false)) {
                                file.delete();
                            }
                        }
                    }
                }
                e eVar = new e(arrayList, 1);
                File file2 = new File(d.a(), str + '_' + i10);
                String str3 = aVar.f9625b;
                if (str3 != null && !file2.exists()) {
                    new h(str3, file2, eVar).execute(new String[0]);
                } else {
                    eVar.a(file2);
                }
            }
        }

        public a(String str, String str2, String str3, int i10, float[] fArr) {
            this.f9624a = str;
            this.f9625b = str2;
            this.c = str3;
            this.f9626d = i10;
            this.f9627e = fArr;
        }
    }

    /* compiled from: ModelManager.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9631a;

        static {
            int[] iArr = new int[Task.values().length];
            try {
                iArr[Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9631a = iArr;
        }
    }

    public static final File d(Task task) {
        if (k6.a.b(ModelManager.class)) {
            return null;
        }
        try {
            g.e(task, "task");
            a aVar = (a) f9620b.get(task.toUseCase());
            if (aVar == null) {
                return null;
            }
            return aVar.f9628f;
        } catch (Throwable th2) {
            k6.a.a(ModelManager.class, th2);
            return null;
        }
    }

    public static final String[] f(Task task, float[][] fArr, String[] strArr) {
        com.facebook.appevents.ml.a aVar;
        boolean z10;
        if (k6.a.b(ModelManager.class)) {
            return null;
        }
        try {
            g.e(task, "task");
            a aVar2 = (a) f9620b.get(task.toUseCase());
            if (aVar2 != null && (aVar = aVar2.f9629g) != null) {
                float[] fArr2 = aVar2.f9627e;
                int length = strArr.length;
                boolean z11 = false;
                int length2 = fArr[0].length;
                d6.a aVar3 = new d6.a(new int[]{length, length2});
                for (int i10 = 0; i10 < length; i10++) {
                    System.arraycopy(fArr[i10], 0, aVar3.c, i10 * length2, length2);
                }
                d6.a a10 = aVar.a(aVar3, strArr, task.toKey());
                if (a10 == null || fArr2 == null) {
                    return null;
                }
                if (a10.c.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return null;
                }
                if (fArr2.length == 0) {
                    z11 = true;
                }
                if (z11) {
                    return null;
                }
                int i11 = b.f9631a[task.ordinal()];
                ModelManager modelManager = f9619a;
                if (i11 != 1) {
                    if (i11 == 2) {
                        return modelManager.g(a10, fArr2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return modelManager.h(a10, fArr2);
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(ModelManager.class, th2);
            return null;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    a a10 = a.C0142a.a(jSONObject.getJSONObject(keys.next()));
                    if (a10 != null) {
                        f9620b.put(a10.f9624a, a10);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
        if (kotlin.text.k.O(r7, "en", false) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[Catch: all -> 0x00cf, TryCatch #2 {all -> 0x00cf, blocks: (B:5:0x0007, B:6:0x001a, B:8:0x0020, B:10:0x003e, B:12:0x004e, B:29:0x0085, B:30:0x008f, B:32:0x009b, B:34:0x00ab, B:37:0x00bb, B:39:0x00c1, B:16:0x0056, B:17:0x0058, B:23:0x006c), top: B:46:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r11 = this;
            boolean r0 = k6.a.b(r11)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lcf
            r0.<init>()     // Catch: java.lang.Throwable -> Lcf
            java.util.concurrent.ConcurrentHashMap r1 = com.facebook.appevents.ml.ModelManager.f9620b     // Catch: java.lang.Throwable -> Lcf
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> Lcf
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lcf
            r2 = 0
            r3 = 0
            r6 = r2
            r8 = r3
        L1a:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> Lcf
            if (r4 == 0) goto Lb7
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> Lcf
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lcf
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lcf
            com.facebook.appevents.ml.ModelManager$a r4 = (com.facebook.appevents.ml.ModelManager.a) r4     // Catch: java.lang.Throwable -> Lcf
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = r7.toUseCase()     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = kotlin.jvm.internal.g.a(r5, r7)     // Catch: java.lang.Throwable -> Lcf
            if (r7 == 0) goto L8f
            java.lang.String r6 = r4.f9625b     // Catch: java.lang.Throwable -> Lcf
            int r7 = r4.f9626d     // Catch: java.lang.Throwable -> Lcf
            int r8 = java.lang.Math.max(r8, r7)     // Catch: java.lang.Throwable -> Lcf
            com.facebook.internal.FeatureManager$Feature r7 = com.facebook.internal.FeatureManager.Feature.SuggestedEvents     // Catch: java.lang.Throwable -> Lcf
            boolean r7 = com.facebook.internal.FeatureManager.c(r7)     // Catch: java.lang.Throwable -> Lcf
            if (r7 == 0) goto L8f
            boolean r7 = k6.a.b(r11)     // Catch: java.lang.Throwable -> Lcf
            r9 = 1
            if (r7 == 0) goto L56
            goto L82
        L56:
            com.facebook.internal.p r7 = com.facebook.internal.p.f9815a     // Catch: java.lang.Throwable -> L67
            android.content.Context r7 = com.facebook.d.a()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            android.content.res.Resources r7 = r7.getResources()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            android.content.res.Configuration r7 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.Locale r7 = r7.locale     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            goto L6a
        L67:
            r7 = move-exception
            goto L7f
        L69:
            r7 = r2
        L6a:
            if (r7 == 0) goto L7d
            java.lang.String r7 = r7.getLanguage()     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "locale.language"
            kotlin.jvm.internal.g.d(r7, r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r10 = "en"
            boolean r7 = kotlin.text.k.O(r7, r10, r3)     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L82
        L7d:
            r7 = r9
            goto L83
        L7f:
            k6.a.a(r11, r7)     // Catch: java.lang.Throwable -> Lcf
        L82:
            r7 = r3
        L83:
            if (r7 == 0) goto L8f
            com.facebook.appevents.e r7 = new com.facebook.appevents.e     // Catch: java.lang.Throwable -> Lcf
            r7.<init>(r9)     // Catch: java.lang.Throwable -> Lcf
            r4.f9630h = r7     // Catch: java.lang.Throwable -> Lcf
            r0.add(r4)     // Catch: java.lang.Throwable -> Lcf
        L8f:
            com.facebook.appevents.ml.ModelManager$Task r7 = com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = r7.toUseCase()     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = kotlin.jvm.internal.g.a(r5, r7)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L1a
            java.lang.String r6 = r4.f9625b     // Catch: java.lang.Throwable -> Lcf
            int r5 = r4.f9626d     // Catch: java.lang.Throwable -> Lcf
            int r8 = java.lang.Math.max(r8, r5)     // Catch: java.lang.Throwable -> Lcf
            com.facebook.internal.FeatureManager$Feature r5 = com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity     // Catch: java.lang.Throwable -> Lcf
            boolean r5 = com.facebook.internal.FeatureManager.c(r5)     // Catch: java.lang.Throwable -> Lcf
            if (r5 == 0) goto L1a
            d6.b r5 = new d6.b     // Catch: java.lang.Throwable -> Lcf
            r5.<init>(r3)     // Catch: java.lang.Throwable -> Lcf
            r4.f9630h = r5     // Catch: java.lang.Throwable -> Lcf
            r0.add(r4)     // Catch: java.lang.Throwable -> Lcf
            goto L1a
        Lb7:
            if (r6 == 0) goto Lce
            if (r8 <= 0) goto Lce
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lcf
            if (r1 != 0) goto Lce
            com.facebook.appevents.ml.ModelManager$a r1 = new com.facebook.appevents.ml.ModelManager$a     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r5 = "MTML"
            r7 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcf
            com.facebook.appevents.ml.ModelManager.a.C0142a.b(r1, r0)     // Catch: java.lang.Throwable -> Lcf
        Lce:
            return
        Lcf:
            r0 = move-exception
            k6.a.a(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager.b():void");
    }

    public final JSONObject c() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            String str = com.facebook.e.f9701j;
            com.facebook.e g10 = e.c.g(null, "app/model_asset", null);
            g10.f9706d = bundle;
            JSONObject jSONObject = g10.c().f9728b;
            if (jSONObject == null) {
                return null;
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final String[] g(d6.a aVar, float[] fArr) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.c;
            if (i11 != fArr.length) {
                return null;
            }
            c f02 = ge.a.f0(0, i10);
            ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(f02, 10));
            hg.b it = f02.iterator();
            while (it.c) {
                int a10 = it.a();
                String str = "none";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(a10 * i11) + i13] >= fArr[i12]) {
                        str = f9621d.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final String[] h(d6.a aVar, float[] fArr) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            int[] iArr = aVar.f16118a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            float[] fArr2 = aVar.c;
            if (i11 != fArr.length) {
                return null;
            }
            c f02 = ge.a.f0(0, i10);
            ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(f02, 10));
            hg.b it = f02.iterator();
            while (it.c) {
                int a10 = it.a();
                String str = "other";
                int length = fArr.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i13 + 1;
                    if (fArr2[(a10 * i11) + i13] >= fArr[i12]) {
                        str = c.get(i13);
                    }
                    i12++;
                    i13 = i14;
                }
                arrayList.add(str);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
