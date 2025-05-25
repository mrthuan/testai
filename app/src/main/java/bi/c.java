package bi;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.Scroller;
import lib.zj.office.ss.control.Spreadsheet;
import lib.zj.office.system.f;
import lib.zj.office.system.k;

/* compiled from: SSEventManage.java */
/* loaded from: classes3.dex */
public final class c extends pi.b implements k {
    public boolean A;
    public final pi.c B;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5433t;

    /* renamed from: u  reason: collision with root package name */
    public int f5434u;

    /* renamed from: v  reason: collision with root package name */
    public int f5435v;

    /* renamed from: w  reason: collision with root package name */
    public final Spreadsheet f5436w;

    /* renamed from: x  reason: collision with root package name */
    public ki.c f5437x;

    /* renamed from: y  reason: collision with root package name */
    public ki.c f5438y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5439z;

    public c(Spreadsheet spreadsheet, f fVar) {
        super(spreadsheet.getContext(), fVar);
        this.f5436w = spreadsheet;
        this.B = new pi.c(1000, this);
    }

    @Override // lib.zj.office.system.k
    public final void a() {
        this.B.b();
        this.f28956n.r(536870922, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // pi.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r9 = this;
            super.b()
            android.widget.Scroller r0 = r9.f28959q
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L89
            r0 = 1
            r9.f28946d = r0
            android.widget.Scroller r1 = r9.f28959q
            int r1 = r1.getCurrX()
            android.widget.Scroller r2 = r9.f28959q
            int r2 = r2.getCurrY()
            int r3 = r9.f5434u
            lib.zj.office.ss.control.Spreadsheet r4 = r9.f5436w
            if (r1 != r3) goto L2f
            int r3 = r9.f5435v
            if (r3 != r2) goto L2f
            android.widget.Scroller r1 = r9.f28959q
            r1.abortAnimation()
            r4.c = r0
            r4.postInvalidate()
            return
        L2f:
            oi.f r3 = r4.getSheetView()
            int r5 = r9.f5434u
            r6 = 2
            if (r1 == r5) goto L48
            int r7 = r9.f5435v
            if (r7 != 0) goto L48
            int r5 = r1 - r5
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= r6) goto L46
            r5 = r0
            goto L49
        L46:
            r9.f5434u = r1
        L48:
            r5 = 0
        L49:
            int r7 = r9.f5435v
            if (r2 == r7) goto L5c
            int r8 = r9.f5434u
            if (r8 != 0) goto L5c
            int r7 = r7 - r2
            int r7 = java.lang.Math.abs(r7)
            if (r7 <= r6) goto L5a
            r5 = r0
            goto L5c
        L5a:
            r9.f5435v = r2
        L5c:
            if (r5 == 0) goto L80
            if (r3 == 0) goto L80
            r9.A = r0
            float r5 = r3.f23079f
            oi.d r6 = r3.c
            r6.a(r5)
            int r5 = r9.f5434u
            int r5 = r1 - r5
            float r5 = (float) r5
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            int r6 = r9.f5435v
            int r6 = r2 - r6
            float r6 = (float) r6
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            r3.m(r5, r6)
        L80:
            r4.c = r0
            r4.postInvalidate()
            r9.f5434u = r1
            r9.f5435v = r2
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.c.b():void");
    }

    @Override // pi.b
    public final void c() {
        super.c();
        pi.c cVar = this.B;
        if (cVar != null) {
            if (cVar.f28961a) {
                cVar.c.cancel();
                cVar.c.purge();
                cVar.f28961a = false;
            }
            cVar.c = null;
            cVar.f28963d = null;
        }
    }

