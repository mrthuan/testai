package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.StarCheckView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import eo.d;
import java.util.Locale;
import l.p;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseRateDialog.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public StarCheckView f21997a;

    /* renamed from: b  reason: collision with root package name */
    public StarCheckView f21998b;
    public StarCheckView c;

    /* renamed from: d  reason: collision with root package name */
    public StarCheckView f21999d;

    /* renamed from: e  reason: collision with root package name */
    public StarCheckView f22000e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f22001f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f22002g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f22003h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f22004i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f22005j;

    /* renamed from: k  reason: collision with root package name */
    public p f22006k;

    /* renamed from: l  reason: collision with root package name */
    public pe.a f22007l;

    /* renamed from: m  reason: collision with root package name */
    public int f22008m = 0;

    /* compiled from: BaseRateDialog.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22009a;

        public a(int i10) {
            this.f22009a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            super.onAnimationEnd(animator);
            try {
                dVar.f22003h.setImageResource(this.f22009a);
                dVar.f22003h.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(120L);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: BaseRateDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final oe.a f22011a;

        /* renamed from: b  reason: collision with root package name */
        public final ne.a f22012b;

        public b(ne.a aVar, d.a aVar2) {
            this.f22012b = aVar;
            this.f22011a = aVar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id2 = view.getId();
            ne.a aVar = this.f22012b;
            boolean z10 = aVar.f22439a;
            oe.a aVar2 = this.f22011a;
            d dVar = d.this;
            if (z10 && !aVar.f22440b) {
                dVar.f21997a.d();
                if (id2 == R.id.rate_star_1) {
                    if (dVar.f22008m == 5) {
                        dVar.f22008m = 4;
                        dVar.f21997a.setCheck(false);
                    } else {
                        dVar.f22008m = 5;
                        dVar.f21997a.setCheck(true);
                        dVar.f21998b.setCheck(true);
                        dVar.c.setCheck(true);
                        dVar.f21999d.setCheck(true);
                        dVar.f22000e.setCheck(true);
                    }
                    dVar.c(view.getContext(), aVar, aVar2);
                    return;
                } else if (id2 == R.id.rate_star_2) {
                    if (dVar.f22008m == 4) {
                        dVar.f22008m = 3;
                        dVar.f21998b.setCheck(false);
                    } else {
                        dVar.f22008m = 4;
                        dVar.f21997a.setCheck(false);
                        dVar.f21998b.setCheck(true);
                        dVar.c.setCheck(true);
                        dVar.f21999d.setCheck(true);
                        dVar.f22000e.setCheck(true);
                    }
                    dVar.c(view.getContext(), aVar, aVar2);
                    return;
                } else if (id2 == R.id.rate_star_3) {
                    if (dVar.f22008m == 3) {
                        dVar.f22008m = 2;
                        dVar.c.setCheck(false);
                    } else {
                        dVar.f22008m = 3;
                        dVar.f21997a.setCheck(false);
                        dVar.f21998b.setCheck(false);
                        dVar.c.setCheck(true);
                        dVar.f21999d.setCheck(true);
                        dVar.f22000e.setCheck(true);
                    }
                    dVar.c(view.getContext(), aVar, aVar2);
                    return;
                } else if (id2 == R.id.rate_star_4) {
                    if (dVar.f22008m == 2) {
                        dVar.f22008m = 1;
                        dVar.f21999d.setCheck(false);
                    } else {
                        dVar.f22008m = 2;
                        dVar.f21997a.setCheck(false);
                        dVar.f21998b.setCheck(false);
                        dVar.c.setCheck(false);
                        dVar.f21999d.setCheck(true);
                        dVar.f22000e.setCheck(true);
                    }
                    dVar.c(view.getContext(), aVar, aVar2);
                    return;
                } else if (id2 == R.id.rate_star_5) {
                    if (dVar.f22008m == 1) {
                        dVar.f22008m = 0;
                        dVar.f22000e.setCheck(false);
                    } else {
                        dVar.f22008m = 1;
                        dVar.f21997a.setCheck(false);
                        dVar.f21998b.setCheck(false);
                        dVar.c.setCheck(false);
                        dVar.f21999d.setCheck(false);
                        dVar.f22000e.setCheck(true);
                    }
                    dVar.c(view.getContext(), aVar, aVar2);
                    return;
                } else {
                    return;
                }
            }
            StarCheckView starCheckView = dVar.f22000e;
            synchronized (starCheckView) {
                starCheckView.f2406b = starCheckView.c;
                starCheckView.postInvalidate();
            }
            if (id2 == R.id.rate_star_1) {
                if (dVar.f22008m == 1) {
                    dVar.f22008m = 0;
                    dVar.f21997a.setCheck(false);
                } else {
                    dVar.f22008m = 1;
                    dVar.f21997a.setCheck(true);
                    dVar.f21998b.setCheck(false);
                    dVar.c.setCheck(false);
                    dVar.f21999d.setCheck(false);
                    dVar.f22000e.setCheck(false);
                }
                dVar.c(view.getContext(), aVar, aVar2);
            } else if (id2 == R.id.rate_star_2) {
                if (dVar.f22008m == 2) {
                    dVar.f22008m = 1;
                    dVar.f21998b.setCheck(false);
                } else {
                    dVar.f22008m = 2;
                    dVar.f21997a.setCheck(true);
                    dVar.f21998b.setCheck(true);
                    dVar.c.setCheck(false);
                    dVar.f21999d.setCheck(false);
                    dVar.f22000e.setCheck(false);
                }
                dVar.c(view.getContext(), aVar, aVar2);
            } else if (id2 == R.id.rate_star_3) {
                if (dVar.f22008m == 3) {
                    dVar.f22008m = 2;
                    dVar.c.setCheck(false);
                } else {
                    dVar.f22008m = 3;
                    dVar.f21997a.setCheck(true);
                    dVar.f21998b.setCheck(true);
                    dVar.c.setCheck(true);
                    dVar.f21999d.setCheck(false);
                    dVar.f22000e.setCheck(false);
                }
                dVar.c(view.getContext(), aVar, aVar2);
            } else if (id2 == R.id.rate_star_4) {
                if (dVar.f22008m == 4) {
                    dVar.f22008m = 3;
                    dVar.f21999d.setCheck(false);
                } else {
                    dVar.f22008m = 4;
                    dVar.f21997a.setCheck(true);
                    dVar.f21998b.setCheck(true);
                    dVar.c.setCheck(true);
                    dVar.f21999d.setCheck(true);
                    dVar.f22000e.setCheck(false);
                }
                dVar.c(view.getContext(), aVar, aVar2);
            } else if (id2 == R.id.rate_star_5) {
                if (dVar.f22008m == 5) {
                    dVar.f22008m = 4;
                    dVar.f22000e.setCheck(false);
                } else {
                    dVar.f22008m = 5;
                    dVar.f21997a.setCheck(true);
                    dVar.f21998b.setCheck(true);
                    dVar.c.setCheck(true);
                    dVar.f21999d.setCheck(true);
                    dVar.f22000e.setCheck(true);
                }
                dVar.c(view.getContext(), aVar, aVar2);
            }
        }
    }

    public static boolean b(Locale locale) {
        if (locale != null) {
            try {
                String country = locale.getCountry();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(country) && country.equalsIgnoreCase(OperatorName.BEGIN_INLINE_IMAGE_DATA)) {
                    return true;
                }
                if (!TextUtils.isEmpty(language)) {
                    if (language.toLowerCase().startsWith("in")) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public final void a(int i10) {
        ImageView imageView = this.f22003h;
        if (imageView != null) {
            imageView.animate().scaleX(0.2f).scaleY(0.2f).alpha(0.2f).setDuration(120L).setListener(new a(i10));
        }
    }

    public abstract void c(Context context, ne.a aVar, oe.a aVar2);
}
