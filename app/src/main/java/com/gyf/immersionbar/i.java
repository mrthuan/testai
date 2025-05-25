package com.gyf.immersionbar;

import android.app.Activity;
import android.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.gyf.immersionbar.c;
import com.gyf.immersionbar.j;
import java.util.ArrayList;

/* compiled from: ImmersionDelegate.java */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public g f13812a;

    public i(Object obj) {
        if (obj instanceof Activity) {
            if (this.f13812a == null) {
                this.f13812a = new g((Activity) obj);
            }
        } else if (obj instanceof Fragment) {
            if (this.f13812a == null) {
                if (obj instanceof androidx.fragment.app.m) {
                    this.f13812a = new g((androidx.fragment.app.m) obj);
                } else {
                    this.f13812a = new g((Fragment) obj);
                }
            }
        } else if ((obj instanceof android.app.Fragment) && this.f13812a == null) {
            if (obj instanceof DialogFragment) {
                this.f13812a = new g((DialogFragment) obj);
            } else {
                this.f13812a = new g((android.app.Fragment) obj);
            }
        }
    }

    public final void a() {
        g gVar = this.f13812a;
        if (gVar != null && gVar.f13805q) {
            gVar.f13799k.getClass();
        }
    }

    public final void b() {
        g gVar = this.f13812a;
        if (gVar != null) {
            gVar.q();
            if (!OSUtils.isEMUI3_x()) {
                gVar.d();
            } else if (gVar.f13805q && !gVar.f13796h && gVar.f13799k.f13772s) {
                gVar.f();
            } else {
                gVar.d();
            }
            a();
        }
    }

    public final void c() {
        g gVar;
        g gVar2 = this.f13812a;
        if (gVar2 != null) {
            if (gVar2.f13790a != null) {
                d dVar = gVar2.f13803o;
                if (dVar != null) {
                    if (dVar.f13789k) {
                        dVar.c.getViewTreeObserver().removeOnGlobalLayoutListener(dVar);
                        dVar.f13789k = false;
                    }
                    gVar2.f13803o = null;
                }
                int i10 = c.f13776d;
                ArrayList<h> arrayList = c.a.f13779a.f13777a;
                if (arrayList != null) {
                    arrayList.remove(gVar2);
                }
                int i11 = j.f13813a;
                j jVar = j.a.f13814a;
                gVar2.f13799k.getClass();
                jVar.getClass();
            }
            if (gVar2.f13798j && (gVar = gVar2.f13795g) != null) {
                b bVar = gVar.f13799k;
                bVar.f13769p = gVar.f13806r;
                if (bVar.f13759f != BarHide.FLAG_SHOW_BAR) {
                    gVar.m();
                }
            }
            gVar2.f13805q = false;
            this.f13812a = null;
        }
    }

    public final void d() {
        g gVar = this.f13812a;
        if (gVar != null) {
            gVar.q();
            if (!gVar.f13796h && gVar.f13805q && gVar.f13799k != null) {
                if (OSUtils.isEMUI3_x() && gVar.f13799k.f13773t) {
                    gVar.f();
                } else if (gVar.f13799k.f13759f != BarHide.FLAG_SHOW_BAR) {
                    gVar.m();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        g gVar = this.f13812a;
        if (gVar != null && (activity = gVar.f13790a) != null) {
            new a(activity);
            throw null;
        }
    }
}
