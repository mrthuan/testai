package lib.zj.office.officereader.beans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import lib.zj.office.system.f;
import pdf.pdfreader.viewer.editor.free.R;
import ph.a;

@SuppressLint({"WrongCall"})
/* loaded from: classes3.dex */
public class AImageFindButton extends LinearLayout implements GestureDetector.OnGestureListener, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final f f20889a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f20890b;
    public final AImageButton c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20891d;

    public AImageFindButton(Context context, f fVar, String str, int i10, int i11, int i12, a aVar) {
        super(context);
        this.f20889a = fVar;
        setOrientation(0);
        setVerticalGravity(17);
        EditText editText = new EditText(getContext());
        this.f20890b = editText;
        editText.setFreezesText(false);
        editText.setGravity(17);
        editText.setSingleLine();
        editText.addTextChangedListener(aVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10 - 10, -2);
        layoutParams.leftMargin = 5;
        layoutParams.rightMargin = 5;
        addView(editText, layoutParams);
        AImageButton aImageButton = new AImageButton(context, fVar, str, R.drawable.file_search, R.drawable.file_search_disable, 788529152);
        this.c = aImageButton;
        aImageButton.setNormalBgResID(R.drawable.sys_toolsbar_button_bg_normal);
        aImageButton.setPushBgResID(R.drawable.sys_toolsbar_button_bg_push);
        aImageButton.setLayoutParams(new LinearLayout.LayoutParams(i11, i12));
        aImageButton.setOnClickListener(this);
        aImageButton.setEnabled(false);
        addView(aImageButton);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.f20891d && (view instanceof AImageButton)) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            EditText editText = this.f20890b;
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 2);
            inputMethodManager.hideSoftInputFromInputMethod(editText.getWindowToken(), 2);
            this.f20889a.r(((AImageButton) view).getActionID(), editText.getText().toString());
        }
        this.f20891d = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.c.getClass();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        this.c.onDraw(canvas);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.c.getClass();
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setBackgroundResource(R.drawable.sys_toolsbar_button_bg_normal);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f20891d = true;
        this.c.onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.c.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        this.c.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.c.getClass();
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.onTouchEvent(motionEvent);
    }

    public void setFindBtnState(boolean z10) {
        this.c.setEnabled(z10);
    }

    public AImageFindButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
