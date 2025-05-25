package yo;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;

/* compiled from: SignActionManager.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArraySet<InterfaceC0423c> f32208a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f32209b = new AtomicBoolean();
    public final LinkedBlockingDeque<Pair<SignActionInfo, SignActionInfo>> c = new LinkedBlockingDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingDeque<Pair<SignActionInfo, SignActionInfo>> f32210d = new LinkedBlockingDeque<>();

    /* compiled from: SignActionManager.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f32211a = new c();
    }

    /* compiled from: SignActionManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(SignActionInfo signActionInfo, SignActionInfo signActionInfo2);
    }

    /* compiled from: SignActionManager.java */
    /* renamed from: yo.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0423c {
        void S0(boolean z10, boolean z11);

        void b1(SignActionInfo signActionInfo, SignActionInfo signActionInfo2, yo.a aVar);

        void m0(SignActionInfo signActionInfo, SignActionInfo signActionInfo2, yo.b bVar);
    }

    public final void a(SignActionInfo signActionInfo, SignActionInfo signActionInfo2) {
        this.c.offer(new Pair<>(signActionInfo, signActionInfo2));
        this.f32210d.clear();
        b();
    }

    public final void b() {
        Iterator<InterfaceC0423c> it = this.f32208a.iterator();
        while (it.hasNext()) {
            InterfaceC0423c next = it.next();
            if (next != null) {
                next.S0(!this.c.isEmpty(), true ^ this.f32210d.isEmpty());
            }
        }
        this.f32209b.set(true);
    }
}
