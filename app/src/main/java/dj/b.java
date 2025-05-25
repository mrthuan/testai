package dj;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import com.android.billingclient.api.a0;
import gj.h;
import gj.j;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lib.zj.office.system.beans.pagelist.APageListAdapter;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.system.i;
import lib.zj.office.system.r;
import lib.zj.office.wp.control.PrintWord;
import lib.zj.office.wp.control.Word;
import rh.k;

/* compiled from: WPControl.java */
/* loaded from: classes3.dex */
public final class b extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16218a;

    /* renamed from: b  reason: collision with root package name */
    public final lib.zj.office.system.f f16219b;
    public final Word c;

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f16220a;

        public a(Object obj) {
            this.f16220a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                boolean z10 = k.a.f29581a.f29580b;
                Object obj = this.f16220a;
                if (z10) {
                    if (((Boolean) obj).booleanValue()) {
                        Word.i iVar = bVar.c.E;
                        if (iVar != null) {
                            iVar.r0();
                        }
                    } else {
                        Word word = bVar.c;
                        Word.i iVar2 = word.E;
                        if (iVar2 != null) {
                            iVar2.F0();
                        }
                        h hVar = word.f21110r;
                        if (hVar != null) {
                            word.O = true;
                            word.f21099g = hVar.f482e;
                            ai.e eVar = hVar.f17835p;
                            if (eVar != null) {
                                eVar.dispose();
                                hVar.f17835p = null;
                            }
                            word.postInvalidate();
                        }
                    }
                }
                bVar.f16219b.s().l0(((Boolean) obj).booleanValue());
            }
        }
    }

    /* compiled from: WPControl.java */
    /* renamed from: dj.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0197b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f16222a;

        public RunnableC0197b(Object obj) {
            this.f16222a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                bVar.f16219b.s().n0((List) this.f16222a);
            }
        }
    }

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f16224a;

        public c(Object obj) {
            this.f16224a = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                bVar.f16219b.s().n0((List) this.f16224a);
            }
        }
    }

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                bVar.s().i();
            }
        }
    }

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                bVar.f16219b.s().l0(false);
            }
        }
    }

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.s().K();
        }
    }

    /* compiled from: WPControl.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (!bVar.f16218a) {
                bVar.s().N();
            }
        }
    }

    public b(lib.zj.office.system.f fVar, zh.g gVar) {
        this.f16219b = fVar;
        this.c = new Word(fVar.s().m(), gVar, this);
    }

    @Override // lib.zj.office.system.f
    public final void dispose() {
        APageListView aPageListView;
        this.f16218a = true;
        Word word = this.c;
        dj.a aVar = word.f21105m;
        xh.b bVar = word.f21106n;
        if (bVar != null) {
            bVar.f31654a.clear();
            bVar.f31655b = -1;
        }
        dj.c cVar = word.f21107o;
        if (cVar != null) {
            cVar.c();
        }
        j jVar = word.f21109q;
        if (jVar != null) {
            jVar.dispose();
        }
        h hVar = word.f21110r;
        if (hVar != null) {
            hVar.dispose();
        }
        a0 a0Var = word.f21108p;
        if (a0Var != null) {
            a0Var.e();
        }
        zh.g gVar = word.f21104l;
        if (gVar != null) {
            gVar.dispose();
        }
        PrintWord printWord = word.f21111s;
        if (printWord != null && (aPageListView = printWord.f21087d) != null) {
            Adapter adapter = aPageListView.f21009h;
            if (adapter instanceof APageListAdapter) {
                ((APageListAdapter) adapter).dispose();
            }
            SparseArray<APageListItem> sparseArray = aPageListView.f21011j;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sparseArray.valueAt(i10).c();
                }
                sparseArray.clear();
            }
            LinkedList<APageListItem> linkedList = aPageListView.f21012k;
            if (linkedList != null) {
                Iterator<APageListItem> it = linkedList.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                linkedList.clear();
            }
        }
        word.setOnClickListener(null);
        word.setListener(null);
        word.setOnReflowStateCallBack(null);
    }

    @Override // lib.zj.office.system.f
    public final View getView() {
        return this.c;
    }

    public final void i() {
        this.c.post(new g());
    }

    @Override // lib.zj.office.system.f
    public final Activity m() {
        return s().m();
    }

    @Override // lib.zj.office.system.f
    public final sg.c n() {
        return this.f16219b.n();
    }

    @Override // lib.zj.office.system.f
    public final r o() {
        return this.f16219b.o();
    }

    @Override // lib.zj.office.system.f
    public final boolean p() {
        return this.f16219b.p();
    }

    @Override // lib.zj.office.system.f
    public final byte q() {
        return (byte) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0237  */
    @Override // lib.zj.office.system.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.b.r(int, java.lang.Object):void");
    }

    @Override // lib.zj.office.system.f
    public final i s() {
        return this.f16219b.s();
    }

    @Override // lib.zj.office.system.f
    public final lib.zj.office.system.h t() {
        return this.c.getFind();
    }

    @Override // lib.zj.office.system.f
    public final sg.b u() {
        return this.f16219b.u();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // lib.zj.office.system.f
    public final Object w(int i10) {
        Word word = this.c;
        switch (i10) {
            case 536870917:
                return Float.valueOf(word.getZoom());
            case 536870918:
                return Float.valueOf(word.getFitZoom());
            case 536870923:
                return Integer.valueOf(word.getPageCount());
            case 536870924:
                return Integer.valueOf(word.getCurrentPageNumber());
            case 536870934:
                if (word != null) {
                    return Integer.valueOf(word.getFitSizeState());
                }
                break;
            case 536870936:
                return null;
            case 805306368:
                return Boolean.valueOf(word.getStatus().f16217a);
            case 805306371:
                throw null;
            case 805306372:
                throw null;
            case 805306374:
                return Integer.valueOf(word.getCurrentRootType());
        }
        return null;
    }

    @Override // lib.zj.office.system.f
    public final boolean x() {
        return this.f16218a;
    }

    @Override // lib.zj.office.system.f
    public final int z() {
        return this.c.getCurrentPageNumber();
    }
}
