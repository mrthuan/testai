package com.bytedance.adsdk.lottie.cJ;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.lottie.ac;
import com.bytedance.adsdk.lottie.ac.Sf;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class Qhi {
    private final AssetManager CJ;

    /* renamed from: fl  reason: collision with root package name */
    private ac f7851fl;
    private final Sf<String> Qhi = new Sf<>();
    private final Map<Sf<String>, Typeface> cJ = new HashMap();

    /* renamed from: ac  reason: collision with root package name */
    private final Map<String, Typeface> f7850ac = new HashMap();
    private String Tgh = ".ttf";

    public Qhi(Drawable.Callback callback, ac acVar) {
        this.f7851fl = acVar;
        if (!(callback instanceof View)) {
            this.CJ = null;
        } else {
            this.CJ = ((View) callback).getContext().getAssets();
        }
    }

    private Typeface cJ(com.bytedance.adsdk.lottie.ac.ac acVar) {
        Typeface typeface;
        String Qhi = acVar.Qhi();
        Typeface typeface2 = this.f7850ac.get(Qhi);
        if (typeface2 != null) {
            return typeface2;
        }
        String ac2 = acVar.ac();
        String cJ = acVar.cJ();
        ac acVar2 = this.f7851fl;
        if (acVar2 != null) {
            typeface = acVar2.Qhi(Qhi, ac2, cJ);
            if (typeface == null) {
                typeface = this.f7851fl.Qhi(Qhi);
            }
        } else {
            typeface = null;
        }
        ac acVar3 = this.f7851fl;
        if (acVar3 != null && typeface == null) {
            String cJ2 = acVar3.cJ(Qhi, ac2, cJ);
            if (cJ2 == null) {
                cJ2 = this.f7851fl.cJ(Qhi);
            }
            if (cJ2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.CJ, cJ2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (acVar.CJ() != null) {
            return acVar.CJ();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.CJ, "fonts/" + Qhi + this.Tgh);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.f7850ac.put(Qhi, typeface);
        return typeface;
    }

    public void Qhi(ac acVar) {
        this.f7851fl = acVar;
    }

    public void Qhi(String str) {
        this.Tgh = str;
    }

    public Typeface Qhi(com.bytedance.adsdk.lottie.ac.ac acVar) {
        this.Qhi.Qhi(acVar.Qhi(), acVar.ac());
        Typeface typeface = this.cJ.get(this.Qhi);
        if (typeface != null) {
            return typeface;
        }
        Typeface Qhi = Qhi(cJ(acVar), acVar.ac());
        this.cJ.put(this.Qhi, Qhi);
        return Qhi;
    }

    private Typeface Qhi(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
