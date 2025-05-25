package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.s;
import androidx.lifecycle.Lifecycle;
import cg.l;
import cg.p;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.j;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.y0;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity.HomeScreenPermissionGuideActivity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShortcutRationaleHelper.kt */
@wf.c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1", f = "ShortcutRationaleHelper.kt", l = {ShapeTypes.DOUBLE_WAVE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ShortcutRationaleHelper$shortcutRationaleDialogFlow$1 extends SuspendLambda implements p<j<? super Boolean>, kotlin.coroutines.c<? super tf.d>, Object> {
    final /* synthetic */ androidx.appcompat.app.c $activity;
    final /* synthetic */ b $appSettingPermissionIntroducer;
    final /* synthetic */ ShortcutType $shortcutType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutRationaleHelper$shortcutRationaleDialogFlow$1(f fVar, androidx.appcompat.app.c cVar, ShortcutType shortcutType, b bVar, kotlin.coroutines.c<? super ShortcutRationaleHelper$shortcutRationaleDialogFlow$1> cVar2) {
        super(2, cVar2);
        this.this$0 = fVar;
        this.$activity = cVar;
        this.$shortcutType = shortcutType;
        this.$appSettingPermissionIntroducer = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ShortcutRationaleHelper$shortcutRationaleDialogFlow$1 shortcutRationaleHelper$shortcutRationaleDialogFlow$1 = new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1(this.this$0, this.$activity, this.$shortcutType, this.$appSettingPermissionIntroducer, cVar);
        shortcutRationaleHelper$shortcutRationaleDialogFlow$1.L$0 = obj;
        return shortcutRationaleHelper$shortcutRationaleDialogFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                s.u0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            s.u0(obj);
            final j jVar = (j) this.L$0;
            this.this$0.f24816a = new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a(this.$activity, this.$shortcutType);
            f fVar = this.this$0;
            fVar.f24817b = false;
            fVar.c.set(true);
            Lifecycle lifecycle = this.$activity.getLifecycle();
            kotlin.jvm.internal.g.d(lifecycle, "activity.lifecycle");
            final l1 a10 = kotlinx.coroutines.flow.f.a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$job$1(this.this$0, this.$activity, this.$shortcutType, jVar, null), TryPinAppWidgetUseCaseKt.a(lifecycle)), b.b.x(this.$activity));
            final f fVar2 = this.this$0;
            pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a aVar = fVar2.f24816a;
            if (aVar != null) {
                final androidx.appcompat.app.c cVar = this.$activity;
                final ShortcutType shortcutType = this.$shortcutType;
                final b bVar = this.$appSettingPermissionIntroducer;
                aVar.D = new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.c() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1.1
                    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.c
                    public final void a() {
                        Intent intent;
                        String p10 = ea.a.p("P2VDbRBzRGk1bg==", "jEXQQjTc");
                        String p11 = ea.a.p("UHU_cwNlEG0tYVhsBncJYyhpUWs=", "78hQSKTV");
                        tf.c cVar2 = WidgetEventCenter.f28682a;
                        final ShortcutType shortcutType2 = shortcutType;
                        String a11 = WidgetEventCenter.a(shortcutType2);
                        final androidx.appcompat.app.c cVar3 = androidx.appcompat.app.c.this;
                        tn.a.d(cVar3, p10, p11, a11, false);
                        tf.c cVar4 = ShortcutPermissionExtKt.f24844a;
                        kotlin.jvm.internal.g.e(cVar3, "<this>");
                        Intent intent2 = new Intent(ea.a.p("Um4vchxpBi4BZUB0AG4xc2pBYlAKSQBBH0kjTjpEJFRySQdTLFMnVCZJekdT", "Klea73aV"));
                        intent2.addFlags(335544320);
                        intent2.setData(Uri.fromParts(ea.a.p("KmFVay9nZQ==", "OJZ6N7gX"), cVar3.getPackageName(), null));
                        if (((Boolean) ShortcutPermissionExtKt.f24845b.getValue()).booleanValue()) {
                            intent = new Intent();
                            intent.setComponent(new ComponentName(ea.a.p("LG9cLhRpQml0cy9jAHIBdExjC24xZXI=", "lvjLQ2ui"), ea.a.p("Wm8_LhhpR2lmcANyWWMybkxlIC45ZURtHXMCaT5uMS5pZSBtHHNBaSduFUVQaSNvSkExdCB2X3R5", "IM9Ru2tl")));
                            intent.putExtra(ea.a.p("KnhFchhfR2s9bittZQ==", "WmdooLps"), cVar3.getPackageName());
                        } else if (((Boolean) ShortcutPermissionExtKt.f24844a.getValue()).booleanValue()) {
                            intent = new Intent();
                            intent.setComponent(new ComponentName(ea.a.p("UG8mLhFiCS4eYUFuCmgzcjI=", "zJk5boW6"), ea.a.p("UG8mLhFiCS4eYUFuCmgzcnYuW241dCJsPnNdb0N0AnVHLht1AXYLZQVBV3QAdj90eQ==", "R51aGQwk")));
                            if (cVar3.getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                                intent.setComponent(new ComponentName(ea.a.p("LG9cLg9pQW90cC9yGGkbc1xvAG0kbgRnU3I=", "VZZt6sc1"), ea.a.p("UG8mLgVpFG9ccFFyBGklcy1vXG0nbiJnNXJ9YTZ0LHZadDIuIG8EdCJlRm0AcyVpK252ZTJhKmwRYydpI2kxeQ==", "PSUEpSn0")));
                            }
                            if (cVar3.getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                                intent.setComponent(new ComponentName(ea.a.p("LG9cLhBxWG90cy9jAHJl", "iDGgX3Uh"), ea.a.p("UG8mLhpxDW9cc1FjHHIzLjdhVGUhdSJyPi42b1F0JmVBbSJzAGkNbjZlQGEAbBdjMGlEaTJ5", "Ze7vS93x")));
                            }
                        } else if (((Boolean) ShortcutPermissionExtKt.c.getValue()).booleanValue()) {
                            intent = new Intent();
                            intent.setComponent(new ComponentName(ea.a.p("UG8mLhxwEm9cbFV1B2M-ZXI=", "SAXGeiLQ"), ea.a.p("UG8mLhxwEm9cbFV1B2M-ZTYuQWgpcjdjPXRsUwlvQXRQdT9TFnQWaRxnR0EKdD92LXR5", "HBa3n8SF")));
                            if (cVar3.getPackageManager().queryIntentActivities(intent, 128).isEmpty()) {
                                intent.setComponent(new ComponentName(ea.a.p("UG8mLhBvDm8ALkdhD2U1ZSp0V3I=", "rH2ca6yJ"), ea.a.p("LG9cLhpvW28oLjlhE2ULZVt0C3JrcAByH2kccyNvOS4fZUNtEHNEaTVuB2EbYQ9lR0ENdCx2DHR5", "lURUroJW")));
                            }
                        } else {
                            intent = intent2;
                        }
                        Pair pair = new Pair(intent, intent2);
                        Intent intent3 = (Intent) pair.component1();
                        Intent intent4 = (Intent) pair.component2();
                        b bVar2 = bVar;
                        if (bVar2 != null) {
                            l<Boolean, tf.d> lVar = new l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return tf.d.f30009a;
                                }

                                public final void invoke(boolean z10) {
                                    if (z10) {
                                        androidx.appcompat.app.c cVar5 = androidx.appcompat.app.c.this;
                                        String p12 = ea.a.p("P2VDbRBzRGk1bg==", "EuifRJRe");
                                        String p13 = ea.a.p("UHU_cwNlEG0VdV1kDF8laCt3", "08cnIvWV");
                                        tf.c cVar6 = WidgetEventCenter.f28682a;
                                        tn.a.d(cVar5, p12, p13, WidgetEventCenter.a(shortcutType2), false);
                                        int i11 = HomeScreenPermissionGuideActivity.f24827v;
                                        HomeScreenPermissionGuideActivity.a.a(androidx.appcompat.app.c.this, shortcutType2);
                                    }
                                }
                            };
                            kotlin.jvm.internal.g.e(intent3, "intent");
                            kotlinx.coroutines.flow.f.a(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1$1$onAllowClicked$2(fVar2, androidx.appcompat.app.c.this, shortcutType, jVar, null), new CallbackFlowBuilder(new PermissionIntroducer$launchAppSettingFlow$1(bVar2, intent4, lVar, intent3, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND)), b.b.x(cVar3));
                        }
                    }

                    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.c
                    public final void b() {
                        String p10 = ea.a.p("JGUgbTNzAmknbg==", "nXTRZqjB");
                        String p11 = ea.a.p("L3UDcz9lRG0XYwpvR2UIY1RpMWs=", "g9LwO6tI");
                        tf.c cVar2 = WidgetEventCenter.f28682a;
                        tn.a.d(androidx.appcompat.app.c.this, p10, p11, WidgetEventCenter.a(shortcutType), false);
                        if (fVar2.c.getAndSet(false)) {
                            jVar.v(Boolean.FALSE);
                        }
                    }
                };
            }
            androidx.appcompat.app.c cVar2 = this.$activity;
            tf.c cVar3 = WidgetEventCenter.f28682a;
            tn.a.d(cVar2, "permission", "cutsperm_show", WidgetEventCenter.a(this.$shortcutType), false);
            pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a aVar2 = this.this$0.f24816a;
            if (aVar2 != null) {
                aVar2.show();
            }
            cg.a<tf.d> aVar3 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.ShortcutRationaleHelper$shortcutRationaleDialogFlow$1.2
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    y0.this.b(null);
                }
            };
            this.label = 1;
            if (ProduceKt.a(jVar, aVar3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tf.d.f30009a;
    }

    @Override // cg.p
    public final Object invoke(j<? super Boolean> jVar, kotlin.coroutines.c<? super tf.d> cVar) {
        return ((ShortcutRationaleHelper$shortcutRationaleDialogFlow$1) create(jVar, cVar)).invokeSuspend(tf.d.f30009a);
    }
}
