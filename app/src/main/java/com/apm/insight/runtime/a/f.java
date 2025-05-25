package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class f {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static volatile f f6742a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6743b;
    private Map<CrashType, c> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private b f6744d;

    /* renamed from: e  reason: collision with root package name */
    private d f6745e;

    /* renamed from: com.apm.insight.runtime.a.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6746a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6746a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6746a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6746a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6746a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6746a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6746a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6746a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6746a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.f6743b = context;
        try {
            this.f6744d = b.d();
            this.f6745e = new d(this.f6743b);
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, null, false);
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar, c.a aVar2, boolean z10) {
        c a10;
        return (crashType == null || (a10 = a(crashType)) == null) ? aVar : a10.a(aVar, aVar2, z10);
    }

    public com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        for (com.apm.insight.entity.a aVar2 : list) {
            jSONArray2.put(aVar2.h());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header a10 = Header.a(this.f6743b);
        Header.a(a10);
        a10.c();
        a10.d();
        a10.e();
        Header.b(a10);
        aVar.a(a10);
        return aVar;
    }

    private c a(CrashType crashType) {
        c cVar = this.c.get(crashType);
        if (cVar != null) {
            return cVar;
        }
        switch (AnonymousClass1.f6746a[crashType.ordinal()]) {
            case 1:
                cVar = new j(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 2:
                cVar = new k(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 3:
                cVar = new l(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 4:
                cVar = new a(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 5:
                cVar = new h(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 6:
                cVar = new g(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 7:
                cVar = new e(this.f6743b, this.f6744d, this.f6745e);
                break;
            case 8:
                cVar = new i(this.f6743b, this.f6744d, this.f6745e);
                break;
        }
        if (cVar != null) {
            this.c.put(crashType, cVar);
        }
        return cVar;
    }

    public static f a() {
        if (f6742a == null) {
            Context g10 = com.apm.insight.i.g();
            if (g10 == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f6742a = new f(g10);
        }
        return f6742a;
    }
}
