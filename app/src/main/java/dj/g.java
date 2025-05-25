package dj;

import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.wp.control.PrintWord;
import lib.zj.office.wp.control.Word;

/* compiled from: Word.java */
/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Word f16241a;

    public g(Word word) {
        this.f16241a = word;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PrintWord printWord;
        APageListView listView;
        Word word = this.f16241a;
        if (word.f21097e == 2 && (printWord = word.f21111s) != null && (listView = printWord.getListView()) != null && listView.getChildCount() == 1) {
            listView.requestLayout();
        }
    }
}
