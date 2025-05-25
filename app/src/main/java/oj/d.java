package oj;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.i;
import nj.a;
import oj.a;

/* compiled from: ReflowHelper.java */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPDFCore f23104b;
    public final /* synthetic */ c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f23105d;

    /* compiled from: ReflowHelper.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f23105d.getClass();
            e.a(null, dVar.c);
        }
    }

    /* compiled from: ReflowHelper.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f23107a;

        public b(int[] iArr) {
            this.f23107a = iArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            dVar.f23105d.getClass();
            e.a(this.f23107a, dVar.c);
        }
    }

    public d(e eVar, int i10, ReaderPDFCore readerPDFCore, c cVar) {
        this.f23105d = eVar;
        this.f23103a = i10;
        this.f23104b = readerPDFCore;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f23103a;
        ReaderPDFCore readerPDFCore = this.f23104b;
        e eVar = this.f23105d;
        eVar.getClass();
        Context context = a.C0300a.f22499a.f22497a;
        int i11 = context.getResources().getDisplayMetrics().widthPixels;
        int i12 = context.getResources().getDisplayMetrics().heightPixels;
        int i13 = context.getResources().getDisplayMetrics().densityDpi;
        i.a.f21508a.getClass();
        ReaderPDFCore.c cacheReflow = readerPDFCore.cacheReflow(i10, i11, i12, i13, i.f21501e[1], i.f21504h[1], null);
        Handler handler = eVar.f23111b;
        if (cacheReflow == null) {
            handler.post(new a());
            return;
        }
        ConcurrentHashMap<Integer, ReaderPDFCore.c> concurrentHashMap = eVar.c;
        int i14 = this.f23103a;
        concurrentHashMap.put(Integer.valueOf(i14), cacheReflow);
        int[] c = cacheReflow.c();
        if (c != null && c.length == 3) {
            a.C0318a.f23099a.f23098a.put(Integer.valueOf(i14), Integer.valueOf(c[2]));
        }
        handler.post(new b(c));
    }
}
