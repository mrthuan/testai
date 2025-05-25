package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6706a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6707b = false;
    private static boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private static int f6708d = 1;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f6709e = false;

    /* renamed from: f  reason: collision with root package name */
    private static long f6710f = -1;

    /* renamed from: z  reason: collision with root package name */
    private static volatile b f6711z;
    private int B;

    /* renamed from: g  reason: collision with root package name */
    private Application f6712g;

    /* renamed from: h  reason: collision with root package name */
    private Context f6713h;

    /* renamed from: n  reason: collision with root package name */
    private String f6719n;

    /* renamed from: o  reason: collision with root package name */
    private long f6720o;

    /* renamed from: p  reason: collision with root package name */
    private String f6721p;

    /* renamed from: q  reason: collision with root package name */
    private long f6722q;

    /* renamed from: r  reason: collision with root package name */
    private String f6723r;

    /* renamed from: s  reason: collision with root package name */
    private long f6724s;

    /* renamed from: t  reason: collision with root package name */
    private String f6725t;

    /* renamed from: u  reason: collision with root package name */
    private long f6726u;

    /* renamed from: v  reason: collision with root package name */
    private String f6727v;

    /* renamed from: w  reason: collision with root package name */
    private long f6728w;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f6714i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private List<Long> f6715j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private List<String> f6716k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private List<Long> f6717l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private LinkedList<a> f6718m = new LinkedList<>();

    /* renamed from: x  reason: collision with root package name */
    private boolean f6729x = false;

    /* renamed from: y  reason: collision with root package name */
    private long f6730y = -1;
    private int A = 50;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f6732a;

        /* renamed from: b  reason: collision with root package name */
        String f6733b;
        long c;

        public a(String str, String str2, long j10) {
            this.f6733b = str2;
            this.c = j10;
            this.f6732a = str;
        }

        public String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.c)) + " : " + this.f6732a + ' ' + this.f6733b;
        }
    }

    private b(Application application) {
        this.f6713h = application;
        this.f6712g = application;
        try {
            m();
        } catch (Throwable unused) {
        }
    }

    public static int b() {
        int i10 = f6708d;
        return i10 == 1 ? f6709e ? 2 : 1 : i10;
    }

    public static long c() {
        return f6710f;
    }

    public static /* synthetic */ int g(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int l(b bVar) {
        int i10 = bVar.B;
        bVar.B = i10 - 1;
        return i10;
    }

    public long e() {
        return SystemClock.uptimeMillis() - this.f6730y;
    }

    public String h() {
        return String.valueOf(this.f6723r);
    }

    public static b d() {
        if (f6711z == null) {
            synchronized (b.class) {
                if (f6711z == null) {
                    f6711z = new b(com.apm.insight.i.h());
                }
            }
        }
        return f6711z;
    }

    private void m() {
        if (this.f6712g != null) {
            this.f6712g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    boolean z10;
                    b.this.f6719n = activity.getClass().getName();
                    b.this.f6720o = System.currentTimeMillis();
                    if (bundle != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean unused = b.f6707b = z10;
                    boolean unused2 = b.c = true;
                    b.this.f6714i.add(b.this.f6719n);
                    b.this.f6715j.add(Long.valueOf(b.this.f6720o));
                    b bVar = b.this;
                    bVar.a(bVar.f6719n, b.this.f6720o, "onCreate");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    String name = activity.getClass().getName();
                    int indexOf = b.this.f6714i.indexOf(name);
                    if (indexOf > -1 && indexOf < b.this.f6714i.size()) {
                        b.this.f6714i.remove(indexOf);
                        b.this.f6715j.remove(indexOf);
                    }
                    b.this.f6716k.add(name);
                    long currentTimeMillis = System.currentTimeMillis();
                    b.this.f6717l.add(Long.valueOf(currentTimeMillis));
                    b.this.a(name, currentTimeMillis, "onDestroy");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    b.this.f6725t = activity.getClass().getName();
                    b.this.f6726u = System.currentTimeMillis();
                    b.l(b.this);
                    if (b.this.B != 0) {
                        if (b.this.B < 0) {
                            b.this.B = 0;
                        }
                        b bVar = b.this;
                        bVar.a(bVar.f6725t, b.this.f6726u, "onPause");
                    }
                    b.this.f6729x = false;
                    boolean unused = b.c = false;
                    b.this.f6730y = SystemClock.uptimeMillis();
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f6725t, b.this.f6726u, "onPause");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    b.this.f6723r = activity.getClass().getName();
                    b.this.f6724s = System.currentTimeMillis();
                    b.g(b.this);
                    if (!b.this.f6729x) {
                        if (b.f6706a) {
                            boolean unused = b.f6706a = false;
                            int unused2 = b.f6708d = 1;
                            long unused3 = b.f6710f = b.this.f6724s;
                        }
                        if (!b.this.f6723r.equals(b.this.f6725t)) {
                            return;
                        }
                        if (b.c && !b.f6707b) {
                            int unused4 = b.f6708d = 4;
                            long unused5 = b.f6710f = b.this.f6724s;
                            return;
                        } else if (!b.c) {
                            int unused6 = b.f6708d = 3;
                            long unused7 = b.f6710f = b.this.f6724s;
                            return;
                        }
                    }
                    b.this.f6729x = true;
                    b bVar = b.this;
                    bVar.a(bVar.f6723r, b.this.f6724s, "onResume");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    b.this.f6721p = activity.getClass().getName();
                    b.this.f6722q = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f6721p, b.this.f6722q, "onStart");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    b.this.f6727v = activity.getClass().getName();
                    b.this.f6728w = System.currentTimeMillis();
                    b bVar = b.this;
                    bVar.a(bVar.f6727v, b.this.f6728w, "onStop");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }
            });
        }
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6714i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6714i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6714i.get(i10), this.f6715j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f6716k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f6716k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f6716k.get(i10), this.f6717l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("last_create_activity", a(this.f6719n, this.f6720o));
            jSONObject.put("last_start_activity", a(this.f6721p, this.f6722q));
            jSONObject.put("last_resume_activity", a(this.f6723r, this.f6724s));
            jSONObject.put("last_pause_activity", a(this.f6725t, this.f6726u));
            jSONObject.put("last_stop_activity", a(this.f6727v, this.f6728w));
            jSONObject.put("alive_activities", n());
            jSONObject.put("finish_activities", o());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f6718m).iterator();
        while (it.hasNext()) {
            jSONArray.put(((a) it.next()).toString());
        }
        return jSONArray;
    }

    public boolean f() {
        return this.f6729x;
    }

    private a a(String str, String str2, long j10) {
        a aVar;
        if (this.f6718m.size() >= this.A) {
            aVar = this.f6718m.poll();
            if (aVar != null) {
                this.f6718m.add(aVar);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            a aVar2 = new a(str, str2, j10);
            this.f6718m.add(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NamingTable.TAG, str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static void a() {
        f6709e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10, String str2) {
        try {
            a a10 = a(str, str2, j10);
            a10.f6733b = str2;
            a10.f6732a = str;
            a10.c = j10;
        } catch (Throwable unused) {
        }
    }
}
