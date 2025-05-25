package com.airbnb.lottie.model.content;

import e3.k;
import g3.c;
import g3.s;
import l3.b;

/* loaded from: classes.dex */
public final class ShapeTrimPath implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Type f6084a;

    /* renamed from: b  reason: collision with root package name */
    public final k3.b f6085b;
    public final k3.b c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.b f6086d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6087e;

    /* loaded from: classes.dex */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException(b.a.c("Unknown trim path type ", i10));
            }
            return SIMULTANEOUSLY;
        }
    }

    public ShapeTrimPath(String str, Type type, k3.b bVar, k3.b bVar2, k3.b bVar3, boolean z10) {
        this.f6084a = type;
        this.f6085b = bVar;
        this.c = bVar2;
        this.f6086d = bVar3;
        this.f6087e = z10;
    }

    @Override // l3.b
    public final c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new s(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f6085b + ", end: " + this.c + ", offset: " + this.f6086d + "}";
    }
}
