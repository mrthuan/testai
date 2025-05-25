package pdf.pdfreader.viewer.editor.free.feature.billing;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.activity.s;
import androidx.lifecycle.LiveData;
import ig.h;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.a0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import ol.b;
import ol.d;
import ol.e;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.billing.i;
import pdf.pdfreader.viewer.editor.free.datasource.sp.SharePreferencesImpl;
import pdf.pdfreader.viewer.editor.free.datasource.sp.a;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.c;

/* compiled from: BillingConfigImpl.kt */
/* loaded from: classes3.dex */
public final class BillingConfigImpl extends SharePreferencesImpl implements i {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static Boolean E;
    public static final a F;
    public static final a G;
    public static Boolean H;
    public static final a I;
    public static Boolean J;
    public static final a K;
    public static Boolean L;
    public static final a M;
    public static Boolean N;
    public static final a O;
    public static Boolean P;
    public static final a Q;
    public static Boolean R;
    public static final BillingConfigImpl c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f24850d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f24851e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f24852f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f24853g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f24854h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f24855i;

    /* renamed from: j  reason: collision with root package name */
    public static final StateFlowImpl f24856j;

    /* renamed from: k  reason: collision with root package name */
    public static final c f24857k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f24858l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f24859m;

    /* renamed from: n  reason: collision with root package name */
    public static final c f24860n;

    /* renamed from: o  reason: collision with root package name */
    public static final c f24861o;

    /* renamed from: p  reason: collision with root package name */
    public static final c f24862p;

    /* renamed from: q  reason: collision with root package name */
    public static final c f24863q;

    /* renamed from: r  reason: collision with root package name */
    public static final a f24864r;

    /* renamed from: s  reason: collision with root package name */
    public static final a f24865s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f24866t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f24867u;

    /* renamed from: v  reason: collision with root package name */
    public static final c f24868v;

    /* renamed from: w  reason: collision with root package name */
    public static final c f24869w;

    /* renamed from: x  reason: collision with root package name */
    public static final c f24870x;

