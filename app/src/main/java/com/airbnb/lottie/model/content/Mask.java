package com.airbnb.lottie.model.content;

import k3.d;
import k3.h;

/* loaded from: classes.dex */
public final class Mask {

    /* renamed from: a  reason: collision with root package name */
    public final MaskMode f6054a;

    /* renamed from: b  reason: collision with root package name */
    public final h f6055b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6056d;

    /* loaded from: classes.dex */
    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, h hVar, d dVar, boolean z10) {
        this.f6054a = maskMode;
        this.f6055b = hVar;
        this.c = dVar;
        this.f6056d = z10;
    }
}
