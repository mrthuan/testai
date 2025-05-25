package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: TimePickerView.java */
/* loaded from: classes2.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f13130a;

    public d(GestureDetector gestureDetector) {
        this.f13130a = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f13130a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
