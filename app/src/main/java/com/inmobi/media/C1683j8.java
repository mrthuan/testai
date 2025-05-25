package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.TextView;

/* renamed from: com.inmobi.media.j8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1683j8 extends TextView {
    public C1683j8(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (getLineHeight() > 0) {
            i14 = i11 / getLineHeight();
        } else {
            i14 = 0;
        }
        if (i14 > 0) {
            setSingleLine(false);
            setLines(i14);
        }
        if (i14 == 1) {
            setSingleLine();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
