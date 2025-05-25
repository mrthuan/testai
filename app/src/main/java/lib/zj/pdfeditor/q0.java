package lib.zj.pdfeditor;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: SearchTaskResult.java */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: d  reason: collision with root package name */
    public static q0 f21567d;

    /* renamed from: a  reason: collision with root package name */
    public final String f21568a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21569b;
    public final RectF[] c;

    public q0(String str, int i10, RectF[] rectFArr) {
        this.f21568a = str;
        this.f21569b = i10;
        this.c = rectFArr;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchTaskResult{txt='");
        sb2.append(this.f21568a);
        sb2.append("', pageNumber=");
        sb2.append(this.f21569b);
        sb2.append(", searchBoxes=");
        return androidx.activity.r.f(sb2, Arrays.toString(this.c), '}');
    }
}
