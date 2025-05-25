package pdf.pdfreader.viewer.editor.free.thumb;

import android.widget.ImageView;
import b1.e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.a;
import kotlin.jvm.internal.g;
import lo.b;
import tf.c;

/* compiled from: ThumbLoadCenter.kt */
/* loaded from: classes3.dex */
public final class ThumbLoadCenter {

    /* renamed from: e  reason: collision with root package name */
    public static final c<ThreadPoolExecutor> f26575e = a.a(new cg.a<ThreadPoolExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter$Companion$loadPageThread$2
        @Override // cg.a
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
        }
    });

    /* renamed from: a  reason: collision with root package name */
    public b f26576a;

    /* renamed from: b  reason: collision with root package name */
    public final c f26577b = a.a(new cg.a<LinkedBlockingQueue<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter$loadTask$2
        @Override // cg.a
        public final LinkedBlockingQueue<Integer> invoke() {
            return new LinkedBlockingQueue<>();
        }
    });
    public final c c = a.a(new cg.a<ConcurrentHashMap<Integer, lo.a>>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter$loadParamsCacheMap$2
        @Override // cg.a
        public final ConcurrentHashMap<Integer, lo.a> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public final c f26578d = a.a(new cg.a<AtomicBoolean>() { // from class: pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter$isFinish$2
        @Override // cg.a
        public final AtomicBoolean invoke() {
            return new AtomicBoolean(true);
        }
    });

    public final ConcurrentHashMap<Integer, lo.a> a() {
        return (ConcurrentHashMap) this.c.getValue();
    }

    public final AtomicBoolean b() {
        return (AtomicBoolean) this.f26578d.getValue();
    }

    public final void c(int i10, int i11, int i12, ImageView imageView, lo.c callback, boolean z10) {
        g.e(callback, "callback");
        if (b().get() || a().get(Integer.valueOf(i10)) != null) {
            return;
        }
        lo.a aVar = new lo.a(i10, i11, i12, imageView, callback, z10);
        boolean isEmpty = a().isEmpty();
        a().put(Integer.valueOf(i10), aVar);
        ((LinkedBlockingQueue) this.f26577b.getValue()).offer(Integer.valueOf(i10));
        if (isEmpty) {
            f26575e.getValue().execute(new e(this, 25));
        }
    }

    public final void d() {
        Integer num;
        if (!b().get() && (num = (Integer) ((LinkedBlockingQueue) this.f26577b.getValue()).poll()) != null) {
            lo.a aVar = a().get(num);
            if (aVar != null) {
                f26575e.getValue().execute(new com.facebook.appevents.g(19, this, aVar));
            } else {
                d();
            }
        }
    }

    public final void e(b bVar) {
        b().set(false);
        this.f26576a = bVar;
    }

    public final void f() {
        b().set(true);
        a().clear();
        ((LinkedBlockingQueue) this.f26577b.getValue()).clear();
    }
}
