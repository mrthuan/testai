package com.facebook.internal.instrument;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.internal.p;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import h6.d;
import java.io.File;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InstrumentData.kt */
/* loaded from: classes.dex */
public final class InstrumentData {

    /* renamed from: a  reason: collision with root package name */
    public final String f9794a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f9795b;
    public final JSONArray c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9796d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9797e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9798f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f9799g;

    /* compiled from: InstrumentData.kt */
    /* loaded from: classes.dex */
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* compiled from: InstrumentData.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f9801a;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.Analysis.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.AnrReport.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.CrashReport.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.CrashShield.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Type.ThreadCheck.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f9801a = iArr;
            }
        }

        public final String getLogPrefix() {
            int i10 = a.f9801a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return OpenTypeScript.UNKNOWN;
                            }
                            return "thread_check_log_";
                        }
                        return "shield_log_";
                    }
                    return "crash_log_";
                }
                return "anr_log_";
            }
            return "analysis_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.f9801a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return OpenTypeScript.UNKNOWN;
                            }
                            return "ThreadCheck";
                        }
                        return "CrashShield";
                    }
                    return "CrashReport";
                }
                return "AnrReport";
            }
            return "Analysis";
        }
    }

    /* compiled from: InstrumentData.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9802a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.Analysis.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AnrReport.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.CrashReport.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.CrashShield.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.ThreadCheck.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9802a = iArr;
        }
    }

    public InstrumentData(JSONArray jSONArray) {
        this.f9795b = Type.Analysis;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f9799g = valueOf;
        this.c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        g.d(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f9794a = stringBuffer2;
    }

    public final int a(InstrumentData data) {
        g.e(data, "data");
        Long l10 = this.f9799g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = data.f9799g;
        if (l11 == null) {
            return 1;
        }
        int i10 = (l11.longValue() > longValue ? 1 : (l11.longValue() == longValue ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        if (i10 != 0) {
            return 1;
        }
        return 0;
    }

    public final boolean b() {
        int i10;
        Type type = this.f9795b;
        if (type == null) {
            i10 = -1;
        } else {
            i10 = a.f9802a[type.ordinal()];
        }
        Long l10 = this.f9799g;
        if (i10 != 1) {
            String str = this.f9798f;
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || str == null || l10 == null) {
                    return false;
                }
            } else if (str == null || this.f9797e == null || l10 == null) {
                return false;
            }
        } else if (this.c == null || l10 == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (!b()) {
            return;
        }
        d.g(this.f9794a, toString());
    }

    public final String toString() {
        int i10;
        JSONObject jSONObject;
        Type type = this.f9795b;
        if (type == null) {
            i10 = -1;
        } else {
            i10 = a.f9802a[type.ordinal()];
        }
        Long l10 = this.f9799g;
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
                jSONObject = new JSONObject();
                jSONObject.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject.put("device_model", Build.MODEL);
                String str = this.f9796d;
                if (str != null) {
                    jSONObject.put("app_version", str);
                }
                if (l10 != null) {
                    jSONObject.put("timestamp", l10);
                }
                String str2 = this.f9797e;
                if (str2 != null) {
                    jSONObject.put("reason", str2);
                }
                String str3 = this.f9798f;
                if (str3 != null) {
                    jSONObject.put("callstack", str3);
                }
                if (type != null) {
                    jSONObject.put("type", type);
                }
            }
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
        }
        if (jSONObject == null) {
            String jSONObject2 = new JSONObject().toString();
            g.d(jSONObject2, "JSONObject().toString()");
            return jSONObject2;
        }
        String jSONObject3 = jSONObject.toString();
        g.d(jSONObject3, "params.toString()");
        return jSONObject3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InstrumentData(java.lang.Throwable r7, com.facebook.internal.instrument.InstrumentData.Type r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f9795b = r8
            com.facebook.internal.p r0 = com.facebook.internal.p.f9815a
            android.content.Context r0 = com.facebook.d.a()
            java.lang.String r1 = r0.getPackageName()
            r2 = 0
            r3 = 0
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            if (r0 != 0) goto L1c
            goto L1f
        L1c:
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1f
            goto L20
        L1f:
            r0 = r3
        L20:
            r6.f9796d = r0
            if (r7 != 0) goto L26
            r0 = r3
            goto L39
        L26:
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L31
            java.lang.String r0 = r7.toString()
            goto L39
        L31:
            java.lang.Throwable r0 = r7.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L39:
            r6.f9797e = r0
            if (r7 != 0) goto L3e
            goto L6b
        L3e:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
        L43:
            if (r7 == 0) goto L67
            if (r7 == r3) goto L67
            java.lang.StackTraceElement[] r1 = r7.getStackTrace()
            java.lang.String r3 = "t.stackTrace"
            kotlin.jvm.internal.g.d(r1, r3)
            int r3 = r1.length
            r4 = r2
        L52:
            if (r4 >= r3) goto L60
            r5 = r1[r4]
            java.lang.String r5 = r5.toString()
            r0.put(r5)
            int r4 = r4 + 1
            goto L52
        L60:
            java.lang.Throwable r1 = r7.getCause()
            r3 = r7
            r7 = r1
            goto L43
        L67:
            java.lang.String r3 = r0.toString()
        L6b:
            r6.f9798f = r3
            long r0 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r7
            long r0 = r0 / r2
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r6.f9799g = r7
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r8 = r8.getLogPrefix()
            r0.append(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.append(r7)
            java.lang.String r7 = ".json"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "StringBuffer().append(t.…ppend(\".json\").toString()"
            kotlin.jvm.internal.g.d(r7, r8)
            r6.f9794a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.instrument.InstrumentData.<init>(java.lang.Throwable, com.facebook.internal.instrument.InstrumentData$Type):void");
    }

    public InstrumentData(String str, String str2) {
        this.f9795b = Type.AnrReport;
        p pVar = p.f9815a;
        Context a10 = com.facebook.d.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        this.f9796d = str3;
        this.f9797e = str;
        this.f9798f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f9799g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        g.d(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f9794a = stringBuffer2;
    }

    public InstrumentData(File file) {
        Type type;
        String name = file.getName();
        g.d(name, "file.name");
        this.f9794a = name;
        if (j.M(name, "crash_log_", false)) {
            type = Type.CrashReport;
        } else if (j.M(name, "shield_log_", false)) {
            type = Type.CrashShield;
        } else if (j.M(name, "thread_check_log_", false)) {
            type = Type.ThreadCheck;
        } else if (j.M(name, "analysis_log_", false)) {
            type = Type.Analysis;
        } else if (j.M(name, "anr_log_", false)) {
            type = Type.AnrReport;
        } else {
            type = Type.Unknown;
        }
        this.f9795b = type;
        JSONObject e10 = d.e(name);
        if (e10 != null) {
            this.f9799g = Long.valueOf(e10.optLong("timestamp", 0L));
            this.f9796d = e10.optString("app_version", null);
            this.f9797e = e10.optString("reason", null);
            this.f9798f = e10.optString("callstack", null);
            this.c = e10.optJSONArray("feature_names");
        }
    }
}
