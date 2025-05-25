package f2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* compiled from: TransitionManager.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final f2.a f17063a = new f2.a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<y.b<ViewGroup, ArrayList<k>>>> f17064b = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, k kVar) {
        ArrayList<ViewGroup> arrayList = c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            if (f0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (kVar == null) {
                    kVar = f17063a;
                }
                k clone = kVar.clone();
                ArrayList<k> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<k> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().w(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.i(viewGroup, true);
                }
                if (((h) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static y.b<ViewGroup, ArrayList<k>> b() {
        y.b<ViewGroup, ArrayList<k>> bVar;
        ThreadLocal<WeakReference<y.b<ViewGroup, ArrayList<k>>>> threadLocal = f17064b;
        WeakReference<y.b<ViewGroup, ArrayList<k>>> weakReference = threadLocal.get();
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            return bVar;
        }
        y.b<ViewGroup, ArrayList<k>> bVar2 = new y.b<>();
        threadLocal.set(new WeakReference<>(bVar2));
        return bVar2;
    }

    /* compiled from: TransitionManager.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final k f17065a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f17066b;

        /* compiled from: TransitionManager.java */
        /* renamed from: f2.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0218a extends n {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ y.b f17067a;

            public C0218a(y.b bVar) {
                this.f17067a = bVar;
            }

            @Override // f2.k.d
            public final void c(k kVar) {
                ((ArrayList) this.f17067a.getOrDefault(a.this.f17066b, null)).remove(kVar);
                kVar.x(this);
            }
        }

        public a(ViewGroup viewGroup, k kVar) {
            this.f17065a = kVar;
            this.f17066b = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01e3 A[EDGE_INSN: B:142:0x01e3->B:89:0x01e3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x020b  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 701
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.o.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f17066b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            o.c.remove(viewGroup);
            ArrayList<k> orDefault = o.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<k> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().z(viewGroup);
                }
            }
            this.f17065a.j(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
