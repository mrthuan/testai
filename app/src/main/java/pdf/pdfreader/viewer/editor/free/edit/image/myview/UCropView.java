package pdf.pdfreader.viewer.editor.free.edit.image.myview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dm.a;
import fm.b;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class UCropView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final GestureCropImageView f24339a;

    /* renamed from: b  reason: collision with root package name */
    public final OverlayView f24340b;

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView getCropImageView() {
        return this.f24339a;
    }

    public OverlayView getOverlayView() {
        return this.f24340b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.ucrop_view, (ViewGroup) this, true);
        GestureCropImageView gestureCropImageView = (GestureCropImageView) findViewById(R.id.image_view_crop);
        this.f24339a = gestureCropImageView;
        OverlayView overlayView = (OverlayView) findViewById(R.id.view_overlay);
        this.f24340b = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16265a);
        overlayView.getClass();
        overlayView.f24298m = obtainStyledAttributes.getBoolean(2, false);
        int color = obtainStyledAttributes.getColor(3, overlayView.getResources().getColor(R.color.ucrop_color_default_dimmed));
        overlayView.f24299n = color;
        Paint paint = overlayView.f24301p;
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color2 = obtainStyledAttributes.getColor(4, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_frame));
        Paint paint2 = overlayView.f24303r;
        paint2.setStrokeWidth(dimensionPixelSize);
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = overlayView.f24304s;
        paint3.setStrokeWidth(dimensionPixelSize * 3);
        paint3.setColor(color2);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = overlayView.f24305t;
        paint4.setStrokeWidth(dimensionPixelSize * 5);
        paint4.setColor(color2);
        paint4.setStyle(Paint.Style.STROKE);
        overlayView.f24296k = obtainStyledAttributes.getBoolean(10, true);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(9, overlayView.getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color3 = obtainStyledAttributes.getColor(6, overlayView.getResources().getColor(R.color.ucrop_color_default_crop_grid));
        Paint paint5 = overlayView.f24302q;
        paint5.setStrokeWidth(dimensionPixelSize2);
        paint5.setColor(color3);
        overlayView.f24291f = obtainStyledAttributes.getInt(8, 2);
        overlayView.f24292g = obtainStyledAttributes.getInt(7, 2);
        overlayView.f24297l = obtainStyledAttributes.getBoolean(11, true);
        gestureCropImageView.getClass();
        float abs = Math.abs(obtainStyledAttributes.getFloat(0, 0.0f));
        float abs2 = Math.abs(obtainStyledAttributes.getFloat(1, 0.0f));
        if (abs != 0.0f && abs2 != 0.0f) {
            gestureCropImageView.F = abs / abs2;
        } else {
            gestureCropImageView.F = 0.0f;
        }
        obtainStyledAttributes.recycle();
        gestureCropImageView.setCropBoundsChangeListener(new fm.a(this));
        overlayView.setOverlayViewChangeListener(new b(this));
    }
}