    @Override // pi.b
    public final void d(int i10, int i11) {
        Spreadsheet spreadsheet = this.f5436w;
        if (spreadsheet.getSheetView() == null) {
            return;
        }
        float f10 = spreadsheet.getSheetView().f23079f;
        int round = Math.round(spreadsheet.getSheetView().f23081h * f10);
        int round2 = Math.round(spreadsheet.getSheetView().f23082i * f10);
        this.f5435v = 0;
        this.f5434u = 0;
        if (Math.abs(i11) > Math.abs(i10)) {
            this.f5435v = round2;
            Scroller scroller = this.f28959q;
            oi.f sheetView = spreadsheet.getSheetView();
            scroller.fling(round, round2, 0, i11, 0, 0, 0, Math.round(sheetView.f23076b.f16606g * sheetView.f23079f));
        } else {
            this.f5434u = round;
            Scroller scroller2 = this.f28959q;
            oi.f sheetView2 = spreadsheet.getSheetView();
            scroller2.fling(round, round2, i10, 0, 0, Math.round(sheetView2.f23076b.f16605f * sheetView2.f23079f), 0, 0);
        }
        spreadsheet.c = true;
        spreadsheet.postInvalidate();
    }

    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        super.onLongPress(motionEvent);
        this.f5433t = true;
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        this.f5435v = Math.round(y10);
        this.f5434u = Math.round(x4);
        Spreadsheet spreadsheet = this.f5436w;
        oi.f sheetView = spreadsheet.getSheetView();
        if (sheetView == null) {
            return;
        }
        float f11 = sheetView.c.f23072b;
        int i14 = (f11 > x4 ? 1 : (f11 == x4 ? 0 : -1));
        oi.c cVar = sheetView.f23077d;
        if (i14 > 0 && cVar.f23069b < y10) {
            float y11 = motionEvent.getY();
            oi.f sheetView2 = spreadsheet.getSheetView();
            if (sheetView2 != null) {
                float f12 = sheetView2.f23077d.f23069b;
                ki.e eVar = sheetView2.f23086m;
                int i15 = eVar.f19779a;
                int round = Math.round(f12);
                Rect rect = new Rect();
                rect.bottom = round;
                rect.top = round;
                if (sheetView2.f23076b.f16601a.f16633k) {
                    i12 = 65536;
                } else {
                    i12 = 1048576;
                }
                while (f12 <= y11 && i15 <= i12) {
                    ei.b g10 = sheetView2.f23076b.g(i15);
                    if (g10 != null && g10.d()) {
                        i15++;
                    } else {
                        if (g10 == null) {
                            f10 = sheetView2.f23076b.f16618s;
                        } else {
                            f10 = g10.f16598f;
                        }
                        float round2 = Math.round(f10 * sheetView2.f23079f);
                        if (i15 == eVar.f19779a && !eVar.f19782e) {
                            round2 = (float) Math.round(eVar.f19784g * sheetView2.f23079f);
                        }
                        rect.top = rect.bottom;
                        rect.bottom = Math.round(f12);
                        int round3 = Math.round(f12);
                        f12 += round2;
                        i15++;
                        round = round3;
                    }
                }
                if (this.f5437x == null) {
                    this.f5437x = new ki.c();
                }
                ki.c cVar2 = this.f5437x;
                cVar2.f19771a = (short) 1;
                if (y11 > (round + f12) / 2.0f) {
                    cVar2.f19772b = i15 - 1;
                    rect.top = rect.bottom;
                    rect.bottom = Math.round(f12);
                    this.f5437x.f19773d = rect;
                } else {
                    int i16 = i15 - 2;
                    if (i16 >= 0) {
                        i13 = i16;
                    } else {
                        i13 = 0;
                    }
                    cVar2.f19772b = i13;
                    cVar2.f19773d = rect;
                }
            }
        } else if (f11 < x4 && cVar.f23069b > y10) {
            float x10 = motionEvent.getX();
            oi.f sheetView3 = spreadsheet.getSheetView();
            if (sheetView3 != null) {
                float f13 = sheetView3.c.f23072b;
                ki.e eVar2 = sheetView3.f23086m;
                int i17 = eVar2.f19780b;
                int round4 = Math.round(f13);
                Rect rect2 = new Rect();
                int round5 = Math.round(f13);
                rect2.right = round5;
                rect2.left = round5;
                if (sheetView3.f23076b.f16601a.f16633k) {
                    i10 = 256;
                } else {
                    i10 = 16384;
                }
                while (f13 <= x10 && i17 <= i10) {
                    if (sheetView3.f23076b.l(i17)) {
                        i17++;
                    } else {
                        float round6 = Math.round(sheetView3.f23076b.d(i17) * sheetView3.f23079f);
                        if (i17 == eVar2.f19780b && !eVar2.f19783f) {
                            round6 = (float) Math.round(eVar2.f19785h * sheetView3.f23079f);
                        }
                        rect2.left = rect2.right;
                        rect2.right = Math.round(f13);
                        int round7 = Math.round(f13);
                        f13 += round6;
                        i17++;
                        round4 = round7;
                    }
                }
                if (this.f5437x == null) {
                    this.f5437x = new ki.c();
                }
                ki.c cVar3 = this.f5437x;
                cVar3.f19771a = (short) 2;
                if (x10 > (round4 + f13) / 2.0f) {
                    cVar3.c = i17 - 1;
                    rect2.left = rect2.right;
                    rect2.right = Math.round(f13);
                    this.f5437x.f19773d = rect2;
                } else {
                    int i18 = i17 - 2;
                    if (i18 >= 0) {
                        i11 = i18;
                    } else {
                        i11 = 0;
                    }
                    cVar3.c = i11;
                    cVar3.f19773d = rect2;
                }
            }
        }
        ki.c cVar4 = this.f5437x;
        if (cVar4 != null) {
            this.f5438y = new ki.c(cVar4.f19771a, new Rect(cVar4.f19773d), cVar4.f19772b, cVar4.c);
            spreadsheet.getSheetView().f23090q = this.f5438y;
            spreadsheet.getSheetView().f23089p = true;
            spreadsheet.c = true;
            spreadsheet.postInvalidate();
        }
    }

    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        super.onScroll(motionEvent, motionEvent2, f10, f11);
        Spreadsheet spreadsheet = this.f5436w;
        oi.f sheetView = spreadsheet.getSheetView();
        boolean z10 = false;
        if (sheetView == null) {
            return false;
        }
        if (Math.abs(f10) > 2.0f) {
            z10 = true;
        } else {
            f10 = 0.0f;
        }
        if (Math.abs(f11) > 2.0f) {
            z10 = true;
        } else {
            f11 = 0.0f;
        }
        if (z10) {
            this.f28947e = true;
            this.A = true;
            sheetView.c.a(sheetView.f23079f);
            sheetView.m(Math.round(f10), Math.round(f11));
            spreadsheet.c = true;
            spreadsheet.postInvalidate();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0582  */
    @Override // pi.b, android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
