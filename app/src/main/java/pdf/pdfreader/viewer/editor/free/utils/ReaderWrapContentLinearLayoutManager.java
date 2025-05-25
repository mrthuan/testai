package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public class ReaderWrapContentLinearLayoutManager extends LinearLayoutManager {
    public ReaderWrapContentLinearLayoutManager() {
        super(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void o0(RecyclerView.t tVar, RecyclerView.y yVar) {
        try {
            super.o0(tVar, yVar);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public ReaderWrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
