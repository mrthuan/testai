package vl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.TreeMap;

/* compiled from: BrowseMediaLibraryThread.java */
/* loaded from: classes3.dex */
public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f30845a;

    /* renamed from: b  reason: collision with root package name */
    public final c f30846b;
    public final a c;

    /* compiled from: BrowseMediaLibraryThread.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(TreeMap<String, List<ul.b>> treeMap);

        void b(int i10);

        void c();
    }

    static {
        ea.a.p("MXJZd0RlOmUsaQdMXWIlYUp5Bmg7ZVdk", "yps67w4f");
    }

    public b(Context context, d dVar, e eVar) {
        new WeakReference(context);
        this.c = eVar;
        this.f30846b = dVar;
        this.f30845a = new Handler(Looper.myLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02cf, code lost:
        if (r6 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02d1, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d6, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02b5, code lost:
        if (r6 != null) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0357 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.b.run():void");
    }
}
