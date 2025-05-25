package yh;

import android.graphics.Paint;
import android.graphics.Typeface;
import ei.d;
import java.text.BreakIterator;

/* compiled from: FontKit.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f32149b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final BreakIterator f32150a = BreakIterator.getLineInstance();

    public static Paint a(ei.a aVar, d dVar, ji.b bVar) {
        Paint a10 = sg.d.f29801b.a();
        a10.setAntiAlias(true);
        a k10 = dVar.k(aVar.b().f18503b);
        boolean z10 = k10.f32143d;
        boolean z11 = k10.c;
        if (z10 && z11) {
            a10.setTextSkewX(-0.2f);
            a10.setFakeBoldText(true);
        } else if (z10) {
            a10.setFakeBoldText(true);
        } else if (z11) {
            a10.setTextSkewX(-0.2f);
        }
        if (k10.f32147h) {
            a10.setStrikeThruText(true);
        }
        if (k10.f32146g != 0) {
            a10.setUnderlineText(true);
        }
        a10.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
        a10.setTextSize((float) ((k10.f32142b * 1.3333333730697632d) + 0.5d));
        int i10 = dVar.i(k10.f32144e);
        if ((16777215 & i10) == 0 && bVar != null) {
            i10 = bVar.f19264a;
        }
        a10.setColor(i10);
        return a10;
    }
}
