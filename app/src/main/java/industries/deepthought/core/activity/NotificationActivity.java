package industries.deepthought.core.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import c5.a;
import h5.e;
import h5.m;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: NotificationActivity.kt */
/* loaded from: classes.dex */
public final class NotificationActivity extends Activity {
    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        Intent intent = getIntent();
        if (intent != null) {
            str = intent.getStringExtra("es_ia");
        } else {
            str = null;
        }
        if (g.a(str, "install")) {
            a b10 = a.b();
            b10.a();
            if (b10.c.f5583e.j() != null) {
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("GHAiYT1l", "ZkmFIL7A"), ea.a.p("OnBVYQ1laG41dCNfFmwBY2s=", "fbkT8I1g"));
            }
            Context applicationContext = getApplicationContext();
            m mVar = new m();
            mVar.c(applicationContext, new e(mVar, 0));
        }
        finish();
    }
}
