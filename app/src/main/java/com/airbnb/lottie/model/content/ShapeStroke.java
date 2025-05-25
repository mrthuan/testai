package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import e3.k;
import g3.c;
import g3.r;
import java.util.ArrayList;
import java.util.List;
import k3.d;
import l3.b;

/* loaded from: classes.dex */
public final class ShapeStroke implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f6071a;

    /* renamed from: b  reason: collision with root package name */
    public final k3.b f6072b;
    public final List<k3.b> c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.a f6073d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6074e;

    /* renamed from: f  reason: collision with root package name */
    public final k3.b f6075f;

    /* renamed from: g  reason: collision with root package name */
    public final LineCapType f6076g;

    /* renamed from: h  reason: collision with root package name */
    public final LineJoinType f6077h;

    /* renamed from: i  reason: collision with root package name */
    public final float f6078i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6079j;

    /* loaded from: classes.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i10 = a.f6082a[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i10 = a.f6083b[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6082a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6083b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f6083b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6083b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6083b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f6082a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6082a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6082a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, k3.b bVar, ArrayList arrayList, k3.a aVar, d dVar, k3.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f10, boolean z10) {
        this.f6071a = str;
        this.f6072b = bVar;
        this.c = arrayList;
        this.f6073d = aVar;
        this.f6074e = dVar;
        this.f6075f = bVar2;
        this.f6076g = lineCapType;
        this.f6077h = lineJoinType;
        this.f6078i = f10;
        this.f6079j = z10;
    }

    @Override // l3.b
    public final c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        return new r(kVar, aVar, this);
    }
}
