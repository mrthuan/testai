package rh;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.n;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.pg.control.Presentation;
import zh.l;

/* compiled from: PGFind.java */
/* loaded from: classes3.dex */
public final class h implements lib.zj.office.system.h {
    public final Presentation c;

    /* renamed from: d  reason: collision with root package name */
    public String f29570d;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f29568a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final Handler f29569b = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public int f29571e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f29572f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f29573g = -1;

    /* renamed from: h  reason: collision with root package name */
    public final Rectangle f29574h = new Rectangle();

    public h(Presentation presentation) {
        this.c = presentation;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(int r8, lh.n r9) {
        /*
            r7 = this;
            lib.zj.office.pg.control.Presentation r0 = r7.c
            int r1 = r0.getCurrentIndex()
            r2 = 0
            r3 = 1
            if (r8 == r1) goto Le
            r0.n(r8, r3)
            goto L3e
        Le:
            lib.zj.office.java.awt.Rectangle r1 = r7.f29574h
            r1.setBounds(r2, r2, r2, r2)
            rh.e r4 = r0.getEditor()
            int r5 = r7.f29573g
            long r5 = (long) r5
            r4.c(r5, r1)
            lib.zj.office.pg.control.PGPrintMode r4 = r0.getPrintMode()
            lib.zj.office.system.beans.pagelist.APageListView r4 = r4.getListView()
            int r5 = r1.f20688x
            int r6 = r1.f20689y
            boolean r4 = r4.h(r5, r6)
            if (r4 != 0) goto L40
            lib.zj.office.pg.control.PGPrintMode r3 = r0.getPrintMode()
            lib.zj.office.system.beans.pagelist.APageListView r3 = r3.getListView()
            int r4 = r1.f20688x
            int r1 = r1.f20689y
            r3.n(r4, r1)
        L3e:
            r3 = r2
            goto L52
        L40:
            lib.zj.office.pg.control.PGPrintMode r1 = r0.getPrintMode()
            lib.zj.office.pg.control.PGPrintMode r4 = r0.getPrintMode()
            lib.zj.office.system.beans.pagelist.APageListView r4 = r4.getListView()
            r4.getCurrentPageView()
            r1.getClass()
        L52:
            if (r3 == 0) goto L57
            r0.postInvalidate()
        L57:
            r7.f29572f = r8
            rh.e r8 = r0.getEditor()
            r8.f29561a = r9
            rh.e r8 = r0.getEditor()
            xh.b r8 = r8.f29562b
            int r9 = r7.f29573g
            long r3 = (long) r9
            java.lang.String r1 = r7.f29570d
            int r1 = r1.length()
            int r1 = r1 + r9
            long r5 = (long) r1
            r8.f31655b = r2
            java.util.ArrayList<xh.c> r8 = r8.f31654a
            r8.clear()
            xh.c r9 = new xh.c
            r9.<init>(r3, r5)
            r8.add(r9)
            lib.zj.office.system.f r8 = r0.getControl()
            r9 = 20
            r0 = 0
            r8.r(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.h.a(int, lh.n):void");
    }

    @Override // lib.zj.office.system.h
    public final void b() {
        this.f29570d = null;
        xh.b bVar = this.c.getEditor().f29562b;
        bVar.f31655b = -1;
        bVar.f31654a.clear();
    }

    @Override // lib.zj.office.system.h
    public final void c() {
        this.f29568a.set(true);
    }

    @Override // lib.zj.office.system.h
    public final boolean d(String str) {
        if (str == null) {
            return false;
        }
        this.f29570d = str;
        this.f29573g = -1;
        this.f29571e = -1;
        AtomicBoolean atomicBoolean = this.f29568a;
        atomicBoolean.set(false);
        Presentation presentation = this.c;
        int currentIndex = presentation.getCurrentIndex();
        while (!atomicBoolean.get()) {
            if (g(currentIndex)) {
                return true;
            }
            currentIndex++;
            if (currentIndex == presentation.getRealSlideCount()) {
                currentIndex = 0;
            }
            if (currentIndex == presentation.getCurrentIndex()) {
                return false;
            }
        }
        return false;
    }

    @Override // lib.zj.office.system.h
    public final boolean e() {
        boolean z10;
        int i10;
        int lastIndexOf;
        if (this.f29570d == null) {
            return false;
        }
        Presentation presentation = this.c;
        int currentIndex = presentation.getCurrentIndex();
        AtomicBoolean atomicBoolean = this.f29568a;
        atomicBoolean.set(false);
        while (!atomicBoolean.get()) {
            th.d d10 = presentation.f20933m.d(currentIndex);
            int i11 = this.f29571e;
            if (i11 < 0) {
                i11 = d10.g() - 1;
            }
            while (i11 >= 0 && !atomicBoolean.get()) {
                lh.g h10 = d10.h(i11);
                if (h10 != null && h10.getType() == 1) {
                    if (this.f29571e == i11 && presentation.getCurrentIndex() == currentIndex) {
                        i10 = this.f29573g;
                    } else {
                        i10 = -1;
                    }
                    l lVar = ((n) h10).f20643n;
                    if (lVar != null && ((i10 < 0 || i10 >= this.f29570d.length()) && lVar.f32372b - lVar.f32371a != 0)) {
                        if (i10 >= 0) {
                            presentation.getRenderersDoc();
                            String text = lVar.getText();
                            String str = this.f29570d;
                            lastIndexOf = text.lastIndexOf(str, Math.max(this.f29573g - str.length(), 0));
                        } else {
                            presentation.getRenderersDoc();
                            lastIndexOf = lVar.getText().lastIndexOf(this.f29570d);
                        }
                        if (lastIndexOf >= 0) {
                            this.f29573g = lastIndexOf;
                            this.f29571e = i11;
                            this.f29569b.post(new u1.a(this, currentIndex, h10, 1));
                            z10 = true;
                            break;
                        }
                    }
                }
                i11--;
            }
            z10 = false;
            if (z10) {
                return true;
            }
            this.f29573g = -1;
            this.f29571e = -1;
            currentIndex--;
            if (currentIndex < 0) {
                return false;
            }
        }
        return false;
    }

    @Override // lib.zj.office.system.h
    public final boolean f() {
        if (this.f29570d == null) {
            return false;
        }
        Presentation presentation = this.c;
        int currentIndex = presentation.getCurrentIndex();
        AtomicBoolean atomicBoolean = this.f29568a;
        atomicBoolean.set(false);
        while (!atomicBoolean.get()) {
            if (g(currentIndex)) {
                return true;
            }
            this.f29573g = -1;
            this.f29571e = -1;
            currentIndex++;
            if (currentIndex == presentation.getRealSlideCount()) {
                return false;
            }
        }
        return false;
    }

    public final boolean g(int i10) {
        l lVar;
        int i11;
        int indexOf;
        Presentation presentation = this.c;
        th.d d10 = presentation.f20933m.d(i10);
        for (int max = Math.max(0, this.f29571e); max < d10.g() && !this.f29568a.get(); max++) {
            lh.g h10 = d10.h(max);
            if (h10 != null && h10.getType() == 1 && (lVar = ((n) h10).f20643n) != null && lVar.f32372b - lVar.f32371a != 0) {
                if (this.f29571e == max && presentation.getCurrentIndex() == i10) {
                    i11 = this.f29573g;
                } else {
                    i11 = -1;
                }
                if (i11 >= 0) {
                    presentation.getRenderersDoc();
                    String text = lVar.getText();
                    String str = this.f29570d;
                    indexOf = text.indexOf(str, str.length() + this.f29573g);
                } else {
                    presentation.getRenderersDoc();
                    indexOf = lVar.getText().indexOf(this.f29570d);
                }
                if (indexOf >= 0) {
                    this.f29573g = indexOf;
                    this.f29571e = max;
                    this.f29569b.post(new g(this, i10, h10, 0));
                    return true;
                }
            }
        }
        return false;
    }
}
