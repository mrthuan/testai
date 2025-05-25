package rg;

import android.graphics.Rect;
import android.view.View;
import androidx.privacysandbox.ads.adservices.topics.d;
import gj.k;
import java.util.List;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.i;
import lib.zj.office.system.p;
import lib.zj.office.wp.control.Word;
import sp.f;
import sp.h;

/* compiled from: IOffice.java */
/* loaded from: classes2.dex */
public abstract class c implements i {
    public static boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public p f29542a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f29543b = -12303292;

    public c() {
        p pVar = new p(this);
        this.f29542a = pVar;
        pVar.f21054g = new b(this);
    }

    @Override // lib.zj.office.system.i
    public final boolean B0() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final byte C0() {
        return (byte) 2;
    }

    @Override // lib.zj.office.system.i
    public final boolean L() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean O() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P() {
        return true;
    }

    @Override // lib.zj.office.system.i
    public final boolean P0() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final int V0() {
        return 0;
    }

    @Override // lib.zj.office.system.i
    public final Integer Y0() {
        return this.f29543b;
    }

    public final void a(sp.c cVar, h hVar) {
        Rect g10;
        View view = this.f29542a.getView();
        if (hVar.f29858h) {
            return;
        }
        int i10 = 0;
        if (view instanceof Word) {
            Word word = (Word) view;
            word.getClass();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int c10 = hVar.c(i11, word.S);
                if (c10 < 0 || c10 > 1) {
                    break;
                } else if (c10 != 0) {
                    k I = word.f21109q.I(i11);
                    int i13 = I.f482e;
                    cVar.a(i12, I.f481d, i13);
                    I.I(1.0f, -I.f480b, -I.c, cVar, false);
                    cVar.b();
                    i12 += i13;
                    i11++;
                }
            }
        }
        if (view instanceof Presentation) {
            Presentation presentation = (Presentation) view;
            presentation.getClass();
            int i14 = 0;
            while (true) {
                int c11 = hVar.c(i10, presentation.f20922a);
                if (c11 >= 0 && c11 <= 1) {
                    if (c11 != 0) {
                        PGPrintMode pGPrintMode = presentation.f20940t;
                        float height = pGPrintMode.g(i10).height();
                        cVar.a(i14, g10.width(), height);
                        vh.a.g().d(cVar, pGPrintMode.f20915g, pGPrintMode.f20916h, pGPrintMode.f20915g.d(i10), 1.0f, null);
                        cVar.b();
                        i14 = (int) (i14 + height);
                        i10++;
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // lib.zj.office.system.i
    public final String a1() {
        return "UTF-8";
    }

    public final Rectangle b() {
        View view = this.f29542a.getView();
        if (view instanceof Word) {
            return ((Word) view).getFirstPageSize();
        }
        if (view instanceof Presentation) {
            return ((Presentation) view).getFirstPageSize();
        }
        return null;
    }

    @Override // lib.zj.office.system.i
    public final byte getPageListViewMovingPosition() {
        return (byte) 1;
    }

    @Override // lib.zj.office.system.i
    public final boolean q() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean t(int i10, Object obj) {
        p pVar = this.f29542a;
        if (pVar == null) {
            return true;
        }
        try {
        } catch (Exception e10) {
            this.f29542a.f21062o.c().a(false, e10);
        }
        if (i10 != 20) {
            if (i10 != 268435458) {
                if (i10 != 788529152) {
                    if (i10 == 1073741828) {
                        return true;
                    }
                    return false;
                }
                String trim = ((String) obj).trim();
                if (trim.length() > 0) {
                    this.f29542a.t().d(trim);
                }
            } else {
                d dVar = pVar.f21061n;
                if (dVar != null) {
                    dVar.r(268435458, obj);
                }
            }
        } else {
            ((f) this).N();
        }
        return true;
    }

    @Override // lib.zj.office.system.i
    public final void H0() {
    }

    @Override // lib.zj.office.system.i
    public final void S() {
    }

    @Override // lib.zj.office.system.i
    public final void d1() {
    }

    @Override // lib.zj.office.system.i
    public final void i() {
    }

    @Override // lib.zj.office.system.i
    public final void j() {
    }

    @Override // lib.zj.office.system.i
    public final void k0() {
    }

    @Override // lib.zj.office.system.i
    public final void l() {
    }

    @Override // lib.zj.office.system.i
    public final void o() {
    }

    @Override // lib.zj.office.system.i
    public final void A0(String str) {
    }

    @Override // lib.zj.office.system.i
    public final void M0(boolean z10) {
    }

    @Override // lib.zj.office.system.i
    public final void c1(byte b10) {
    }

    @Override // lib.zj.office.system.i
    public final void h1(boolean z10) {
    }

    @Override // lib.zj.office.system.i
    public final void n0(List<Integer> list) {
    }
}
