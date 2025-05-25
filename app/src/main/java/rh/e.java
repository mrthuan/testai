package rh;

import java.util.Map;
import lh.n;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.pg.control.Presentation;

/* compiled from: PGEditor.java */
/* loaded from: classes3.dex */
public final class e implements xh.e {

    /* renamed from: a  reason: collision with root package name */
    public n f29561a;

    /* renamed from: b  reason: collision with root package name */
    public final xh.b f29562b = new xh.b(this);
    public final Presentation c;

    /* renamed from: d  reason: collision with root package name */
    public Map<Integer, qh.d> f29563d;

    public e(Presentation presentation) {
        this.c = presentation;
    }

    @Override // xh.e
    public final qh.d a(int i10) {
        Map<Integer, qh.d> map;
        if (this.c != null && (map = this.f29563d) != null) {
            qh.d dVar = map.get(Integer.valueOf(i10));
            if (dVar == null) {
                dVar = this.f29563d.get(-2);
            }
            if (dVar == null) {
                return this.f29563d.get(-1);
            }
            return dVar;
        }
        return null;
    }

    @Override // xh.e
    public final Rectangle c(long j10, Rectangle rectangle) {
        n nVar = this.f29561a;
        if (nVar != null) {
            ai.h hVar = nVar.f20644o;
            if (hVar != null) {
                hVar.A(j10, rectangle, false);
            }
            int i10 = rectangle.f20688x;
            Rectangle rectangle2 = this.f29561a.f20604e;
            rectangle.f20688x = i10 + rectangle2.f20688x;
            rectangle.f20689y += rectangle2.f20689y;
        }
        return rectangle;
    }

    @Override // xh.e
    public final lib.zj.office.system.f getControl() {
        Presentation presentation = this.c;
        if (presentation != null) {
            return presentation.getControl();
        }
        return null;
    }

    @Override // xh.e
    public final zh.g getDocument() {
        return null;
    }

    @Override // xh.e
    public final byte getEditType() {
        return (byte) 2;
    }

    @Override // xh.e
    public final xh.d getHighlight() {
        return this.f29562b;
    }

    @Override // xh.e
    public final lh.g getTextBox() {
        return this.f29561a;
    }
}
