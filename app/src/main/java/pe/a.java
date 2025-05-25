package pe;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Message;
import androidx.appcompat.widget.StarCheckView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CheckHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public final List<StarCheckView> f28928b;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f28930e;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerC0360a f28927a = new HandlerC0360a();
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28929d = false;

    /* compiled from: CheckHelper.java */
    /* renamed from: pe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0360a extends Handler {
        public HandlerC0360a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                a.this.d(message.arg1, message.arg2, ((Boolean) message.obj).booleanValue());
            }
        }
    }

    /* compiled from: CheckHelper.java */
    /* loaded from: classes.dex */
    public class b implements StarCheckView.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f28932a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StarCheckView f28933b;

        public b(boolean z10, StarCheckView starCheckView) {
            this.f28932a = z10;
            this.f28933b = starCheckView;
        }
    }

    public a(ArrayList arrayList) {
        this.f28928b = arrayList;
    }

    public final void a() {
        List<StarCheckView> list = this.f28928b;
        if (list == null) {
            return;
        }
        for (StarCheckView starCheckView : list) {
            if (starCheckView != null) {
                starCheckView.setCheck(false);
            }
        }
    }

    public final void b(boolean z10) {
        StarCheckView starCheckView;
        List<StarCheckView> list = this.f28928b;
        if (list == null || list.size() <= 0 || (starCheckView = (StarCheckView) a0.a.f(list, -1)) == null) {
            return;
        }
        starCheckView.setOnAnimationEnd(new b(z10, starCheckView));
    }

    public final void c(int i10) {
        boolean z10;
        if (this.c == i10) {
            return;
        }
        this.c = i10;
        this.f28927a.removeMessages(1);
        this.f28929d = true;
        ObjectAnimator objectAnimator = this.f28930e;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        int i11 = 0;
        while (true) {
            List<StarCheckView> list = this.f28928b;
            if (i11 < list.size()) {
                StarCheckView starCheckView = list.get(i11);
                if (i11 <= i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                starCheckView.c(z10, false);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        List<StarCheckView> list;
        if (i11 >= i10 && (list = this.f28928b) != null && list.size() > i10 && i10 >= 0) {
            StarCheckView starCheckView = list.get(i10);
            if (starCheckView == null) {
                b(z10);
                return;
            }
            starCheckView.setPosition(i10);
            starCheckView.c(true, true);
            Message message = new Message();
            message.what = 1;
            message.arg1 = i10 + 1;
            message.arg2 = i11;
            message.obj = Boolean.valueOf(z10);
            this.f28927a.sendMessageDelayed(message, 160L);
            return;
        }
        b(z10);
    }
}
