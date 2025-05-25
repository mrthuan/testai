package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.u;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hpsf.Variant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6374b = false;

    /* renamed from: t  reason: collision with root package name */
    private static int f6375t = 2;

    /* renamed from: a  reason: collision with root package name */
    c f6376a;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f6377d;

    /* renamed from: e  reason: collision with root package name */
    private int f6378e;

    /* renamed from: f  reason: collision with root package name */
    private int f6379f;

    /* renamed from: g  reason: collision with root package name */
    private f f6380g;

    /* renamed from: h  reason: collision with root package name */
    private b f6381h;

    /* renamed from: i  reason: collision with root package name */
    private long f6382i;

    /* renamed from: j  reason: collision with root package name */
    private long f6383j;

    /* renamed from: k  reason: collision with root package name */
    private int f6384k;

    /* renamed from: l  reason: collision with root package name */
    private long f6385l;

    /* renamed from: m  reason: collision with root package name */
    private String f6386m;

    /* renamed from: n  reason: collision with root package name */
    private String f6387n;

    /* renamed from: o  reason: collision with root package name */
    private com.apm.insight.b.e f6388o;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f6389p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6390q;

    /* renamed from: r  reason: collision with root package name */
    private final u f6391r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f6392s;

    /* renamed from: u  reason: collision with root package name */
    private Runnable f6393u;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f6401a;

        /* renamed from: b  reason: collision with root package name */
        long f6402b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6403d;

        /* renamed from: e  reason: collision with root package name */
        int f6404e;

        /* renamed from: f  reason: collision with root package name */
        StackTraceElement[] f6405f;

        private a() {
        }

        public void a() {
            this.f6401a = -1L;
            this.f6402b = -1L;
            this.c = -1L;
            this.f6404e = -1;
            this.f6405f = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6406a;

        /* renamed from: b  reason: collision with root package name */
        a f6407b;
        final List<a> c;

        /* renamed from: d  reason: collision with root package name */
        private int f6408d = 0;

        public b(int i10) {
            this.f6406a = i10;
            this.c = new ArrayList(i10);
        }

        public a a() {
            a aVar = this.f6407b;
            if (aVar != null) {
                this.f6407b = null;
                return aVar;
            }
            return new a();
        }

        public void a(a aVar) {
            int i10;
            int size = this.c.size();
            int i11 = this.f6406a;
            if (size < i11) {
                this.c.add(aVar);
                i10 = this.c.size();
            } else {
                int i12 = this.f6408d % i11;
                this.f6408d = i12;
                a aVar2 = this.c.set(i12, aVar);
                aVar2.a();
                this.f6407b = aVar2;
                i10 = this.f6408d + 1;
            }
            this.f6408d = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f6409a;

        /* renamed from: b  reason: collision with root package name */
        long f6410b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        long f6411d;

        /* renamed from: e  reason: collision with root package name */
        long f6412e;
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public long f6413a;

        /* renamed from: b  reason: collision with root package name */
        long f6414b;
        long c;

        /* renamed from: d  reason: collision with root package name */
        int f6415d;

        /* renamed from: e  reason: collision with root package name */
        int f6416e;

        /* renamed from: f  reason: collision with root package name */
        long f6417f;

        /* renamed from: g  reason: collision with root package name */
        long f6418g;

        /* renamed from: h  reason: collision with root package name */
        String f6419h;

        /* renamed from: i  reason: collision with root package name */
        public String f6420i;

        /* renamed from: j  reason: collision with root package name */
        String f6421j;

        /* renamed from: k  reason: collision with root package name */
        d f6422k;

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", h.a(this.f6419h));
                jSONObject.put("cpuDuration", this.f6418g);
                jSONObject.put("duration", this.f6417f);
                jSONObject.put("type", this.f6415d);
                jSONObject.put("count", this.f6416e);
                jSONObject.put("messageCount", this.f6416e);
                jSONObject.put("lastDuration", this.f6414b - this.c);
                jSONObject.put("start", this.f6413a);
                jSONObject.put("end", this.f6414b);
                a(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        public void b() {
            this.f6415d = -1;
            this.f6416e = -1;
            this.f6417f = -1L;
            this.f6419h = null;
            this.f6421j = null;
            this.f6422k = null;
            this.f6420i = null;
        }

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f6421j);
            jSONObject.put("sblock_uuid", this.f6421j);
            jSONObject.put("belong_frame", this.f6422k != null);
            d dVar = this.f6422k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.c - (dVar.f6409a / 1000000));
                jSONObject.put("doFrameTime", (this.f6422k.f6410b / 1000000) - this.c);
                d dVar2 = this.f6422k;
                jSONObject.put("inputHandlingTime", (dVar2.c / 1000000) - (dVar2.f6410b / 1000000));
                d dVar3 = this.f6422k;
                jSONObject.put("animationsTime", (dVar3.f6411d / 1000000) - (dVar3.c / 1000000));
                d dVar4 = this.f6422k;
                jSONObject.put("performTraversalsTime", (dVar4.f6412e / 1000000) - (dVar4.f6411d / 1000000));
                jSONObject.put("drawTime", this.f6414b - (this.f6422k.f6412e / 1000000));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        int f6423a;

        /* renamed from: b  reason: collision with root package name */
        int f6424b;
        e c;

        /* renamed from: d  reason: collision with root package name */
        List<e> f6425d = new ArrayList();

        public f(int i10) {
            this.f6423a = i10;
        }

        public e a(int i10) {
            e eVar = this.c;
            if (eVar != null) {
                eVar.f6415d = i10;
                this.c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f6415d = i10;
            return eVar2;
        }

        public List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f6425d.size() == this.f6423a) {
                for (int i11 = this.f6424b; i11 < this.f6425d.size(); i11++) {
                    arrayList.add(this.f6425d.get(i11));
                }
                while (i10 < this.f6424b - 1) {
                    arrayList.add(this.f6425d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f6425d.size()) {
                    arrayList.add(this.f6425d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }

        public void a(e eVar) {
            int i10;
            int size = this.f6425d.size();
            int i11 = this.f6423a;
            if (size < i11) {
                this.f6425d.add(eVar);
                i10 = this.f6425d.size();
            } else {
                int i12 = this.f6424b % i11;
                this.f6424b = i12;
                e eVar2 = this.f6425d.set(i12, eVar);
                eVar2.b();
                this.c = eVar2;
                i10 = this.f6424b + 1;
            }
            this.f6424b = i10;
        }
    }

    public h(int i10) {
        this(i10, false);
    }

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.g.a(i10);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static /* synthetic */ int f(h hVar) {
        int i10 = hVar.c;
        hVar.c = i10 + 1;
        return i10;
    }

    public JSONArray c() {
        List<e> a10;
        JSONArray jSONArray = new JSONArray();
        try {
            a10 = this.f6380g.a();
        } catch (Throwable unused) {
        }
        if (a10 == null) {
            return jSONArray;
        }
        int i10 = 0;
        for (e eVar : a10) {
            if (eVar != null) {
                i10++;
                jSONArray.put(eVar.a().put(FacebookMediationAdapter.KEY_ID, i10));
            }
        }
        return jSONArray;
    }

    public h(int i10, boolean z10) {
        this.c = 0;
        this.f6377d = 0;
        this.f6378e = 100;
        this.f6379f = 200;
        this.f6382i = -1L;
        this.f6383j = -1L;
        this.f6384k = -1;
        this.f6385l = -1L;
        this.f6389p = false;
        this.f6390q = false;
        this.f6392s = false;
        this.f6393u = new Runnable() { // from class: com.apm.insight.b.h.2
            private long c;

            /* renamed from: b  reason: collision with root package name */
            private long f6396b = 0;

            /* renamed from: d  reason: collision with root package name */
            private int f6397d = -1;

            /* renamed from: e  reason: collision with root package name */
            private int f6398e = 0;

            /* renamed from: f  reason: collision with root package name */
            private int f6399f = 0;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a10 = h.this.f6381h.a();
                if (this.f6397d == h.this.f6377d) {
                    this.f6398e++;
                } else {
                    this.f6398e = 0;
                    this.f6399f = 0;
                    this.c = uptimeMillis;
                }
                this.f6397d = h.this.f6377d;
                int i11 = this.f6398e;
                if (i11 > 0 && i11 - this.f6399f >= h.f6375t && this.f6396b != 0 && uptimeMillis - this.c > 700 && h.this.f6392s) {
                    a10.f6405f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f6399f = this.f6398e;
                }
                a10.f6403d = h.this.f6392s;
                a10.c = (uptimeMillis - this.f6396b) - 300;
                a10.f6401a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f6396b = uptimeMillis2;
                a10.f6402b = uptimeMillis2 - uptimeMillis;
                a10.f6404e = h.this.f6377d;
                h.this.f6391r.a(h.this.f6393u, 300L);
                h.this.f6381h.a(a10);
            }
        };
        this.f6376a = new c() { // from class: com.apm.insight.b.h.1
        };
        if (!z10 && !f6374b) {
            this.f6391r = null;
            return;
        }
        u uVar = new u("looper_monitor");
        this.f6391r = uVar;
        uVar.b();
        this.f6381h = new b(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
        uVar.a(this.f6393u, 300L);
    }

    private void e() {
        this.f6378e = 100;
        this.f6379f = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
    }

    public e a(long j10) {
        e eVar = new e();
        eVar.f6419h = this.f6387n;
        eVar.f6420i = this.f6386m;
        eVar.f6417f = j10 - this.f6383j;
        eVar.f6418g = a(this.f6384k) - this.f6385l;
        eVar.f6416e = this.c;
        return eVar;
    }

    public void b() {
        a();
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    public void a() {
        if (this.f6389p) {
            return;
        }
        this.f6389p = true;
        e();
        this.f6380g = new f(this.f6378e);
        this.f6388o = new com.apm.insight.b.e() { // from class: com.apm.insight.b.h.3
            @Override // com.apm.insight.b.e
            public void a(String str) {
                h.this.f6392s = true;
                h.this.f6387n = str;
                super.a(str);
                h.this.a(true, com.apm.insight.b.e.f6368a);
            }

            @Override // com.apm.insight.b.e
            public void b(String str) {
                super.b(str);
                h.f(h.this);
                h.this.a(false, com.apm.insight.b.e.f6368a);
                h hVar = h.this;
                hVar.f6386m = hVar.f6387n;
                h.this.f6387n = "no message running";
                h.this.f6392s = false;
            }

            @Override // com.apm.insight.b.e
            public boolean a() {
                return true;
            }
        };
        i.a();
        i.a(this.f6388o);
        k.a(k.a());
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f6390q = true;
        e a10 = this.f6380g.a(i10);
        a10.f6417f = j10 - this.f6382i;
        if (z10) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a10.f6418g = currentThreadTimeMillis - this.f6385l;
            this.f6385l = currentThreadTimeMillis;
        } else {
            a10.f6418g = -1L;
        }
        a10.f6416e = this.c;
        a10.f6419h = str;
        a10.f6420i = this.f6386m;
        a10.f6413a = this.f6382i;
        a10.f6414b = j10;
        a10.c = this.f6383j;
        this.f6380g.a(a10);
        this.c = 0;
        this.f6382i = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, long j10) {
        h hVar;
        int i10;
        String str;
        boolean z11;
        int i11 = this.f6377d + 1;
        this.f6377d = i11;
        this.f6377d = i11 & Variant.VT_ILLEGAL;
        this.f6390q = false;
        if (this.f6382i < 0) {
            this.f6382i = j10;
        }
        if (this.f6383j < 0) {
            this.f6383j = j10;
        }
        if (this.f6384k < 0) {
            this.f6384k = Process.myTid();
            this.f6385l = SystemClock.currentThreadTimeMillis();
        }
        int i12 = this.f6379f;
        if (j10 - this.f6382i > i12) {
            long j11 = this.f6383j;
            if (j10 - j11 > i12) {
                int i13 = this.c;
                if (z10) {
                    if (i13 == 0) {
                        a(1, j10, "no message running");
                    } else {
                        a(9, j11, this.f6386m);
                        i10 = 1;
                        str = "no message running";
                        z11 = false;
                    }
                } else if (i13 == 0) {
                    i10 = 8;
                    str = this.f6387n;
                    z11 = true;
                } else {
                    hVar = this;
                    hVar.a(9, j11, this.f6386m, false);
                    i10 = 8;
                    str = this.f6387n;
                    z11 = true;
                    hVar.a(i10, j10, str, z11);
                }
                hVar = this;
                hVar.a(i10, j10, str, z11);
            } else {
                a(9, j10, this.f6387n);
            }
        }
        this.f6383j = j10;
    }
}
