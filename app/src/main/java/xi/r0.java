package xi;

import android.graphics.Paint;
import java.util.logging.Logger;
import lib.zj.office.java.awt.Color;

/* compiled from: LogBrush32.java */
/* loaded from: classes3.dex */
public final class r0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f31772a;

    /* renamed from: b  reason: collision with root package name */
    public final Color f31773b;
    public final int c;

    public r0(int i10, Color color) {
        this.f31772a = i10;
        this.f31773b = color;
        this.c = 0;
    }

    @Override // xi.l0
    public final void a(wi.d dVar) {
        Paint paint = dVar.f31239j;
        Color color = this.f31773b;
        int i10 = this.f31772a;
        if (i10 == 0) {
            paint.setColor(color.getRGB());
        } else if (i10 == 1) {
            paint.setColor(new Color(0, 0, 0, 0).getRGB());
        } else {
            Logger logger = Logger.getLogger("org.freehep.graphicsio.emf");
            logger.warning("LogBrush32 style not supported: " + toString());
            paint.setColor(color.getRGB());
        }
    }

    public final String toString() {
        return "  LogBrush32\n    style: " + this.f31772a + "\n    color: " + this.f31773b + "\n    hatch: " + this.c;
    }

    public r0(wi.c cVar) {
        this.f31772a = (int) cVar.readUnsignedInt();
        this.f31773b = cVar.i();
        this.c = (int) cVar.readUnsignedInt();
    }
}
