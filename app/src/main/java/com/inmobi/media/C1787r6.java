package com.inmobi.media;

import android.view.MotionEvent;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.inmobi.media.r6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1787r6 {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1775q6 f15405a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15406b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public float f15407d;

    /* renamed from: e  reason: collision with root package name */
    public float f15408e;

    /* renamed from: f  reason: collision with root package name */
    public float f15409f;

    /* renamed from: g  reason: collision with root package name */
    public int f15410g;

    /* renamed from: h  reason: collision with root package name */
    public int f15411h;

    /* renamed from: i  reason: collision with root package name */
    public float f15412i;

    /* renamed from: j  reason: collision with root package name */
    public JSONArray f15413j;

    /* renamed from: k  reason: collision with root package name */
    public MotionEvent f15414k;

    /* renamed from: l  reason: collision with root package name */
    public int f15415l;

    public C1787r6(InterfaceC1775q6 mListener) {
        kotlin.jvm.internal.g.e(mListener, "mListener");
        this.f15405a = mListener;
        this.f15406b = "r6";
        this.f15415l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f15410g = -1;
        this.f15411h = -1;
    }

    public final void a(MotionEvent event) {
        Integer num;
        float f10;
        float f11;
        float f12;
        kotlin.jvm.internal.g.e(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                float f13 = 0.0f;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                String TAG = this.f15406b;
                                kotlin.jvm.internal.g.d(TAG, "TAG");
                                event.toString();
                                this.f15411h = -1;
                                if (this.f15412i > 30.0f) {
                                    MotionEvent motionEvent = this.f15414k;
                                    if (motionEvent != null) {
                                        S9 s92 = (S9) this.f15405a;
                                        s92.getClass();
                                        if (!s92.getRenderingConfig().getSupportedGestures().contains(3)) {
                                            A4 a42 = s92.f14665j;
                                            if (a42 != null) {
                                                String TAG2 = S9.O0;
                                                kotlin.jvm.internal.g.d(TAG2, "TAG");
                                                ((B4) a42).c(TAG2, "Rotation gesture is disabled from config");
                                            }
                                        } else {
                                            A4 a43 = s92.f14665j;
                                            if (a43 != null) {
                                                String str = S9.O0;
                                                StringBuilder a10 = A5.a(str, "TAG", " Rotation detected ");
                                                a10.append(this.f15412i);
                                                a10.append(" \n ");
                                                a10.append(motionEvent);
                                                a10.append(" \n ");
                                                a10.append(event);
                                                ((B4) a43).a(str, kotlin.text.f.C(a10.toString()));
                                            }
                                            JSONArray jSONArray = new JSONArray();
                                            jSONArray.put(new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a(motionEvent.getX())), Integer.valueOf(AbstractC1579c2.a(motionEvent.getY())))));
                                            jSONArray.put(new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a(motionEvent.getX(1))), Integer.valueOf(AbstractC1579c2.a(motionEvent.getY(1))))));
                                            jSONArray.put(new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a(event.getX())), Integer.valueOf(AbstractC1579c2.a(event.getY())))));
                                            jSONArray.put(new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a(event.getX(1))), Integer.valueOf(AbstractC1579c2.a(event.getY(1))))));
                                            s92.b("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
                                        }
                                    }
                                    this.f15412i = 0.0f;
                                }
                                float x4 = event.getX() - event.getX(1);
                                float y10 = event.getY() - event.getY(1);
                                if (Math.abs(((int) Math.sqrt((y10 * y10) + (x4 * x4))) - this.f15415l) > 500) {
                                    MotionEvent motionEvent2 = this.f15414k;
                                    if (motionEvent2 != null) {
                                        S9 s93 = (S9) this.f15405a;
                                        s93.getClass();
                                        if (!s93.getRenderingConfig().getSupportedGestures().contains(4)) {
                                            A4 a44 = s93.f14665j;
                                            if (a44 != null) {
                                                String TAG3 = S9.O0;
                                                kotlin.jvm.internal.g.d(TAG3, "TAG");
                                                ((B4) a44).c(TAG3, "Pinch gesture is disabled from config");
                                            }
                                        } else {
                                            A4 a45 = s93.f14665j;
                                            if (a45 != null) {
                                                String TAG4 = S9.O0;
                                                kotlin.jvm.internal.g.d(TAG4, "TAG");
                                                ((B4) a45).a(TAG4, kotlin.text.f.C(" onScaleDetected\n " + motionEvent2 + " \n " + event));
                                            }
                                            JSONArray jSONArray2 = new JSONArray();
                                            float f14 = 2;
                                            jSONArray2.put(new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a((event.getX(1) + event.getX()) / f14)), Integer.valueOf(AbstractC1579c2.a((event.getY(1) + event.getY()) / f14)))));
                                            s93.b("window.imraidview.onGestureDetected('4', '" + jSONArray2 + "');");
                                        }
                                    }
                                    this.f15415l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        String TAG5 = this.f15406b;
                        kotlin.jvm.internal.g.d(TAG5, "TAG");
                        event.toString();
                        this.f15411h = event.getPointerId(event.getActionIndex());
                        this.f15414k = MotionEvent.obtain(event);
                        int findPointerIndex = event.findPointerIndex(this.f15410g);
                        int findPointerIndex2 = event.findPointerIndex(this.f15411h);
                        if (findPointerIndex >= 0) {
                            this.f15408e = event.getX(findPointerIndex);
                            this.f15409f = event.getY(findPointerIndex);
                        } else {
                            Q4 q42 = Q4.f14590a;
                            Q4.c.a(new J1(new IllegalArgumentException("Index for mPtrID1=" + this.f15410g + " is " + findPointerIndex + " | Pointer count=" + event.getPointerCount())));
                        }
                        if (findPointerIndex2 >= 0) {
                            this.c = event.getX(findPointerIndex2);
                            this.f15407d = event.getY(findPointerIndex2);
                        } else {
                            Q4 q43 = Q4.f14590a;
                            Q4.c.a(new J1(new IllegalArgumentException("Index for mPtrID2=" + this.f15411h + " is " + findPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                        }
                        float f15 = this.f15408e - this.c;
                        float f16 = this.f15409f - this.f15407d;
                        this.f15415l = (int) Math.sqrt((f16 * f16) + (f15 * f15));
                        return;
                    }
                    String TAG6 = this.f15406b;
                    kotlin.jvm.internal.g.d(TAG6, "TAG");
                    event.toString();
                    this.f15410g = -1;
                    this.f15411h = -1;
                    return;
                }
                JSONArray jSONArray3 = this.f15413j;
                int i10 = this.f15410g;
                if (i10 != -1 && this.f15411h != -1) {
                    int findPointerIndex3 = event.findPointerIndex(i10);
                    int findPointerIndex4 = event.findPointerIndex(this.f15411h);
                    if (findPointerIndex3 >= 0) {
                        f11 = event.getX(findPointerIndex3);
                        f10 = event.getY(findPointerIndex3);
                    } else {
                        Q4 q44 = Q4.f14590a;
                        Q4.c.a(new J1(new IllegalArgumentException("Index for mPtrID1=" + this.f15410g + " is " + findPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                    if (findPointerIndex4 >= 0) {
                        float x10 = event.getX(findPointerIndex4);
                        f13 = event.getY(findPointerIndex4);
                        f12 = x10;
                    } else {
                        Q4 q45 = Q4.f14590a;
                        Q4.c.a(new J1(new IllegalArgumentException("Index for mPtrID1=" + this.f15411h + " is " + findPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
                        f12 = 0.0f;
                    }
                    float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f15407d - this.f15409f, this.c - this.f15408e)) - ((float) Math.atan2(f13 - f10, f12 - f11)))) % 360;
                    if (degrees < -180.0f) {
                        degrees += 360.0f;
                    }
                    if (degrees > 180.0f) {
                        degrees -= 360.0f;
                    }
                    this.f15412i = Math.abs(degrees);
                    return;
                } else if (i10 != -1 && jSONArray3 != null && jSONArray3.length() > 0 && jSONArray3.length() < 50) {
                    try {
                        int a11 = AbstractC1579c2.a(event.getX());
                        int a12 = AbstractC1579c2.a(event.getY());
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(jSONArray3.length() - 1);
                        JSONArray jSONArray5 = new JSONArray((Collection) ge.a.I(Integer.valueOf(a11), Integer.valueOf(a12)));
                        float f17 = jSONArray4.getInt(0) - jSONArray5.getInt(0);
                        float f18 = jSONArray4.getInt(1) - jSONArray5.getInt(1);
                        if (((int) Math.sqrt((f18 * f18) + (f17 * f17))) > 100) {
                            jSONArray3.put(jSONArray5);
                            return;
                        }
                        return;
                    } catch (JSONException unused) {
                        return;
                    }
                } else {
                    return;
                }
            }
            String TAG7 = this.f15406b;
            kotlin.jvm.internal.g.d(TAG7, "TAG");
            event.toString();
            this.f15410g = -1;
            JSONArray jSONArray6 = this.f15413j;
            if (jSONArray6 != null && jSONArray6.length() > 5) {
                S9 s94 = (S9) this.f15405a;
                s94.getClass();
                if (!s94.getRenderingConfig().getSupportedGestures().contains(2)) {
                    A4 a46 = s94.f14665j;
                    if (a46 != null) {
                        String TAG8 = S9.O0;
                        kotlin.jvm.internal.g.d(TAG8, "TAG");
                        ((B4) a46).c(TAG8, "Pan gesture is disabled from config");
                    }
                } else {
                    A4 a47 = s94.f14665j;
                    if (a47 != null) {
                        String str2 = S9.O0;
                        StringBuilder a13 = A5.a(str2, "TAG", "onPanDetected\n ");
                        JSONArray jSONArray7 = this.f15413j;
                        if (jSONArray7 != null) {
                            num = Integer.valueOf(jSONArray7.length());
                        } else {
                            num = null;
                        }
                        a13.append(num);
                        a13.append(" \n ");
                        a13.append(this.f15413j);
                        ((B4) a47).a(str2, kotlin.text.f.C(a13.toString()));
                    }
                    s94.b("window.imraidview.onGestureDetected('2', '" + this.f15413j + "');");
                }
                this.f15413j = new JSONArray();
                return;
            }
            return;
        }
        String TAG9 = this.f15406b;
        kotlin.jvm.internal.g.d(TAG9, "TAG");
        event.toString();
        this.f15410g = event.getPointerId(event.getActionIndex());
        this.f15413j = new JSONArray();
        JSONArray jSONArray8 = new JSONArray((Collection) ge.a.I(Integer.valueOf(AbstractC1579c2.a(event.getX())), Integer.valueOf(AbstractC1579c2.a(event.getY()))));
        JSONArray jSONArray9 = this.f15413j;
        if (jSONArray9 != null) {
            jSONArray9.put(jSONArray8);
        }
    }
}
