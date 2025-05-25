package com.inmobi.media;

import java.util.ArrayList;

/* renamed from: com.inmobi.media.e7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1612e7 extends H7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612e7(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, String textColor, ArrayList textStyles, K7 nativeAnimationTimer) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, 12, (byte) 0, "#ff000000", ge.a.J("none"), nativeAnimationTimer);
        kotlin.jvm.internal.g.e(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.g.e(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.g.e(borderColor, "borderColor");
        kotlin.jvm.internal.g.e(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.g.e(textColor, "textColor");
        kotlin.jvm.internal.g.e(textStyles, "textStyles");
        kotlin.jvm.internal.g.e(nativeAnimationTimer, "nativeAnimationTimer");
        this.f14316l = i18;
        this.f14318n = textColor.length() == 0 ? "#ff000000" : textColor;
        int min = Math.min(textStyles.size(), 1);
        this.f14319o = new ArrayList();
        if (min < 0) {
            return;
        }
        int i19 = 0;
        while (true) {
            this.f14319o.add(textStyles.get(i19));
            if (i19 == min) {
                return;
            }
            i19++;
        }
    }
}
