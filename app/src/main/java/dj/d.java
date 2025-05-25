package dj;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.k;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.h;
import lib.zj.office.wp.control.Word;

/* compiled from: WPFind.java */
/* loaded from: classes3.dex */
public final class d implements h {
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f16234d;

    /* renamed from: e  reason: collision with root package name */
    public zh.h f16235e;

    /* renamed from: f  reason: collision with root package name */
    public final Word f16236f;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f16232a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16233b = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    public final Rectangle f16237g = new Rectangle();

    public d(Word word) {
        this.f16236f = word;
    }

    public final void a(long j10) {
        Word word = this.f16236f;
        if (word.f21103k.x()) {
            return;
        }
        Rectangle rectangle = this.f16237g;
        rectangle.setBounds(0, 0, 0, 0);
        word.c(j10, rectangle);
        Rectangle visibleRect = word.getVisibleRect();
        float zoom = word.getZoom();
        int i10 = (int) (rectangle.f20688x * zoom);
        int i11 = (int) (rectangle.f20689y * zoom);
        if (!visibleRect.contains(i10, i11)) {
            if (visibleRect.width + i10 > word.getWordWidth() * zoom) {
                i10 = ((int) (word.getWordWidth() * zoom)) - visibleRect.width;
            }
            if (visibleRect.height + i11 > word.getWordHeight() * zoom) {
                i11 = ((int) (word.getWordHeight() * zoom)) - visibleRect.height;
            }
            word.scrollTo(i10, i11);
        } else {
            word.postInvalidate();
        }
        word.getControl().r(20, null);
        if (word.getCurrentRootType() != 2) {
            word.getControl().r(536870922, null);
        }
    }

    @Override // lib.zj.office.system.h
    public final void b() {
        this.f16234d = null;
        Word word = this.f16236f;
        xh.b bVar = (xh.b) word.getHighlight();
        bVar.f31655b = -1;
        bVar.f31654a.clear();
        word.postInvalidate();
    }

    @Override // lib.zj.office.system.h
    public final void c() {
        this.f16232a.set(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r9 == false) goto L18;
     */
    @Override // lib.zj.office.system.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.d.d(java.lang.String):boolean");
    }

    @Override // lib.zj.office.system.h
    public final boolean e() {
        boolean z10 = false;
        if (this.f16234d == null) {
            return false;
        }
        xh.b bVar = (xh.b) this.f16236f.getHighlight();
        int i10 = bVar.f31655b;
        if (i10 - 1 >= 0) {
            z10 = true;
            bVar.f31655b = i10 - 1;
        }
        this.f16233b.post(new k(this, 14));
        return z10;
    }

    @Override // lib.zj.office.system.h
    public final boolean f() {
        boolean z10 = false;
        if (this.f16234d == null) {
            return false;
        }
        xh.b bVar = (xh.b) this.f16236f.getHighlight();
        if (bVar.f31655b + 1 < bVar.f31654a.size()) {
            bVar.f31655b++;
            z10 = true;
        }
        this.f16233b.post(new b1.e(this, 10));
        return z10;
    }
}
