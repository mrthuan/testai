package v5;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.text.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.a;
import v5.d;

/* compiled from: CodelessMatcher.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30658f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static c f30659g;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30660a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final Set<Activity> f30661b;
    public final LinkedHashSet c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<String> f30662d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, HashSet<String>> f30663e;

    /* compiled from: CodelessMatcher.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static Bundle b(EventBinding eventBinding, View view, View view2) {
            ArrayList a10;
            boolean z10;
            boolean z11;
            Bundle bundle = new Bundle();
            if (eventBinding == null) {
                return bundle;
            }
            List<w5.a> unmodifiableList = Collections.unmodifiableList(eventBinding.c);
            kotlin.jvm.internal.g.d(unmodifiableList, "unmodifiableList(parameters)");
            for (w5.a aVar : unmodifiableList) {
                String str = aVar.f30974b;
                String str2 = aVar.f30973a;
                if (str != null) {
                    if (str.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        bundle.putString(str2, aVar.f30974b);
                    }
                }
                ArrayList arrayList = aVar.c;
                if (arrayList.size() > 0) {
                    if (kotlin.jvm.internal.g.a(aVar.f30975d, "relative")) {
                        a10 = ViewTreeObserver$OnGlobalLayoutListenerC0386c.a.a(view2, arrayList, 0, -1, view2.getClass().getSimpleName());
                    } else {
                        a10 = ViewTreeObserver$OnGlobalLayoutListenerC0386c.a.a(view, arrayList, 0, -1, view.getClass().getSimpleName());
                    }
                    Iterator it = a10.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            b bVar = (b) it.next();
                            if (bVar.a() != null) {
                                String j10 = w5.c.j(bVar.a());
                                if (j10.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    bundle.putString(str2, j10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        public final synchronized c a() {
            c cVar;
            c cVar2;
            try {
                cVar = null;
                if (k6.a.b(c.class)) {
                    cVar2 = null;
                } else {
                    cVar2 = c.f30659g;
                }
                if (cVar2 == null) {
                    c cVar3 = new c();
                    if (!k6.a.b(c.class)) {
                        c.f30659g = cVar3;
                    }
                }
                if (!k6.a.b(c.class)) {
                    cVar = c.f30659g;
                }
                kotlin.jvm.internal.g.c(cVar, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                throw th2;
            }
            return cVar;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f30664a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30665b;

        public b(View view, String viewMapKey) {
            kotlin.jvm.internal.g.e(view, "view");
            kotlin.jvm.internal.g.e(viewMapKey, "viewMapKey");
            this.f30664a = new WeakReference<>(view);
            this.f30665b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f30664a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    /* compiled from: CodelessMatcher.kt */
    /* renamed from: v5.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC0386c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<View> f30666a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f30667b;
        public final HashSet<String> c;

        /* renamed from: d  reason: collision with root package name */
        public final String f30668d;

        /* compiled from: CodelessMatcher.kt */
        /* renamed from: v5.c$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
                if (kotlin.jvm.internal.g.a(r8.getClass().getSimpleName(), (java.lang.String) r11.get(r11.size() - 1)) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
                if (r1.c != r8.getId()) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x010a, code lost:
                if (kotlin.jvm.internal.g.a(r6, r5) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
                if (kotlin.jvm.internal.g.a(r7, r6) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0161, code lost:
                if (kotlin.jvm.internal.g.a(r7, r6) == false) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
                if (kotlin.jvm.internal.g.a(r1, r11) == false) goto L31;
             */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0197 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.util.ArrayList a(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
                /*
                    Method dump skipped, instructions count: 458
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: v5.c.ViewTreeObserver$OnGlobalLayoutListenerC0386c.a.a(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
            }

            public static ArrayList b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC0386c(View view, Handler handler, HashSet<String> listenerSet, String str) {
            kotlin.jvm.internal.g.e(handler, "handler");
            kotlin.jvm.internal.g.e(listenerSet, "listenerSet");
            this.f30666a = new WeakReference<>(view);
            this.c = listenerSet;
            this.f30668d = str;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            a.View$OnClickListenerC0385a view$OnClickListenerC0385a;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            View.OnClickListener f10 = w5.c.f(a10);
            if (f10 instanceof a.View$OnClickListenerC0385a) {
                kotlin.jvm.internal.g.c(f10, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                if (((a.View$OnClickListenerC0385a) f10).f30646e) {
                    z10 = true;
                    hashSet = this.c;
                    str = bVar.f30665b;
                    if (hashSet.contains(str) && !z10) {
                        v5.a aVar = v5.a.f30642a;
                        if (!k6.a.b(v5.a.class)) {
                            try {
                                view$OnClickListenerC0385a = new a.View$OnClickListenerC0385a(eventBinding, view, a10);
                            } catch (Throwable th2) {
                                k6.a.a(v5.a.class, th2);
                            }
                            a10.setOnClickListener(view$OnClickListenerC0385a);
                            hashSet.add(str);
                            return;
                        }
                        view$OnClickListenerC0385a = null;
                        a10.setOnClickListener(view$OnClickListenerC0385a);
                        hashSet.add(str);
                        return;
                    }
                }
            }
            z10 = false;
            hashSet = this.c;
            str = bVar.f30665b;
            if (hashSet.contains(str)) {
            }
        }

        public final void b(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            a.b bVar2;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof a.b) {
                kotlin.jvm.internal.g.c(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                if (((a.b) onItemClickListener).f30650e) {
                    z10 = true;
                    hashSet = this.c;
                    str = bVar.f30665b;
                    if (hashSet.contains(str) && !z10) {
                        v5.a aVar = v5.a.f30642a;
                        if (!k6.a.b(v5.a.class)) {
                            try {
                                bVar2 = new a.b(eventBinding, view, adapterView);
                            } catch (Throwable th2) {
                                k6.a.a(v5.a.class, th2);
                            }
                            adapterView.setOnItemClickListener(bVar2);
                            hashSet.add(str);
                            return;
                        }
                        bVar2 = null;
                        adapterView.setOnItemClickListener(bVar2);
                        hashSet.add(str);
                        return;
                    }
                }
            }
            z10 = false;
            hashSet = this.c;
            str = bVar.f30665b;
            if (hashSet.contains(str)) {
            }
        }

        public final void c(b bVar, View view, EventBinding eventBinding) {
            boolean z10;
            HashSet<String> hashSet;
            String str;
            d.a aVar;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            View.OnTouchListener g10 = w5.c.g(a10);
            if (g10 instanceof d.a) {
                kotlin.jvm.internal.g.c(g10, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                if (((d.a) g10).f30673e) {
                    z10 = true;
                    hashSet = this.c;
                    str = bVar.f30665b;
                    if (hashSet.contains(str) && !z10) {
                        int i10 = d.f30669a;
                        if (!k6.a.b(d.class)) {
                            try {
                                aVar = new d.a(eventBinding, view, a10);
                            } catch (Throwable th2) {
                                k6.a.a(d.class, th2);
                            }
                            a10.setOnTouchListener(aVar);
                            hashSet.add(str);
                            return;
                        }
                        aVar = null;
                        a10.setOnTouchListener(aVar);
                        hashSet.add(str);
                        return;
                    }
                }
            }
            z10 = false;
            hashSet = this.c;
            str = bVar.f30665b;
            if (hashSet.contains(str)) {
            }
        }

        public final void d() {
            boolean z10;
            ArrayList arrayList = this.f30667b;
            if (arrayList != null) {
                WeakReference<View> weakReference = this.f30666a;
                if (weakReference.get() != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        EventBinding eventBinding = (EventBinding) arrayList.get(i10);
                        View view = weakReference.get();
                        if (eventBinding != null && view != null) {
                            String str = eventBinding.f9505d;
                            if (str != null && str.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            String str2 = this.f30668d;
                            if (z10 || kotlin.jvm.internal.g.a(str, str2)) {
                                List unmodifiableList = Collections.unmodifiableList(eventBinding.f9504b);
                                kotlin.jvm.internal.g.d(unmodifiableList, "unmodifiableList(path)");
                                if (unmodifiableList.size() <= 25) {
                                    Iterator it = a.a(view, unmodifiableList, 0, -1, str2).iterator();
                                    while (it.hasNext()) {
                                        b bVar = (b) it.next();
                                        try {
                                            View a10 = bVar.a();
                                            if (a10 != null) {
                                                View a11 = w5.c.a(a10);
                                                if (a11 != null && w5.c.f30977a.m(a10, a11)) {
                                                    c(bVar, view, eventBinding);
                                                } else if (!j.M(a10.getClass().getName(), "com.facebook.react", false)) {
                                                    if (!(a10 instanceof AdapterView)) {
                                                        a(bVar, view, eventBinding);
                                                    } else if (a10 instanceof ListView) {
                                                        b(bVar, view, eventBinding);
                                                    }
                                                }
                                            }
                                        } catch (Exception unused) {
                                            k6.a.b(c.class);
                                            p pVar = p.f9815a;
                                            com.facebook.d dVar = com.facebook.d.f9685a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            d();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            d();
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.internal.f b10;
            if (k6.a.b(this)) {
                return;
            }
            try {
                if (!k6.a.b(this) && (b10 = FetchedAppSettingsManager.b(com.facebook.d.b())) != null && b10.f9770f) {
                    JSONArray jSONArray = b10.f9771g;
                    ArrayList arrayList = new ArrayList();
                    if (jSONArray != null) {
                        try {
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                kotlin.jvm.internal.g.d(jSONObject, "array.getJSONObject(i)");
                                arrayList.add(EventBinding.a.a(jSONObject));
                            }
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    }
                    this.f30667b = arrayList;
                    View view = this.f30666a.get();
                    if (view == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    d();
                }
            } catch (Throwable th2) {
                k6.a.a(this, th2);
            }
        }
    }

    public c() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        kotlin.jvm.internal.g.d(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f30661b = newSetFromMap;
        this.c = new LinkedHashSet();
        this.f30662d = new HashSet<>();
        this.f30663e = new HashMap<>();
    }

    public final void a(Activity activity) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(activity, "activity");
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f30661b.add(activity);
                this.f30662d.clear();
                HashSet<String> hashSet = this.f30663e.get(Integer.valueOf(activity.hashCode()));
                if (hashSet != null) {
                    this.f30662d = hashSet;
                }
                if (!k6.a.b(this)) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        b();
                        return;
                    } else {
                        this.f30660a.post(new androidx.activity.b(this, 6));
                        return;
                    }
                }
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void b() {
        if (k6.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f30661b) {
                if (activity != null) {
                    this.c.add(new ViewTreeObserver$OnGlobalLayoutListenerC0386c(c6.f.b(activity), this.f30660a, this.f30662d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(activity, "activity");
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f30661b.remove(activity);
                this.c.clear();
                HashMap<Integer, HashSet<String>> hashMap = this.f30663e;
                Integer valueOf = Integer.valueOf(activity.hashCode());
                Object clone = this.f30662d.clone();
                kotlin.jvm.internal.g.c(clone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                hashMap.put(valueOf, (HashSet) clone);
                this.f30662d.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
