package com.lib.flutter.encrypt;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import cg.l;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.k;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import qb.c1;

/* compiled from: EngineHelper.kt */
/* loaded from: classes2.dex */
public final class EngineHelper {

    /* renamed from: b  reason: collision with root package name */
    public static FlutterAppApi f15727b;
    public static io.flutter.embedding.engine.a c;

    /* renamed from: d  reason: collision with root package name */
    public static Application f15728d;

    /* renamed from: e  reason: collision with root package name */
    public static d f15729e;

    /* renamed from: g  reason: collision with root package name */
    public static final String f15731g = ea.a.p("RQ==", "qTAwnDso");

    /* renamed from: a  reason: collision with root package name */
    public static final EngineHelper f15726a = new EngineHelper();

    /* renamed from: f  reason: collision with root package name */
    public static final LinkedHashMap f15730f = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final LinkedHashMap f15732h = new LinkedHashMap();

    /* compiled from: EngineHelper.kt */
    /* loaded from: classes2.dex */
    public static final class a implements NativeAppGlobalApi {

        /* renamed from: b  reason: collision with root package name */
        public static final a f15733b = new a();

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            if (r1 == null) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0002, B:6:0x0015, B:8:0x001e, B:10:0x0022, B:13:0x0035, B:27:0x006c, B:32:0x00ac, B:33:0x00b4, B:35:0x00bb, B:37:0x00cb, B:42:0x00da, B:43:0x00e2, B:47:0x00f0, B:49:0x00ff, B:48:0x00f9, B:25:0x0068, B:12:0x002d, B:50:0x0102, B:51:0x0112, B:53:0x0120, B:54:0x0125, B:56:0x0131, B:57:0x0150, B:59:0x0156, B:60:0x0166, B:61:0x0176, B:14:0x0043), top: B:66:0x0002, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0002, B:6:0x0015, B:8:0x001e, B:10:0x0022, B:13:0x0035, B:27:0x006c, B:32:0x00ac, B:33:0x00b4, B:35:0x00bb, B:37:0x00cb, B:42:0x00da, B:43:0x00e2, B:47:0x00f0, B:49:0x00ff, B:48:0x00f9, B:25:0x0068, B:12:0x002d, B:50:0x0102, B:51:0x0112, B:53:0x0120, B:54:0x0125, B:56:0x0131, B:57:0x0150, B:59:0x0156, B:60:0x0166, B:61:0x0176, B:14:0x0043), top: B:66:0x0002, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0002, B:6:0x0015, B:8:0x001e, B:10:0x0022, B:13:0x0035, B:27:0x006c, B:32:0x00ac, B:33:0x00b4, B:35:0x00bb, B:37:0x00cb, B:42:0x00da, B:43:0x00e2, B:47:0x00f0, B:49:0x00ff, B:48:0x00f9, B:25:0x0068, B:12:0x002d, B:50:0x0102, B:51:0x0112, B:53:0x0120, B:54:0x0125, B:56:0x0131, B:57:0x0150, B:59:0x0156, B:60:0x0166, B:61:0x0176, B:14:0x0043), top: B:66:0x0002, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f0 A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0002, B:6:0x0015, B:8:0x001e, B:10:0x0022, B:13:0x0035, B:27:0x006c, B:32:0x00ac, B:33:0x00b4, B:35:0x00bb, B:37:0x00cb, B:42:0x00da, B:43:0x00e2, B:47:0x00f0, B:49:0x00ff, B:48:0x00f9, B:25:0x0068, B:12:0x002d, B:50:0x0102, B:51:0x0112, B:53:0x0120, B:54:0x0125, B:56:0x0131, B:57:0x0150, B:59:0x0156, B:60:0x0166, B:61:0x0176, B:14:0x0043), top: B:66:0x0002, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f9 A[Catch: Exception -> 0x017d, TryCatch #0 {Exception -> 0x017d, blocks: (B:3:0x0002, B:6:0x0015, B:8:0x001e, B:10:0x0022, B:13:0x0035, B:27:0x006c, B:32:0x00ac, B:33:0x00b4, B:35:0x00bb, B:37:0x00cb, B:42:0x00da, B:43:0x00e2, B:47:0x00f0, B:49:0x00ff, B:48:0x00f9, B:25:0x0068, B:12:0x002d, B:50:0x0102, B:51:0x0112, B:53:0x0120, B:54:0x0125, B:56:0x0131, B:57:0x0150, B:59:0x0156, B:60:0x0166, B:61:0x0176, B:14:0x0043), top: B:66:0x0002, inners: #1 }] */
        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String a(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lib.flutter.encrypt.EngineHelper.a.a(java.lang.String):java.lang.String");
        }

        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        public final void b(String str) {
            boolean z10;
            try {
                Application application = EngineHelper.f15728d;
                if (application == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (EngineHelper.b(EngineHelper.f15726a, application, jSONObject)) {
                    return;
                }
                String str2 = "";
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                g.d(keys, ea.a.p("WXMkbl1rB3kBKCk=", "haPZ8BVD"));
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt != null) {
                        if (g.a(next, ea.a.p("Vl9u", "dLwAxjSu")) && (opt instanceof String)) {
                            str2 = opt;
                        } else if (opt instanceof String) {
                            bundle.putString(next, (String) opt);
                        } else if (opt instanceof Integer) {
                            bundle.putInt(next, ((Number) opt).intValue());
                        } else if (opt instanceof Long) {
                            bundle.putLong(next, ((Number) opt).longValue());
                        } else if (opt instanceof Double) {
                            bundle.putDouble(next, ((Number) opt).doubleValue());
                        } else if (opt instanceof Boolean) {
                            bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                        }
                    }
                }
                if (str2.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    FirebaseAnalytics.getInstance(application).b(bundle, str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        public final boolean c(String str) {
            Context applicationContext;
            d dVar;
            Application application = EngineHelper.f15728d;
            if (application != null && (applicationContext = application.getApplicationContext()) != null && (dVar = EngineHelper.f15729e) != null) {
                return dVar.b(applicationContext, str);
            }
            return false;
        }

        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        public final void d(String str, String str2) {
            EngineHelper.f15730f.put(str, str2);
        }

        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        public final void e(String str, String str2) {
            e eVar;
            boolean z10;
            LinkedHashMap linkedHashMap = EngineHelper.f15732h;
            if (linkedHashMap.containsKey(str) && (eVar = (e) linkedHashMap.get(str)) != null) {
                if (str2.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    eVar.a(str2);
                } else {
                    eVar.b();
                }
            }
        }

        @Override // com.lib.flutter.encrypt.NativeAppGlobalApi
        public final void f(String str) {
            d dVar;
            Application application = EngineHelper.f15728d;
            if (application != null && (dVar = EngineHelper.f15729e) != null) {
                dVar.c(application, str);
            }
        }
    }

    public static final String a(EngineHelper engineHelper, String str) {
        String str2;
        boolean z10;
        engineHelper.getClass();
        d dVar = f15729e;
        if (dVar != null) {
            str2 = dVar.d(f15728d, str);
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return f15731g;
        }
        return str2;
    }

    public static final boolean b(EngineHelper engineHelper, Application application, JSONObject jSONObject) {
        Object opt;
        boolean z10;
        engineHelper.getClass();
        try {
            String p10 = ea.a.p("KWxucyZ1aHA=", "dDJ6cEjX");
            boolean optBoolean = jSONObject.optBoolean(p10);
            if (optBoolean) {
                Iterator<String> keys = jSONObject.keys();
                g.d(keys, ea.a.p("JXNebldrUnkpKCk=", "vjznFN6A"));
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!g.a(next, p10) && (opt = jSONObject.opt(next)) != null && (opt instanceof String)) {
                        EngineHelper engineHelper2 = f15726a;
                        g.d(next, ea.a.p("IWV5", "dCJwMqPG"));
                        engineHelper2.getClass();
                        i(application, next, (String) opt);
                        d dVar = f15729e;
                        if (dVar != null) {
                            dVar.a();
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            ea.a.p("BHMDch9yXnAtchJ5", "lHQfO1bc");
                            opt.toString();
                        }
                    }
                }
            }
            return optBoolean;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static void c(final l lVar) {
        try {
            FlutterAppApi flutterAppApi = f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.e(ea.a.p("VGwUYxxuBGln", "niotMGSX"), new l<String, tf.d>() { // from class: com.lib.flutter.encrypt.EngineHelper$forceRefreshGuideLanguageEnable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(String str) {
                        invoke2(str);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(String it) {
                        g.e(it, "it");
                        l<Boolean, tf.d> lVar2 = lVar;
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.valueOf(Boolean.parseBoolean(it)));
                        }
                    }
                });
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication r7, java.util.List r8, java.lang.String r9, pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1 r10) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lib.flutter.encrypt.EngineHelper.d(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication, java.util.List, java.lang.String, pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig$callback$1):void");
    }

    public static void e(final e listener) {
        g.e(listener, "listener");
        Set entrySet = f15732h.entrySet();
        l<Map.Entry<String, e>, Boolean> lVar = new l<Map.Entry<String, e>, Boolean>() { // from class: com.lib.flutter.encrypt.EngineHelper$removeCombinationAdListener$1
            {
                super(1);
            }

            @Override // cg.l
            public final Boolean invoke(Map.Entry<String, e> it) {
                g.e(it, "it");
                return Boolean.valueOf(g.a(it.getValue(), e.this));
            }
        };
        g.e(entrySet, "<this>");
        k.l0(entrySet, lVar, true);
    }

    public static void f(String type, String str) {
        g.e(type, "type");
        FlutterAppApi flutterAppApi = f15727b;
        if (flutterAppApi != null) {
            try {
                flutterAppApi.f15735b.post(new c1(1, flutterAppApi, type, str));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void g(long j10, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ea.a.p("UGE_ZQ==", "70Qkpouz"), ea.a.p("WmFw", "6aDbKHa2"));
        jSONObject.put(ea.a.p("EGMYaVxu", "Fpql3hMd"), ea.a.p("P2F5", "cT2puJZ3"));
        jSONObject.put(ea.a.p("NXIyZTNfXmQ=", "whZVA7Js"), str);
        jSONObject.put(ea.a.p("RnUzYzhhSmUXdAlrUW4=", "C16AP9At"), str2);
        jSONObject.put(ea.a.p("P3VDYxFhRGUFdCNtZQ==", "jYikEou4"), j10);
        jSONObject.put(ea.a.p("cw==", "4YnTZelh"), System.currentTimeMillis());
        String p10 = ea.a.p("MA==", "pqNgUShq");
        String jSONObject2 = jSONObject.toString();
        g.d(jSONObject2, ea.a.p("WXMkbjxiCGURdBp0BlMici1uVSgp", "STRZPb9i"));
        f(p10, jSONObject2);
    }

    public static void h(String key, e listener) {
        g.e(key, "key");
        g.e(listener, "listener");
        f15732h.put(key, listener);
    }

    public static void i(Context context, String str, String value) {
        g.e(context, "context");
        g.e(value, "value");
        try {
            String p10 = ea.a.p("UHU4XwZzB3ItdE1wZQ==", "Yt5WY08O");
            boolean a10 = g.a(str, p10);
            LinkedHashMap linkedHashMap = f15730f;
            if (a10 && linkedHashMap.containsKey(p10) && g.a(linkedHashMap.get(p10), ea.a.p("BGU6YQ==", "zEiNLEVH"))) {
                return;
            }
            linkedHashMap.put(str, value);
            FirebaseAnalytics.getInstance(context).f13491a.zzO(null, str, value, false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static String j(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        Set<String> keySet = bundle.keySet();
        g.d(keySet, ea.a.p("WGUycw==", "qmawJKMl"));
        for (String str : keySet) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                jSONObject.put(str, obj);
            } else if (obj instanceof Integer) {
                jSONObject.put(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                jSONObject.put(str, ((Number) obj).longValue());
            } else if (obj instanceof Double) {
                jSONObject.put(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                jSONObject.put(str, ((Boolean) obj).booleanValue());
            }
        }
        String jSONObject2 = jSONObject.toString();
        g.d(jSONObject2, ea.a.p("JVMOTjdiM2UrdE4pGmEncFR5cntDIBYgloDXIHEgPwpPIGEgWCB5IDUuEm9ndCVpVmd6KQ==", "AeoAxYqf"));
        return jSONObject2;
    }
}
