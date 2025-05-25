package lib.zj.office.officereader.beans;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public class AImageTextButton extends AImageButton {

    /* renamed from: k  reason: collision with root package name */
    public int f20892k;

    /* renamed from: l  reason: collision with root package name */
    public int f20893l;

    /* renamed from: m  reason: collision with root package name */
    public int f20894m;

    /* renamed from: n  reason: collision with root package name */
    public int f20895n;

    @Override // lib.zj.office.officereader.beans.AImageButton
    public final void a() {
        super.a();
    }

    public int getBottomIndent() {
        return this.f20893l;
    }

    public int getLeftIndent() {
        return this.f20894m;
    }

    public int getRightIndent() {
        return this.f20895n;
    }

    public int getTopIndent() {
        return this.f20892k;
    }

    @Override // lib.zj.office.officereader.beans.AImageButton, android.view.View
    public final void onDraw(Canvas canvas) {
        Rect clipBounds = canvas.getClipBounds();
        int i10 = clipBounds.right;
        int i11 = clipBounds.bottom - clipBounds.top;
        Bitmap bitmap = this.f20881f;
        bitmap.getWidth();
        int height = (((i11 - bitmap.getHeight()) - 10) + 0) / 2;
        throw null;
    }

    public void setBottomIndent(int i10) {
        this.f20893l = i10;
    }

    public void setLeftIndent(int i10) {
        this.f20894m = i10;
    }

    public void setRightIndent(int i10) {
        this.f20895n = i10;
    }

    public void setTopIndent(int i10) {
        this.f20892k = i10;
    }
}
