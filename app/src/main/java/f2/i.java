package f2;

import android.view.View;
import java.util.HashMap;

/* compiled from: SidePropagation.java */
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.w {

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f17031e = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: d  reason: collision with root package name */
    public int f17032d = 80;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
        if (r7 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bf, code lost:
        if (r7 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
        r7 = 3;
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c4, code lost:
        r7 = 3;
        r10 = 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    @Override // androidx.fragment.app.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A(android.view.ViewGroup r19, f2.k r20, f2.r r21, f2.r r22) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.A(android.view.ViewGroup, f2.k, f2.r, f2.r):long");
    }

    @Override // androidx.fragment.app.w
    public final void y(r rVar) {
        HashMap hashMap = rVar.f17075a;
        Integer num = (Integer) hashMap.get("android:visibility:visibility");
        View view = rVar.f17076b;
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        hashMap.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int round = Math.round(view.getTranslationX()) + r2[0];
        int[] iArr = {round};
        iArr[0] = (view.getWidth() / 2) + round;
        int round2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = round2;
        iArr[1] = (view.getHeight() / 2) + round2;
        hashMap.put("android:visibilityPropagation:center", iArr);
    }

    @Override // androidx.fragment.app.w
    public final /* bridge */ /* synthetic */ void z() {
    }
}
