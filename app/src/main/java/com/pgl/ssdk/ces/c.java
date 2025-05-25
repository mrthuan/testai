package com.pgl.ssdk.ces;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.pgl.ssdk.ApkUtils;
import com.pgl.ssdk.C;
import com.pgl.ssdk.D;
import com.pgl.ssdk.F;
import com.pgl.ssdk.H;
import com.pgl.ssdk.K;
import com.pgl.ssdk.L;
import com.pgl.ssdk.M;
import com.pgl.ssdk.PglArmorCallApi;
import com.pgl.ssdk.Q;
import com.pgl.ssdk.S;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.x;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: PglSSManagerImpl.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: h  reason: collision with root package name */
    private static volatile c f15797h = null;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f15798i = false;

    /* renamed from: j  reason: collision with root package name */
    private static Map<String, Object> f15799j = null;

    /* renamed from: k  reason: collision with root package name */
    private static int f15800k = 1;

    /* renamed from: l  reason: collision with root package name */
    private static K.a f15801l;

    /* renamed from: a  reason: collision with root package name */
    public Context f15802a;

    /* renamed from: b  reason: collision with root package name */
    private String f15803b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f15804d;

    /* renamed from: e  reason: collision with root package name */
    private String f15805e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f15806f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f15807g = null;

    /* compiled from: PglSSManagerImpl.java */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            PglArmorCallApi.a(PglArmorCallApi.b());
        }
    }

    /* compiled from: PglSSManagerImpl.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D.a(c.this.f15802a).a();
            C.a(c.this.f15802a).a();
        }
    }

    /* compiled from: PglSSManagerImpl.java */
    /* renamed from: com.pgl.ssdk.ces.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0187c implements Runnable {
        public RunnableC0187c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.b(c.this.f15802a);
        }
    }

    private c(Context context, String str) {
        this.f15802a = context;
        this.f15803b = str;
    }

    public static c a(Context context, String str, int i10, int i11, int i12) {
        Application application;
        if (f15797h == null) {
            synchronized (c.class) {
                if (f15797h == null) {
                    if (context == null) {
                        try {
                            application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                        } catch (Throwable unused) {
                            application = null;
                        }
                        context = application.getApplicationContext();
                    }
                    if (context == null) {
                        f15800k = 4;
                        return null;
                    }
                    F.f15758a = i10;
                    K.a a10 = K.a(context, "nms");
                    if (a10 != null) {
                        f15800k = a10.f15780a;
                        f15801l = a10;
                        return null;
                    }
                    c cVar = new c(context, str);
                    f15797h = cVar;
                    cVar.c = i11;
                    f15797h.f15804d = i12;
                    f15797h.a(context);
                    c cVar2 = f15797h;
                    String a11 = L.a(context, "iid", "");
                    if (TextUtils.isEmpty(a11)) {
                        a11 = UUID.randomUUID().toString();
                        L.b(context, "iid", a11);
                    }
                    cVar2.getClass();
                    if (!TextUtils.isEmpty(a11)) {
                        com.pgl.ssdk.ces.a.meta(104, null, a11);
                    }
                    PglArmorCallApi.b(context);
                    f15800k = 0;
                    ApkUtils.a(new a());
                }
            }
        }
        return f15797h;
    }

    public static String d() {
        if (f15797h != null) {
            return f15797h.f15803b;
        }
        return null;
    }

    public static String e() {
        if (f15797h != null) {
            return f15797h.f15805e;
        }
        return null;
    }

    public static int f() {
        return f15800k;
    }

    public static c g() {
        return f15797h;
    }

    public static K.a h() {
        return f15801l;
    }

    public void b() {
        Map<String, Object> map = f15799j;
        if (map != null) {
            Object obj = map.get(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ);
            if (obj instanceof String) {
                String str = (String) obj;
                String[] split = !TextUtils.isEmpty(str) ? str.split("//") : null;
                ArrayList arrayList = new ArrayList();
                if (split != null && split.length > 0) {
                    for (String str2 : split) {
                        try {
                            Class.forName(str2);
                            arrayList.add(str2);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                String obj2 = !arrayList.isEmpty() ? arrayList.toString() : null;
                if (TextUtils.isEmpty(obj2)) {
                    return;
                }
                com.pgl.ssdk.ces.a.meta(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, null, obj2);
            }
        }
    }

    public synchronized void c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f15807g)) {
            com.pgl.ssdk.ces.a.meta(111, null, str);
            this.f15807g = str;
            S.c();
        }
    }

    public synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f15806f)) {
            com.pgl.ssdk.ces.a.meta(112, null, str);
            this.f15806f = str;
            S.c();
        }
    }

    public void c() {
        ApkUtils.a(new RunnableC0187c());
    }

    public synchronized void b(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f15805e)) {
            com.pgl.ssdk.ces.a.meta(103, null, str);
            S.c();
            this.f15805e = str;
        }
    }

    private void a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (context == null || f15798i) {
            return;
        }
        try {
            com.pgl.ssdk.ces.a.meta(101, null, "1");
            com.pgl.ssdk.ces.a.meta(102, null, this.f15803b);
            com.pgl.ssdk.ces.a.meta(114, null, Integer.valueOf(this.c));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(x.c(context));
            com.pgl.ssdk.ces.a.meta(105, null, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            try {
                str = context.getPackageName();
            } catch (Throwable unused) {
                str = null;
            }
            sb3.append(str == null ? "" : str.trim());
            com.pgl.ssdk.ces.a.meta(106, null, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            try {
                str2 = context.getFilesDir().getAbsolutePath();
            } catch (Throwable unused2) {
                str2 = null;
            }
            sb4.append(str2 == null ? "" : str2.trim());
            com.pgl.ssdk.ces.a.meta(107, null, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            try {
                str3 = context.getApplicationInfo().sourceDir;
            } catch (Throwable unused3) {
                str3 = null;
            }
            sb5.append(str3 == null ? "" : str3.trim());
            com.pgl.ssdk.ces.a.meta(108, null, sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            try {
                str4 = Environment.getExternalStorageDirectory().getAbsolutePath();
            } catch (Throwable unused4) {
                str4 = null;
            }
            sb6.append(str4 == null ? "" : str4.trim());
            com.pgl.ssdk.ces.a.meta(109, null, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            try {
                str5 = Environment.getDataDirectory().getPath();
            } catch (Throwable unused5) {
                str5 = null;
            }
            sb7.append(str5 != null ? str5.trim() : "");
            com.pgl.ssdk.ces.a.meta(110, null, sb7.toString());
            f15798i = true;
        } catch (Throwable unused6) {
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        this.f15805e = str2;
        this.f15806f = str3;
        com.pgl.ssdk.ces.a.meta(113, null, str);
        com.pgl.ssdk.ces.a.meta(112, null, str3);
        com.pgl.ssdk.ces.a.meta(103, null, str2);
        com.pgl.ssdk.ces.a.meta(111, null, str4);
        try {
            H.b();
            S.a(this.f15802a, this.f15803b);
            a("CZL-L1st");
        } catch (Throwable unused) {
        }
    }

    public void a(String str) {
        try {
            long j10 = "CZL-L1st".equals(str) ? 10000L : 0L;
            Q c = M.a().c();
            if (c != null) {
                c.postDelayed(new d(this.f15802a, str), j10);
            }
            ApkUtils.a(new b());
            PglArmorCallApi.a();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
        if (r7 != 1) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(int r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.ces.c.a(int, java.lang.Object):java.lang.Object");
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            f15799j = map;
        }
    }

    public void a() {
        ApkUtils.a(new b());
    }
}
