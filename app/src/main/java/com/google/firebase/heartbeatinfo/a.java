package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import bb.e;
import bb.f;
import bb.m;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import d8.o;
import db.b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import lb.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DefaultHeartBeatController.java */
/* loaded from: classes2.dex */
public final class a implements f, HeartBeatInfo {

    /* renamed from: a  reason: collision with root package name */
    public final b<m> f13583a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f13584b;
    public final b<g> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<e> f13585d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f13586e;

    public a() {
        throw null;
    }

    public a(final Context context, final String str, Set<e> set, b<g> bVar, Executor executor) {
        this.f13583a = new b() { // from class: bb.d
            @Override // db.b
            public final Object get() {
                return new m(context, str);
            }
        };
        this.f13585d = set;
        this.f13586e = executor;
        this.c = bVar;
        this.f13584b = context;
    }

    @Override // bb.f
    public final o a() {
        if (!s0.m.a(this.f13584b)) {
            return Tasks.e("");
        }
        return Tasks.c(new Callable() { // from class: bb.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                com.google.firebase.heartbeatinfo.a aVar = com.google.firebase.heartbeatinfo.a.this;
                synchronized (aVar) {
                    m mVar = aVar.f13583a.get();
                    ArrayList c = mVar.c();
                    mVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c.size(); i10++) {
                        n nVar = (n) c.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", nVar.b());
                        jSONObject.put("dates", new JSONArray((Collection) nVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                return byteArrayOutputStream;
            }
        }, this.f13586e);
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public final synchronized HeartBeatInfo.HeartBeat b() {
        long currentTimeMillis = System.currentTimeMillis();
        m mVar = this.f13583a.get();
        if (mVar.i(currentTimeMillis)) {
            mVar.g();
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }

    public final void c() {
        if (this.f13585d.size() <= 0) {
            Tasks.e(null);
        } else if (!s0.m.a(this.f13584b)) {
            Tasks.e(null);
        } else {
            Tasks.c(new bb.b(this, 0), this.f13586e);
        }
    }
}
