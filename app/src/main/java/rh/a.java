package rh;

import android.app.Activity;
import android.app.ProgressDialog;
import android.text.ClipboardManager;
import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.beans.CalloutView.CalloutView;
import lib.zj.office.system.r;

/* compiled from: PGControl.java */
/* loaded from: classes3.dex */
public final class a extends androidx.privacysandbox.ads.adservices.topics.d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f29544a;

    /* renamed from: b  reason: collision with root package name */
    public final Presentation f29545b;
    public final lib.zj.office.system.f c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29546d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressDialog f29547e;

    /* compiled from: PGControl.java */
    /* renamed from: rh.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0369a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f29548a;

        public RunnableC0369a(Object obj) {
            this.f29548a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a) {
                aVar.c.s().l0(((Boolean) this.f29548a).booleanValue());
            }
        }
    }

    /* compiled from: PGControl.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f29550a;

        public b(Object obj) {
            this.f29550a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a) {
                aVar.c.s().n0((List) this.f29550a);
            }
        }
    }

    /* compiled from: PGControl.java */
    /* loaded from: classes3.dex */
    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f29552a;

        public c(Object obj) {
            this.f29552a = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a) {
                aVar.c.s().n0((List) this.f29552a);
            }
        }
    }

    /* compiled from: PGControl.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a && aVar.s() != null) {
                aVar.s().N();
            }
        }
    }

    /* compiled from: PGControl.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a) {
                aVar.s().i();
            }
        }
    }

    /* compiled from: PGControl.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.f29544a) {
                Presentation presentation = aVar.f29545b;
                sg.c n10 = presentation.f20931k.n();
                if (n10 != null) {
                    n10.c();
                    try {
                        presentation.p(n10);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public a(lib.zj.office.system.f fVar, th.c cVar) {
        this.c = fVar;
        this.f29545b = new Presentation(s().m(), cVar, this);
    }

    @Override // lib.zj.office.system.f
    public final void dispose() {
        pi.c cVar;
        this.f29544a = true;
        Presentation presentation = this.f29545b;
        vh.b bVar = presentation.f20934n;
        if (bVar != null) {
            lib.zj.office.java.awt.geom.d dVar = bVar.f30815e;
            if (dVar != null && (cVar = (pi.c) dVar.c) != null) {
                if (cVar.f28961a) {
                    cVar.c.cancel();
                    cVar.c.purge();
                    cVar.f28961a = false;
                }
                cVar.c = null;
                cVar.f28963d = null;
            }
            HashMap hashMap = bVar.f30816f;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
        rh.f fVar = presentation.f20935o;
        if (fVar != null) {
            fVar.c();
        }
        presentation.f20933m.b();
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, lib.zj.office.system.f
    public final void getSlideShow() {
        this.c.getSlideShow();
    }

    @Override // lib.zj.office.system.f
    public final View getView() {
        return this.f29545b;
    }

    @Override // lib.zj.office.system.f
    public final Activity m() {
        return this.c.s().m();
    }

    @Override // lib.zj.office.system.f
    public final sg.c n() {
        return this.c.n();
    }

    @Override // lib.zj.office.system.f
    public final r o() {
        lib.zj.office.system.f fVar = this.c;
        if (fVar != null) {
            return fVar.o();
        }
        return null;
    }

    @Override // lib.zj.office.system.f
    public final boolean p() {
        return this.c.p();
    }

    @Override // lib.zj.office.system.f
    public final byte q() {
        return (byte) 2;
    }

    @Override // lib.zj.office.system.f
    public final void r(int i10, Object obj) {
        int intValue;
        int intValue2;
        boolean z10;
        if (this.f29544a) {
            return;
        }
        boolean z11 = true;
        switch (i10) {
            case -268435456:
            case 1342177281:
                this.f29545b.postInvalidate();
                return;
            case 19:
                Presentation presentation = this.f29545b;
                presentation.c = true;
                PGPrintMode pGPrintMode = presentation.f20940t;
                if (((int) (pGPrintMode.getZoom() * 100.0f)) == 100) {
                    pGPrintMode.f20913e.o(pGPrintMode.getFitZoom(), SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, true);
                    return;
                }
                return;
            case 20:
                this.f29545b.post(new d());
                return;
            case 22:
                if (p()) {
                    s().m().onBackPressed();
                    return;
                }
                return;
            case 26:
                if (this.f29545b.getParent() != null) {
                    this.f29545b.post(new RunnableC0369a(obj));
                    return;
                }
                return;
            case 27:
                if (this.f29545b.getParent() != null) {
                    this.f29545b.post(new b(obj));
                    return;
                } else {
                    new c(obj).start();
                    return;
                }
            case 268435458:
                ((ClipboardManager) s().m().getSystemService("clipboard")).setText(this.f29545b.getSelectedText());
                return;
            case 536870917:
                Presentation presentation2 = this.f29545b;
                boolean z12 = presentation2.f20936p;
                if (!z12) {
                    int[] iArr = (int[]) obj;
                    float f10 = iArr[0] / 10000.0f;
                    int i11 = iArr[1];
                    int i12 = iArr[2];
                    if (!z12) {
                        presentation2.f20940t.f20913e.o(f10, i11, i12, true);
                    }
                    this.f29545b.post(new e());
                    return;
                }
                return;
            case 536870920:
                String str = ((ih.a) obj).f18492b;
                if (str != null) {
                    try {
                        pi.b.f28943s = true;
                        s().A0(str);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 536870922:
                this.f29545b.post(new f());
                return;
            case 536870925:
                Presentation presentation3 = this.f29545b;
                if (presentation3.f20936p) {
                    presentation3.o((byte) 4);
                    return;
                } else if (presentation3.getCurrentIndex() > 0) {
                    Presentation presentation4 = this.f29545b;
                    presentation4.n(presentation4.getCurrentIndex() - 1, false);
                    return;
                } else {
                    return;
                }
            case 536870926:
                Presentation presentation5 = this.f29545b;
                if (presentation5.f20936p) {
                    presentation5.o((byte) 5);
                    return;
                } else if (presentation5.getCurrentIndex() < this.f29545b.getRealSlideCount() - 1) {
                    Presentation presentation6 = this.f29545b;
                    presentation6.n(presentation6.getCurrentIndex() + 1, false);
                    return;
                } else {
                    return;
                }
            case 536870927:
                s().X0();
                rh.b bVar = new rh.b(this);
                Presentation presentation7 = this.f29545b;
                presentation7.post(bVar);
                if (this.f29546d) {
                    if (presentation7.f20925e < presentation7.getRealSlideCount()) {
                        presentation7.post(new i(presentation7));
                        presentation7.f20940t.f20913e.p(presentation7.f20925e);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f29546d = false;
                        presentation7.post(new rh.c(this));
                        return;
                    }
                    return;
                }
                return;
            case 536870933:
                this.f29545b.setFitSize(((Integer) obj).intValue());
                return;
            case 536870942:
                this.f29545b.l();
                return;
            case 1342177280:
                String str2 = this.f29545b.getCurrentSlide().f30040g.f29749a;
                Vector vector = new Vector();
                vector.add(str2);
                new sh.b(this, s().m(), vector).show();
                return;
            case 1342177282:
                if (!this.f29545b.f20936p && (intValue = ((Integer) obj).intValue()) >= 0) {
                    Presentation presentation8 = this.f29545b;
                    if (intValue < presentation8.getSlideCount()) {
                        this.f29546d = false;
                        if (intValue >= presentation8.getRealSlideCount()) {
                            this.f29546d = true;
                            if (s().O()) {
                                presentation8.postDelayed(new rh.d(this, this), 200L);
                            } else {
                                sg.b u7 = this.c.u();
                                if (u7 != null) {
                                    u7.b();
                                }
                            }
                        }
                        presentation8.n(intValue, false);
                        return;
                    }
                    return;
                }
                return;
            case 1358954497:
                s().T(true);
                Presentation presentation9 = this.f29545b;
                if (obj == null) {
                    intValue2 = presentation9.getCurrentIndex() + 1;
                } else {
                    intValue2 = ((Integer) obj).intValue();
                }
                synchronized (presentation9) {
                    if (intValue2 > 0) {
                        if (intValue2 <= presentation9.f20933m.f30031e) {
                            if (presentation9.f20935o == null) {
                                presentation9.f20935o = new rh.f(presentation9, presentation9.f20931k);
                            }
                            if (presentation9.getCurrentIndex() + 1 != intValue2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            presentation9.setOnTouchListener(presentation9.f20935o);
                            presentation9.f20931k.o().b().c(0);
                            presentation9.f20940t.setVisibility(8);
                            presentation9.f20936p = true;
                            presentation9.m(presentation9.getWidth(), presentation9.getHeight());
                            int i13 = intValue2 - 1;
                            presentation9.f20937q = i13;
                            th.d d10 = presentation9.f20933m.d(i13);
                            presentation9.f20932l = d10;
                            if (presentation9.f20934n == null) {
                                presentation9.f20934n = new vh.b(presentation9, d10);
                            }
                            presentation9.f20934n.d(presentation9.f20932l, true);
                            presentation9.setBackgroundColor(-16777216);
                            CalloutView calloutView = presentation9.f20941u;
                            if (calloutView == null) {
                                if (presentation9.f20931k.o().b().f29351e.size() != 0) {
                                    z11 = false;
                                }
                                if (!z11) {
                                    presentation9.l();
                                }
                            } else {
                                calloutView.setIndex(presentation9.f20937q);
                            }
                            presentation9.postInvalidate();
                            if (z10 && presentation9.getControl().s() != null) {
                                presentation9.getControl().s().S();
                            }
                            presentation9.post(new j(presentation9));
                            return;
                        }
                    }
                    return;
                }
            case 1358954498:
                this.f29545b.g();
                return;
            case 1358954499:
                this.f29545b.o((byte) 2);
                return;
            case 1358954500:
                this.f29545b.o((byte) 3);
                return;
            case 1358954503:
                this.f29545b.setAnimationDuration(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    @Override // lib.zj.office.system.f
    public final lib.zj.office.system.i s() {
        lib.zj.office.system.f fVar = this.c;
        if (fVar == null) {
            return null;
        }
        return fVar.s();
    }

    @Override // lib.zj.office.system.f
    public final lib.zj.office.system.h t() {
        return this.f29545b.getFind();
    }

    @Override // lib.zj.office.system.f
    public final sg.b u() {
        return this.c.u();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // lib.zj.office.system.f
    public final Object w(int i10) {
        switch (i10) {
            case 536870917:
                return Float.valueOf(this.f29545b.getZoom());
            case 536870918:
                return Float.valueOf(this.f29545b.getFitZoom());
            case 536870923:
                return Integer.valueOf(this.f29545b.getSlideCount());
            case 536870924:
                return Integer.valueOf(this.f29545b.getCurrentIndex() + 1);
            case 536870925:
                return Boolean.valueOf(this.f29545b.k());
            case 536870926:
                return Boolean.valueOf(this.f29545b.i());
            case 536870934:
                Presentation presentation = this.f29545b;
                if (presentation != null) {
                    return Integer.valueOf(presentation.getFitSizeState());
                }
                break;
            case 536870935:
                return Integer.valueOf(this.f29545b.getRealSlideCount());
            case 536870936:
                return null;
            case 1342177283:
                throw null;
            case 1342177284:
                throw null;
            case 1342177285:
                throw null;
            case 1358954496:
                return Boolean.valueOf(this.f29545b.f20936p);
            case 1358954501:
                return Boolean.valueOf(this.f29545b.j());
            case 1358954502:
                return Boolean.valueOf(this.f29545b.h());
            case 1358954504:
                throw null;
            case 1358954505:
                throw null;
        }
        return null;
    }

    @Override // lib.zj.office.system.f
    public final boolean x() {
        return this.f29544a;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.d, lib.zj.office.system.f
    public final boolean y() {
        return this.f29545b.f20936p;
    }

    @Override // lib.zj.office.system.f
    public final int z() {
        return this.f29545b.getCurrentIndex() + 1;
    }
}
