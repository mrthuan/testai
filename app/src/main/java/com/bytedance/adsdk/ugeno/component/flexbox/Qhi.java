package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes.dex */
interface Qhi {
    int Qhi(int i10, int i11, int i12);

    int Qhi(View view);

    int Qhi(View view, int i10, int i11);

    View Qhi(int i10);

    void Qhi(View view, int i10, int i11, ac acVar);

    void Qhi(ac acVar);

    boolean Qhi();

    int cJ(int i10, int i11, int i12);

    View cJ(int i10);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<ac> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void setFlexLines(List<ac> list);
}