    /* renamed from: y  reason: collision with root package name */
    public static final c f24871y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f24872z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("IXMWcgdtMHUlVRVlRkIuU11yJGVy", "xyHFbYxx"), ea.a.p("WnMbchZtC3UfVUdlG0IvUyFyRGU0KGpa", "SkBmx9gc"), 0);
        kotlin.jvm.internal.i.f19949a.getClass();
        f24850d = new h[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMbchZtC3UfVUdlG0IvRCFiR2c=", "8ImLbdSS"), ea.a.p("JnNhchxtXnU3VTllB0IRRFBiG2dtKVo=", "Z21LCnDY"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("Wm4lZQFPAXI0clFlPHMzQyt1XHQ=", "5XwcycUz"), ea.a.p("VGU_SR1uB3I9Y0ZGG2UzVTdlcW8zbjcoY0k=", "JH1uBuI0"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMEQyFGF2M2aUdwBWEvUzFiQWM0aSFl", "TJtZpS5G"), ea.a.p("B3MpQ2RGOWMMaRVwWGEuU01iIWM7aVRlXCla", "9Gnf6LkM"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("XGM5VAFpA2wmaURTAW93", "DCX5TTcG"), ea.a.p("VWVHTytyF3IhYQpUXXAEaFd3eila", "2M23HCCq"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("K3ACclZ0NFAMRihlUWQHcl1tO3Vt", "7DDg7QsB"), ea.a.p("VGU_TwNlEGEGZWREL04zZSBQQGUraTZtbila", "FcD5yjiC"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("PHBdYQpoZHU4cylyHHAcaVpuPWgqdyZvQ250", "4DED6pwn"), ea.a.p("E2U8Ux9sGHMgUxNiR2MlaUh0O28nU15vA0MedT90ailJ", "DktHoyWV"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("PHBdYQpoZHU4cylyHHAcaVpuPWgqdzFpVWU=", "1Rmx8zvZ"), ea.a.p("KGVFUwlsVnMyUz9iBmMaaUV0B28rUw1vG1Q_bQsobUo=", "Ph4KlVnD"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("XmU_YSdyC2EeUlFjBnJk", "t85m9Oic"), ea.a.p("FWUsTVJ0G1Q6aQdsZmU0b0pkeikFald2FS8dYT9nbVMGcjFuUDs=", "wArX7zRT"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMEcBZyA3QXUHBGJ2UzZBd1UHMlcipiZQ==", "s5JI61SS"), ea.a.p("HnMrcC1yLHQtUCJGemUyZGt1MHMqcl9iEShYSQ==", "HTwdHMsx"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("JnN-cBxyVnQ_UA5GO2UNZGZ1DHMmcgxiD0QGYhdn", "DDkTjcbG"), ea.a.p("JnN-cBxyVnQ_UA5GO2UNZGZ1DHMmcgxiDEQjYjpnQCla", "VnPviFOh"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMcbwFkUFA2RnplDGQFdSZzUXIvYmU=", "1a2ltZ5r"), ea.a.p("WnMcbwFkUFA2RnplDGQFdSZzUXIvYiYoGUk=", "0IAvOd8S"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMbRDUyK20TZ1FODGUyUzFiQWM0aSFl", "dFGanrAa"), ea.a.p("WnMbRDUyK20TZ1FODGUyUzFiQWM0aSFlbylJ", "GupU51zQ"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("XnMVRBwyLW86ZChlUWQEdVpzMXIgYmU=", "tZ7EZzVy"), ea.a.p("JnNhRD8yYG8oZARlEGQ7dVdzDXIsYgAocUk=", "BKgLX1cL"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("IXM9aQtuAkQOTgNlUFMiYktjIGkrZQ==", "qlHnlR7X"), ea.a.p("JnNiaR5uZ0QcTi9lEVMdYkZjHGknZU0pSQ==", "APGOmk4G"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("WnMKSTBoA3Q8ZVFkOnU0cydyW2Jl", "bdxf800k"), ea.a.p("WnMKSTBoA3Q8ZVFkOnU0cydyW2IjKGpJ", "CppyYNxa"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("LXMnZBN0YGUwdChlUWQEdVpzMXIgYmU=", "L9Dbz46C"), ea.a.p("JnN0ZBB0Y2UidARlEGQ7dVdzDXIsYgAoXkk=", "UZYswIiI"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("JnNhYR5lemE0YS1lB04NZVFTG2I2YxdpEGU=", "OdvtrmEx"), ea.a.p("JnNhYR5lemE0YS1lB04NZVFTG2I2YxdpJ2VqKUk=", "iEjCEBie"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("UG8-cBxuNmUBdHFTHWEiZQ==", "eAoSgvYe"), ea.a.p("MGU7Qyh1PW8mVANzQEUEdFl0NyhgSQ==", "sZWOGMYH"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("LG9EcBZuY2UpdA9EHGEEb1JTBm8yVAxtZQ==", "TbzVYp4M"), ea.a.p("VGU_Qxx1Em8cVFFzHUUSaSVsXWcVaCx3NmksZRApSg==", "bA8yqfSx"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("Wm8jcA1uYGU7dCNFWmQDaVVl", "Le9Vb4Cz"), ea.a.p("VGU_Qxx1Em8cVFFzHUUTbiBUW20jKGpK", "OdCZcSxW"), 0), new MutablePropertyReference1Impl(BillingConfigImpl.class, ea.a.p("UG8-cBxuNmUBdHFTAW8hQyt1XHQ=", "PuSMFivp"), ea.a.p("L2UHQyl1J28mVANzQEUEaFd3EW88bkIoXUk=", "yqHsFWHC"), 0)};
        BillingConfigImpl billingConfigImpl = new BillingConfigImpl();
        c = billingConfigImpl;
        f24851e = kotlin.a.a(new cg.a<r<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$isSupportFlow$2
            @Override // cg.a
            public final r<Boolean> invoke() {
                return t0.a(Boolean.valueOf(BillingConfigImpl.c.z()));
            }
        });
        f24852f = true;
        f24853g = true;
        f24854h = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("fjUx", "VcgDIE8n"), 2);
        f24855i = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("AjUx", "AXUE5a9Z"), 2);
        f24856j = t0.a(Boolean.valueOf(billingConfigImpl.w()));
        f24857k = kotlin.a.a(new cg.a<r<d>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$productInfo$2
            @Override // cg.a
            public final r<d> invoke() {
                return t0.a(e.c);
            }
        });
        f24858l = kotlin.a.a(new cg.a<r<ol.h>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$testC1Plan$2
            @Override // cg.a
            public final r<ol.h> invoke() {
                return t0.a(e.f23479b);
            }
        });
        f24859m = kotlin.a.a(new cg.a<r<ol.h>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$testC2Plan$2
            @Override // cg.a
            public final r<ol.h> invoke() {
                return t0.a(e.f23479b);
            }
        });
        f24860n = kotlin.a.a(new cg.a<r<b>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$testECouponPlan$2
            @Override // cg.a
            public final r<b> invoke() {
                return t0.a(e.f23478a);
            }
        });
        f24861o = kotlin.a.a(new cg.a<r<d>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$testHInfo$2
            @Override // cg.a
            public final r<d> invoke() {
                return t0.a(e.f23480d);
            }
        });
        f24862p = kotlin.a.a(new cg.a<r<d>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$blackFridayPlan$2
            @Override // cg.a
            public final r<d> invoke() {
                return t0.a(e.f23481e);
            }
        });
        f24863q = kotlin.a.a(new cg.a<r<ol.a>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$coffeePrice$2
            @Override // cg.a
            public final r<ol.a> invoke() {
                return t0.a(e.f23482f);
            }
        });
        f24864r = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, -1, ea.a.p("fjc1", "8th8vx1k"), 2);
        f24865s = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("QDc1", "pbq4HGOB"), 2);
        f24866t = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("Uzc1", "hnb9xXvT"), 2);
        f24867u = true;
        f24868v = kotlin.a.a(new cg.a<r<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$billingEntranceRemoteConfig$2
            @Override // cg.a
            public final r<Boolean> invoke() {
                return t0.a(Boolean.TRUE);
            }
        });
        f24869w = kotlin.a.a(new cg.a<a0<? extends Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$billingEntranceConfig$2

            /* compiled from: BillingConfigImpl.kt */
            @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$billingEntranceConfig$2$1", f = "BillingConfigImpl.kt", l = {}, m = "invokeSuspend")
            /* renamed from: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$billingEntranceConfig$2$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements cg.r<Boolean, Boolean, Boolean, kotlin.coroutines.c<? super Boolean>, Object> {
                /* synthetic */ boolean Z$0;
                /* synthetic */ boolean Z$1;
                /* synthetic */ boolean Z$2;
                int label;

                public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(4, cVar);
                }

                @Override // cg.r
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, kotlin.coroutines.c<? super Boolean> cVar) {
                    return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z10;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        s.u0(obj);
                        boolean z11 = this.Z$0;
                        boolean z12 = this.Z$1;
                        boolean z13 = this.Z$2;
                        if (z11 && !z12 && z13) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Object invoke(boolean z10, boolean z11, boolean z12, kotlin.coroutines.c<? super Boolean> cVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
                    anonymousClass1.Z$0 = z10;
                    anonymousClass1.Z$1 = z11;
                    anonymousClass1.Z$2 = z12;
                    return anonymousClass1.invokeSuspend(tf.d.f30009a);
                }
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1] */
            @Override // cg.a
            public final a0<? extends Boolean> invoke() {
                BillingConfigImpl.c.getClass();
                StateFlowImpl stateFlowImpl = BillingConfigImpl.f24856j;
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                final kotlinx.coroutines.flow.c[] cVarArr = {(r) BillingConfigImpl.f24851e.getValue(), stateFlowImpl, (r) BillingConfigImpl.f24868v.getValue()};
                ?? r02 = new kotlinx.coroutines.flow.c<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

                    /* compiled from: Zip.kt */
                    @wf.c(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {333, 262}, m = "invokeSuspend")
                    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2  reason: invalid class name */
                    /* loaded from: classes.dex */
                    public static final class AnonymousClass2 extends SuspendLambda implements cg.q<d<Object>, Object[], kotlin.coroutines.c<? super tf.d>, Object> {
                        final /* synthetic */ cg.r $transform$inlined;
                        private /* synthetic */ Object L$0;
                        /* synthetic */ Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(kotlin.coroutines.c cVar, cg.r rVar) {
                            super(3, cVar);
                            this.$transform$inlined = rVar;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            d dVar;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i10 = this.label;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        androidx.activity.s.u0(obj);
                                        return tf.d.f30009a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                dVar = (d) this.L$0;
                                androidx.activity.s.u0(obj);
                            } else {
                                androidx.activity.s.u0(obj);
                                dVar = (d) this.L$0;
                                Object[] objArr = (Object[]) this.L$1;
                                cg.r rVar = this.$transform$inlined;
                                Object obj2 = objArr[0];
                                Object obj3 = objArr[1];
                                Object obj4 = objArr[2];
                                this.L$0 = dVar;
                                this.label = 1;
                                obj = rVar.invoke(obj2, obj3, obj4, this);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            this.L$0 = null;
                            this.label = 2;
                            if (dVar.emit(obj, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return tf.d.f30009a;
                        }

                        @Override // cg.q
                        public final Object invoke(d<Object> dVar, Object[] objArr, kotlin.coroutines.c<? super tf.d> cVar) {
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar, this.$transform$inlined);
                            anonymousClass2.L$0 = dVar;
                            anonymousClass2.L$1 = objArr;
                            return anonymousClass2.invokeSuspend(tf.d.f30009a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.c
                    public final Object a(d<? super Object> dVar, kotlin.coroutines.c cVar) {
                        Object a10 = kotlinx.coroutines.flow.internal.g.a(cVarArr, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new AnonymousClass2(null, anonymousClass1), dVar, cVar);
                        if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return a10;
                        }
                        return tf.d.f30009a;
                    }
                };
                lg.b bVar = j0.f20206a;
                return o.a(r02, x.a(l.f20194a), Boolean.TRUE);
            }
        });
        f24870x = kotlin.a.a(new cg.a<LiveData<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$billingEntranceConfigLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LiveData<Boolean> invoke() {
                BillingConfigImpl.c.getClass();
                return androidx.lifecycle.h.a((a0) BillingConfigImpl.f24869w.getValue());
            }
        });
        f24871y = kotlin.a.a(new cg.a<LiveData<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl$isPremiumUserLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final LiveData<Boolean> invoke() {
                BillingConfigImpl.c.getClass();
                return androidx.lifecycle.h.a(BillingConfigImpl.f24856j);
            }
        });
        f24872z = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("AjUx", "HhEpUacH"), 2);
        A = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("fjU1", "dDGIrr34"), 2);
        B = com.google.android.play.core.assetpacks.c.M(billingConfigImpl, ea.a.p("AjU1", "czS2Y1YB"), 2);
        C = com.google.android.play.core.assetpacks.c.T(billingConfigImpl, "", ea.a.p("ejc2", "j3K9X9Lc"), 2);
        D = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("eTU2", "LPH7QAD1"), 2);
        F = com.google.android.play.core.assetpacks.c.i(billingConfigImpl, false, ea.a.p("RDU2", "KhuHT4lL"), 2);
        G = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("fjYw", "vEbfUXhC"), 2);
        I = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("AjY5", "K5pd8apl"), 2);
        K = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("AjY5", "bnuL5JLr"), 2);
        M = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("fjYw", "UoOEnwxH"), 2);
        com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("XTYy", "NClQv2qY"), 2);
        O = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("fjcw", "KcEGnjGV"), 2);
        Q = com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("Ajcz", "TaiDT4ZY"), 2);
        com.google.android.play.core.assetpacks.c.J(billingConfigImpl, -1, ea.a.p("AjU4", "a4n4fRMg"), 2);
        com.google.android.play.core.assetpacks.c.M(billingConfigImpl, ea.a.p("fjU4", "8zBobeI2"), 2);
        com.google.android.play.core.assetpacks.c.M(billingConfigImpl, ea.a.p("AjU4", "PeRl5K01"), 2);
        com.google.android.play.core.assetpacks.c.J(billingConfigImpl, 0, ea.a.p("AjU4", "Zf5Qh2na"), 2);
    }

    public BillingConfigImpl() {
        super(ea.a.p("LWldbBBuUF85byRmHGc=", "23kzrZWk"));
    }

    public static boolean A() {
        boolean z10;
        boolean z11;
        Boolean bool = H;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object>[] hVarArr = f24850d;
        h<Object> hVar = hVarArr[11];
        a aVar = G;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z12 = false;
        int i10 = 1;
        if (intValue == 0) {
            SharePreferencesImpl.c();
            String h10 = de.e.h(c1.Q, "");
            if (h10 != null && h10.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                ea.a.p("FWklbAtuN18_bxRka3Q4X0hkNF86dVRzF3IYcCVpLW4obzllDF9hNXEgBW9aZj5nGGkhIC1lUGEBbHQ=", "9xwIbPZq");
            } else {
                z12 = TextUtils.equals(ea.a.p("MQ==", "ykB5ht83"), h10);
            }
            if (!z12) {
                i10 = 2;
            }
            aVar.c(hVarArr[11], Integer.valueOf(i10));
            H = Boolean.valueOf(z12);
        } else {
            if (intValue == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            H = Boolean.valueOf(z10);
            if (intValue == 1) {
                return true;
            }
        }
        return z12;
    }

    public static void B(int i10) {
        f24864r.c(f24850d[2], Integer.valueOf(i10));
    }

    public static void C(String str) {
        C.c(f24850d[8], str);
    }

    public static int j() {
        int intValue = ((Number) f24864r.b(f24850d[2])).intValue();
        if (intValue == -1) {
            g.d(ReaderPdfApplication.m(), ea.a.p("VGU_SR1zFmEcY1EoKQ==", "Rb75bITN"));
            c1 c1Var = c1.f28564a;
            String str = c1.f28596q0;
            c1Var.getClass();
            int l10 = c1.l(3, str);
            B(l10);
            return l10;
        }
        return intValue;
    }

    public static int l() {
        return ((Number) A.b(f24850d[6])).intValue();
    }

    public static boolean p() {
        return ((Boolean) f24865s.b(f24850d[3])).booleanValue();
    }

    public static boolean r() {
        boolean z10;
        boolean equals;
        if (!f24867u) {
            return false;
        }
        Application c10 = SharePreferencesImpl.c();
        String h10 = de.e.h(c1.Y, "");
        String x4 = com.google.android.play.core.assetpacks.c.x(c10);
        if (h10 != null && h10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            List<String> list = c1.f28610x0;
            Objects.toString(list);
            equals = list.contains(x4);
        } else {
            equals = TextUtils.equals(h10, ea.a.p("MQ==", "rYW2AEWe"));
        }
        if (!equals) {
            return false;
        }
        return true;
    }

    public static boolean s() {
        boolean z10;
        boolean equals;
        int i10 = (q0.j(SharePreferencesImpl.c()) > 63L ? 1 : (q0.j(SharePreferencesImpl.c()) == 63L ? 0 : -1));
        h<Object>[] hVarArr = f24850d;
        if (i10 < 0) {
            return ((Boolean) f24872z.b(hVarArr[5])).booleanValue();
        }
        Boolean bool = E;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object> hVar = hVarArr[9];
        a aVar = D;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z11 = false;
        int i11 = 1;
        if (intValue == 0) {
            Application c10 = SharePreferencesImpl.c();
            String h10 = de.e.h(c1.T, "");
            String x4 = com.google.android.play.core.assetpacks.c.x(c10);
            if (h10 == null || h10.length() == 0) {
                z11 = true;
            }
            if (z11) {
                List<String> list = c1.f28600s0;
                Objects.toString(list);
                equals = list.contains(x4);
            } else {
                equals = TextUtils.equals(h10, ea.a.p("MQ==", "6QpghCwE"));
            }
            if (!equals) {
                i11 = 2;
            }
            aVar.c(hVarArr[9], Integer.valueOf(i11));
            E = Boolean.valueOf(equals);
            return equals;
        }
        if (intValue == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        E = Boolean.valueOf(z10);
        if (intValue != 1) {
            return false;
        }
        return true;
    }

    public static boolean t() {
        boolean z10;
        boolean equals;
        Boolean bool = J;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object>[] hVarArr = f24850d;
        h<Object> hVar = hVarArr[12];
        a aVar = I;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z11 = false;
        int i10 = 1;
        if (intValue == 0) {
            Application c10 = SharePreferencesImpl.c();
            String h10 = de.e.h(c1.V, "");
            String x4 = com.google.android.play.core.assetpacks.c.x(c10);
            if (h10 == null || h10.length() == 0) {
                z11 = true;
            }
            if (z11) {
                List<String> list = c1.f28604u0;
                Objects.toString(list);
                equals = list.contains(x4);
            } else {
                equals = TextUtils.equals(h10, ea.a.p("MQ==", "UadT43OE"));
            }
            if (!equals) {
                i10 = 2;
            }
            aVar.c(hVarArr[12], Integer.valueOf(i10));
            J = Boolean.valueOf(equals);
            return equals;
        }
        if (intValue == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        J = Boolean.valueOf(z10);
        if (intValue != 1) {
            return false;
        }
        return true;
    }

    public static boolean u() {
        boolean z10;
        boolean equals;
        Boolean bool = L;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object>[] hVarArr = f24850d;
        h<Object> hVar = hVarArr[13];
        a aVar = K;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z11 = false;
        int i10 = 1;
        if (intValue == 0) {
            Application c10 = SharePreferencesImpl.c();
            String h10 = de.e.h(c1.W, "");
            String x4 = com.google.android.play.core.assetpacks.c.x(c10);
            if (h10 == null || h10.length() == 0) {
                z11 = true;
            }
            if (z11) {
                List<String> list = c1.f28606v0;
                Objects.toString(list);
                equals = list.contains(x4);
            } else {
                equals = TextUtils.equals(h10, ea.a.p("MQ==", "snZYwh3H"));
            }
            if (!equals) {
                i10 = 2;
            }
            aVar.c(hVarArr[13], Integer.valueOf(i10));
            L = Boolean.valueOf(equals);
            return equals;
        }
        if (intValue == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        L = Boolean.valueOf(z10);
        if (intValue != 1) {
            return false;
        }
        return true;
    }

    public static boolean v() {
        boolean z10;
        boolean equals;
        Boolean bool = R;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object>[] hVarArr = f24850d;
        h<Object> hVar = hVarArr[17];
        a aVar = Q;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z11 = false;
        int i10 = 1;
        if (intValue == 0) {
            Application c10 = SharePreferencesImpl.c();
            String h10 = de.e.h(c1.X, "");
            String x4 = com.google.android.play.core.assetpacks.c.x(c10);
            if (h10 == null || h10.length() == 0) {
                z11 = true;
            }
            if (z11) {
                List<String> list = c1.f28608w0;
                Objects.toString(list);
                equals = list.contains(x4);
            } else {
                equals = TextUtils.equals(h10, ea.a.p("MQ==", "WY3UMEoL"));
            }
            if (!equals) {
                i10 = 2;
            }
            aVar.c(hVarArr[17], Integer.valueOf(i10));
            R = Boolean.valueOf(equals);
            return equals;
        }
        if (intValue == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        R = Boolean.valueOf(z10);
        if (intValue != 1) {
            return false;
        }
        return true;
    }

    public static LiveData x() {
        return (LiveData) f24871y.getValue();
    }

    public static boolean y() {
        boolean z10;
        boolean z11;
        Boolean bool = N;
        if (bool != null) {
            return bool.booleanValue();
        }
        c.getClass();
        h<Object>[] hVarArr = f24850d;
        h<Object> hVar = hVarArr[14];
        a aVar = M;
        int intValue = ((Number) aVar.b(hVar)).intValue();
        boolean z12 = false;
        int i10 = 1;
        if (intValue == 0) {
            SharePreferencesImpl.c();
            String h10 = de.e.h(c1.R, "");
            if (h10 != null && h10.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                ea.a.p("DWkjbD1uIV87YRBla3M-Z1ZfIXUrc1VyHXAFaT5uHW8fZSFfZTZ2ICtvCGZdZ3dpSyA2ZS9hQ2x0", "qQoOTFch");
            } else {
                z12 = TextUtils.equals(ea.a.p("MQ==", "Cua7FT68"), h10);
            }
            if (!z12) {
                i10 = 2;
            }
            aVar.c(hVarArr[14], Integer.valueOf(i10));
            N = Boolean.valueOf(z12);
        } else {
            if (intValue == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            N = Boolean.valueOf(z10);
            if (intValue == 1) {
                return true;
            }
        }
        return z12;
    }

    public final void D(boolean z10) {
        StateFlowImpl stateFlowImpl;
        Object b10;
        f24854h.c(f24850d[0], Boolean.valueOf(z10));
        do {
            stateFlowImpl = f24856j;
            b10 = stateFlowImpl.b();
            ((Boolean) b10).booleanValue();
        } while (!stateFlowImpl.c(b10, Boolean.valueOf(w())));
    }

    public final boolean h() {
        Object obj;
        boolean z10;
        Iterator<T> it = m().b().c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ol.i) obj).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        Object obj;
        boolean z10;
        Iterator<T> it = k().b().c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ol.i) obj).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final r<d> k() {
        return (r) f24857k.getValue();
    }

    public final r<d> m() {
        return (r) f24861o.getValue();
    }

    public final boolean n() {
        Object obj;
        boolean z10;
        c cVar = f24862p;
        if (g.a(((r) cVar.getValue()).b(), e.f23481e)) {
            return false;
        }
        Iterator<T> it = ((d) ((r) cVar.getValue()).b()).c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ol.i) obj).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            return false;
        }
        return true;
    }

    public final boolean o(Context context) {
        g.e(context, "context");
        if (g.a(c1.e(context), ea.a.p("ezI=", "U2ajskhY"))) {
            return h();
        }
        return i();
    }

    public final boolean q() {
        return c1.E(SharePreferencesImpl.c());
    }

    public final boolean w() {
        h<Object>[] hVarArr = f24850d;
        if (!((Boolean) f24854h.b(hVarArr[0])).booleanValue()) {
            if (!((Boolean) f24855i.b(hVarArr[1])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean z() {
        if (f24852f && f24853g) {
            return true;
        }
        return false;
    }
}
