package ee;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.LottieView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: FullScreenDialog.java */
/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public final int f16563a;

    /* renamed from: b  reason: collision with root package name */
    public InterfaceC0211b f16564b;

    /* compiled from: FullScreenDialog.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.isShowing()) {
                InterfaceC0211b interfaceC0211b = bVar.f16564b;
                if (interfaceC0211b != null) {
                    interfaceC0211b.a();
                }
                bVar.getClass();
                new Handler(Looper.getMainLooper()).postDelayed(new c(bVar), 1000L);
            }
        }
    }

    /* compiled from: FullScreenDialog.java */
    /* renamed from: ee.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0211b {
        void a();
    }

    public b(Context context, int i10) {
        super(context, 2132017153);
        this.f16563a = 1000;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        this.f16563a = i10;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final synchronized void dismiss() {
        try {
            super.dismiss();
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ad_full_loading_layout);
        LottieView lottieView = (LottieView) findViewById(R.id.ad_full_loading_view);
        if (lottieView != null) {
            lottieView.setLottiePath("ad_full_loading.json");
            lottieView.setVisibility(0);
            try {
                lottieView.f2344a.setVisibility(0);
                lottieView.f2344a.setEnabled(true);
                lottieView.f2344a.setProgress(0.0f);
                lottieView.f2344a.j();
            } catch (Exception e10) {
                lottieView.setVisibility(8);
                e10.printStackTrace();
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a(), this.f16563a);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        try {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
    }
}
