package f6;

import android.view.View;
import com.facebook.internal.p;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONObject;

/* compiled from: ViewOnClickListener.kt */
/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public static final HashSet f17135e;

    /* renamed from: a  reason: collision with root package name */
    public final View.OnClickListener f17136a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<View> f17137b;
    public final WeakReference<View> c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17138d;

    /* compiled from: ViewOnClickListener.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final boolean a(java.lang.String r3, java.lang.String r4) {
            /*
                java.util.HashSet r0 = f6.f.f17135e
                f6.b r0 = f6.b.f17124a
                java.lang.Class<f6.b> r0 = f6.b.class
                boolean r1 = k6.a.b(r0)
                if (r1 == 0) goto Ld
                goto L20
            Ld:
                java.util.LinkedHashMap r1 = f6.b.f17125b     // Catch: java.lang.Throwable -> L1c
                boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L1c
                if (r2 == 0) goto L20
                java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1c
                goto L21
            L1c:
                r3 = move-exception
                k6.a.a(r0, r3)
            L20:
                r3 = 0
            L21:
                if (r3 != 0) goto L25
                r3 = 0
                goto L3d
            L25:
                java.lang.String r0 = "other"
                boolean r0 = kotlin.jvm.internal.g.a(r3, r0)
                r1 = 1
                if (r0 != 0) goto L3c
                com.facebook.appevents.t r0 = new com.facebook.appevents.t
                r0.<init>(r3, r4, r1)
                com.facebook.internal.p r3 = com.facebook.internal.p.f9815a
                java.util.concurrent.Executor r3 = com.facebook.d.c()     // Catch: java.lang.Exception -> L3c
                r3.execute(r0)     // Catch: java.lang.Exception -> L3c
            L3c:
                r3 = r1
            L3d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.f.a.a(java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(android.view.View r6, android.view.View r7, java.lang.String r8) {
            /*
                java.lang.String r0 = "hostView"
                kotlin.jvm.internal.g.e(r6, r0)
                int r0 = r6.hashCode()
                java.util.HashSet r1 = f6.f.f17135e
                java.lang.Class<f6.f> r1 = f6.f.class
                boolean r2 = k6.a.b(r1)
                r3 = 0
                if (r2 == 0) goto L16
            L14:
                r2 = r3
                goto L1e
            L16:
                java.util.HashSet r2 = f6.f.f17135e     // Catch: java.lang.Throwable -> L19
                goto L1e
            L19:
                r2 = move-exception
                k6.a.a(r1, r2)
                goto L14
            L1e:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L8e
                f6.f r2 = new f6.f
                r2.<init>(r6, r7, r8)
                java.lang.Class<w5.c> r7 = w5.c.class
                boolean r8 = k6.a.b(r7)
                if (r8 == 0) goto L36
                goto L79
            L36:
                java.lang.String r8 = "android.view.View"
                java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51 java.lang.Exception -> L79
                java.lang.String r4 = "mListenerInfo"
                java.lang.reflect.Field r8 = r8.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L51 java.lang.Exception -> L79
                java.lang.String r4 = "android.view.View$ListenerInfo"
                java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52 java.lang.Exception -> L79
                java.lang.String r5 = "mOnClickListener"
                java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L52 java.lang.Exception -> L79
                goto L53
            L4f:
                r6 = move-exception
                goto L76
            L51:
                r8 = r3
            L52:
                r4 = r3
            L53:
                if (r8 == 0) goto L72
                if (r4 != 0) goto L58
                goto L72
            L58:
                r5 = 1
                r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L79
                r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L79
                r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L4f java.lang.IllegalAccessException -> L67 java.lang.Exception -> L79
                java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L4f java.lang.IllegalAccessException -> L67 java.lang.Exception -> L79
                goto L68
            L67:
                r8 = r3
            L68:
                if (r8 != 0) goto L6e
                r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L79
                goto L79
            L6e:
                r4.set(r8, r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L79
                goto L79
            L72:
                r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L79
                goto L79
            L76:
                k6.a.a(r7, r6)
            L79:
                boolean r6 = k6.a.b(r1)
                if (r6 == 0) goto L80
                goto L87
            L80:
                java.util.HashSet r3 = f6.f.f17135e     // Catch: java.lang.Throwable -> L83
                goto L87
            L83:
                r6 = move-exception
                k6.a.a(r1, r6)
            L87:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r3.add(r6)
            L8e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.f.a.b(android.view.View, android.view.View, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void c(java.lang.String r7, java.lang.String r8, float[] r9) {
            /*
                f6.d r0 = f6.d.f17129a
                java.lang.Class<f6.d> r0 = f6.d.class
                boolean r1 = k6.a.b(r0)
                java.lang.String r2 = "event"
                r3 = 0
                if (r1 == 0) goto Le
                goto L1c
            Le:
                kotlin.jvm.internal.g.e(r7, r2)     // Catch: java.lang.Throwable -> L18
                java.util.LinkedHashSet r1 = f6.d.c     // Catch: java.lang.Throwable -> L18
                boolean r1 = r1.contains(r7)     // Catch: java.lang.Throwable -> L18
                goto L1d
            L18:
                r1 = move-exception
                k6.a.a(r0, r1)
            L1c:
                r1 = r3
            L1d:
                r4 = 0
                if (r1 == 0) goto L4d
                android.content.Context r9 = com.facebook.d.a()
                com.facebook.appevents.l r0 = new com.facebook.appevents.l
                r0.<init>(r9, r4)
                boolean r9 = k6.a.b(r0)
                if (r9 == 0) goto L31
                goto Lc6
            L31:
                android.os.Bundle r9 = new android.os.Bundle     // Catch: java.lang.Throwable -> L47
                r9.<init>()     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "_is_suggested_event"
                java.lang.String r2 = "1"
                r9.putString(r1, r2)     // Catch: java.lang.Throwable -> L47
                java.lang.String r1 = "_button_text"
                r9.putString(r1, r8)     // Catch: java.lang.Throwable -> L47
                r0.d(r9, r7)     // Catch: java.lang.Throwable -> L47
                goto Lc6
            L47:
                r7 = move-exception
                k6.a.a(r0, r7)
                goto Lc6
            L4d:
                boolean r1 = k6.a.b(r0)
                if (r1 == 0) goto L54
                goto L62
            L54:
                kotlin.jvm.internal.g.e(r7, r2)     // Catch: java.lang.Throwable -> L5e
                java.util.LinkedHashSet r1 = f6.d.f17131d     // Catch: java.lang.Throwable -> L5e
                boolean r0 = r1.contains(r7)     // Catch: java.lang.Throwable -> L5e
                goto L63
            L5e:
                r1 = move-exception
                k6.a.a(r0, r1)
            L62:
                r0 = r3
            L63:
                if (r0 == 0) goto Lc6
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "event_name"
                r0.putString(r1, r7)     // Catch: org.json.JSONException -> Lc6
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc6
                r7.<init>()     // Catch: org.json.JSONException -> Lc6
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> Lc6
                r1.<init>()     // Catch: org.json.JSONException -> Lc6
                int r2 = r9.length     // Catch: org.json.JSONException -> Lc6
                r5 = r3
            L7b:
                if (r5 >= r2) goto L8a
                r6 = r9[r5]     // Catch: org.json.JSONException -> Lc6
                r1.append(r6)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r6 = ","
                r1.append(r6)     // Catch: org.json.JSONException -> Lc6
                int r5 = r5 + 1
                goto L7b
            L8a:
                java.lang.String r9 = "dense"
                java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> Lc6
                r7.put(r9, r1)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r9 = "button_text"
                r7.put(r9, r8)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r8 = "metadata"
                java.lang.String r7 = r7.toString()     // Catch: org.json.JSONException -> Lc6
                r0.putString(r8, r7)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r7 = com.facebook.e.f9701j     // Catch: org.json.JSONException -> Lc6
                java.util.Locale r7 = java.util.Locale.US     // Catch: org.json.JSONException -> Lc6
                java.lang.String r8 = "%s/suggested_events"
                r9 = 1
                java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch: org.json.JSONException -> Lc6
                java.lang.String r2 = com.facebook.d.b()     // Catch: org.json.JSONException -> Lc6
                r1[r3] = r2     // Catch: org.json.JSONException -> Lc6
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r1, r9)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r7 = java.lang.String.format(r7, r8, r9)     // Catch: org.json.JSONException -> Lc6
                java.lang.String r8 = "format(locale, format, *args)"
                kotlin.jvm.internal.g.d(r7, r8)     // Catch: org.json.JSONException -> Lc6
                com.facebook.e r7 = com.facebook.e.c.h(r4, r7, r4, r4)     // Catch: org.json.JSONException -> Lc6
                r7.f9706d = r0     // Catch: org.json.JSONException -> Lc6
                r7.c()     // Catch: org.json.JSONException -> Lc6
            Lc6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f6.f.a.c(java.lang.String, java.lang.String, float[]):void");
        }
    }

    static {
        new a();
        f17135e = new HashSet();
    }

    public f(View view, View view2, String str) {
        this.f17136a = w5.c.f(view);
        this.f17137b = new WeakReference<>(view2);
        this.c = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        g.d(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f17138d = j.K(lowerCase, "activity", "");
    }

    public final void a() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            View view = this.f17137b.get();
            View view2 = this.c.get();
            if (view != null && view2 != null) {
                try {
                    String d10 = c.d(view2);
                    String b10 = b.b(view2, d10);
                    if (b10 == null || a.a(b10, d10)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", c.b(view, view2));
                    jSONObject.put("screenname", this.f17138d);
                    if (!k6.a.b(this)) {
                        try {
                            u4.a aVar = new u4.a(jSONObject, d10, this, b10);
                            p pVar = p.f9815a;
                            com.facebook.d.c().execute(aVar);
                        } catch (Throwable th2) {
                            k6.a.a(this, th2);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            k6.a.a(this, th3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            if (k6.a.b(this)) {
                return;
            }
            g.e(view, "view");
            View.OnClickListener onClickListener = this.f17136a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
