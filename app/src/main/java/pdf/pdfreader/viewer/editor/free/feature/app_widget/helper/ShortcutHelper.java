package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.y0;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.base.extension.HarmonyExtKt;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionState;

/* compiled from: ShortcutHelper.kt */
/* loaded from: classes3.dex */
public final class ShortcutHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24790a = new a();

    /* compiled from: ShortcutHelper.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: ShortcutHelper.kt */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24797a;

            static {
                int[] iArr = new int[ShortcutPermissionState.values().length];
                try {
                    iArr[ShortcutPermissionState.ALLOW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ShortcutPermissionState.ASK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ShortcutPermissionState.DENY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f24797a = iArr;
            }
        }

        public static boolean a(Context context) {
            boolean isRequestPinAppWidgetSupported;
            kotlin.jvm.internal.g.e(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                isRequestPinAppWidgetSupported = AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
                if (isRequestPinAppWidgetSupported) {
                    return true;
                }
            }
            return false;
        }

        public static void b(final String path, final androidx.appcompat.app.c activity, final f fVar, final b bVar, cg.a aVar) {
            kotlin.jvm.internal.g.e(path, "path");
            kotlin.jvm.internal.g.e(activity, "activity");
            final PinShortcutUseCase pinShortcutUseCase = new PinShortcutUseCase(activity, ShortcutHelper.f24790a);
            cg.a<y0> aVar2 = new cg.a<y0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$showRationale$1

                /* compiled from: ShortcutHelper.kt */
                @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$showRationale$1$1", f = "ShortcutHelper.kt", l = {}, m = "invokeSuspend")
                /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$showRationale$1$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, kotlin.coroutines.c<? super tf.d>, Object> {
                    final /* synthetic */ androidx.appcompat.app.c $activity;
                    final /* synthetic */ b $appSettingPermissionIntroducer;
                    final /* synthetic */ String $path;
                    final /* synthetic */ f $shortcutRationaleHelper;
                    /* synthetic */ boolean Z$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(String str, androidx.appcompat.app.c cVar, f fVar, b bVar, kotlin.coroutines.c<? super AnonymousClass1> cVar2) {
                        super(2, cVar2);
                        this.$path = str;
                        this.$activity = cVar;
                        this.$shortcutRationaleHelper = fVar;
                        this.$appSettingPermissionIntroducer = bVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$path, this.$activity, this.$shortcutRationaleHelper, this.$appSettingPermissionIntroducer, cVar);
                        anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                        return anonymousClass1;
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, kotlin.coroutines.c<? super tf.d> cVar) {
                        return invoke(bool.booleanValue(), cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label == 0) {
                            s.u0(obj);
                            if (this.Z$0 && !((Boolean) HarmonyExtKt.f24026a.getValue()).booleanValue()) {
                                ShortcutHelper.a aVar = ShortcutHelper.f24790a;
                                ShortcutHelper.Companion.b(this.$path, this.$activity, this.$shortcutRationaleHelper, this.$appSettingPermissionIntroducer, null);
                            }
                            return tf.d.f30009a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Object invoke(boolean z10, kotlin.coroutines.c<? super tf.d> cVar) {
                        return ((AnonymousClass1) create(Boolean.valueOf(z10), cVar)).invokeSuspend(tf.d.f30009a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cg.a
                public final y0 invoke() {
                    f fVar2 = f.this;
                    if (fVar2 != null) {
                        return kotlinx.coroutines.flow.f.a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(path, activity, f.this, bVar, null), fVar2.b(activity, bVar, ShortcutType.ICON)), b.b.x(activity));
                    }
                    return null;
                }
            };
            int i10 = a.f24797a[ShortcutPermissionExtKt.b(activity).ordinal()];
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    aVar2.invoke();
                    return;
                }
                return;
            }
            final kotlinx.coroutines.flow.e eVar = new kotlinx.coroutines.flow.e(tf.d.f30009a);
            kotlinx.coroutines.flow.f.a(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ShortcutHelper$Companion$tryInstallIcon$3(activity, aVar, aVar2, null), new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ShortcutHelper$Companion$tryInstallIcon$2(null), new kotlinx.coroutines.flow.c<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.d {

                    /* renamed from: a  reason: collision with root package name */
                    public final /* synthetic */ kotlinx.coroutines.flow.d f24794a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ String f24795b;
                    public final /* synthetic */ PinShortcutUseCase c;

                    /* renamed from: d  reason: collision with root package name */
                    public final /* synthetic */ androidx.appcompat.app.c f24796d;

                    /* compiled from: Emitters.kt */
                    @wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2", f = "ShortcutHelper.kt", l = {250, 223}, m = "emit")
                    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.c cVar) {
                            super(cVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= SlideAtom.USES_MASTER_SLIDE_ID;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.d dVar, String str, PinShortcutUseCase pinShortcutUseCase, androidx.appcompat.app.c cVar) {
                        this.f24794a = dVar;
                        this.f24795b = str;
                        this.c = pinShortcutUseCase;
                        this.f24796d = cVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[RETURN] */
                    @Override // kotlinx.coroutines.flow.d
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.c r13) {
                        /*
                            r11 = this;
                            boolean r0 = r13 instanceof pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r13
                            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2$1 r0 = (pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2$1 r0 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1$2$1
                            r0.<init>(r13)
                        L18:
                            java.lang.Object r13 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r0.label
                            r9 = 2
                            r2 = 1
                            if (r1 == 0) goto L3c
                            if (r1 == r2) goto L33
                            if (r1 != r9) goto L2b
                            androidx.activity.s.u0(r13)
                            goto Ldb
                        L2b:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r13)
                            throw r12
                        L33:
                            java.lang.Object r12 = r0.L$0
                            kotlinx.coroutines.flow.d r12 = (kotlinx.coroutines.flow.d) r12
                            androidx.activity.s.u0(r13)
                            goto Lcf
                        L3c:
                            androidx.activity.s.u0(r13)
                            tf.d r12 = (tf.d) r12
                            java.io.File r12 = new java.io.File
                            java.lang.String r13 = r11.f24795b
                            r12.<init>(r13)
                            java.lang.String r1 = pdf.pdfreader.viewer.editor.free.utils.v.y(r12)
                            int r3 = r1.hashCode()
                            r4 = 2131231503(0x7f08030f, float:1.8079089E38)
                            switch(r3) {
                                case 79058: goto L7e;
                                case 79444: goto L71;
                                case 2670346: goto L64;
                                case 66411159: goto L57;
                                default: goto L56;
                            }
                        L56:
                            goto L84
                        L57:
                            java.lang.String r3 = "EXCEL"
                            boolean r1 = r1.equals(r3)
                            if (r1 != 0) goto L60
                            goto L84
                        L60:
                            r4 = 2131231506(0x7f080312, float:1.8079095E38)
                            goto L84
                        L64:
                            java.lang.String r3 = "WORD"
                            boolean r1 = r1.equals(r3)
                            if (r1 != 0) goto L6d
                            goto L84
                        L6d:
                            r4 = 2131231505(0x7f080311, float:1.8079093E38)
                            goto L84
                        L71:
                            java.lang.String r3 = "PPT"
                            boolean r1 = r1.equals(r3)
                            if (r1 != 0) goto L7a
                            goto L84
                        L7a:
                            r4 = 2131231504(0x7f080310, float:1.807909E38)
                            goto L84
                        L7e:
                            java.lang.String r3 = "PDF"
                            boolean r1 = r1.equals(r3)
                        L84:
                            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.PinShortcutUseCase r1 = r11.c
                            java.util.UUID r3 = java.util.UUID.randomUUID()
                            java.lang.String r3 = r3.toString()
                            java.lang.String r5 = "randomUUID().toString()"
                            kotlin.jvm.internal.g.d(r3, r5)
                            androidx.appcompat.app.c r5 = r11.f24796d
                            android.graphics.drawable.Icon r4 = android.graphics.drawable.Icon.createWithResource(r5, r4)
                            java.lang.String r6 = "createWithResource(activity, icon)"
                            kotlin.jvm.internal.g.d(r4, r6)
                            java.lang.String r13 = pdf.pdfreader.viewer.editor.free.utils.v.p(r13)
                            java.lang.String r6 = "getFileName(path)"
                            kotlin.jvm.internal.g.d(r13, r6)
                            java.lang.String r12 = r12.getPath()
                            if (r12 != 0) goto Laf
                            java.lang.String r12 = ""
                        Laf:
                            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
                            java.lang.String r6 = "activity.lifecycle"
                            kotlin.jvm.internal.g.d(r5, r6)
                            kotlinx.coroutines.flow.c r6 = pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.TryPinAppWidgetUseCaseKt.a(r5)
                            kotlinx.coroutines.flow.d r10 = r11.f24794a
                            r0.L$0 = r10
                            r0.label = r2
                            r2 = r3
                            r3 = r4
                            r4 = r13
                            r5 = r12
                            r7 = r0
                            java.lang.Object r13 = r1.a(r2, r3, r4, r5, r6, r7)
                            if (r13 != r8) goto Lce
                            return r8
                        Lce:
                            r12 = r10
                        Lcf:
                            r1 = 0
                            r0.L$0 = r1
                            r0.label = r9
                            java.lang.Object r12 = r12.emit(r13, r0)
                            if (r12 != r8) goto Ldb
                            return r8
                        Ldb:
                            tf.d r12 = tf.d.f30009a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutHelper$Companion$tryInstallIcon$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.c
                public final Object a(kotlinx.coroutines.flow.d<? super d> dVar, kotlin.coroutines.c cVar) {
                    Object a10 = eVar.a(new AnonymousClass2(dVar, path, pinShortcutUseCase, activity), cVar);
                    if (a10 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return a10;
                    }
                    return tf.d.f30009a;
                }
            }))), new ShortcutHelper$Companion$tryInstallIcon$4(null)), b.b.x(activity));
        }
    }

    /* compiled from: ShortcutHelper.kt */
    /* loaded from: classes3.dex */
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final CoroutineContext f24798a;

        public a() {
            lg.b bVar = j0.f20206a;
            m1 m1Var = new m1(null);
            bVar.getClass();
            this.f24798a = CoroutineContext.DefaultImpls.a(bVar, m1Var);
        }

        @Override // kotlinx.coroutines.w
        public final CoroutineContext n() {
            return this.f24798a;
        }
    }
}
