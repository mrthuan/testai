package lib.zj.office.officereader.beans;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import lib.zj.office.system.f;
import sg.d;

/* loaded from: classes3.dex */
public class AImageCheckButton extends AImageButton {

    /* renamed from: k  reason: collision with root package name */
    public final Bitmap f20886k;

    /* renamed from: l  reason: collision with root package name */
    public short f20887l;

    /* renamed from: m  reason: collision with root package name */
    public final String f20888m;

    public AImageCheckButton(Context context, f fVar, String str, String str2, int i10, int i11, int i12, int i13) {
        super(context, fVar, str, i10, i12, i13);
        this.f20888m = str2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = context.getResources().getDisplayMetrics().densityDpi;
        options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
        this.f20886k = BitmapFactory.decodeResource(context.getResources(), i11, options);
    }

    @Override // lib.zj.office.officereader.beans.AImageButton
    public final void a() {
        super.a();
        Bitmap bitmap = this.f20886k;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public short getState() {
        return this.f20887l;
    }

    @Override // lib.zj.office.officereader.beans.AImageButton, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f20885j) {
            this.f20885j = false;
            return;
        }
        short s4 = this.f20887l;
        boolean z10 = true;
        if (s4 != 1) {
            if (s4 == 2) {
                setState((short) 1);
            }
        } else {
            setState((short) 2);
        }
        int actionID = ((AImageButton) view).getActionID();
        if (this.f20887l != 1) {
            z10 = false;
        }
        this.f20884i.r(actionID, Boolean.valueOf(z10));
        postInvalidate();
        this.f20885j = false;
    }

    @Override // lib.zj.office.officereader.beans.AImageButton, android.view.View
    public final void onDraw(Canvas canvas) {
        Paint a10 = d.f29801b.a();
        short s4 = this.f20887l;
        if (s4 != 0) {
            if (s4 != 1) {
                if (s4 == 2) {
                    int width = getWidth();
                    Bitmap bitmap = this.f20886k;
                    canvas.drawBitmap(bitmap, (width - bitmap.getWidth()) / 2, (getHeight() - bitmap.getHeight()) / 2, a10);
                    return;
                }
                return;
            }
            int width2 = getWidth();
            Bitmap bitmap2 = this.f20881f;
            canvas.drawBitmap(bitmap2, (width2 - bitmap2.getWidth()) / 2, (getHeight() - bitmap2.getHeight()) / 2, a10);
            return;
        }
        int width3 = getWidth();
        Bitmap bitmap3 = this.f20882g;
        canvas.drawBitmap(bitmap3, (width3 - bitmap3.getWidth()) / 2, (getHeight() - bitmap3.getHeight()) / 2, a10);
    }

    @Override // lib.zj.office.officereader.beans.AImageButton, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f20885j = true;
        short s4 = this.f20887l;
        f fVar = this.f20884i;
        if (s4 != 1) {
            if (s4 == 2) {
                fVar.r(17, this.f20888m);
                return;
            }
            return;
        }
        fVar.r(17, this.f20880e);
    }

    public void setState(short s4) {
        boolean z10;
        this.f20887l = s4;
        if (s4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
    }
}
