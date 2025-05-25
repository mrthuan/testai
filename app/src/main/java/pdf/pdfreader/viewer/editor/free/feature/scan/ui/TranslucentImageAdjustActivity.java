package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* compiled from: TranslucentImageAdjustActivity.kt */
/* loaded from: classes3.dex */
public final class TranslucentImageAdjustActivity extends ImageAdjustActivity {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f25786v0 = 0;

    /* compiled from: TranslucentImageAdjustActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String workflow) {
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(workflow, "workflow");
            Intent intent = new Intent(context, TranslucentImageAdjustActivity.class);
            intent.putExtra(ea.a.p("WnMZZQdhCWU=", "dMRIJ53n"), true);
            intent.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "1FkDaUNY"), workflow);
            context.startActivity(intent);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }
}
