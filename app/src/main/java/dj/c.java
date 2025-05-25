package dj;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.regex.Pattern;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.wp.control.Word;
import rh.k;
import zh.h;

/* compiled from: WPEventManage.java */
/* loaded from: classes3.dex */
public final class c extends pi.b {

    /* renamed from: t  reason: collision with root package name */
    public final Word f16230t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16231u;

    public c(Word word, lib.zj.office.system.f fVar) {
        super(word.getContext(), fVar);
        this.f16231u = false;
        kotlin.jvm.internal.g.d(Pattern.compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?(((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})(:[0-9]{1,5})?)|((www\\.|[a-zA-Z0-9.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.(top|com.cn|com|net|cn|cc|gov|hk)(:[0-9]{1,5})?))((/[a-zA-Z0-9./,;?'+&%$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z./,;?'+&%$#=~_\\-]*))", 2), "compile(\"\"\"((https?|s?ft…Pattern.CASE_INSENSITIVE)");
        this.f16230t = word;
    }

    @Override // pi.b
    public final void b() {
        super.b();
        boolean computeScrollOffset = this.f28959q.computeScrollOffset();
        Word word = this.f16230t;
        if (computeScrollOffset) {
            this.f28959q.getCurrY();
            this.f28959q.getFinalY();
            word.getScrollX();
            word.getScrollY();
            this.f28946d = true;
            jh.c.f19238d.c = false;
            word.scrollTo(this.f28959q.getCurrX(), this.f28959q.getCurrY());
            return;
        }
        jh.c cVar = jh.c.f19238d;
        if (!cVar.h()) {
            cVar.c = true;
            word.postInvalidate();
        }
    }

    @Override // pi.b
    public final void c() {
        super.c();
    }

    @Override // pi.b
    public final void d(int i10, int i11) {
        int wordWidth;
        if (this.f16231u) {
            return;
        }
        Word word = this.f16230t;
        Rectangle visibleRect = word.getVisibleRect();
        float zoom = word.getZoom();
        if (word.getCurrentRootType() == 1) {
            this.f28956n.s().d1();
            if (word.getWidth() == word.getWordWidth()) {
                wordWidth = word.getWidth();
            } else {
                wordWidth = ((int) (word.getWordWidth() * zoom)) + 5;
            }
        } else {
            wordWidth = (int) (word.getWordWidth() * zoom);
        }
        if (Math.abs(i11) > Math.abs(i10)) {
            Scroller scroller = this.f28959q;
            int i12 = visibleRect.f20688x;
            scroller.fling(i12, visibleRect.f20689y, 0, i11, 0, i12, 0, ((int) (word.getWordHeight() * zoom)) - visibleRect.height);
            word.getWordHeight();
        } else {
            Scroller scroller2 = this.f28959q;
            int i13 = visibleRect.f20688x;
            int i14 = visibleRect.f20689y;
            scroller2.fling(i13, i14, i10, 0, 0, wordWidth - visibleRect.width, i14, 0);
        }
        word.postInvalidate();
    }

    public final void g() {
        this.f28956n.r(536870917, new int[]{(int) (k.a.f29581a.b() * 10000.0f), this.f28952j, this.f28953k});
        this.f28956n.getView().postInvalidate();
        this.f28956n.r(536870922, null);
        this.f28956n.s().d1();
        this.f28956n.r(805306373, null);
    }

    @Override // pi.b, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        k kVar = k.a.f29581a;
        if (kVar.f29580b) {
            int i10 = kVar.f29579a;
            if (i10 < 5) {
                kVar.f29579a = i10 + 1;
                kVar.a();
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                kVar.f29579a = 0;
                kVar.a();
            }
            g();
        }
        super.onDoubleTap(motionEvent);
        return true;
    }

    @Override // pi.b, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        super.onDoubleTapEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onScroll(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            r8 = this;
            lib.zj.office.wp.control.Word r0 = r8.f16230t
            dj.a r1 = r0.getStatus()
            boolean r1 = r1.f16217a
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = r8.f16231u
            if (r1 == 0) goto L11
            return r2
        L11:
            super.onScroll(r9, r10, r11, r12)
            float r9 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r12)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            r10 = 0
            if (r9 <= 0) goto L23
            r9 = r2
            goto L24
        L23:
            r9 = r10
        L24:
            lib.zj.office.java.awt.Rectangle r1 = r0.getVisibleRect()
            int r3 = r1.f20688x
            int r4 = r1.f20689y
            float r5 = r0.getZoom()
            int r6 = r0.getCurrentRootType()
            if (r6 != r2) goto L53
            lib.zj.office.system.f r6 = r8.f28956n
            lib.zj.office.system.i r6 = r6.s()
            r6.d1()
            int r6 = r0.getWidth()
            int r7 = r0.getWordWidth()
            if (r6 != r7) goto L4e
            int r6 = r0.getWidth()
            goto L5a
        L4e:
            int r6 = r0.getWordWidth()
            goto L57
        L53:
            int r6 = r0.getWordWidth()
        L57:
            float r6 = (float) r6
            float r6 = r6 * r5
            int r6 = (int) r6
        L5a:
            int r7 = r0.getWordHeight()
            float r7 = (float) r7
            float r7 = r7 * r5
            int r5 = (int) r7
            r7 = 0
            if (r9 == 0) goto L87
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 <= 0) goto L78
            int r9 = r1.width
            int r12 = r3 + r9
            if (r12 >= r6) goto L78
            float r10 = (float) r3
            float r10 = r10 + r11
            int r10 = (int) r10
            int r11 = r10 + r9
            if (r11 <= r6) goto L85
            int r3 = r6 - r9
            goto La9
        L78:
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 >= 0) goto Laa
            if (r3 <= 0) goto Laa
            float r9 = (float) r3
            float r9 = r9 + r11
            int r9 = (int) r9
            if (r9 >= 0) goto L84
            goto L85
        L84:
            r10 = r9
        L85:
            r3 = r10
            goto La9
        L87:
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 <= 0) goto L9b
            int r9 = r1.height
            int r11 = r4 + r9
            if (r11 >= r5) goto L9b
            float r10 = (float) r4
            float r10 = r10 + r12
            int r10 = (int) r10
            int r11 = r10 + r9
            if (r11 <= r5) goto La8
            int r4 = r5 - r9
            goto La9
        L9b:
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 >= 0) goto Laa
            if (r4 <= 0) goto Laa
            float r9 = (float) r4
            float r9 = r9 + r12
            int r9 = (int) r9
            if (r9 >= 0) goto La7
            goto La8
        La7:
            r10 = r9
        La8:
            r4 = r10
        La9:
            r10 = r2
        Laa:
            if (r10 == 0) goto Lb1
            r8.f28947e = r2
            r0.scrollTo(r3, r4)
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dj.c.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // pi.b, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        h f10;
        ih.a b10;
        super.onSingleTapUp(motionEvent);
        if (motionEvent.getAction() == 1) {
            float x4 = motionEvent.getX();
            Word word = this.f16230t;
            long p10 = word.p((int) ((x4 + word.getScrollX()) / word.getZoom()), (int) ((motionEvent.getY() + word.getScrollY()) / word.getZoom()));
            if (p10 >= 0 && (f10 = word.getDocument().f(p10)) != null) {
                zh.b bVar = zh.b.f32374b;
                zh.f d10 = f10.d();
                bVar.getClass();
                int j10 = zh.b.j(d10);
                if (j10 >= 0 && (b10 = this.f28956n.o().d().b(j10)) != null) {
                    pi.b.f28943s = true;
                    this.f28956n.r(536870920, b10);
                }
            }
        }
        return true;
    }

    @Override // pi.b, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            super.onTouch(view, motionEvent);
            int action = motionEvent.getAction();
            Word word = this.f16230t;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2 && this.f16231u) {
                        if (k.a.f29581a.f29580b) {
                            word.scrollTo(word.getScrollX(), (int) (((word.f21099g * word.f21102j) - word.getHeight()) * (motionEvent.getY() / word.getHeight())));
                        } else if (word.P) {
                            word.scrollTo(word.getScrollX(), (int) ((((word.f21099g * word.f21100h) - word.getHeight()) + word.getSliderBottomMargin()) * ((((motionEvent.getY() / word.getHeight()) * word.getSliderBottomMargin()) + motionEvent.getY()) / word.getHeight())));
                        } else {
                            word.scrollTo((int) (((word.f21098f * word.f21100h) - word.getWidth()) * (motionEvent.getX() / word.getWidth())), word.getScrollY());
                        }
                    }
                } else {
                    this.f16231u = false;
                    if (this.f28949g) {
                        this.f28949g = false;
                        if (word.getCurrentRootType() == 0) {
                            this.f28956n.r(536870922, null);
                        }
                        if (this.f28944a) {
                            this.f28956n.s().d1();
                            this.f28956n.r(805306373, null);
                        } else {
                            this.f28944a = true;
                        }
                    }
                    word.getControl().r(20, null);
                }
            } else {
                jh.c.f19238d.c = true;
                boolean z10 = word.P;
                Rect rect = word.f21116x;
                if (z10) {
                    if (motionEvent.getX() > rect.left && motionEvent.getX() < rect.right && motionEvent.getY() > rect.top - 100 && motionEvent.getY() < rect.bottom + 100) {
                        this.f16231u = true;
                    }
                } else if (motionEvent.getX() > rect.left - 100 && motionEvent.getX() < rect.right + 100 && motionEvent.getY() > rect.top && motionEvent.getY() < rect.bottom) {
                    this.f16231u = true;
                }
            }
        } catch (Exception e10) {
            this.f28956n.o().c().a(false, e10);
        }
        return false;
    }
}
