package com.afollestad.materialdialogs;

import android.view.ViewTreeObserver;
import com.afollestad.materialdialogs.MaterialDialog;

/* compiled from: MaterialDialog.java */
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f5978a;

    /* compiled from: MaterialDialog.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5979a;

        public a(int i10) {
            this.f5979a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f5978a.f5934h.requestFocus();
            bVar.f5978a.c.f5965u.B0(this.f5979a);
        }
    }

    public b(MaterialDialog materialDialog) {
        this.f5978a = materialDialog;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        MaterialDialog materialDialog = this.f5978a;
        materialDialog.f5934h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        MaterialDialog.ListType listType = materialDialog.f5942p;
        MaterialDialog.ListType listType2 = MaterialDialog.ListType.SINGLE;
        if (listType == listType2 || listType == MaterialDialog.ListType.MULTI) {
            if (listType == listType2) {
                int i10 = materialDialog.c.f5961q;
                if (i10 < 0) {
                    return;
                }
                materialDialog.f5934h.post(new a(i10));
                return;
            }
            materialDialog.getClass();
        }
    }
}
