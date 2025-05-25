package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class H7 extends X6 {

    /* renamed from: l  reason: collision with root package name */
    public int f14316l;

    /* renamed from: m  reason: collision with root package name */
    public final byte f14317m;

    /* renamed from: n  reason: collision with root package name */
    public String f14318n;

    /* renamed from: o  reason: collision with root package name */
    public List f14319o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String borderStrokeStyle, String borderCornerStyle, String borderColor, String backgroundColor, int i18, byte b10, String textColor, List textStyles, K7 k72) {
        super(i10, i11, i12, i13, i14, i15, i16, i17, "fill", borderStrokeStyle, borderCornerStyle, borderColor, backgroundColor, k72);
        kotlin.jvm.internal.g.e(borderStrokeStyle, "borderStrokeStyle");
        kotlin.jvm.internal.g.e(borderCornerStyle, "borderCornerStyle");
        kotlin.jvm.internal.g.e(borderColor, "borderColor");
        kotlin.jvm.internal.g.e(backgroundColor, "backgroundColor");
        kotlin.jvm.internal.g.e(textColor, "textColor");
        kotlin.jvm.internal.g.e(textStyles, "textStyles");
        this.f14316l = i18;
        this.f14317m = b10;
        this.f14318n = textColor.length() == 0 ? "#ff000000" : textColor;
        int min = Math.min(textStyles.size(), 4);
        this.f14319o = new ArrayList();
        for (int i19 = 0; i19 < min; i19++) {
            this.f14319o.add(textStyles.get(i19));
        }
    }

    @Override // com.inmobi.media.X6
    public final String a() {
        String str = this.f14849j;
        Locale locale = Locale.US;
        return a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }
}
