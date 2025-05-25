package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: ToastCompatUtils.java */
/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public static Toast f28718a;

    /* renamed from: b  reason: collision with root package name */
    public static Handler f28719b;

    /* compiled from: ToastCompatUtils.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            j1.f28718a.show();
        }
    }

    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            sj.b.a(context, str).show();
        } catch (Error | Exception e10) {
            e10.printStackTrace();
            fe.a.a().c(e10);
        }
    }

    public static void b(Context context, String str) {
        if (context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.view_style_toast_txt, (ViewGroup) null);
            try {
                Toast toast = f28718a;
                if (toast != null) {
                    toast.cancel();
                }
                ea.a.p("O2VCdHQ=", "YkDPdVfB");
                ea.a.p("PGhedyp0Tmw_VCVhBnRSMQQxIA==", "goUGQDPP");
                ((TextView) inflate.findViewById(R.id.tv)).setText(str);
                if (Build.VERSION.SDK_INT == 25) {
                    f28718a = sj.b.a(context, "");
                } else {
                    f28718a = new Toast(context);
                }
                f28718a.setView(inflate);
                f28718a.setDuration(0);
                int dimension = (int) context.getResources().getDimension(R.dimen.dp_150);
                if ((context instanceof Activity) && ((Activity) context).getResources().getConfiguration().orientation == 2) {
                    dimension = (int) context.getResources().getDimension(R.dimen.dp_80);
                }
                if (f28719b == null) {
                    f28719b = new Handler(context.getMainLooper());
                }
                f28718a.setGravity(80, 0, dimension);
                f28718a.show();
                f28719b.postDelayed(new l1(), 100L);
            } catch (Error e10) {
                e10.printStackTrace();
                fe.a.a().c(e10);
            } catch (Exception e11) {
                ea.a.p("O2VCdHQ=", "PG3pKNNk");
                ea.a.p("QGgkdyB0G2wXVFthGnRsMnYyIA==", "3QhlfQx0");
                e11.printStackTrace();
                fe.a.a().c(e11);
            }
        }
    }

    public static void c(int i10, int i11, Context context, String str, boolean z10) {
        f(context, str, z10, null, i10, i11);
    }

    public static void d(Context context, String str, Drawable drawable) {
        e(context, str, false, drawable, -1);
    }

    public static void e(Context context, String str, boolean z10, Drawable drawable, int i10) {
        f(context, str, z10, drawable, -1, i10);
    }

    public static void f(Context context, String str, boolean z10, Drawable drawable, int i10, int i11) {
        float dimension;
        if (context == null) {
            context = ReaderPdfApplication.m();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_style_toast, (ViewGroup) null);
        try {
            Toast toast = f28718a;
            if (toast != null) {
                toast.cancel();
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.iv);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bg_root);
            ((TextView) inflate.findViewById(R.id.tv)).setText(str);
            if (drawable != null) {
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageDrawable(drawable);
            } else if (i10 != -1) {
                appCompatImageView.setVisibility(0);
                appCompatImageView.setImageResource(i10);
            } else {
                appCompatImageView.setVisibility(8);
            }
            if (z10) {
                linearLayout.setBackgroundResource(R.drawable.shape_style_toast_remove);
            }
            if (f28718a == null) {
                if (Build.VERSION.SDK_INT == 25) {
                    f28718a = sj.b.a(context, "");
                } else {
                    f28718a = new Toast(context);
                }
            }
            f28718a.setView(inflate);
            f28718a.setDuration(0);
            if (i11 > 0) {
                dimension = i11;
            } else {
                dimension = context.getResources().getDimension(R.dimen.dp_66);
            }
            f28718a.setGravity(49, 0, (int) dimension);
            if (f28719b == null) {
                f28719b = new Handler(context.getMainLooper());
            }
            f28719b.postDelayed(new a(), 100L);
        } catch (Error e10) {
            ea.a.p("O2VCdHQ=", "UV1C1PQp");
            ea.a.p("AmgrdyJ0M2wtVAlhR3RtZUpyPXJpMwUzIA==", "WeqDqJsf");
            e10.printStackTrace();
            fe.a.a().c(e10);
        } catch (Exception e11) {
            ea.a.p("LWUfdHQ=", "xqYlRckA");
            ea.a.p("NWgcdx50NGwtVAlhR3RtZUpyPXJpMgQyIA==", "72FsMM4g");
            e11.printStackTrace();
            fe.a.a().c(e11);
        }
    }

    public static void g(View view, String str, boolean z10, Drawable drawable) {
        if (view == null) {
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.toast_iv);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.toast_bg);
        ((TextView) view.findViewById(R.id.toast_tv)).setText(str);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (z10) {
            linearLayout.setBackgroundResource(R.drawable.shape_style_toast_remove);
        } else {
            linearLayout.setBackgroundResource(R.drawable.shape_style_toast);
        }
        view.animate().cancel();
        view.setVisibility(0);
        view.animate().alpha(1.0f).setDuration(300L).start();
    }

    public static void h(String str, Context context, boolean z10, int i10) {
        f(context, str, z10, null, i10, -1);
    }

    public static void i(Context context, String str, boolean z10, int i10) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_subscription_toast, (ViewGroup) null);
        try {
            Toast toast = f28718a;
            if (toast != null) {
                toast.cancel();
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bg_root);
            ((TextView) inflate.findViewById(R.id.tv)).setText(str);
            ((AppCompatImageView) inflate.findViewById(R.id.iv)).setImageResource(i10);
            if (z10) {
                linearLayout.setBackgroundResource(R.drawable.shape_dark_subscription_toast);
            }
            if (f28718a == null) {
                if (Build.VERSION.SDK_INT == 25) {
                    f28718a = sj.b.a(context, "");
                } else {
                    f28718a = new Toast(context);
                }
            }
            f28718a.setView(inflate);
            f28718a.setDuration(0);
            f28718a.setGravity(49, 0, (int) context.getResources().getDimension(R.dimen.dp_66));
            if (f28719b == null) {
                f28719b = new Handler(context.getMainLooper());
            }
            f28719b.postDelayed(new k1(), 100L);
        } catch (Error e10) {
            ea.a.p("O2VCdHQ=", "J8i2TKGP");
            ea.a.p("QGgkdyB0G2wXVFthGnRsZTZyXXJmM3AzIA==", "wSNMyykf");
            e10.printStackTrace();
            fe.a.a().c(e10);
        } catch (Exception e11) {
            ea.a.p("O2VCdHQ=", "2cA2FPn6");
            ea.a.p("PGhedyp0Tmw_VCVhBnRSZUdyAXJlMlcyIA==", "dmMrV4gO");
            e11.printStackTrace();
            fe.a.a().c(e11);
        }
    }
}
