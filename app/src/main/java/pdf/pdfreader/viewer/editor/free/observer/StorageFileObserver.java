package pdf.pdfreader.viewer.editor.free.observer;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.w;
import com.facebook.appevents.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import qb.b1;
import tf.c;
import tf.d;
import zn.b;

/* compiled from: StorageFileObserver.kt */
/* loaded from: classes3.dex */
public final class StorageFileObserver {

    /* renamed from: a  reason: collision with root package name */
    public static pdf.pdfreader.viewer.editor.free.observer.a f25899a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f25900b = kotlin.a.a(new cg.a<ExecutorService>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$observerThreadPool$2
        @Override // cg.a
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    });
    public static final c c = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public static final c f25901d = kotlin.a.a(new cg.a<HashMap<String, Long>>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$cacheMap$2
        @Override // cg.a
        public final HashMap<String, Long> invoke() {
            return new HashMap<>();
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public static long f25902e;

    /* renamed from: f  reason: collision with root package name */
    public static final w<Boolean> f25903f;

    /* renamed from: g  reason: collision with root package name */
    public static final w f25904g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f25905h;

    /* renamed from: i  reason: collision with root package name */
    public static final c f25906i;

    /* renamed from: j  reason: collision with root package name */
    public static final Object f25907j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f25908k;

    /* compiled from: StorageFileObserver.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f25909a;

        public a(Context context) {
            this.f25909a = context;
        }

        @Override // zn.b
        public final void a(int i10, String str) {
            if (str != null && !k.O(str, ea.a.p("YXBUbh1pWWc=", "FEulr8kY"), false)) {
                if (i10 == 128 || i10 == 256) {
                    synchronized (StorageFileObserver.f25907j) {
                        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
                        if (!((HashSet) StorageFileObserver.f25906i.getValue()).contains(str) && aj.b.H(str)) {
                            c cVar = StorageFileObserver.f25908k;
                            Locale locale = Locale.ROOT;
                            g.d(locale, ea.a.p("YU8EVA==", "bTRG95UT"));
                            String lowerCase = str.toLowerCase(locale);
                            g.d(lowerCase, ea.a.p("O2gLcxNhRCAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWU9QwNzVihbbythCmUp", "jnOb37F1"));
                            if (((HashSet) cVar.getValue()).contains(lowerCase)) {
                                ea.a.p("HU9-VA==", "piLmlwGD");
                                String lowerCase2 = str.toLowerCase(locale);
                                g.d(lowerCase2, ea.a.p("B2gMc3hhBCAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWUBQwRzPSgbbythCmUp", "H1seXwbN"));
                                ((HashSet) cVar.getValue()).remove(lowerCase2);
                                return;
                            }
                            d dVar = d.f30009a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (StorageFileObserver.a().isEmpty()) {
                                StorageFileObserver.f25902e = elapsedRealtime;
                            }
                            if (StorageFileObserver.a().size() > 100) {
                                long j10 = (StorageFileObserver.f25902e + elapsedRealtime) / 2;
                                Iterator it = StorageFileObserver.a().entrySet().iterator();
                                while (it.hasNext()) {
                                    if (((Number) ((Map.Entry) it.next()).getValue()).longValue() < j10) {
                                        it.remove();
                                    }
                                }
                                StorageFileObserver.f25902e = elapsedRealtime;
                            }
                            pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
                            Long l10 = (Long) StorageFileObserver.a().get(str);
                            if (l10 != null && elapsedRealtime - l10.longValue() < 3000) {
                                return;
                            }
                            StorageFileObserver.a().put(str, Long.valueOf(elapsedRealtime));
                            Context context = this.f25909a;
                            g.d(context, ea.a.p("UnA7bBpjA3Qbb1pDBm4iZTx0", "qrPU00Kg"));
                            StorageFileObserver.c(context, str, false);
                        }
                    }
                }
            }
        }
    }

    static {
        w<Boolean> wVar = new w<>();
        f25903f = wVar;
        f25904g = wVar;
        f25905h = kotlin.a.a(new cg.a<List<zn.a>>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$fileObserverListeners$2
            @Override // cg.a
            public final List<zn.a> invoke() {
                return new ArrayList();
            }
        });
        f25906i = kotlin.a.a(new cg.a<HashSet<String>>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$recentRenamePath$2
            @Override // cg.a
            public final HashSet<String> invoke() {
                return new HashSet<>();
            }
        });
        f25907j = new Object();
        f25908k = kotlin.a.a(new cg.a<HashSet<String>>() { // from class: pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver$skipPath$2
            @Override // cg.a
            public final HashSet<String> invoke() {
                return new HashSet<>();
            }
        });
    }

    public static final HashMap a() {
        return (HashMap) f25901d.getValue();
    }

    public static void b(String str) {
        boolean z10;
        synchronized (f25907j) {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Locale locale = Locale.ROOT;
                g.d(locale, ea.a.p("EE8nVA==", "y3BhfHjO"));
                String lowerCase = str.toLowerCase(locale);
                g.d(lowerCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnQC5GbwJvOmU9Q1BzHChbbzlhJmUp", "hO4Oi2NM"));
                ((HashSet) f25908k.getValue()).add(lowerCase);
            }
            d dVar = d.f30009a;
        }
    }

    public static void c(Context context, String path, boolean z10) {
        g.e(path, "path");
        ((ExecutorService) f25900b.getValue()).execute(new b1(context.getApplicationContext(), 3, path, z10));
    }

    public static void d(String path) {
        g.e(path, "path");
        synchronized (f25907j) {
            ((HashSet) f25906i.getValue()).remove(path);
        }
    }

    public static final void e(Context context) {
        g.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        g.d(applicationContext, ea.a.p("L3A8bApjU3QhbwhDW24jZUB0", "MENLc2Nq"));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.f(applicationContext) && f25899a == null) {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            g.d(absolutePath, ea.a.p("VGU_RQt0B3IcYVhTHW8kYSNldmk0ZSB0FnIrKGouDGJAbyd1B2UyYQZo", "yRCmSZpG"));
            f25899a = new pdf.pdfreader.viewer.editor.free.observer.a(absolutePath, new a(applicationContext));
            ((ExecutorService) f25900b.getValue()).execute(new e(3));
        }
    }
}
