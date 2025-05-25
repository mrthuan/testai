package com.bytedance.sdk.openadsdk.iMK;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.ROR.Qhi;
import com.bytedance.sdk.component.adexpress.CJ.kYc;
import com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.WAv;
import com.bytedance.sdk.component.cJ.Qhi.fl;
import com.bytedance.sdk.component.fl.hm;
import com.bytedance.sdk.component.fl.zc;
import com.bytedance.sdk.openadsdk.core.model.hpZ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.settings.HzH;
import com.bytedance.sdk.openadsdk.utils.lG;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: TTNetClient.java */
/* loaded from: classes.dex */
public class ac {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ac Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.iMK.Qhi.ac f9334ac;
    private final com.bytedance.sdk.component.ROR.Qhi cJ;

    private ac(Context context) {
        Qhi.C0078Qhi c0078Qhi = new Qhi.C0078Qhi();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.ROR.Qhi Qhi2 = c0078Qhi.Qhi(10000L, timeUnit).cJ(10000L, timeUnit).ac(10000L, timeUnit).Qhi(true).Qhi();
        this.cJ = Qhi2;
        com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.Qhi.Qhi(new WAv() { // from class: com.bytedance.sdk.openadsdk.iMK.ac.1
            @Override // com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.WAv
            public ExecutorService Qhi() {
                if (HzH.YD().VV()) {
                    return lG.WAv();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.WAv
            public boolean cJ() {
                return HzH.YD().VV();
            }
        });
        fl Qhi3 = Qhi2.fl().Qhi();
        if (Qhi3 != null) {
            Qhi3.Qhi(32);
        }
    }

    private void CJ() {
        if (this.f9334ac == null) {
            this.f9334ac = new com.bytedance.sdk.openadsdk.iMK.Qhi.ac();
        }
    }

    public static ac Qhi() {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = new ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi());
                }
            }
        }
        return Qhi;
    }

    public com.bytedance.sdk.openadsdk.iMK.Qhi.ac ac() {
        CJ();
        return this.f9334ac;
    }

    public com.bytedance.sdk.component.ROR.Qhi cJ() {
        return this.cJ;
    }

    public void Qhi(String str, int i10, int i11, ImageView imageView, tP tPVar) {
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str).Qhi(i10).cJ(i11).fl(zn.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).CJ(zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(tPVar, str, imageView));
    }

    public void Qhi(int i10, final ImageView imageView, final tP tPVar) {
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(tPVar.Tgh()).Qhi(i10).cJ(i10).fl(zn.CJ(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).CJ(zn.ac(com.bytedance.sdk.openadsdk.core.HzH.Qhi())).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(tPVar, tPVar.Tgh(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.iMK.ac.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String ROR = tPVar.ROR();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(ROR));
                        try {
                            com.bytedance.sdk.component.utils.cJ.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void Qhi(hpZ hpz, ImageView imageView, tP tPVar) {
        if (hpz == null || TextUtils.isEmpty(hpz.Qhi()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(hpz).ac(2).Qhi(com.bytedance.sdk.openadsdk.ROR.ac.Qhi(tPVar, hpz.Qhi(), imageView));
    }

    public void Qhi(String str, final View view) {
        if (TextUtils.isEmpty(str) || view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ROR.fl.Qhi(str).ac(2).Qhi(new hm() { // from class: com.bytedance.sdk.openadsdk.iMK.ac.4
            @Override // com.bytedance.sdk.component.fl.hm
            public Bitmap Qhi(Bitmap bitmap) {
                return kYc.Qhi(view.getContext(), bitmap, 10);
            }
        }).Qhi(new com.bytedance.sdk.component.fl.HzH<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.iMK.ac.3
            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.fl.HzH
            public void Qhi(zc<Bitmap> zcVar) {
                if (zcVar == null) {
                    return;
                }
                final Bitmap cJ = zcVar.cJ();
                if (cJ instanceof Bitmap) {
                    if (lG.fl()) {
                        View view2 = view;
                        if (view2 instanceof ImageView) {
                            ((ImageView) view2).setImageDrawable(new BitmapDrawable(view.getResources(), cJ));
                            return;
                        } else {
                            view2.setBackground(new BitmapDrawable(view.getResources(), cJ));
                            return;
                        }
                    }
                    view.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.iMK.ac.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view.getResources(), (Bitmap) cJ));
                            } else {
                                view3.setBackground(new BitmapDrawable(view.getResources(), (Bitmap) cJ));
                            }
                        }
                    });
                }
            }
        });
    }
}
