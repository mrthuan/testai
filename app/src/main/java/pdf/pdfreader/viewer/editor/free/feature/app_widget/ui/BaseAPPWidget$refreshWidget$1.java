package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import androidx.activity.s;
import cg.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.w;
import tf.d;
import wf.c;

/* compiled from: BaseAPPWidget.kt */
@c(c = "pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget$refreshWidget$1", f = "BaseAPPWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BaseAPPWidget$refreshWidget$1 extends SuspendLambda implements p<w, kotlin.coroutines.c<? super d>, Object> {
    final /* synthetic */ int $appWidgetId;
    final /* synthetic */ AppWidgetManager $appWidgetManager;
    final /* synthetic */ RemoteViews $views;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAPPWidget$refreshWidget$1(AppWidgetManager appWidgetManager, int i10, RemoteViews remoteViews, kotlin.coroutines.c<? super BaseAPPWidget$refreshWidget$1> cVar) {
        super(2, cVar);
        this.$appWidgetManager = appWidgetManager;
        this.$appWidgetId = i10;
        this.$views = remoteViews;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<d> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BaseAPPWidget$refreshWidget$1(this.$appWidgetManager, this.$appWidgetId, this.$views, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            s.u0(obj);
            this.$appWidgetManager.updateAppWidget(this.$appWidgetId, this.$views);
            return d.f30009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // cg.p
    public final Object invoke(w wVar, kotlin.coroutines.c<? super d> cVar) {
        return ((BaseAPPWidget$refreshWidget$1) create(wVar, cVar)).invokeSuspend(d.f30009a);
    }
}
