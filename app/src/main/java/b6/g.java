package b6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.text.Regex;

/* compiled from: StdParamsEnforcementManager.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5341b;

    /* renamed from: a  reason: collision with root package name */
    public static final g f5340a = new g();
    public static final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f5342d = new HashMap();

    public static final void c(Bundle bundle) {
        boolean z10;
        boolean z11;
        g gVar = f5340a;
        if (k6.a.b(g.class)) {
            return;
        }
        try {
            if (f5341b && bundle != null) {
                ArrayList arrayList = new ArrayList();
                for (String key : bundle.keySet()) {
                    String valueOf = String.valueOf(bundle.get(key));
                    HashMap hashMap = c;
                    boolean z12 = true;
                    boolean z13 = false;
                    if (hashMap.get(key) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    HashMap hashMap2 = f5342d;
                    if (hashMap2.get(key) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10 || z11) {
                        Set set = (Set) hashMap.get(key);
                        gVar.getClass();
                        if (!k6.a.b(gVar)) {
                            if (set != null) {
                                Set<String> set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    for (String str : set2) {
                                        if (new Regex(str).matches(valueOf)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            z12 = false;
                            z13 = z12;
                        }
                        boolean b10 = gVar.b(valueOf, (Set) hashMap2.get(key));
                        if (!z13 && !b10) {
                            kotlin.jvm.internal.g.d(key, "key");
                            arrayList.add(key);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            k6.a.a(g.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[Catch: Exception -> 0x009f, all -> 0x00aa, TryCatch #0 {Exception -> 0x009f, blocks: (B:20:0x0035, B:22:0x0042, B:36:0x0077, B:38:0x0082, B:39:0x0086, B:40:0x008a, B:42:0x0095, B:43:0x0099, B:33:0x0071), top: B:51:0x0035, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[Catch: Exception -> 0x009f, all -> 0x00aa, TryCatch #0 {Exception -> 0x009f, blocks: (B:20:0x0035, B:22:0x0042, B:36:0x0077, B:38:0x0082, B:39:0x0086, B:40:0x008a, B:42:0x0095, B:43:0x0099, B:33:0x0071), top: B:51:0x0035, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.json.JSONArray r14) {
        /*
            r13 = this;
            java.util.HashMap r0 = b6.g.c
            java.util.HashMap r1 = b6.g.f5342d
            java.lang.String r2 = "key"
            boolean r3 = k6.a.b(r13)
            if (r3 == 0) goto Ld
            return
        Ld:
            if (r14 == 0) goto Lae
            boolean r3 = b6.g.f5341b     // Catch: java.lang.Throwable -> Laa
            if (r3 == 0) goto L15
            goto Lae
        L15:
            int r3 = r14.length()     // Catch: java.lang.Throwable -> Laa
            r4 = 0
            r5 = r4
        L1b:
            if (r5 >= r3) goto La9
            org.json.JSONObject r6 = r14.getJSONObject(r5)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r6.getString(r2)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L30
            int r8 = r7.length()     // Catch: java.lang.Throwable -> Laa
            if (r8 != 0) goto L2e
            goto L30
        L2e:
            r8 = r4
            goto L31
        L30:
            r8 = 1
        L31:
            if (r8 == 0) goto L35
            goto La5
        L35:
            java.lang.String r8 = "value"
            org.json.JSONArray r6 = r6.getJSONArray(r8)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            int r8 = r6.length()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            r9 = r4
        L40:
            if (r9 >= r8) goto La5
            org.json.JSONObject r10 = r6.getJSONObject(r9)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.lang.String r11 = "require_exact_match"
            boolean r10 = r10.getBoolean(r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            org.json.JSONObject r11 = r6.getJSONObject(r9)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.lang.String r12 = "potential_matches"
            org.json.JSONArray r11 = r11.getJSONArray(r12)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            boolean r12 = k6.a.b(r13)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            if (r12 == 0) goto L5d
            goto L74
        L5d:
            java.util.HashSet r11 = com.facebook.internal.p.e(r11)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r11 != 0) goto L75
            java.util.HashSet r11 = new java.util.HashSet     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r11.<init>()     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            goto L75
        L69:
            r11 = move-exception
            goto L71
        L6b:
            java.util.HashSet r11 = new java.util.HashSet     // Catch: java.lang.Throwable -> L69
            r11.<init>()     // Catch: java.lang.Throwable -> L69
            goto L75
        L71:
            k6.a.a(r13, r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
        L74:
            r11 = 0
        L75:
            if (r10 == 0) goto L8a
            kotlin.jvm.internal.g.d(r7, r2)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.lang.Object r10 = r1.get(r7)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            if (r10 == 0) goto L86
            r10.addAll(r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            r11 = r10
        L86:
            r1.put(r7, r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            goto L9c
        L8a:
            kotlin.jvm.internal.g.d(r7, r2)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.lang.Object r10 = r0.get(r7)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            if (r10 == 0) goto L99
            r10.addAll(r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
            r11 = r10
        L99:
            r0.put(r7, r11)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Laa
        L9c:
            int r9 = r9 + 1
            goto L40
        L9f:
            r1.remove(r7)     // Catch: java.lang.Throwable -> Laa
            r0.remove(r7)     // Catch: java.lang.Throwable -> Laa
        La5:
            int r5 = r5 + 1
            goto L1b
        La9:
            return
        Laa:
            r14 = move-exception
            k6.a.a(r13, r14)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.g.a(org.json.JSONArray):void");
    }

    public final boolean b(String str, Set<String> set) {
        if (k6.a.b(this) || set == null) {
            return false;
        }
        try {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            for (String str2 : set2) {
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = str.toLowerCase(locale);
                kotlin.jvm.internal.g.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (kotlin.jvm.internal.g.a(lowerCase, lowerCase2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }
}
