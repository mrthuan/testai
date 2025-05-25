package com.facebook.appevents;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.JsonReader;
import android.view.View;
import c7.p;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.j;
import com.google.android.play.core.assetpacks.b1;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.lib.flutter.encrypt.NativeGuideLanApi;
import com.tom_roush.fontbox.ttf.NamingTable;
import gf.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lb.f;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.u0;
import lib.zj.pdfeditor.x;
import oa.c0;
import org.json.JSONArray;
import org.json.JSONException;
import pa.a;
import w8.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements FeatureManager.a, p.a, g.a, f.a, a.InterfaceC0328a, b.c, x, u0, ga.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9618a;

    public /* synthetic */ m(int i10) {
        this.f9618a = i10;
    }

    @Override // ga.e
    public Object a(ga.r rVar) {
        switch (this.f9618a) {
            case 0:
                return ExecutorsRegistrar.f13494b.get();
            default:
                Set h10 = rVar.h(lb.d.class);
                lb.c cVar = lb.c.f20542b;
                if (cVar == null) {
                    synchronized (lb.c.class) {
                        cVar = lb.c.f20542b;
                        if (cVar == null) {
                            cVar = new lb.c();
                            lb.c.f20542b = cVar;
                        }
                    }
                }
                return new lb.b(h10, cVar);
        }
    }

    @Override // c7.p.a
    public Object apply(Object obj) {
        s6.b bVar = c7.p.f5653f;
        return (List) c7.p.l(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new t5.i(4));
    }

    @Override // w8.g.a
    public void b(ValueAnimator valueAnimator, View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    @Override // pa.a.InterfaceC0328a
    public Object d(JsonReader jsonReader) {
        String str;
        ya.d dVar = pa.a.f23839a;
        jsonReader.beginObject();
        String str2 = null;
        Integer num = null;
        c0 c0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(NamingTable.TAG)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(pa.a.a(jsonReader));
                    }
                    jsonReader.endArray();
                    c0Var = new c0(arrayList);
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    if (str2 != null) {
                        break;
                    } else {
                        throw new NullPointerException("Null name");
                    }
                case 2:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " name";
        } else {
            str = "";
        }
        if (num == null) {
            str = str.concat(" importance");
        }
        if (c0Var == null) {
            str = a6.h.c(str, " frames");
        }
        if (str.isEmpty()) {
            return new oa.r(str2, num.intValue(), c0Var);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // lib.zj.pdfeditor.u0
    public void e(View view) {
        int i10 = PDFReaderView.f21220m2;
        ((PDFPageView) view).s2();
    }

    @Override // lib.zj.pdfeditor.x
    public void f(PDFReaderView pDFReaderView) {
        pDFReaderView.v();
    }

    @Override // lb.f.a
    public String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return FirebaseCommonRegistrar.a(installerPackageName);
        }
        return "";
    }

    @Override // com.facebook.internal.FeatureManager.a
    public void k(boolean z10) {
        File[] listFiles;
        boolean z11;
        switch (this.f9618a) {
            case 0:
                if (z10) {
                    String str = com.facebook.appevents.cloudbridge.b.f9494b;
                    try {
                        com.facebook.e eVar = new com.facebook.e(null, com.facebook.d.b().concat("/cloudbridge_settings"), null, HttpMethod.GET, new com.facebook.appevents.cloudbridge.a(), 32);
                        j.a aVar = com.facebook.internal.j.f9803d;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        kotlin.jvm.internal.g.c(str, "null cannot be cast to non-null type kotlin.String");
                        j.a.b(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", eVar);
                        eVar.d();
                        return;
                    } catch (JSONException e10) {
                        j.a aVar2 = com.facebook.internal.j.f9803d;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                        kotlin.jvm.internal.g.c(str, "null cannot be cast to non-null type kotlin.String");
                        j.a.b(loggingBehavior2, str, " \n\nGraph Request Exception: \n=============\n%s\n\n ", b1.Z(e10));
                        return;
                    }
                }
                return;
            case 1:
                if (z10) {
                    com.facebook.appevents.iap.g gVar = com.facebook.appevents.iap.g.f9593a;
                    if (!k6.a.b(com.facebook.appevents.iap.g.class)) {
                        try {
                            if (!c6.g.d()) {
                                com.facebook.appevents.iap.f.g();
                            } else {
                                com.facebook.appevents.iap.g.f9596e.set(true);
                                com.facebook.appevents.iap.g.d();
                            }
                            return;
                        } catch (Throwable th2) {
                            k6.a.a(com.facebook.appevents.iap.g.class, th2);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                if (z10) {
                    com.facebook.d dVar = com.facebook.d.f9685a;
                    if (com.facebook.n.c() && !com.facebook.internal.p.t()) {
                        File b10 = h6.d.b();
                        if (b10 == null) {
                            listFiles = new File[0];
                        } else {
                            listFiles = b10.listFiles(new l6.d());
                            kotlin.jvm.internal.g.d(listFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
                        }
                        final ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            l6.a aVar3 = new l6.a(file);
                            if (aVar3.f20518b != null && aVar3.c != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList.add(aVar3);
                            }
                        }
                        kotlin.collections.j.j0(arrayList, new l6.b(0));
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayList.size() && i10 < 1000; i10++) {
                            jSONArray.put(arrayList.get(i10));
                        }
                        h6.d.f("error_reports", jSONArray, new e.b() { // from class: l6.c
                            /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: JSONException -> 0x0032, TryCatch #0 {JSONException -> 0x0032, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x000f, B:12:0x001c, B:13:0x0020, B:15:0x0026), top: B:19:0x0007 }] */
                            /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                            @Override // com.facebook.e.b
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void b(com.facebook.i r3) {
                                /*
                                    r2 = this;
                                    java.util.ArrayList r0 = r1
                                    java.lang.String r1 = "$validReports"
                                    kotlin.jvm.internal.g.e(r0, r1)
                                    com.facebook.FacebookRequestError r1 = r3.c     // Catch: org.json.JSONException -> L32
                                    if (r1 != 0) goto L32
                                    org.json.JSONObject r3 = r3.f9729d     // Catch: org.json.JSONException -> L32
                                    if (r3 == 0) goto L19
                                    java.lang.String r1 = "success"
                                    boolean r3 = r3.getBoolean(r1)     // Catch: org.json.JSONException -> L32
                                    r1 = 1
                                    if (r3 != r1) goto L19
                                    goto L1a
                                L19:
                                    r1 = 0
                                L1a:
                                    if (r1 == 0) goto L32
                                    java.util.Iterator r3 = r0.iterator()     // Catch: org.json.JSONException -> L32
                                L20:
                                    boolean r0 = r3.hasNext()     // Catch: org.json.JSONException -> L32
                                    if (r0 == 0) goto L32
                                    java.lang.Object r0 = r3.next()     // Catch: org.json.JSONException -> L32
                                    l6.a r0 = (l6.a) r0     // Catch: org.json.JSONException -> L32
                                    java.lang.String r0 = r0.f20517a     // Catch: org.json.JSONException -> L32
                                    h6.d.a(r0)     // Catch: org.json.JSONException -> L32
                                    goto L20
                                L32:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: l6.c.b(com.facebook.i):void");
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // gf.b.c
    public void n(Object obj, gf.a aVar) {
        List h10;
        NativeGuideLanApi.Companion companion = NativeGuideLanApi.Companion.f15739a;
        ea.a.p("QWU7bHk=", "elizdNWa");
        try {
            NativeGuideLanApi nativeGuideLanApi = NativeGuideLanApi.Companion.c;
            if (nativeGuideLanApi != null) {
                nativeGuideLanApi.y();
            }
            h10 = ge.a.H(null);
        } catch (Throwable th2) {
            h10 = b.b.h(th2);
        }
        aVar.i(h10);
    }
}
