package mj;

import android.graphics.RectF;
import lib.zj.pdfeditor.text.editor.TextEditorAction;

/* compiled from: TextEditorFocusInfo.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f22083a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22084b;
    public RectF c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f22085d;

    /* renamed from: e  reason: collision with root package name */
    public RectF f22086e;

    /* renamed from: f  reason: collision with root package name */
    public TextEditorAction f22087f;

    /* renamed from: g  reason: collision with root package name */
    public int f22088g;

    public h(int i10, int i11) {
        this.f22083a = i10;
        this.f22084b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextEditorFocusInfo{pageIndex=");
        sb2.append(this.f22083a);
        sb2.append(", blockIndex=");
        sb2.append(this.f22084b);
        sb2.append(", cursorBox=");
        sb2.append(this.c);
        sb2.append(", startSelectTextRectF=");
        sb2.append(this.f22085d);
        sb2.append(", endSelectTextRectF=");
        sb2.append(this.f22086e);
        sb2.append(", refocusAction=");
        sb2.append(this.f22087f);
        sb2.append(", refocusChangeColor=");
        return androidx.activity.f.n(sb2, this.f22088g, '}');
    }
}
