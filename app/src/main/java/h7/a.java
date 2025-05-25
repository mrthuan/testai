package h7;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes.dex */
public interface a {
    View b(int i10);

    int c(int i10, int i11, int i12);

    void d(c cVar);

    void e(View view, int i10, int i11, c cVar);

    View f(int i10);

    int g(View view, int i10, int i11);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<c> getFlexLinesInternal();

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

    int h(int i10, int i11, int i12);

    void j(View view, int i10);

    boolean k();

    int l(View view);

    void setFlexLines(List<c> list);
}
