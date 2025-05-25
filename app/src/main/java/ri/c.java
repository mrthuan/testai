package ri;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import lib.zj.office.system.beans.pagelist.APageListItem;

/* compiled from: IPageListViewListener.java */
/* loaded from: classes3.dex */
public interface c {
    void a();

    APageListItem b(int i10);

    void c();

    boolean d(View view, MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11, byte b10);

    void e(APageListItem aPageListItem);

    void f();

    Rect g(int i10);

    Object getModel();

    int getPageCount();

    byte getPageListViewMovingPosition();

    void i();

    boolean j();

    boolean l();

    boolean o();

    boolean q();

    void setDrawPictrue(boolean z10);
}
