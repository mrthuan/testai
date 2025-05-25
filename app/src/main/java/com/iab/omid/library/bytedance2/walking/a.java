package com.iab.omid.library.bytedance2.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<View, String> f13908a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<View, C0181a> f13909b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<View> f13910d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<String> f13911e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private final HashSet<String> f13912f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    private final HashMap<String, String> f13913g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private final Map<View, Boolean> f13914h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private boolean f13915i;

    /* renamed from: com.iab.omid.library.bytedance2.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0181a {

        /* renamed from: a  reason: collision with root package name */
        private final e f13916a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<String> f13917b = new ArrayList<>();

        public C0181a(e eVar, String str) {
            this.f13916a = eVar;
            a(str);
        }

        public e a() {
            return this.f13916a;
        }

        public ArrayList<String> b() {
            return this.f13917b;
        }

        public void a(String str) {
            this.f13917b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.f13914h.remove(view);
            return Boolean.FALSE;
        } else if (this.f13914h.containsKey(view)) {
            return this.f13914h.get(view);
        } else {
            Map<View, Boolean> map = this.f13914h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.c.get(str);
    }

    public C0181a c(View view) {
        C0181a c0181a = this.f13909b.get(view);
        if (c0181a != null) {
            this.f13909b.remove(view);
        }
        return c0181a;
    }

    public String d(View view) {
        if (this.f13908a.size() == 0) {
            return null;
        }
        String str = this.f13908a.get(view);
        if (str != null) {
            this.f13908a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.f13910d.contains(view) ? c.PARENT_VIEW : this.f13915i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (this.f13914h.containsKey(view)) {
            this.f13914h.put(view, Boolean.TRUE);
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
            this.f13910d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    public String b(String str) {
        return this.f13913g.get(str);
    }

    public HashSet<String> c() {
        return this.f13911e;
    }

    public void d() {
        this.f13915i = true;
    }

    public void e() {
        com.iab.omid.library.bytedance2.internal.c c = com.iab.omid.library.bytedance2.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.bytedance2.adsession.a aVar : c.a()) {
                View c10 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c10 != null) {
                        String a10 = a(c10);
                        if (a10 == null) {
                            this.f13911e.add(adSessionId);
                            this.f13908a.put(c10, adSessionId);
                            a(aVar);
                        } else if (a10 != "noWindowFocus") {
                            this.f13912f.add(adSessionId);
                            this.c.put(adSessionId, c10);
                            this.f13913g.put(adSessionId, a10);
                        }
                    } else {
                        this.f13912f.add(adSessionId);
                        this.f13913g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.f13908a.clear();
        this.f13909b.clear();
        this.c.clear();
        this.f13910d.clear();
        this.f13911e.clear();
        this.f13912f.clear();
        this.f13913g.clear();
        this.f13915i = false;
    }

    public HashSet<String> b() {
        return this.f13912f;
    }

    private void a(com.iab.omid.library.bytedance2.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.bytedance2.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0181a c0181a = this.f13909b.get(view);
        if (c0181a != null) {
            c0181a.a(aVar.getAdSessionId());
        } else {
            this.f13909b.put(view, new C0181a(eVar, aVar.getAdSessionId()));
        }
    }
}
