package lib.zj.office.fc.hssf.record.cf;

import a0.a;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public final class CellRangeUtil {
    public static final int ENCLOSES = 4;
    public static final int INSIDE = 3;
    public static final int NO_INTERSECTION = 1;
    public static final int OVERLAP = 2;

    private CellRangeUtil() {
    }

    public static boolean contains(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        int firstRow = hSSFCellRangeAddress2.getFirstRow();
        int lastRow = hSSFCellRangeAddress2.getLastRow();
        int firstColumn = hSSFCellRangeAddress2.getFirstColumn();
        int lastColumn = hSSFCellRangeAddress2.getLastColumn();
        if (le(hSSFCellRangeAddress.getFirstRow(), firstRow) && ge(hSSFCellRangeAddress.getLastRow(), lastRow) && le(hSSFCellRangeAddress.getFirstColumn(), firstColumn) && ge(hSSFCellRangeAddress.getLastColumn(), lastColumn)) {
            return true;
        }
        return false;
    }

    public static HSSFCellRangeAddress createEnclosingCellRange(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        int firstRow;
        int lastRow;
        int firstColumn;
        int lastColumn;
        if (hSSFCellRangeAddress2 == null) {
            return hSSFCellRangeAddress.copy();
        }
        if (lt(hSSFCellRangeAddress2.getFirstRow(), hSSFCellRangeAddress.getFirstRow())) {
            firstRow = hSSFCellRangeAddress2.getFirstRow();
        } else {
            firstRow = hSSFCellRangeAddress.getFirstRow();
        }
        if (gt(hSSFCellRangeAddress2.getLastRow(), hSSFCellRangeAddress.getLastRow())) {
            lastRow = hSSFCellRangeAddress2.getLastRow();
        } else {
            lastRow = hSSFCellRangeAddress.getLastRow();
        }
        if (lt(hSSFCellRangeAddress2.getFirstColumn(), hSSFCellRangeAddress.getFirstColumn())) {
            firstColumn = hSSFCellRangeAddress2.getFirstColumn();
        } else {
            firstColumn = hSSFCellRangeAddress.getFirstColumn();
        }
        if (gt(hSSFCellRangeAddress2.getLastColumn(), hSSFCellRangeAddress.getLastColumn())) {
            lastColumn = hSSFCellRangeAddress2.getLastColumn();
        } else {
            lastColumn = hSSFCellRangeAddress.getLastColumn();
        }
        return new HSSFCellRangeAddress(firstRow, lastRow, firstColumn, lastColumn);
    }

    private static List cutHorizontally(int i10, List list) {
        HSSFCellRangeAddress[] array;
        ArrayList arrayList = new ArrayList();
        for (HSSFCellRangeAddress hSSFCellRangeAddress : toArray(list)) {
            if (hSSFCellRangeAddress.getFirstRow() < i10 && i10 < hSSFCellRangeAddress.getLastRow()) {
                arrayList.add(new HSSFCellRangeAddress(hSSFCellRangeAddress.getFirstRow(), i10, hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastColumn()));
                arrayList.add(new HSSFCellRangeAddress(i10 + 1, hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastColumn()));
            } else {
                arrayList.add(hSSFCellRangeAddress);
            }
        }
        return arrayList;
    }

    private static List cutVertically(int i10, List list) {
        HSSFCellRangeAddress[] array;
        ArrayList arrayList = new ArrayList();
        for (HSSFCellRangeAddress hSSFCellRangeAddress : toArray(list)) {
            if (hSSFCellRangeAddress.getFirstColumn() < i10 && i10 < hSSFCellRangeAddress.getLastColumn()) {
                arrayList.add(new HSSFCellRangeAddress(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getFirstColumn(), i10));
                arrayList.add(new HSSFCellRangeAddress(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getLastRow(), i10 + 1, hSSFCellRangeAddress.getLastColumn()));
            } else {
                arrayList.add(hSSFCellRangeAddress);
            }
        }
        return arrayList;
    }

    private static boolean ge(int i10, int i11) {
        return !lt(i10, i11);
    }

    private static boolean gt(int i10, int i11) {
        return lt(i11, i10);
    }

    public static boolean hasExactSharedBorder(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        int firstRow = hSSFCellRangeAddress2.getFirstRow();
        int lastRow = hSSFCellRangeAddress2.getLastRow();
        int firstColumn = hSSFCellRangeAddress2.getFirstColumn();
        int lastColumn = hSSFCellRangeAddress2.getLastColumn();
        if ((hSSFCellRangeAddress.getFirstRow() > 0 && hSSFCellRangeAddress.getFirstRow() - 1 == lastRow) || (firstRow > 0 && firstRow - 1 == hSSFCellRangeAddress.getLastRow())) {
            if (hSSFCellRangeAddress.getFirstColumn() != firstColumn || hSSFCellRangeAddress.getLastColumn() != lastColumn) {
                return false;
            }
            return true;
        } else if (((hSSFCellRangeAddress.getFirstColumn() <= 0 || hSSFCellRangeAddress.getFirstColumn() - 1 != lastColumn) && (firstColumn <= 0 || hSSFCellRangeAddress.getLastColumn() != firstColumn - 1)) || hSSFCellRangeAddress.getFirstRow() != firstRow || hSSFCellRangeAddress.getLastRow() != lastRow) {
            return false;
        } else {
            return true;
        }
    }

    public static int intersect(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        int firstRow = hSSFCellRangeAddress2.getFirstRow();
        int lastRow = hSSFCellRangeAddress2.getLastRow();
        int firstColumn = hSSFCellRangeAddress2.getFirstColumn();
        int lastColumn = hSSFCellRangeAddress2.getLastColumn();
        if (!gt(hSSFCellRangeAddress.getFirstRow(), lastRow) && !lt(hSSFCellRangeAddress.getLastRow(), firstRow) && !gt(hSSFCellRangeAddress.getFirstColumn(), lastColumn) && !lt(hSSFCellRangeAddress.getLastColumn(), firstColumn)) {
            if (contains(hSSFCellRangeAddress, hSSFCellRangeAddress2)) {
                return 3;
            }
            if (contains(hSSFCellRangeAddress2, hSSFCellRangeAddress)) {
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static boolean le(int i10, int i11) {
        if (i10 != i11 && !lt(i10, i11)) {
            return false;
        }
        return true;
    }

    private static boolean lt(int i10, int i11) {
        if (i10 == -1) {
            return false;
        }
        if (i11 != -1 && i10 >= i11) {
            return false;
        }
        return true;
    }

    public static HSSFCellRangeAddress[] mergeCellRanges(HSSFCellRangeAddress[] hSSFCellRangeAddressArr) {
        if (hSSFCellRangeAddressArr.length < 1) {
            return hSSFCellRangeAddressArr;
        }
        ArrayList arrayList = new ArrayList();
        for (HSSFCellRangeAddress hSSFCellRangeAddress : hSSFCellRangeAddressArr) {
            arrayList.add(hSSFCellRangeAddress);
        }
        return toArray(mergeCellRanges(arrayList));
    }

    private static HSSFCellRangeAddress[] mergeRanges(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        int intersect = intersect(hSSFCellRangeAddress, hSSFCellRangeAddress2);
        if (intersect != 1) {
            if (intersect != 2) {
                if (intersect != 3) {
                    if (intersect == 4) {
                        return new HSSFCellRangeAddress[]{hSSFCellRangeAddress2};
                    }
                    throw new RuntimeException(a.g("unexpected intersection result (", intersect, ")"));
                }
                return new HSSFCellRangeAddress[]{hSSFCellRangeAddress};
            }
            return resolveRangeOverlap(hSSFCellRangeAddress, hSSFCellRangeAddress2);
        } else if (hasExactSharedBorder(hSSFCellRangeAddress, hSSFCellRangeAddress2)) {
            return new HSSFCellRangeAddress[]{createEnclosingCellRange(hSSFCellRangeAddress, hSSFCellRangeAddress2)};
        } else {
            return null;
        }
    }

    public static HSSFCellRangeAddress[] resolveRangeOverlap(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        if (hSSFCellRangeAddress.isFullColumnRange()) {
            if (hSSFCellRangeAddress.isFullRowRange()) {
                return null;
            }
            return sliceUp(hSSFCellRangeAddress, hSSFCellRangeAddress2);
        } else if (hSSFCellRangeAddress.isFullRowRange()) {
            if (hSSFCellRangeAddress2.isFullColumnRange()) {
                return null;
            }
            return sliceUp(hSSFCellRangeAddress, hSSFCellRangeAddress2);
        } else if (hSSFCellRangeAddress2.isFullColumnRange()) {
            return sliceUp(hSSFCellRangeAddress2, hSSFCellRangeAddress);
        } else {
            if (hSSFCellRangeAddress2.isFullRowRange()) {
                return sliceUp(hSSFCellRangeAddress2, hSSFCellRangeAddress);
            }
            return sliceUp(hSSFCellRangeAddress, hSSFCellRangeAddress2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    private static HSSFCellRangeAddress[] sliceUp(HSSFCellRangeAddress hSSFCellRangeAddress, HSSFCellRangeAddress hSSFCellRangeAddress2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hSSFCellRangeAddress2);
        ArrayList arrayList2 = arrayList;
        if (!hSSFCellRangeAddress.isFullColumnRange()) {
            arrayList2 = cutHorizontally(hSSFCellRangeAddress.getLastRow() + 1, cutHorizontally(hSSFCellRangeAddress.getFirstRow(), arrayList));
        }
        ArrayList arrayList3 = arrayList2;
        if (!hSSFCellRangeAddress.isFullRowRange()) {
            arrayList3 = cutVertically(hSSFCellRangeAddress.getLastColumn() + 1, cutVertically(hSSFCellRangeAddress.getFirstColumn(), arrayList2));
        }
        HSSFCellRangeAddress[] array = toArray(arrayList3);
        arrayList3.clear();
        arrayList3.add(hSSFCellRangeAddress);
        for (HSSFCellRangeAddress hSSFCellRangeAddress3 : array) {
            if (intersect(hSSFCellRangeAddress, hSSFCellRangeAddress3) != 4) {
                arrayList3.add(hSSFCellRangeAddress3);
            }
        }
        return toArray(arrayList3);
    }

    private static HSSFCellRangeAddress[] toArray(List list) {
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[list.size()];
        list.toArray(hSSFCellRangeAddressArr);
        return hSSFCellRangeAddressArr;
    }

    private static List mergeCellRanges(List list) {
        while (list.size() > 1) {
            int i10 = 0;
            boolean z10 = false;
            while (i10 < list.size()) {
                HSSFCellRangeAddress hSSFCellRangeAddress = (HSSFCellRangeAddress) list.get(i10);
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < list.size()) {
                    HSSFCellRangeAddress[] mergeRanges = mergeRanges(hSSFCellRangeAddress, (HSSFCellRangeAddress) list.get(i12));
                    if (mergeRanges != null) {
                        list.set(i10, mergeRanges[0]);
                        list.remove(i12);
                        i12--;
                        for (int i13 = 1; i13 < mergeRanges.length; i13++) {
                            i12++;
                            list.add(i12, mergeRanges[i13]);
                        }
                        z10 = true;
                    }
                    i12++;
                }
                i10 = i11;
            }
            if (!z10) {
                break;
            }
        }
        return list;
    }
}
