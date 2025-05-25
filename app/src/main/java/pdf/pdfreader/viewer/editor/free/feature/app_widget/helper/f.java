package pdf.pdfreader.viewer.editor.free.feature.app_widget.helper;

import cg.l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionExtKt;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.ShortcutPermissionState;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;

/* compiled from: ShortcutRationaleHelper.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a f24816a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f24817b;
    public final AtomicBoolean c = new AtomicBoolean(true);

    /* compiled from: ShortcutRationaleHelper.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24818a;

        static {
            int[] iArr = new int[ShortcutType.values().length];
            try {
                iArr[ShortcutType.WIDGET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShortcutType.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24818a = iArr;
        }
    }

    public static final void a(f fVar, androidx.appcompat.app.c cVar, ShortcutType shortcutType, l lVar) {
        fVar.getClass();
        int i10 = a.f24818a[shortcutType.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2) {
                ShortcutPermissionState b10 = ShortcutPermissionExtKt.b(cVar);
                ShortcutPermissionState shortcutPermissionState = ShortcutPermissionState.ALLOW;
                if (b10 != shortcutPermissionState) {
                    z10 = false;
                }
                lVar.invoke(Boolean.valueOf(z10));
                if (b10 == shortcutPermissionState) {
                    tn.a.d(cVar, ea.a.p("P2VDbRBzRGk1bg==", "oYdBMJRO"), ea.a.p("CXUFczZlGG0XYQJka2Q4bmU=", "DpjqFj6l"), WidgetEventCenter.c, false);
                    return;
                }
                return;
            }
            return;
        }
        ShortcutPermissionState c = ShortcutPermissionExtKt.c(cVar);
        ShortcutPermissionState shortcutPermissionState2 = ShortcutPermissionState.ALLOW;
        if (c != shortcutPermissionState2) {
            z10 = false;
        }
        lVar.invoke(Boolean.valueOf(z10));
        if (c == shortcutPermissionState2) {
            tn.a.d(cVar, ea.a.p("EmUVbVBzPGknbg==", "vLbg9OOX"), ea.a.p("AHUkcwdlOm0XYQJka2Q4bmU=", "7GcPwHNP"), WidgetEventCenter.f28683b, false);
        }
    }

    public final CallbackFlowBuilder b(androidx.appcompat.app.c activity, b bVar, ShortcutType shortcutType) {
        kotlin.jvm.internal.g.e(activity, "activity");
        kotlin.jvm.internal.g.e(shortcutType, "shortcutType");
        return new CallbackFlowBuilder(new ShortcutRationaleHelper$shortcutRationaleDialogFlow$1(this, activity, shortcutType, bVar, null), EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }
}
