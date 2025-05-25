package lib.zj.office.fc.ss.usermodel;

import java.util.Iterator;
import lib.zj.office.fc.ss.usermodel.ICell;

/* loaded from: classes3.dex */
public interface CellRange<C extends ICell> extends Iterable<C> {
    C getCell(int i10, int i11);

    C[][] getCells();

    C[] getFlattenedCells();

    int getHeight();

    String getReferenceText();

    C getTopLeftCell();

    int getWidth();

    @Override // java.lang.Iterable
    Iterator<C> iterator();

    int size();
}
