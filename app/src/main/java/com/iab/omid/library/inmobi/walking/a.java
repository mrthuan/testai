package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f14019a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0185a> f14020b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f14021d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f14022e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f14023f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f14024g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f14025h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f14026i;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0185a {

        /* renamed from: a  reason: collision with root package name */
        private final e f14027a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f14028b = new ArrayList<>();

        public C0185a(e eVar, String str) {
            this.f14027a = eVar;
            a(str);
        }

        public e a() {
            return this.f14027a;
        }

        public ArrayList<String> b() {
            return this.f14028b;
        }

        public void a(String str) {
            this.f14028b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f14025h.remove(view);
            return Boolean.FALSE;
        } else if (this.f14025h.containsKey(view)) {
            return this.f14025h.get(view);
        } else {
            Map<View, Boolean> map = this.f14025h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.c.get(str);
    }

    public C0185a c(View view) {
        C0185a c0185a = this.f14020b.get(view);
        if (c0185a != null) {
            this.f14020b.remove(view);
        }
        return c0185a;
    }

    public String d(View view) {
        if (this.f14019a.size() == 0) {
            return null;
        }
        String str = this.f14019a.get(view);
        if (str != null) {
            this.f14019a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f14021d.contains(view) ? c.PARENT_VIEW : this.f14026i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (this.f14025h.containsKey(view)) {
            this.f14025h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    private String a(View view) {
        if (view.isAttachedToWindow()) {
            if (b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String a10 = h.a(view);
                if (a10 != null) {
                    return a10;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f14021d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    public String b(String str) {
        return this.f14024g.get(str);
    }

    public HashSet<String> c() {
        return this.f14022e;
    }

    public void d() {
        this.f14026i = true;
    }

    public void e() {
        com.iab.omid.library.inmobi.internal.c c = com.iab.omid.library.inmobi.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : c.a()) {
                View c10 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c10 != null) {
                        String a10 = a(c10);
                        if (a10 == null) {
                            this.f14022e.add(adSessionId);
                            this.f14019a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f14023f.add(adSessionId);
                            this.c.put(adSessionId, c10);
                            this.f14024g.put(adSessionId, a10);
                        }
                    } else {
                        this.f14023f.add(adSessionId);
                        this.f14024g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f14019a.clear();
        this.f14020b.clear();
        this.c.clear();
        this.f14021d.clear();
        this.f14022e.clear();
        this.f14023f.clear();
        this.f14024g.clear();
        this.f14026i = false;
    }

    public HashSet<String> b() {
        return this.f14023f;
    }

    private void a(com.iab.omid.library.inmobi.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.inmobi.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0185a c0185a = this.f14020b.get(view);
        if (c0185a != null) {
            c0185a.a(aVar.getAdSessionId());
        } else {
            this.f14020b.put(view, new C0185a(eVar, aVar.getAdSessionId()));
        }
    }
}
