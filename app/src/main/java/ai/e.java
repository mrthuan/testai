package ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: IView.java */
/* loaded from: classes3.dex */
public interface e {
    Rectangle A(long j10, Rectangle rectangle, boolean z10);

    boolean B(long j10, boolean z10);

    long C(int i10, int i11, boolean z10);

    long a();

    long b();

    Rect c(float f10, int i10, int i11);

    boolean contains(int i10, int i11);

    void d(a aVar);

    void dispose();

    int e(byte b10);

    e f(int i10, int i11, boolean z10);

    void g(Canvas canvas, int i10, int i11, float f10);

    lib.zj.office.system.f getControl();

    zh.g getDocument();

    int getHeight();

    short getType();

    int getWidth();

    int getX();

    int getY();

    boolean h(Rect rect, int i10, int i11, float f10);

    void i(long j10);

    e j();

    void l(e eVar);

    xh.e n();

    e o();

    void p(int i10, int i11);

    zh.h r();

    int s();

    void setWidth(int i10);

    int t();

    e u(long j10, int i10, boolean z10);

    void v(int i10);

    e w();

    void x(int i10);

    void y(e eVar);

    e z();
}
