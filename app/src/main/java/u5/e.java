package u5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.fragment.app.a1;
import com.facebook.appevents.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import kotlin.text.k;

/* compiled from: MetadataViewObserver.kt */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f30226e;
    public final WeakReference<Activity> c;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f30227a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f30228b = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f30229d = new AtomicBoolean(false);

    /* compiled from: MetadataViewObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
            if (r4.equals("r5") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            if (r4.equals("r4") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
            r5 = new kotlin.text.Regex("[^a-z]+").replace(r5, "");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final void a(java.util.HashMap r3, java.lang.String r4, java.lang.String r5) {
            /*
                java.util.HashMap r0 = u5.e.f30226e
                int r0 = r4.hashCode()
                r1 = 0
                switch(r0) {
                    case 3585: goto L53;
                    case 3586: goto L3c;
                    case 3587: goto L33;
                    case 3588: goto Lc;
                    default: goto La;
                }
            La:
                goto L79
            Lc:
                java.lang.String r0 = "r6"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L15
                goto L79
            L15:
                java.lang.String r0 = "-"
                boolean r2 = kotlin.text.k.O(r5, r0, r1)
                if (r2 == 0) goto L79
                kotlin.text.Regex r2 = new kotlin.text.Regex
                r2.<init>(r0)
                java.util.List r5 = r2.split(r5, r1)
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r1]
                goto L79
            L33:
                java.lang.String r0 = "r5"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L45
                goto L79
            L3c:
                java.lang.String r0 = "r4"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L45
                goto L79
            L45:
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "[^a-z]+"
                r0.<init>(r1)
                java.lang.String r1 = ""
                java.lang.String r5 = r0.replace(r5, r1)
                goto L79
            L53:
                java.lang.String r0 = "r3"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L5c
                goto L79
            L5c:
                java.lang.String r0 = "m"
                boolean r2 = kotlin.text.j.M(r5, r0, r1)
                if (r2 != 0) goto L78
                java.lang.String r2 = "b"
                boolean r2 = kotlin.text.j.M(r5, r2, r1)
                if (r2 != 0) goto L78
                java.lang.String r2 = "ge"
                boolean r5 = kotlin.text.j.M(r5, r2, r1)
                if (r5 == 0) goto L75
                goto L78
            L75:
                java.lang.String r5 = "f"
                goto L79
            L78:
                r5 = r0
            L79:
                r3.put(r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.e.a.a(java.util.HashMap, java.lang.String, java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void b(android.app.Activity r4) {
            /*
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.g.e(r4, r0)
                int r0 = r4.hashCode()
                java.lang.Class<u5.e> r1 = u5.e.class
                boolean r2 = k6.a.b(r1)
                if (r2 == 0) goto L12
                goto L19
            L12:
                java.util.HashMap r2 = u5.e.f30226e     // Catch: java.lang.Throwable -> L15
                goto L1a
            L15:
                r2 = move-exception
                k6.a.a(r1, r2)
            L19:
                r2 = 0
            L1a:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r2.get(r0)
                if (r3 != 0) goto L2c
                u5.e r3 = new u5.e
                r3.<init>(r4)
                r2.put(r0, r3)
            L2c:
                u5.e r3 = (u5.e) r3
                boolean r4 = k6.a.b(r1)
                if (r4 == 0) goto L35
                goto L6c
            L35:
                boolean r4 = k6.a.b(r3)     // Catch: java.lang.Throwable -> L68
                if (r4 == 0) goto L3c
                goto L6c
            L3c:
                java.util.concurrent.atomic.AtomicBoolean r4 = r3.f30229d     // Catch: java.lang.Throwable -> L63
                r0 = 1
                boolean r4 = r4.getAndSet(r0)     // Catch: java.lang.Throwable -> L63
                if (r4 == 0) goto L46
                goto L6c
            L46:
                java.lang.ref.WeakReference<android.app.Activity> r4 = r3.c     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L63
                android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L63
                android.view.View r4 = c6.f.b(r4)     // Catch: java.lang.Throwable -> L63
                if (r4 != 0) goto L55
                goto L6c
            L55:
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch: java.lang.Throwable -> L63
                boolean r0 = r4.isAlive()     // Catch: java.lang.Throwable -> L63
                if (r0 == 0) goto L6c
                r4.addOnGlobalFocusChangeListener(r3)     // Catch: java.lang.Throwable -> L63
                goto L6c
            L63:
                r4 = move-exception
                k6.a.a(r3, r4)     // Catch: java.lang.Throwable -> L68
                goto L6c
            L68:
                r4 = move-exception
                k6.a.a(r1, r4)
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.e.a.b(android.app.Activity):void");
        }
    }

    static {
        new a();
        f30226e = new HashMap();
    }

    public e(Activity activity) {
        this.c = new WeakReference<>(activity);
    }

    public final void a(View view) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            a1 a1Var = new a1(1, view, this);
            if (!k6.a.b(this)) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    a1Var.run();
                } else {
                    this.f30228b.post(a1Var);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void b(View view) {
        boolean z10;
        String text;
        String str;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z12;
        if (k6.a.b(this)) {
            return;
        }
        try {
            String lowerCase = k.n0(((EditText) view).getText().toString()).toString().toLowerCase();
            g.d(lowerCase, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                LinkedHashSet linkedHashSet = this.f30227a;
                if (!linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                    linkedHashSet.add(lowerCase);
                    HashMap hashMap = new HashMap();
                    ArrayList b10 = c.b(view);
                    CopyOnWriteArraySet copyOnWriteArraySet = d.f30223d;
                    Iterator it = new HashSet(d.a()).iterator();
                    ArrayList arrayList3 = null;
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (g.a("r2", dVar.b())) {
                            text = new Regex("[^\\d.]").replace(lowerCase, "");
                        } else {
                            text = lowerCase;
                        }
                        boolean b11 = k6.a.b(dVar);
                        String rule = dVar.f30225b;
                        if (b11) {
                            str = null;
                        } else {
                            str = rule;
                        }
                        if (str.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            if (k6.a.b(dVar)) {
                                rule = null;
                            }
                            if (!k6.a.b(c.class)) {
                                g.e(text, "text");
                                g.e(rule, "rule");
                                z12 = new Regex(rule).matches(text);
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                            }
                        }
                        boolean b12 = k6.a.b(dVar);
                        List<String> list = dVar.c;
                        if (b12) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(list);
                        }
                        if (c.d(b10, arrayList)) {
                            a.a(hashMap, dVar.b(), text);
                        } else {
                            if (arrayList3 == null) {
                                arrayList3 = c.a(view);
                            }
                            if (k6.a.b(dVar)) {
                                arrayList2 = null;
                            } else {
                                arrayList2 = new ArrayList(list);
                            }
                            if (c.d(arrayList3, arrayList2)) {
                                a.a(hashMap, dVar.b(), text);
                            }
                        }
                    }
                    q.a.a(hashMap);
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (k6.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                k6.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
