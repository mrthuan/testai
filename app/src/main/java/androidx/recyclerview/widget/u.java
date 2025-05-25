package androidx.recyclerview.widget;

/* compiled from: LayoutState.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b  reason: collision with root package name */
    public int f4601b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4602d;

    /* renamed from: e  reason: collision with root package name */
    public int f4603e;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4606h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4607i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4600a = true;

    /* renamed from: f  reason: collision with root package name */
    public int f4604f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f4605g = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
        sb2.append(this.f4601b);
        sb2.append(", mCurrentPosition=");
        sb2.append(this.c);
        sb2.append(", mItemDirection=");
        sb2.append(this.f4602d);
        sb2.append(", mLayoutDirection=");
        sb2.append(this.f4603e);
        sb2.append(", mStartLine=");
        sb2.append(this.f4604f);
        sb2.append(", mEndLine=");
        return androidx.activity.f.n(sb2, this.f4605g, '}');
    }
}
