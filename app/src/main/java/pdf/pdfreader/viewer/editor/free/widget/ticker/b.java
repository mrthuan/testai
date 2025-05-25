package pdf.pdfreader.viewer.editor.free.widget.ticker;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: TickerColumn.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a[] f28907a;

    /* renamed from: b  reason: collision with root package name */
    public final c f28908b;
    public char c = 0;

    /* renamed from: d  reason: collision with root package name */
    public char f28909d = 0;

    /* renamed from: e  reason: collision with root package name */
    public char[] f28910e;

    /* renamed from: f  reason: collision with root package name */
    public int f28911f;

    /* renamed from: g  reason: collision with root package name */
    public int f28912g;

    /* renamed from: h  reason: collision with root package name */
    public int f28913h;

    /* renamed from: i  reason: collision with root package name */
    public float f28914i;

    /* renamed from: j  reason: collision with root package name */
    public float f28915j;

    /* renamed from: k  reason: collision with root package name */
    public float f28916k;

    /* renamed from: l  reason: collision with root package name */
    public float f28917l;

    /* renamed from: m  reason: collision with root package name */
    public float f28918m;

    /* renamed from: n  reason: collision with root package name */
    public float f28919n;

    /* renamed from: o  reason: collision with root package name */
    public float f28920o;

    /* renamed from: p  reason: collision with root package name */
    public float f28921p;

    /* renamed from: q  reason: collision with root package name */
    public int f28922q;

    public b(a[] aVarArr, c cVar) {
        this.f28907a = aVarArr;
        this.f28908b = cVar;
    }

    public static boolean b(Canvas canvas, Paint paint, char[] cArr, int i10, float f10) {
        if (i10 >= 0 && i10 < cArr.length) {
            canvas.drawText(cArr, i10, 1, 0.0f, f10, paint);
            return true;
        }
        return false;
    }

    public final void a() {
        float a10 = this.f28908b.a(this.f28909d);
        float f10 = this.f28917l;
        float f11 = this.f28918m;
        if (f10 == f11 && f11 != a10) {
            this.f28918m = a10;
            this.f28917l = a10;
            this.f28919n = a10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (((r11 - r9) + r10) < (r9 - r10)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (((r11 - r10) + r9) < (r10 - r9)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r9 < r10) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        r9 = r9 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r10 < r9) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        r10 = r10 + r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(char r13) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.widget.ticker.b.c(char):void");
    }
}
