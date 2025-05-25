package com.bumptech.glide;

import com.bumptech.glide.g;

/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class g<CHILD extends g<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public n4.e<? super TranscodeType> f6866a = n4.c.f22338b;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
