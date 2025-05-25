package lib.zj.office.officereader.beans;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import lib.zj.office.system.f;
import sg.d;

/* loaded from: classes3.dex */
public class AImageButton extends View implements GestureDetector.OnGestureListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f20877a;

    /* renamed from: b  reason: collision with root package name */
    public int f20878b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f20879d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20880e;

    /* renamed from: f  reason: collision with root package name */
    public final Bitmap f20881f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap f20882g;

    /* renamed from: h  reason: collision with root package name */
    public final GestureDetector f20883h;

    /* renamed from: i  reason: collision with root package name */
    public final f f20884i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f20885j;

    public AImageButton(Context context, f fVar, String str, int i10, int i11, int i12) {
        super(context);
        this.f20878b = -1;
        this.c = -1;
        this.f20879d = -1;
        this.f20884i = fVar;
        this.f20880e = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = context.getResources().getDisplayMetrics().densityDpi;
        options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
        this.f20881f = BitmapFactory.decodeResource(context.getResources(), i10, options);
        if (i11 != -1) {
            this.f20882g = BitmapFactory.decodeResource(getContext().getResources(), i11, options);
        }
        this.f20877a = i12;
        this.f20883h = new GestureDetector(context, this);
        setFocusable(true);
        setClickable(true);
        setLongClickable(true);
        setOnClickListener(this);
    }

    public void a() {
        Bitmap bitmap = this.f20881f;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.f20882g;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
    }

    public int getActionID() {
        return this.f20877a;
    }

    public int getIconHeight() {
        Bitmap bitmap = this.f20881f;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public int getIconWidth() {
        Bitmap bitmap = this.f20881f;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public String getToolstip() {
        return this.f20880e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!this.f20885j && (view instanceof AImageButton)) {
            this.f20884i.r(((AImageButton) view).getActionID(), null);
        }
        this.f20885j = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f20881f;
        if (bitmap == null) {
            return;
        }
        boolean isEnabled = isEnabled();
        d dVar = d.f29801b;
        if (isEnabled) {
            canvas.drawBitmap(bitmap, (getWidth() - bitmap.getWidth()) / 2, (getHeight() - bitmap.getHeight()) / 2, dVar.a());
            return;
        }
        Bitmap bitmap2 = this.f20882g;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (getWidth() - bitmap2.getWidth()) / 2, (getHeight() - bitmap2.getHeight()) / 2, dVar.a());
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        int i11;
        if (z10) {
            i11 = this.f20879d;
        } else {
            i11 = this.f20878b;
        }
        if (i11 != -1) {
            setBackgroundResource(i11);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f20885j = true;
        String str = this.f20880e;
        if (str != null && str.length() > 0) {
            this.f20884i.r(17, str);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.GestureDetector r0 = r6.f20883h
            r0.onTouchEvent(r7)
            int r0 = r7.getAction()
            boolean r1 = r6.isEnabled()
            r2 = 18
            lib.zj.office.system.f r3 = r6.f20884i
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L1f
            int r7 = r7.getAction()
            if (r7 != r5) goto L1e
            r3.r(r2, r4)
        L1e:
            return r5
        L1f:
            r1 = -1
            if (r0 == 0) goto L3a
            if (r0 == r5) goto L2b
            r5 = 2
            if (r0 == r5) goto L3a
            r5 = 3
            if (r0 == r5) goto L2b
            goto L41
        L2b:
            int r0 = r6.f20878b
            if (r0 != r1) goto L33
            r6.setBackgroundDrawable(r4)
            goto L36
        L33:
            r6.setBackgroundResource(r0)
        L36:
            r3.r(r2, r4)
            goto L41
        L3a:
            int r0 = r6.c
            if (r0 == r1) goto L41
            r6.setBackgroundResource(r0)
        L41:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.officereader.beans.AImageButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setFocusBgResID(int i10) {
        this.f20879d = i10;
    }

    public void setNormalBgResID(int i10) {
        setBackgroundResource(i10);
        this.f20878b = i10;
    }

    public void setPushBgResID(int i10) {
        this.c = i10;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
