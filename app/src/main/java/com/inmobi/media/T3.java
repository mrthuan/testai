package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public final class T3 implements Y3 {

    /* renamed from: a  reason: collision with root package name */
    public long f14707a;

    @Override // com.inmobi.media.qc
    public final boolean a(View view, View view2, int i10, Object obj) {
        if (view2 == null || view2.getVisibility() != 0) {
            return false;
        }
        if ((view != null ? view.getParent() : null) == null || !view2.isShown()) {
            return false;
        }
        S9 s92 = view2 instanceof S9 ? (S9) view2 : null;
        if (s92 == null) {
            return false;
        }
        if (s92.getPlacementType() == 1 || (s92.getHeight() > 0 && s92.getWidth() > 0)) {
            Rect rect = new Rect();
            if (s92.getGlobalVisibleRect(rect)) {
                this.f14707a = rect.height() * rect.width();
                if (s92.getPlacementType() == 1) {
                    s92.setConfiguredArea(s92.getHeight() * s92.getWidth());
                }
                if (s92.getArea() > 0) {
                    return ((long) 100) * this.f14707a >= s92.getConfiguredArea() * ((long) i10);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
        if (((android.graphics.drawable.ColorDrawable) r6).getColor() == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (r5.getBackground() == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (((android.graphics.drawable.ColorDrawable) r5).getColor() == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
        if (r5.getForeground() == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fe, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
        if (r5 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0106, code lost:
        if (r5 != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[SYNTHETIC] */
    @Override // com.inmobi.media.qc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.View r13, android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.T3.a(android.view.View, android.view.View, int):boolean");
    }
}
