package lib.zj.office.ss.sheetbar;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.a;
import pdf.pdfreader.viewer.editor.free.R;
import rg.c;

/* loaded from: classes3.dex */
public class SheetButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f20967a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f20968b;

    public SheetButton(Context context, String str, int i10) {
        super(context);
        this.f20967a = i10;
        setPadding(context.getResources().getDimensionPixelSize(R.dimen.dp_21), 0, context.getResources().getDimensionPixelSize(R.dimen.dp_21), 0);
        this.f20968b = new TextView(context);
        if (c.c) {
            setBackgroundResource(R.drawable.ss_bottom_sheet_inversion_bg);
            this.f20968b.setTextColor(a.getColorStateList(context, R.color.ss_bottom_sheet_text_inversion));
        } else {
            setBackgroundResource(R.drawable.ss_bottom_sheet_bg);
            this.f20968b.setTextColor(a.getColorStateList(context, R.color.ss_bottom_sheet_text));
        }
        this.f20968b.setText(str);
        this.f20968b.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.sp_14) / context.getResources().getDisplayMetrics().scaledDensity);
        this.f20968b.setGravity(17);
        this.f20968b.setIncludeFontPadding(false);
        this.f20968b.setTextAppearance(context, R.style.TextViewFont_RobotoMedium);
        addView(this.f20968b, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    public final void a(boolean z10) {
        setSelected(z10);
        this.f20968b.setSelected(z10);
        if (c.c) {
            setBackgroundResource(R.drawable.ss_bottom_sheet_inversion_bg);
            this.f20968b.setTextColor(a.getColorStateList(getContext(), R.color.ss_bottom_sheet_text_inversion));
            return;
        }
        setBackgroundResource(R.drawable.ss_bottom_sheet_bg);
        this.f20968b.setTextColor(a.getColorStateList(getContext(), R.color.ss_bottom_sheet_text));
    }

    public int getSheetIndex() {
        return this.f20967a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
