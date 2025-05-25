package mj;

import android.graphics.RectF;
import lib.zj.pdfeditor.Annotation;

/* compiled from: ImageBlockEntity.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Annotation f22052a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f22053b;
    public boolean c = false;

    public e(Annotation annotation) {
        this.f22052a = annotation;
        this.f22053b = new RectF(((RectF) annotation).left, ((RectF) annotation).top, ((RectF) annotation).right, ((RectF) annotation).bottom);
    }

    public final String toString() {
        return "ImageBlockEntity{annotation=" + this.f22052a + ", rectF=" + this.f22053b + ", isSelected=" + this.c + '}';
    }
}
