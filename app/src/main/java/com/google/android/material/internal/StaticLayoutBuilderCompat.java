package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f12618a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f12619b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f12620d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12627k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f12621e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f12622f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: g  reason: collision with root package name */
    public float f12623g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f12624h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f12625i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12626j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f12628l = null;

    /* loaded from: classes2.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        public StaticLayoutBuilderCompatException(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f12618a = charSequence;
        this.f12619b = textPaint;
        this.c = i10;
        this.f12620d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f12618a == null) {
            this.f12618a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f12618a;
        int i10 = this.f12622f;
        TextPaint textPaint = this.f12619b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f12628l);
        }
        int min = Math.min(charSequence.length(), this.f12620d);
        this.f12620d = min;
        if (this.f12627k && this.f12622f == 1) {
            this.f12621e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f12621e);
        obtain.setIncludePad(this.f12626j);
        if (this.f12627k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f12628l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f12622f);
        float f10 = this.f12623g;
        if (f10 != 0.0f || this.f12624h != 1.0f) {
            obtain.setLineSpacing(f10, this.f12624h);
        }
        if (this.f12622f > 1) {
            obtain.setHyphenationFrequency(this.f12625i);
        }
        return obtain.build();
    }
}
