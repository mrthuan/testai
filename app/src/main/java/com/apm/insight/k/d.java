package com.apm.insight.k;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.l.n;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f6592a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f6593b;

    private d(Context context) {
        this.f6593b = context;
    }

    public static d a() {
        if (f6592a == null) {
            f6592a = new d(com.apm.insight.i.g());
        }
        return f6592a;
    }

    public void b(final JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            p.b().a(new Runnable() { // from class: com.apm.insight.k.d.1
                @Override // java.lang.Runnable
                public void run() {
                    String c = e.c();
                    try {
                        jSONObject.put("upload_scene", "direct");
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    e.b(c, jSONObject.toString());
                }
            });
        }
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String f10 = e.f();
            File file = new File(n.a(this.f6593b), n.c());
            com.apm.insight.l.h.a(file, file.getName(), f10, jSONObject, e.b());
            if (e.a(f10, jSONObject.toString()).a()) {
                com.apm.insight.l.h.a(file);
            }
        } catch (Throwable th2) {
            com.apm.insight.l.p.b(th2);
        }
    }

    public void a(JSONObject jSONObject, long j10, boolean z10) {
        File[] fileArr;
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = e.c();
                int i10 = 0;
                File file = new File(n.a(this.f6593b), com.apm.insight.i.a(j10, CrashType.ANR, false, false));
                com.apm.insight.l.h.a(file, file.getName(), c, jSONObject, e.b());
                if (z10 && !Npth.isStopUpload()) {
                    jSONObject.put("upload_scene", "direct");
                    jSONObject.put("crash_uuid", file.getName());
                    q.a(jSONObject);
                    if (com.apm.insight.runtime.a.j()) {
                        HashMap<String, r.a> a10 = r.a(j10, "anr_trace");
                        fileArr = new File[a10.size() + 2];
                        for (Map.Entry<String, r.a> entry : a10.entrySet()) {
                            if (!entry.getKey().equals(com.apm.insight.l.a.c(this.f6593b))) {
                                fileArr[i10] = n.a(this.f6593b, entry.getValue().f6797b);
                                i10++;
                            }
                        }
                    } else {
                        fileArr = new File[2];
                    }
                    fileArr[fileArr.length - 1] = n.a(this.f6593b, com.apm.insight.i.f());
                    fileArr[fileArr.length - 2] = r.a(j10);
                    if (!e.a(c, jSONObject.toString(), fileArr).a()) {
                        return;
                    }
                    com.apm.insight.l.h.a(file);
                    if (Npth.hasCrash()) {
                        return;
                    }
                    com.apm.insight.l.h.a(n.e(com.apm.insight.i.g()));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(long j10, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                String c = e.c();
                File file = new File(n.a(this.f6593b), n.a(com.apm.insight.i.e()));
                com.apm.insight.l.h.a(file, file.getName(), c, jSONObject, e.a());
                jSONObject.put("upload_scene", "direct");
                q.a(jSONObject);
                if (e.b(c, jSONObject.toString()).a()) {
                    com.apm.insight.l.h.a(file);
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                com.apm.insight.l.p.b(th2);
            }
        }
        return false;
    }

    public boolean a(JSONObject jSONObject, File file, File file2) {
        try {
            String g10 = e.g();
            q.a(jSONObject);
            return e.a(g10, jSONObject.toString(), file, file2, r.a(System.currentTimeMillis()), new File(com.apm.insight.h.b.a())).a();
        } catch (Throwable th2) {
            com.apm.insight.l.p.b(th2);
            return false;
        }
    }
}
