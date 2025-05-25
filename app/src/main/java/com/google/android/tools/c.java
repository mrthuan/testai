package com.google.android.tools;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.b1;
import com.lib.flutter.encrypt.EngineHelper;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AttrsHandler.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f13483a = "3";

    public static final Object a(c cVar, Context context, kotlin.coroutines.c cVar2) {
        cVar.getClass();
        kotlinx.coroutines.h hVar = new kotlinx.coroutines.h(1, b1.L(cVar2));
        hVar.s();
        try {
            com.facebook.d.k();
            com.facebook.d.f9700q = true;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            com.facebook.applinks.b.c(context, new b(hVar));
        } catch (Exception e11) {
            e11.printStackTrace();
            hVar.resumeWith(Result.m13constructorimpl(null));
        }
        Object r4 = hVar.r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return r4;
    }

    public static void b(final c cVar, final int i10, final String data, final int i11, String str, int i12) {
        long j10;
        if ((i12 & 8) != 0) {
            str = null;
        }
        final String str2 = str;
        if ((i12 & 16) != 0) {
            j10 = 2500;
        } else {
            j10 = 0;
        }
        cVar.getClass();
        kotlin.jvm.internal.g.e(data, "data");
        if (j10 <= 0) {
            String jSONArray = new JSONArray().put(c(i10, i11, data, str2)).toString();
            kotlin.jvm.internal.g.d(jSONArray, "JSONArray().put(toAttJso…om, campaign)).toString()");
            EngineHelper.f15726a.getClass();
            EngineHelper.f(cVar.f13483a, jSONArray);
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.google.android.tools.a
            @Override // java.lang.Runnable
            public final void run() {
                c this$0 = c.this;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String data2 = data;
                kotlin.jvm.internal.g.e(data2, "$data");
                String jSONArray2 = new JSONArray().put(c.c(i10, i11, data2, str2)).toString();
                kotlin.jvm.internal.g.d(jSONArray2, "JSONArray().put(toAttJso…om, campaign)).toString()");
                EngineHelper.f15726a.getClass();
                EngineHelper.f(this$0.f13483a, jSONArray2);
            }
        }, j10);
    }

    public static JSONObject c(int i10, int i11, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fl", i10);
        jSONObject.put("da", str);
        jSONObject.put("fr", i11);
        if (str2 != null) {
            jSONObject.put("campaign", str2);
        }
        return jSONObject;
    }
}
